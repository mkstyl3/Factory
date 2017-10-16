package edu.upc.dsa.Controller;

import java.util.HashMap;

public class Factory {

    private static Factory instance;

    public static Factory getInstance(){
        if (instance==null)
            instance = new Factory();
        return instance;
    }
    HashMap<String, Command> cache;

    public Command getCommand(String sCMD) {
        Command cmd = cache.get(sCMD);

        if (cmd == null) {
            cmd = loadClass(sCMD);
            cache.put(sCMD, cmd);
        }

        return cmd;
    }


    private Command loadClass(String sCMD)
    {
        Command cmd=null;
        try {
            Class c = Class.forName("edu.upc.dsa.Model."+sCMD);
            cmd = (Command) c.newInstance();
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex)
        {

        }




        return cmd;

    }
}
