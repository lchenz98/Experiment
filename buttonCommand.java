package Experiment1;

import CS2114.Command;
import CS2114.Widget;

public class buttonCommand implements Command
{

    @Override
    public void execute(Widget trigger) 
    {
        System.out.println("Hello World!");
    }

}