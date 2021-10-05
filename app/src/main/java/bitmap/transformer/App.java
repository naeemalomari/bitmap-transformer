package bitmap.transformer;

public class App {
    public static void main(String[] args) {
<<<<<<< HEAD

        Bitmap bitmap1 = new Bitmap("./app/src/main/resources/Input/inputImage.bmp","./app/src/main/resources/Output/", "first.bmp");
=======
        Bitmap bitmap1 = new Bitmap("C:\\Users\\Student\\401Java\\bitmap-transformer\\app\\src\\main\\resources\\Input\\inputImage.bmp","C:\\Users\\Student\\401Java\\bitmap-transformer\\app\\src\\main\\resources\\Output\\", "first.bmp");
>>>>>>> 287d6dc2e7a41fe04f8756ab5e821edad5d22a3d

        bitmap1.readFile();
        bitmap1.grayScale();
        bitmap1.saveFile();

<<<<<<< HEAD
        Bitmap bitmap2 = new Bitmap("./app/src/main/resources/Input/inputImage.bmp","./app/src/main/resources/Output/", "second.bmp");
=======
        Bitmap bitmap2 = new Bitmap("C:\\Users\\Student\\401Java\\bitmap-transformer\\app\\src\\main\\resources\\Input\\inputImage.bmp","C:\\Users\\Student\\401Java\\bitmap-transformer\\app\\src\\main\\resources\\Output\\", "second.bmp");
>>>>>>> 287d6dc2e7a41fe04f8756ab5e821edad5d22a3d

        bitmap2.readFile();
        bitmap2.imageFlipHorizontal();
        bitmap2.saveFile();


<<<<<<< HEAD
        Bitmap bitmap3 = new Bitmap("./app/src/main/resources/Input/inputImage.bmp","./app/src/main/resources/Output/", "third.bmp");
=======
        Bitmap bitmap3 = new Bitmap("C:\\Users\\Student\\401Java\\bitmap-transformer\\app\\src\\main\\resources\\Input\\inputImage.bmp","C:\\Users\\Student\\401Java\\bitmap-transformer\\app\\src\\main\\resources\\Output\\", "third.bmp");
>>>>>>> 287d6dc2e7a41fe04f8756ab5e821edad5d22a3d

        bitmap3.readFile();
        bitmap3.imageFlipVertical();
        bitmap3.saveFile();


<<<<<<< HEAD
    }
=======
        }
>>>>>>> 287d6dc2e7a41fe04f8756ab5e821edad5d22a3d
}
