package Bot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.Scanner;

/**Запуск и обработка исключений <code>TelegramBotsApi</code>
 *Реализован эхо-функционал для консоли
 */
public class main {
    public static void main(String [] args) {

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new TelegramBot());
        } catch (TelegramApiException exception) {
            exception.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        BotLogic logic = new BotLogic();
        while(true){
            System.out.println(sc.nextLine());
        }
    }
}