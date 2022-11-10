package mediatheque;
public class BookPrinter implements ItemVisitor {
    public void visit(Book i){
     System.out.println("Livre :"+ i.getTitle() + " écrit par " + i.getAuthor());
    }
    public void visit(CD i){
        
    }
}
