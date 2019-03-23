package com.Vladimir.telegram_bots;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendSticker;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class EchoBot extends TelegramLongPollingBot {

    public static void main(String[] args) {

        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try{
            telegramBotsApi.registerBot(new EchoBot());
        } catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            String username = update.getMessage().getFrom().getFirstName();
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();


                if (update.getMessage().hasText()) {
                    SendMessage answer_message = new SendMessage();
                    answer_message.setChatId(chat_id);
                    SendSticker sendSticker = new SendSticker();
                    sendSticker.setChatId(chat_id);
                    switch (message_text) {
                        case "/start": answer_message.setText("Добро пожаловать, " + username + ".\nВоспользуйся /about");
                        sendSticker.setSticker("CAADAgADggIAAlwohgj91172rg2WVAI");
                        break;
                        case "/about": answer_message.setText("Это бот-зеркало, который будет отвечать вам вашим же текстом.");break;
                        default: answer_message.setText(update.getMessage().getText());
                    }
                    try {
                        execute(answer_message);
                        execute(sendSticker);
                    } catch(TelegramApiException e){
                        e.printStackTrace();
                    }
                } else if (update.getMessage().hasSticker()){
                    SendSticker sendSticker = new SendSticker();
                    sendSticker.setChatId(chat_id);
                    sendSticker.setSticker(update.getMessage().getSticker().getFileId());
                    try{
                        execute(sendSticker);
                    } catch (TelegramApiException e){
                        e.printStackTrace();
                    }
                }
                System.out.println(message_text + " - сообщение от " + username + ", отвечаем...\n" + "ID чата - " + update.getMessage().getChatId());
            System.out.println(update.getMessage().getSticker().getFileId());
        }
    }

    public String getBotUsername() {
        return "YOUR BOT NAME";
    }

    public String getBotToken() {
        return "YOUR TOKEN";
    }
}
