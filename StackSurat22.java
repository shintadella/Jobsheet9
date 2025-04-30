public class StackSurat22 {
    Surat22[] stack;
    int top;
    int size;

    public StackSurat22(int size) {
        this.size = size;
        stack = new Surat22[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat22 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat berhasil diterima.");
        } else {
            System.out.println("Stack surat penuh!");
        }
    }

    public Surat22 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat22 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    public void cariSurat(String namaMahasiswa) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat ditemukan:");
                stack[i].tampil();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + namaMahasiswa + " tidak ditemukan.");
        }
    }
}