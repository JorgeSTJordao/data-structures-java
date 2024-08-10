package pile;

//LIFO (Last In Last Out)
public class Pile {

    final private int pileSize = 3;
    private int index = -1; //pattern value
    final private int[] data = new int[pileSize];

    public boolean isFull(){
        return (pileSize - 1) == index;
    }

    public boolean isEmpty(){
        return index == -1;
    }

    public void pileUp(int value){
        if (isFull())
            System.out.println("Full pile");
        else {
            index++;
            data[index] = value;
        }
    }


    public void unstack(){
        if (isEmpty()){
            System.out.println("Empty pile");
        }
        else
            index--;
    }

    public void print(){

        if (isEmpty())
            System.out.println("Empty pile");
        else{
            for (int i = 0; i <= index; i++) {
                System.out.println(data[i]);
            }
        }
    }
}
