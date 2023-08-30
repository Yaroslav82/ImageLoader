package app;

import app.viewers.ImageViewer;
import app.viewers.MediaViewer;

public class Main {

    public static void main(String[] args) {
        MediaViewer viewer = new ImageViewer();

        viewer.view("sun.jpg");
        viewer.view("arrow.svg");
        viewer.view("man.png");
        viewer.view("sunrise.gif");
    }
}
