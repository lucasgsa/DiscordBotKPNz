package CommandsFunctions;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

public class BomDiaFunction {
	public static void bomDiaEvent(GuildMessageReceivedEvent event) {
		event.getChannel().sendMessage("Bom dia para você também amigo "+event.getAuthor().getName()+"!").queue();
	}
}
