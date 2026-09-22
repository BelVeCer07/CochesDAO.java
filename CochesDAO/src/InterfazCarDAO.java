public interface InterfazCarDAO {
    void insertar(Coche coche);
    List<Coches> obtenerTodo();
    List<Coches>obtenerMarca(String Marca);

}