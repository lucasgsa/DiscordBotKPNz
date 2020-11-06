import CommandsFunctions.FunctionListener;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		System.out.println("CommandsLister - Iniciado com sucesso!");
		FunctionListener.listenerCommands(event);
	}
}
