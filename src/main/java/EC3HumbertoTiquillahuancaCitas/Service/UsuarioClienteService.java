package EC3HumbertoTiquillahuancaCitas.Service;

import java.util.List;


import EC3HumbertoTiquillahuancaCitas.Model.UsuarioCliente;

public interface UsuarioClienteService {
	
	void guardar(UsuarioCliente userclient);
	void actualizar(UsuarioCliente userclient);
	void eliminar(Integer id);
	List<UsuarioCliente> listar();
	UsuarioCliente obtener(Integer id);

}
