package task19class;

public class PhotoAlbum {

    private final Page[] pages;

    public PhotoAlbum() {
        this.pages = new Page[10];
        for (int i = 1; i < 10; i++) {
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
        System.out.println("Count photos: " + count);
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
        for (int i = 0; i <= pages.length; i++) {
            int pageNumber = pages[i].getNumber();
            Photo[] photos = getPhotos(pageNumber);
            if (photos.length == 0){
                break;
            }
            Photo[] temp = new Photo[result.length + photos.length];
            System.arraycopy(result, 0, temp, 0, result.length);
            int indx = 0;
            for (int j = result.length; j < temp.length; j++) {
                temp[j] = photos[indx];
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
        int indx = 0;
        Photo[] photos = new Photo[count];
        for (Page page : pages) {
            if (page.getNumber() == pageNumber) {
                for (Photo photo : page.getPhotos()) {

                    photos[indx] = photo;
                }
            }
        }
        return photos;
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
