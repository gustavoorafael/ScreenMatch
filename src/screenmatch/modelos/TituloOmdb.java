package screenmatch.modelos;

import java.util.Objects;

public class TituloOmdb {
    private final String title;
    private final String year;
    private final String runtime;

    public TituloOmdb(String title, String year, String runtime) {
        this.title = title;
        this.year = year;
        this.runtime = runtime;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getRuntime() {
        return runtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TituloOmdb that = (TituloOmdb) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(year, that.year) &&
                Objects.equals(runtime, that.runtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, runtime);
    }

    @Override
    public String toString() {
        return "TituloOmdb{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", runtime='" + runtime + '\'' +
                '}';
    }
}
