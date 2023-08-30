package app.viewers;

import app.exceptions.ImageFormatException;

public interface AdvancedMediaViewer {

    void viewAdvanced(String fileName) throws ImageFormatException;
}