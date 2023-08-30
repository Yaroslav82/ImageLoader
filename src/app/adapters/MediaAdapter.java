package app.adapters;

import app.exceptions.ImageFormatException;
import app.viewers.AdvancedMediaViewer;
import app.viewers.MediaViewer;
import app.viewers.PngViewer;

public class MediaAdapter implements MediaViewer {

    private AdvancedMediaViewer mediaViewer;

    public MediaAdapter() {
        setMediaViewer(new PngViewer());
    }

    public void setMediaViewer(AdvancedMediaViewer mediaViewer) {
        this.mediaViewer = mediaViewer;
    }

    @Override
    public void view(String fileName) {
        try {
            mediaViewer.viewAdvanced(fileName);
        } catch (ImageFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
