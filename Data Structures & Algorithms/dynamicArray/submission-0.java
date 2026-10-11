class DynamicArray {

    private int capacity = 0;
    private int size = 0;
    private int[] arr;


    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[this.capacity];
    }

    public int get(int i) {

        return arr[i];

    }

    public void set(int i, int n) {

        arr[i] = n;
    }

    public void pushback(int n) {

        if (size == capacity){
            resize();
        }

        arr[size] = n;
        size ++;

    }

    public int popback() {

        if (size > 0){
            size --;
        }

        int val = arr[size];
        arr[size] = 0;
        return val;

    }

    private void resize() {
        int newCap = capacity * 2;
        int[] newArr = new int[newCap];
        for (int i = 0; i < size; i++){
            newArr[i] = arr[i];
        }

        arr = newArr;
        capacity= newCap;

    }

    public int getSize() {

        return size;

    }

    public int getCapacity() {

        return capacity;
    }
}
