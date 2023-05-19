package repositorios;

import java.util.List;

public interface Repositorio <T>{

    public List<T> lister();

    public T obtenerPorId(Integer id);

    public void guardar(T t);

    public void eliminar(Integer id);

}
