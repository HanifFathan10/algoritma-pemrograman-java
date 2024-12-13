package Method;

public class Sort {
    static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    static void Bubble(int[] data) {
        for(int i = 1; i < data.length; i++) {
            for(int j = data.length - 1; j >= i; j--) {
                if(data[j-1] > data[j]) {
                    swap(data, j-1, j);
                }
            }
        }
    }

    static void InsertionAsc(int[] data) {
        int i, j, temp;
        for(i = 1; i < data.length; i++) {
            temp = data[i];
            for(j = i - 1; (j >= 0) && (data[j] > temp); j--) {
                data[j+1] = data[j];
            }
            data[j+1] = temp;
        }
    }

    static void InsertionDesc(int[] data) {
        int i, j, temp;
        for(i = 1; i < data.length; i++) {
            temp = data[i];
            for(j = i - 1; (j >= 0) && (data[j] < temp); j--) {
                data[j+1] = data[j];
            }
            data[j+1] = temp;
        }
    }

    public static void SelectionAscending(int[] data) {
        int i, j, Imak;
        for(i = data.length - 1; i > 0; i--) {
            Imak = i;
            for (j = i - 1; j >= 0; j--) {
                if (data[j] > data[Imak]) {
                    Imak = j;
                }
                Sort.swap(data, i, Imak);
            }
        }
    }

    public static void SelectionDescending(int[] data) {
        int i, j, Imak;
        for(i = data.length - 1; i > 0; i--) {
            Imak = i;
            for (j = i - 1; j >= 0; j--) {
                if (data[j] < data[Imak]) {
                    Imak = j;
                }
                Sort.swap(data, i, Imak);
            }
        }
    }
}
