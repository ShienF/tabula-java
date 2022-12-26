package technology.tabula.extractors;

import java.util.List;

import technology.tabula.rectangles.Page;
import technology.tabula.rectangles.Table;

public interface ExtractionAlgorithm {

    List<? extends Table> extract(Page page);
    String toString();
    
}
