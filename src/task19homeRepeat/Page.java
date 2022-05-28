package task19homeRepeat;

public class Page {

    private final int number;
    private Photo[] photos;

    public Page(int number) {
        this.number = number;
        this.photos = new Photo[4];
    }

    public int getNumber() {
        return number;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public boolean addPhoto(Photo photo) {
        for (int i = 0; i < photos.length; i++) {
            if (photos[i] == null) {
                photos[i] = photo;
                System.out.println("Photo added!");
                return true;
            }
        }
        return false;
    }
}

