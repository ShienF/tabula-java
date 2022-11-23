package technology.tabula;

public enum OutputFormat {
    CSV, TSV, JSON;
    static String[] formatNames() {
        OutputFormat[] values = OutputFormat.values();
        String[] rv = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            rv[i] = values[i].name();
        }
        return rv;
    }
}
