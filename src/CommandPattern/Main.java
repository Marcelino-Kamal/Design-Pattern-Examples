package CommandPattern;

public class Main {

    public static void main(String[] args) {
        Button btn = new Button();
        command SaveCommand = new SaveCommand(btn);
        command DeleteCommand = new DeleteCommand(btn);

        ToolBar Tb = new ToolBar();

        Tb.setCommand(DeleteCommand);
        Tb.setBtn();

        Tb.setCommand(SaveCommand);
        Tb.setBtn();
    }
}
