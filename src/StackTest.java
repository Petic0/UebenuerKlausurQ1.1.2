public class StackTest {
    public static void main(String[] args) {
        Stack Stack1 = new Stack();
        Stack1.push(new Box("Nike"));
        Stack1.printStack();
        Stack1.push(new Box("Adidas"));
        Stack1.printStack();
        Stack1.push(new Box("Asics"));
        Stack1.printStack();
        Stack1.push(new Box("Puma"));
        Stack1.printStack();
        Stack1.pop();
        Stack1.printStack();
        Stack1.push(new Box("Vans"));
        Stack1.printStack();
        Stack1.pop();
        Stack1.printStack();
        Stack1.push(new Box("Crocs"));
        Stack1.printStack();
        Stack1.pop();
        Stack1.printStack();
        Stack1.pop();
        Stack1.printStack();
        Stack1.pop();
        Stack1.printStack();
        Stack1.pop();
        Stack1.printStack();
        System.out.println(Stack1.isEmpty());
        Stack1.printStack();
    }
}
