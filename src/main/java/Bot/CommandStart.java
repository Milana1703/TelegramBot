package Bot;

public class CommandStart extends BotCommandResponse{
    public CommandStart(){
        super("/start",
                "стартовое сообщение");
    }

    @Override
    public void execute(){
        this.setMessage("Привет \uD83C\uDF1A \n" +
                "   Я telegram-бот, люди создали меня, чтобы я помогал им в изучении английского языка \n" +
                "   Я появился совсем недавно и еще немногому успел научиться.. но мои создатели каждый день стараются сделать меня лучше) \n" +
                "   С помощью команды /help ты можешь ознакомиться со всем доступным функционалом и узнать как со мной взаимодействовать :з \n" +
                "   Надеюсь, я буду полезен для тебя \uD83D\uDC49\uD83C\uDFFC\uD83D\uDC48\uD83C\uDFFC");
    }
}
