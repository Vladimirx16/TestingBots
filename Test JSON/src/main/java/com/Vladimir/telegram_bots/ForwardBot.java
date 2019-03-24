package com.Vladimir.telegram_bots;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.ApiContext;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class ForwardBot extends TelegramLongPollingBot {

    private ArrayList<String> channel_list = new ArrayList<>();

    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try{
            telegramBotsApi.registerBot(new ForwardBot());
        } catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getMessage().getChatId());
        System.out.println("INFO: Получен запрос...");
        if (message.hasText() && (message.getText().equals("/start") || message.getText().equals("/show_channels") || message.getText().equals("/about"))){
            System.out.println("INFO: Обрабатываем обычный запрос...");
            switch (update.getMessage().getText()){
                case "/start": sendMessage.setText("Привет, " + update.getMessage().getFrom().getFirstName() + "!\nЯ буду пересылать тебе все сообщения из каналов, которые ты сам подключшь.\nИспользуй:\n/add_channel @имя_канала / ссылка_на_канал\n/remove_channel @имя_канала / ссылка_на_канал\n/show_channels\n/about"); break;
                case "/show_channels":
                    if (channel_list.isEmpty()){
                        sendMessage.setText("В вашем списке пока нет каналов");
                    } else {
                        sendMessage.setText("Список ваших каналов: " + channel_list.toString());
                    }
                    break;
                case "/about": sendMessage.setText("Доступные команды:\n/add_channel @имя_канала / ссылка_на_канал\n/remove_channel\n/show_channels\n/about"); break;
            }
            try{
                execute(sendMessage);
            } catch (TelegramApiException e){
                e.printStackTrace();
            }
        } else if (message.hasText() && message.getText().length() > 12 && message.getText().substring(0, 12).equals("/add_channel")) {
            System.out.println("INFO: Добавляем канал...");
            int lengthOfString = update.getMessage().getText().length(); // Записываем длину полученной строки
            String channel = update.getMessage().getText().substring(12, lengthOfString); // Извлекаем из строки /add_channel ... название канала, дабы добавить в список каналов
            channel_list.add(channel);
            sendMessage.setText("Канал успешно добавлен в список!");
            try{
                execute(sendMessage);
            } catch (TelegramApiException e){
                e.printStackTrace();
            }
        } else if (message.hasText() && message.getText().length() > 14 && message.getText().substring(0, 15).equals("/remove_channel")){
            System.out.println("INFO: Удаляем канал...");
            int lengthOfString = update.getMessage().getText().length(); // Записываем длину полученной строки
            String channel = update.getMessage().getText().substring(15, lengthOfString); // Извлекаем из строки /remove_channel ... название канала, дабы удалить из списка
            System.out.println(channel);
            if (channel_list.contains(channel)){
                channel_list.remove(update.getMessage().getText().substring(15, lengthOfString));
                sendMessage.setText("Канал успешно удалён из списка!");
            } else {
                sendMessage.setText("Указанный канал отсутствует в списке!");
            }
            try{
                execute(sendMessage);
            } catch (TelegramApiException e){
                e.printStackTrace();
            }
        }
        else {
            System.out.println("INFO: Получен нестандартный запрос...");
        }


        System.out.println("INFO: Сообщение - '" + update.getMessage().getText() + "', отправитель - @" + update.getMessage().getFrom().getUserName() + ", ID чата - " + update.getMessage().getChatId() + "\n>>>");
    }

    public String getBotUsername() {
        return "YOUR BOT NAME";
    }

    public String getBotToken() {
        return "YOUR TOKEN";
    }

}
