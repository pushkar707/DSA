import java.util.Arrays;

public class SortedQueue {
    int[] items;
    int front;
    int rear;
    int count;
    int size;

    SortedQueue(int size){
        items = new int[size];
        front = -1;
        rear=0;
        this.size = size;
        count = 0;
    }

    void enqueue(int val){
        if(count == size){
            System.out.println("Queue is full");
            return;
        }

        int i=0;
        int temp=0;
        rear = rear % size;

        for(i=(front+1)%size; i<=rear; i++){
            int num = items[i];
            if(num > val){
                items[i] = val;
                temp = num;
                break;
            }
        }

        if(temp == 0){
            items[rear++] = val;
            count++;
            return;
        }


        for(int j=rear; j>i+1; j--){
            items[j] = items[j-1];
        }

        items[i+1] = temp;
        rear++;
        count++;
    }

    int dequeue() {
        if(count == 0){
            System.out.println("Queue is empty");
            return 0;
        }

        front = (front+1) % size;        
        int val = items[front];
        items[front] = 0;
        count--;
        return val;
    }

    public String toString(){
        return Arrays.toString(items);
    }

}
