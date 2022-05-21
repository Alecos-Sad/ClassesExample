package task12class;

public abstract class Directory extends File {

    private TextFile[] files;

    public Directory(String name) {
        super(name);
    }

    public TextFile[] getFiles() {
        return files;
    }

    public void setFiles(TextFile[] files) {
        this.files = files;
    }
}
