public class Stack {
    public Box zeiger;
    public Stack(){
        zeiger = new Box(null);
    }

    public boolean isEmpty() {
        return zeiger == null;
    }

    public void push(Box pBox) {
        if (pBox != null) {
            pBox.setBelow(zeiger);
            zeiger = pBox;
            System.out.println("Pushed " + pBox.getName() + " up!");
        }
    }

    public void pop() {
        if(!isEmpty()) {
            System.out.println("Poped " + top().getName() + "!");
            zeiger = zeiger.getBelow();
        }
    }


    public Box top() {
        return zeiger;
    }

    public void printStack() {
        Box countzeiger;
        countzeiger = top();
        while(countzeiger.getBelow() != null) {
            System.out.println(countzeiger.getName());
            countzeiger = countzeiger.getBelow();
        }
        System.out.println("------------------------");
    }
}

