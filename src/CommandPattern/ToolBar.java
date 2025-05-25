package CommandPattern;

public class ToolBar {

    private command c;

    public void setCommand(command c){
        this.c = c;
    }
    public void setBtn(){
        c.execute();
    }
    
}
