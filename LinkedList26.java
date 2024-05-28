public class LinkedList26 {
    Node26 head;

    public boolean isEmpty(){
        return (head == null);
    }

    public void print(){
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node26 currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }

            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input){
        Node26 newNode = new Node26(input, null);

        if (isEmpty()){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input){
        Node26 newNode = new Node26(input, null);

        if (isEmpty()){
            head = newNode;
        } else {
            Node26 currentNode = head;

            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input){
        Node26 newNode = new Node26(input, null);

        if (!isEmpty()){
            Node26 currentNode = head;

            do {
                if (currentNode.data == key){
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }

                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.print("Linked list kosong");
        }
    }

    public int getData(int index){
        Node26 currentNode = head;

        for (int i = 0; i < index; i++){
            currentNode = currentNode.next;
        }

        return currentNode.data;
    }

    public int indexOf(int key){
        Node26 currentNode = head;
        int index = 0;

        while (currentNode != null && currentNode.data != key){
            currentNode = currentNode.next;
            index++;
        }

        if (currentNode == null){
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst(){
        if (!isEmpty()){
            head = head.next;
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked list kosong");
        } else if (head.next == null){
            head = null;
        } else {
            Node26 currentNode = head;

            while (currentNode.next != null){
                if (currentNode.next.next == null){
                    currentNode.next = null;
                    break;
                }

                currentNode = currentNode.next;
            }
        }
    }

    public void remove(int key){
        if (isEmpty()){
            System.out.println("Linked list kosong");
        } else if (head.data == key){
            removeFirst();
        } else {
            Node26 currentNode = head;

            while (currentNode != null){
                if (currentNode.next.data == key){
                    currentNode.next = currentNode.next.next;
                    break;
                }

                currentNode = currentNode.next;
            }
        }
    }

    public void insertBefore(int key, int input){
        Node26 newNode = new Node26(input, null);
        
        if (!isEmpty()){
            if (head.data == key){
                addFirst(input);
            } else {
                Node26 currentNode = head;

                while (currentNode.next != null){
                    if (currentNode.next.data == key){
                        newNode.next = currentNode.next;
                        currentNode.next = newNode;
                        break;
                    }
                    currentNode = currentNode.next;
                }
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void insertAt(int index, int key){
        if (index < 0){
            System.out.println("Index salah");
        } else if (index == 0){
            addFirst(key);
        } else {
            Node26 currentNode = head;
            for (int i = 0; i < index -1; i++){
            }

            currentNode.next = new Node26(key, currentNode.next);
            if (currentNode.next.next == null) currentNode = currentNode.next;
        }
    }

    public void removeAt(int index){
        if (index == 0){
            removeFirst();
        } else {
            Node26 temp = head;
            for (int i = 0; i < index -1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null){
            }
        }
    }
}