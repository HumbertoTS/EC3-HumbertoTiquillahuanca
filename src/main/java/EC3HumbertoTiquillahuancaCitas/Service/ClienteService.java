package EC3HumbertoTiquillahuancaCitas.Service;

import java.util.List;

import EC3HumbertoTiquillahuancaCitas.Model.Cliente;

public interface ClienteService {

	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);
}
