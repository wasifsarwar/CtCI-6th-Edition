package  Q_educative_stacks_using_queues;

import java.util.ArrayDeque;
import java.util.EmptyStackException;
import java.util.Queue;

import CtCILibrary.AssortedMethods;
class stack_using_queue_class {
    public class stack_using_queue {
        //TODO: Write - Your - Code

       public Queue<Integer> queue1 = new ArrayDeque<Integer>();
       public Queue<Integer> queue2 = new ArrayDeque<Integer>();


       public void push(int data) {
            queue1.add(data);

        }

        public boolean isEmpty() {
            return queue1.size() == 0 && queue2.size() == 0;
        }

        public int pop() throws Exception {
            if (isEmpty()) {
                throw new EmptyStackException();
            }

            while (queue1.size() > 1) {
                queue2.add(queue1.remove());
            }

            int value = queue1.remove();


            return value;

        }

       public void swap() {
           Queue<Integer> queue3 = queue1;
           queue1 = queue2;
           queue2 = queue3;
       }

    }
    public static void main(String[] args) {
        try {
            stack_using_queue_class sqc = new stack_using_queue_class();
            stack_using_queue_class.stack_using_queue sq = sqc.new stack_using_queue();

            System.out.println("sq.push(1), sq.push(2)");
            sq.push(1);
            sq.push(2);

            System.out.println("sq.pop() = "+ (sq.pop()));

            System.out.println("sq.push(3)");

            sq.push(3);
            System.out.println("sq.pop() = "+ (sq.pop()));

        }
        catch(Exception ex){
        }
    }

}