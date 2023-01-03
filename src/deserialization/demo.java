package deserialization;

import java.io.*;

public class demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        person p = new person();
//        p.setName("zqk");
//        p.setAge(10);
        //创建一个序列化的流对象
        //ObjectOutputStream将对象转化为字节数组
        //FileOutputStream将数组写入文件中
//        try {
//            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\SourceCodeRecognition\\out\\production\\SourceCodeRecognition\\p.data"));
//            oos.writeObject(p);
//            oos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //创建一个反序列化的流对象
        //ObjectInputStream将对象转化为字节数组
        //FileInputStream将数组写入文件中
        ObjectInputStream ois= new ObjectInputStream(new FileInputStream("E:\\\\SourceCodeRecognition\\\\out\\\\production\\\\SourceCodeRecognition\\\\p.data"));
        person pe = (person) ois.readObject();
        ois.close();
        System.out.println(pe.getName()+pe.getAge());
    }
}
