package team;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.entities.type.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.plugin.Plugin;
import team.doer;

public class team extends Plugin{
    

    //register commands that run on the server
    @Override
    public void registerServerCommands(CommandHandler handler){
        handler.register("teamchange","<nick> <team_id>","Change team for player.", args -> {
            Player other = Vars.playerGroup.find(p -> p.name.equalsIgnoreCase(args[0]));
            int id = Integer.parseInt (args[1]);
            if(other == null){
                Log.info("No player by that name found!");
                return;
            }
            doer.playerchageinfo(other,id);
        });
    }


    @Override
    public void registerClientCommands(CommandHandler handler){

        //register a simple reply command
        handler.<Player>register("team", "<team_id>", "Change team from yorself", (args, player) -> {
            int id = Integer.parseInt (args[0]);
            Player other = player;
            doer.playerchageinfo(other,id);    
        });
        


    }
    
    
}
