public class H5D_TallyCounter {
    private int n;
    private int undo;
    private int l;
    public H5D_TallyCounter(){
        n =0;}

    public void click(){
        if(n <=(l -1))
        {
            n++;
            undo = n;
        }
        else
            System.out.println("sorry you are finihed");

    }

    public int getClick(){return n;}

    public void reset(){
        n =0;}
    public void undo(){
        if(n == undo)
        {
            n = n -1;

        }
        else
            System.out.println("sorry you are finished");

    }
    public void setL(int l)
    {    if(l>0)
        this.l =l;
    else
        System.out.println("you entered a rong number");
    }
}
