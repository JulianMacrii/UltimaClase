package models;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

public class Productos {
    @Getter @Setter
    private Integer id;
    @Getter @Setter

    private String nombre;
    @Getter @Setter

    private Double precio;
    @Getter @Setter

    private Date fechaAlta;

    @Override
    public String toString() {
        return  "id=" + id +
                " | nombre='" + nombre + '\'' +
                " | precio=" + precio +
                " | fechaAlta=" + fechaAlta +
                '}';
    }
}
