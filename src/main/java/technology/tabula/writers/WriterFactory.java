package technology.tabula.writers;
import technology.tabula.OutputFormat;

public class WriterFactory {
    public Writer createWriter(OutputFormat outputFormat) {
        Writer writer = null;
        switch (outputFormat) {
            case CSV:
                writer = new CSVWriter();
                break;
            case JSON:
                writer = new JSONWriter();
                break;
            case TSV:
                writer = new TSVWriter();
                break;
        }
        return writer;
    }
}
