package questions.linked_lists;

public class SumLists {
    public static Node<Integer> sumReverse(Node<Integer> n1, Node<Integer> n2) throws Exception {
        if (n1 == null || n2 == null) {
            throw new Exception();
        }
        Node<Integer> sum = new Node<>();
        Node<Integer> currSum = sum;
        int reminder = 0;
        int nextReminder = 0;
        do {
            int sumValues = 0;
            if (n1 != null) {
                sumValues += n1.getValue();
                n1 = n1.getNext();
            }
            if (n2 != null) {
                sumValues += n2.getValue();
                n2 = n2.getNext();
            }
            reminder = nextReminder;
            sumValues += reminder;
            int num = sumValues;
            nextReminder = 0;
            if (sumValues >= 10) {
                num = sumValues % 10;
                nextReminder = 1;
            }
            sum.setValue(num);
            sum = sum.getNext();
        }
        while (n1 != null || n2 != null);
        if (reminder != 0) {
            sum.setValue(reminder);
        }
        return currSum;
    }
}
