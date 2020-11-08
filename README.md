# DiscordBot
Version 

This project, was made to help laypeaple in programming,
this enable the user to create custom bots.

### How to use:
 ##### BotLauncher.jar is the compiled and executable file.
   - for use, the only files required are BotLauncher and the configFiles folder
 ##### To start, run start.bat or open BotLauncher.jar directly.
 ##### Create bot, and configure:
   - create your own bot on discord developer page.
   - copy the acess token.
   - paste the token, discordToken in the file botconfig.json that is on the folder "configFiles".
 ##### Adding custom message:
   - open messages.json in folder configFiles.<br>
   - respect the format of json. Remember "," after.<br>
   - you could use tags, in botMessage, current tags:<br>
       - &author - replaces all occurrences with the name of the user who sent the message.<br>
       - More tags will be added soon.<br>
 #### Example:<br>
```
{
   "userMessage": "botMessage",
   "Good morning": "Hey &author, good morning to u too"
}
```

### Maven dependencies:
  - net.dv8tion.JDA<br>
  - com.googlecode.json-simple<br>
 
I'm working on the Readme yet.
