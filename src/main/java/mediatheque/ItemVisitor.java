package mediatheque;

public interface ItemVisitor {
    void visit(Book i);
    void visit(CD i);
}
