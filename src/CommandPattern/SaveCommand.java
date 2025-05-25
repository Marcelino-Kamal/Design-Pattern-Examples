package CommandPattern;

public class SaveCommand implements command {

    private Button btn;

    public SaveCommand(Button btn){
        this.btn=btn;
    }


    @Override
    public void execute() {
       btn.save();
    }

}
