package edu.upc.dsa.Controller;

import edu.upc.dsa.Model.C1;
import edu.upc.dsa.Model.C2;
import edu.upc.dsa.Model.C3;

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


    private Command loadClass(String sCMD) {
        Command cmd=null;

        if (sCMD.equals("C1")) cmd = new C1();
        else if (sCMD.equals("C2")) cmd = new C2();
        else if (sCMD.equals("C3")) cmd = new C3();

        return cmd;

    }
}
