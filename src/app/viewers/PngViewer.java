package app.viewers;

import app.exceptions.ImageFormatException;

public class PngViewer implements AdvancedMediaViewer {

    @Override
    public void viewAdvanced(String fileName) throws ImageFormatException {
        if (fileName.endsWith(".png")) {
            System.out.println("Viewing png file: " + fileName);
        } else {
            throw new ImageFormatException("Image format is incorrect");
        }
    }
}
