package Bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 * Дополнение к классу <code>TelegramLongPollingBot</code>
 * Реализует простого бота для <see>TelegramBotsApi</see>
 * Отправляет получаемые обновления в <see>BotLogic</see>
 */
public class TelegramBot extends TelegramLongPollingBot {

    private final String name = System.getenv("TELEGRAM_BOT_NAME");
    private final String token = System.getenv("TELEGRAM_BOT_TOKEN");

    @Override
    public void onUpdateReceived (Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message;
            BotLogic logic = new BotLogic(update);
            message = logic.getResponse().toTelegram();
            try {
                execute(message);
            } catch (TelegramApiException exception) {
                exception.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return name;
    }

    @Override
    public String getBotToken() {
        return token;
    }
}