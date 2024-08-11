package queue;

//FIFO (First In First Out)
//Last is useful when an element is removed and need to be returned
//java ant
public class Queue {

    public int queueSize;
    public int[] data;
    //When add the first element, both top & list are added.
    //On the contrary the same thing
    public int top = -1;
    public int last = -1;

    public Queue(int queueSize) {
        this.queueSize = queueSize;
        this.data = new int[queueSize];
    }

    public boolean isFull(){
        if (last > top)
            return (last - top) == queueSize - 1;
        return (top - last) == queueSize - 1;
    }

    public boolean isEmpty(){ return last == -1; }

    public void enqueue(int value){
        if (isFull())
            System.out.println("Full queue");
        else if (last != -1){
            if (last != queueSize - 1)
                last++;
            else
                last=0;
            data[last] = value;
        }
        else {
            last++;
            top++;
            data[last] = value;
        }
    }

    //Take the last
    public void dequeue(){
        if (isEmpty()){
            System.out.println("Empty queue");
        }
        else if (last == top){
            top = -1;
            last = -1;
        }
        else {
            if (top != queueSize - 1)
                top++;
            else
                top = 0;
        }
    }

    public void print(){

        if (isEmpty())
            System.out.println("Empty queue");
        else{
            //Separated Intervals ( top --- ,  ---- last)
            if (top > last)
                for (int i = 0; i <= queueSize - 1; i++) {
                    if (i >= top || i <= last)
                        System.out.println(data[i]);
                }
            //Joined Intervals (top ---- last)
            else
                for (int i = 0; i <= queueSize - 1; i++) {
                    if (i >= top && i <= last)
                        System.out.println(data[i]);
                }
        }
    }
}
