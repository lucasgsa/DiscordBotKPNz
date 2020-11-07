# DiscordBot
Version 

This project, was made to help laypeaple in programming,
this enable the user to create custom bots.

### How to use:
 ##### Create bot, and configure:
   - Create your own bot on discord developer page.
   - Copy the acess token.
   - Paste the token, discordToken in the file botconfig.json that is on the folder "configFiles".
 ##### Adding custom message:
   - Open messages.json in folder configFiles.<br>
   - Respect the format of json. Remember "," after.<br>
   - You could use tags, in botMessage, current tags:<br>
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
