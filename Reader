import java.util.Scanner;
public class Reader extends Thread {
        private Memory memory;
        Reader(Memory m){
            this.memory = m;
        }
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            while(true) {
                String inputString = scanner.nextLine();
                if (inputString.equals("stop")) break;
                Number number = new Number(inputString);
                int value = number.summ();
                if (value == 0) System.out.println("Incorrect input!");
                else memory.setRecord(inputString, value);

            }
            memory.deleteAll();
        }
    }

