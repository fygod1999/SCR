package BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestDemo {

    /**
     * add方法当队列已满，会抛出异常，使用这种方法来插入队列，可以通过捕获具体的异常来处理
     */

    public static void testPut() throws Exception{
        BlockingQueue queue=new ArrayBlockingQueue<>(10);
        for(int i=0;i<10;i++){
            queue.put(i);
        }
        queue.add(11);
    }


}
