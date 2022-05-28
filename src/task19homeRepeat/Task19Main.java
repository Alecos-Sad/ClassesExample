package task19homeRepeat;

import java.util.Random;

public class Task19Main {
    public static void main(String[] args) {

        PhotoAlbum photoAlbum = new PhotoAlbum();

        for (int i = 0; i < 5; i++) {
            String name = getPhotoName();
            Photo photo = new Photo(name);
            photoAlbum.addPhoto(photo);
        }
        System.out.println("-----------------");

        Photo[] photos = photoAlbum.getPhotos();
        for (Photo photo : photos) {
            System.out.println(photo.getName());
        }


    }

    private static String getPhotoName() {
        StringBuilder name = new StringBuilder("name - ");
        for (int i = 0; i < 5; i++) {
            name.append((char) (new Random().nextInt(122 - 97) + 97));
        }
        return name.toString();
    }
}
