package CommandPattern;

public class DeleteCommand implements command {

    private Button btn;

    public DeleteCommand(Button btn) {
         this.btn = btn;
    }

    @Override
    public void execute() {
       btn.delete();
    }

}
