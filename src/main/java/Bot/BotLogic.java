package Bot;

import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.Arrays;

/** Класс, преобразовывающий объекты обновлений <see>Update</see>
 *  в объекты ответов <see>BotResponse</see>
 */
public class BotLogic{
    String messageText;
    Long senderChatId;
    boolean isCommand;
    public BotResponse getResponse(){
        BotResponse res = new BotResponse();
        if(isCommand){
            boolean commandFound = false;
            BotCommandResponse[] commandsAvailable = Commands.available();
            for(BotCommandResponse commandResponse : commandsAvailable){
                if(messageText.startsWith(commandResponse.name)){
                    res = commandResponse;
                    res.chatId = senderChatId;
                    commandFound = true;
                }
            }
            if(!commandFound) res = new BotResponse("Я не знаю такой команды :c", senderChatId);
        }
        else {
            res = new BotResponse(messageText, senderChatId);
        }
        return res;
    }

    public BotLogic(Update update){
        messageText = update.getMessage().getText();
        senderChatId = update.getMessage().getChatId();
        isCommand = update.getMessage().isCommand();
    }

    public void init(String msg){
        messageText = msg;
        isCommand = msg.startsWith("/");
    }

    public BotLogic(String msg){
        init(msg);
    }

    public BotLogic(){}

}