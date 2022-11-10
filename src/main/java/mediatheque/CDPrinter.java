package mediatheque;

public class CDPrinter implements ItemVisitor{
    public void visit(Book i){

    }
    public void visit(CD i){
        System.out.println("CD :"+ i.getTitle() + " qui possède " + i.getNumberOfTracks()+ " morceaux.");
    } 
}