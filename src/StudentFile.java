import java.io.*;

public class StudentFile {
    public void writeFile(String pathOutput) {
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(pathOutput);
            objectOutputStream = new ObjectOutputStream(outputStream);
            ManagementStudent listStudent = new ManagementStudent();
            Student student1 = new Student("phi", 26, 0, "ha noi");
            listStudent.add(student1);
            Student student2 = new Student("dao", 26, 1, "ha noi");
            listStudent.add(student2);
            Student student3 = new Student("van", 26, 2, "ha noi");
            listStudent.add(student3);
            Student student4 = new Student("van", 26, 2, "ha noi");
            listStudent.add(student4);
            for (Student student : listStudent.listStudents) {
                objectOutputStream.writeObject(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void readFile(String pathInput) {
        FileInputStream inputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            inputStream = new FileInputStream(pathInput);
            objectInputStream = new ObjectInputStream(inputStream);
            Student student = null;
            while ((student = (Student) objectInputStream.readObject()) != null) {
                System.out.println(student.toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StudentFile studentFile = new StudentFile();
        studentFile.readFile("fileoutputobject.txt");
        //studentFile.writeFile("fileoutputobject.txt");
    }
}
