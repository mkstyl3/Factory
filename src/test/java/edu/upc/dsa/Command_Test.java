package edu.upc.dsa;

import edu.upc.dsa.Controller.*;
import org.junit.Assert;
import org.junit.Test;

public class Command_Test {

    @Test

    public void getCommandTest()
    {

        int command1 = Factory.getInstance().getCommand("C1").execute();
        Assert.assertEquals(command1,1);

        int command2 = Factory.getInstance().getCommand("C2").execute();
        Assert.assertEquals(command2,2);

        int command3 = Factory.getInstance().getCommand("C3").execute();
        Assert.assertEquals(command3,3);

    }
}
