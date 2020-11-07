package messages;
import java.io.IOException;
import java.util.Set;

import org.json.simple.parser.ParseException;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import util.PreMessagesLoader;

public class CommandsPreMessages extends ListenerAdapter {
	
	PreMessagesLoader pml;
	Set<String> premsgKeys;
	
	public CommandsPreMessages(String pathMessages) throws IOException, ParseException {
		pml = new PreMessagesLoader(pathMessages);
		premsgKeys = pml.getInputs();
		System.out.println("CommandsLister - Iniciado com sucesso!");
	}
	
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		checarComando(event);
	}
	
	public void checarComando(GuildMessageReceivedEvent event) {
		String message = event.getMessage().getContentRaw().toLowerCase();

		if (premsgKeys.contains(message)) {
			enviarResposta(message, event);
		}
	}
	
	public void enviarResposta(String entrada, GuildMessageReceivedEvent event) {
		String saida = pml.getOutput(entrada);
		saida = saida.replaceAll("&author", event.getAuthor().getName());
		event.getChannel().sendMessage(saida).queue();
	}
}
