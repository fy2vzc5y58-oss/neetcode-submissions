class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[this.capacity];
    }

    public int get(int i) {
        if (i > size) {
            return -1;
        }

        return arr[i];
    }

    public void set(int i, int n) {
        int newVal = n;
        arr[i] = newVal;
    }

    public void pushback(int n) {

        if (size == capacity){
            resize();
        }

        arr[size] = n;
        size++;

    }

    public int popback() {

        if (size == 0){
            return -1;
        }

        size--;
        int val = arr[size];
        arr[size] = 0;
        return val;



    }

    private void resize() {
        int[] newArr = new int[capacity * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
        capacity = capacity * 2;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
