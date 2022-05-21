package task12class;

public class TextFile extends File {

    private String[] data;

    public TextFile(String name) {
        super(name);
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    public void addLine(String line) {
        String[] newData = new String[data == null ? 1 : data.length + 1];
       if (data != null){
           for (int l = 0; l < data.length; l++) {
               newData[l] = data[l];
           }
       }
       newData[data.length] = line;
       data = newData;
    }

    public void removeLine(int index){
        String[]newData = new String[data.length -1];
        for (int i = 0; i < index; i++) {
            newData[i] = data[i];
        }
        for (int i = index + 1; i < data.length; i++) {
            newData[i - 1] = data[i];
        }
        data = newData;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        if (data != null && data.length > 0) {
            for (String line : data) {
                text.append(line).append("\n");
            }
        }
        return text.toString();
    }
}
