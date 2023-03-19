package Bot;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

/**
 * реализует храниение и вывод сообщения в телеграм
 */
public class BotResponse {
    public Long chatId;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SendMessage toTelegram(){
        SendMessage res = new SendMessage();
        res.setChatId(chatId);
        res.setText(this.getMessage());
        return res;
    }

    @Override
    public String toString() {
        return this.getMessage();
    }

    public void toConsole(){
        System.out.println(this.getMessage());
    }

    public BotResponse(){}

    public BotResponse(String message, Long chatId){
        this.message = message;
        this.chatId = chatId;
    }
}
