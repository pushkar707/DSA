import java.util.Stack;

class MyQueue {
    private Stack<Integer> items = new Stack<>();
    private Stack<Integer> popItem = new Stack<>();

    void enqueue(int val){
        items.push(val);
    }

    int dequeue(){
        if(items.isEmpty() & popItem.isEmpty()){
            System.out.print("Queue is empty");
            return 0;
        }

        if(popItem.isEmpty()){
            while(!items.isEmpty()){
                popItem.push(items.pop());
            }
        }
        return popItem.pop();
    }    
}