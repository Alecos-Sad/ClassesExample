package task12class;

public class Task12Main {
    public static void main(String[] args) {


        String[] lines = {
                "Text1",
                "Text2",
                "Text3"
        };


        TextFile textFile = new TextFile("Diplom v.1");
        Folder folder = new Folder("Diplom");
        textFile.setData(lines);
        folder.setFiles(new TextFile[]{textFile});

        System.out.println("======");
        System.out.println(textFile);
        textFile = folder.getFiles()[0];
        textFile.addLine("Text4");
        System.out.println(textFile);
        System.out.println("============");
        textFile.removeLine(1);
        System.out.println(textFile);
    }
}
