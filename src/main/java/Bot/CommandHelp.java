package Bot;

public class CommandHelp extends BotCommandResponse{
    public CommandHelp(){
        super("/help",
                "демонстрирует список доступных команд с их описанием");
    }

    @Override
    public void execute(){
        BotCommandResponse[] commandsAvailable = Commands.available();
        StringBuilder res = new StringBuilder("");
        for(BotCommandResponse commandResponse : commandsAvailable){
            res.append(commandResponse.name).append(" – ").append(commandResponse.description).append("\n");
        }
        setMessage(res.toString());
    }
}
