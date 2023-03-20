package BotTest;

import Bot.BotLogic;
import org.junit.Test;

import static org.junit.Assert.*;

public class BotLogicTest {

    @Test
    public void getResponse() {
        String actual = new BotLogic("mem").getResponse().toString();
        String expected = "mem";
        assertEquals(actual, expected);

        actual = new BotLogic("/kek").getResponse().toString();
        expected = "Я не знаю такой команды :c";
        assertEquals(actual, expected);

        actual = new BotLogic("/start").getResponse().toString();
        expected = "Привет \uD83C\uDF1A \n" +
                "   Я telegram-бот, люди создали меня, чтобы я помогал им в изучении английского языка \n" +
                "   Я появился совсем недавно и еще немногому успел научиться.. но мои создатели каждый день стараются сделать меня лучше) \n" +
                "   С помощью команды /help ты можешь ознакомиться со всем доступным функционалом и узнать как со мной взаимодействовать :з \n" +
                "   Надеюсь, я буду полезен для тебя \uD83D\uDC49\uD83C\uDFFC\uD83D\uDC48\uD83C\uDFFC";
        assertEquals(actual, expected);

        actual = new BotLogic("/help").getResponse().toString();
        expected = "/start – выводит стартовое сообщение\n" +
                "/help – демонстрирует список доступных команд с их описанием\n";
        assertEquals(actual, expected);
    }
}