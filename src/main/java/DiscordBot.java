import java.io.IOException;

import javax.security.auth.login.LoginException;

import org.json.simple.parser.ParseException;

import messages.CommandsPreMessages;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity.ActivityType;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.internal.entities.EntityBuilder;
import util.ConfigLoader;

public class DiscordBot {
	private ConfigLoader cl;
	private JDA jda;
	
	
	public void loadConfigs(String path) throws IOException, ParseException {
		cl = new ConfigLoader(path);
	}
	
	public void initializeJDA() throws LoginException {
		// Bot login.
		String discordToken = (String) cl.getObject("discordToken");
		
		// Bot preferences.
		String activityName = (String) cl.getObject("activityName");
		String activityURL = (String) cl.getObject("activityURL");
		ActivityType activityType = ActivityType.LISTENING;
		
		JDABuilder jdaBuilder = JDABuilder.createDefault(discordToken);
		jdaBuilder.setActivity(EntityBuilder.createActivity(activityName, activityURL, activityType));
		
		jda = jdaBuilder.build();
	}
	
	public void initializePreMessages() throws IOException, ParseException {
		boolean loadPreCommands = (Boolean) cl.getObject("loadPreCommands");
		if (!loadPreCommands) return;
		String preCommandsPath = (String) cl.getObject("preCommandsPath");
		newListener(new CommandsPreMessages(preCommandsPath));
	}
	
	public void newListener(ListenerAdapter listener) {
		jda.addEventListener(listener);
	}
}
