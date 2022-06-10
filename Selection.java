// concept of selection sort .

int[] arr = {7, 8, 3, 2, 1};

        for (int i = 0; i <arr.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }

            }
            int temp;
            temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
