package app.viewers;

import app.adapters.MediaAdapter;

public class ImageViewer implements MediaViewer {

    private final MediaAdapter adapter = new MediaAdapter();

    @Override
    public void view(String fileName) {
        if (fileName.endsWith("jpg")) {
            System.out.println("Viewing jpg file: " + fileName);
        } else {
            if (fileName.endsWith("png")) {
                adapter.setMediaViewer(new PngViewer());
            } else if (fileName.endsWith("svg")) {
                adapter.setMediaViewer(new SvgViewer());
            }
            adapter.view(fileName);
        }
    }
}
