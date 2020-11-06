package CommandsFunctions;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

public class FunctionListener {
	public static void listenerCommands(GuildMessageReceivedEvent event) {
		String message = event.getMessage().getContentRaw();
		
		if (message.equalsIgnoreCase("bom dia")) {
			BomDiaFunction.bomDiaEvent(event);
		}
		
	}
}
