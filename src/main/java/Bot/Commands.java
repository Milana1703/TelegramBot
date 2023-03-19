package Bot;

/**
 * Класс, хранящий экземпляры всех существующих команд <see>BotCommandResponse</see>
 */
public class Commands {
    public static BotCommandResponse[] available(){
        BotCommandResponse[] res = new BotCommandResponse[2];
        res[0] = new CommandStart();
        res[1] = new CommandHelp();
        return res;
    };
}
