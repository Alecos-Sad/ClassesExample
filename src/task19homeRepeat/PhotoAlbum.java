package task19homeRepeat;

public class PhotoAlbum {

    private final Page[] pages;

    public PhotoAlbum() {
        this.pages = new Page[10];
        for (int i = 1; i <= 10; i++) {
            pages[i - 1] = new Page(i);
        }
    }

    public void countPhotos() {
        int count = 0;
        for (Page page : pages) {
            for (Photo photo : page.getPhotos()) {
                count = photo == null ? count : ++count;
            }
        }
        System.out.println("Count  of Pages is: " + count);
    }

    public void addPhoto(Photo photo) {
        for (Page page : pages) {
            if (page.addPhoto(photo)) {
                break;
            }
        }
    }

    public Photo[] getPhotos() {
        Photo[] result = new Photo[0];
        for (Page page : pages) {
            int pageNumber = page.getNumber();
            Photo[] photos = getPhotos(page.getNumber());
            if (photos.length == 0) {
                break;
            }
            Photo[] temp = new Photo[result.length + photos.length];
            System.arraycopy(result, 0, temp, 0, result.length);
            int idx = 0;
            for (int j = result.length; j < temp.length; j++) {
                temp[j] = photos[idx];
                idx++;
            }
            result = temp;
        }
        return result;
    }

    public Photo[] getPhotos(int pageNumber) {
        int count = getCount(pageNumber);
        if (count == 0) {
            return new Photo[0];
        }
        int idx = 0;
        Photo[] newPhotos = new Photo[count];
        for (Page page : pages) {
            if (page.getNumber() == pageNumber) {
                for (Photo photo : page.getPhotos()) {
                    if (photo == null) {
                        break;
                    }
                    newPhotos[idx] = photo;
                    idx++;
                }
                break;
            }
        }
        return newPhotos;
    }

    private int getCount(int pageNumber) {
        int count = 0;
        for (Page page : pages) {
            if (page.getNumber() == pageNumber) {
                for (Photo photo : page.getPhotos()) {
                    count = photo == null ? count : ++count;
                }
            }
        }
        return count;
    }
}

