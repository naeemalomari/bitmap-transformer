package bitmap.transformer;

public class App {
    public static void main(String[] args) {

        Bitmap bitmap1 = new Bitmap("./app/src/main/resources/Input/inputImage.bmp","./app/src/main/resources/Output/", "first.bmp");

        bitmap1.readFile();
        bitmap1.grayScale();
        bitmap1.saveFile();

        Bitmap bitmap2 = new Bitmap("./app/src/main/resources/Input/inputImage.bmp","./app/src/main/resources/Output/", "second.bmp");

        bitmap2.readFile();
        bitmap2.imageFlipHorizontal();
        bitmap2.saveFile();


        Bitmap bitmap3 = new Bitmap("./app/src/main/resources/Input/inputImage.bmp","./app/src/main/resources/Output/", "third.bmp");


        bitmap3.readFile();
        bitmap3.imageFlipVertical();
        bitmap3.saveFile();


    }

}
