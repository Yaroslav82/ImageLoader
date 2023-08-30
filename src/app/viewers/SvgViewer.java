package app.viewers;

import app.exceptions.ImageFormatException;

public class SvgViewer implements AdvancedMediaViewer {

    @Override
    public void viewAdvanced(String fileName) throws ImageFormatException {
        if (fileName.endsWith(".svg")) {
            System.out.println("Viewing svg file: " + fileName);
        } else {
            throw new ImageFormatException("Image format is incorrect");
        }
    }
}
