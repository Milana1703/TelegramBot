package Bot;

/**
 * Дополнение к классу <code>BotResponse</code>
 * Реализует необходимые поля и методы для обработки команд
 */
public class BotCommandResponse extends BotResponse {
    public String name;
    public String description;

    public BotCommandResponse(Long chatId){
        super("", chatId);
    }


    @Override
    public String getMessage(){
        execute();
        return super.getMessage();
    }

    public BotCommandResponse(){
        super();
    }

    public BotCommandResponse(String name, String description){
        this.name = name;
        this.description = description;
    }
    public void execute(){ }

}
