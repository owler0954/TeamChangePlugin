package team;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.entities.type.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.plugin.Plugin;
import mindustry.game.Team;



public class doer extends Player{
    static void playerchageinfo(Player other,int team){other.resetNoAdd();
    if(team==0){other.setTeam(Team.derelict);}
    if(team==1){other.setTeam(Team.sharded);}
    if(team==2){other.setTeam(Team.crux);}
    if(team==3){other.setTeam(Team.green);}
    if(team==4){other.setTeam(Team.purple);}
    if(team==5){other.setTeam(Team.blue);}
    
    }
        

    
    
}
