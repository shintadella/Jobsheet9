public class StackTugasMahasiswa22 {
    Mahasiswa22[] stack;
    int top;
    int size;

    public StackTugasMahasiswa22(int size) {
        this.size = size;
        stack = new Mahasiswa22[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa22 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa22 pop() {
        if (!isEmpty()) {
            Mahasiswa22 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa22 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public Mahasiswa22 lihatTugasTerbawah() {
        if (!isEmpty()) {
            return stack[0]; 
        } else {
            System.out.println("Stack kosong! Tidak ada tugas di dasar stack.");
            return null;
        }
    }

    public int jumlahTugas() {
        return top + 1;
    }    

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.printf("%s\t%s\t%s\n", stack[i].nama, stack[i].nim, stack[i].kelas);
        }               
            System.out.println("");
        }

        public String konversiDesimalkeBiner(int nilai) {
            StackKonversi22 stack = new StackKonversi22();
            while (nilai != 0) {
                int sisa = nilai % 2;
                stack.push(sisa);
                nilai = nilai / 2;
            }
        
            String biner = new String();
            while (!stack.isEmpty()) {
                biner += stack.pop();
            }
            return biner;
        }
    }
