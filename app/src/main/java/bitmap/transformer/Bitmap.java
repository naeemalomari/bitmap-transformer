package bitmap.transformer;

//
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {
    private String inputFilePath;
    private String outputFilePath;
    private String newFileName;
    private BufferedImage image = null;

    public Bitmap(){}


    public Bitmap(String inputFilePath, String outputFilePath, String newFileName) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
        this.newFileName = newFileName;
    }

    public String getInputFilePath() {
        return inputFilePath;
    }

    public void setInputFilePath(String inputFilePath) {
        this.inputFilePath = inputFilePath;
    }

    public String getOutputFilePath() {
        return outputFilePath;
    }

    public void setOutputFilePath(String outputFilePath) {
        this.outputFilePath = outputFilePath;
    }

    public String getNewFileName() {
        return newFileName;
    }

    public void setNewFileName(String newFileName) {
        this.newFileName = newFileName;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public boolean readFile() {
        try {
            File file = new File(this.inputFilePath);
            this.image = ImageIO.read(file);
        } catch (IOException ioException) {
            ioException.getMessage();
            return false;
        }
        return true;
    }

    public boolean saveFile() {
        try {
            File outputFile = new File(this.outputFilePath + this.newFileName);
            ImageIO.write(this.image, "bmp", outputFile);
        } catch (IOException ioException) {
            ioException.getMessage();
            return false;
        }
        return true;
    }


    //convert to grayScale
    public boolean grayScale() {
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        for (int h = 1; h < height; h++) {
            for (int w = 1; w < width; w++) {
                int color = this.image.getRGB(w,h);
                int red = (color>>16)&0xff;
                int green = (color>>8)&0xff;
                int blue = color&0xff;
                //      calculate avg color
                int avg = (red+green+blue)/3;
                //    replace RGB value with avg
                color = (avg<<24) | (avg<<16) | (avg<<8) | avg;
                this.image.setRGB(w, h, color);
            }
        }
        return true;
    }



    public int imageFlipHorizontal() {
        int lastRGBVal = 0;
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                this.image.setRGB((width - 1) - x, y, this.image.getRGB(x, y));
                lastRGBVal = this.image.getRGB(width - 1 - x, y);
            }
        }
        return lastRGBVal;
    }



    public int imageFlipVertical() {
        int lastRGBVal = 0;
        int height = this.image.getHeight();
        int width = this.image.getWidth();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                this.image.setRGB(x, (height - 1) - y, this.image.getRGB(x, y));
                lastRGBVal = this.image.getRGB(x, height - 1 - y);
            }
        }

        return lastRGBVal;
    }

    @Override
    public boolean equals(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (this.getInputFilePath().equals(bitmap.inputFilePath) && this.outputFilePath.equals(bitmap.getOutputFilePath()) && this.newFileName.equals(bitmap.newFileName)) {
            return true;
        } else {
            return false;
        }
    }

}