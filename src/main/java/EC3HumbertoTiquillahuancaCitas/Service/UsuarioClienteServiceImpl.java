package EC3HumbertoTiquillahuancaCitas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EC3HumbertoTiquillahuancaCitas.Model.UsuarioCliente;
import EC3HumbertoTiquillahuancaCitas.Repository.UsuarioClienteRepository;

@Service
public class UsuarioClienteServiceImpl implements UsuarioClienteService {
	
	@Autowired
	private UsuarioClienteRepository rerpositorio;

	@Override
	public void guardar(UsuarioCliente userclient) {
		// TODO Auto-generated method stub
		rerpositorio.save(userclient);
	}

	@Override
	public void actualizar(UsuarioCliente userclient) {
		// TODO Auto-generated method stub
		rerpositorio.saveAndFlush(userclient);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		rerpositorio.deleteById(id);
	}

	@Override
	public List<UsuarioCliente> listar() {
		// TODO Auto-generated method stub
		return rerpositorio.findAll();
	}

	@Override
	public UsuarioCliente obtener(Integer id) {
		// TODO Auto-generated method stub
		return rerpositorio.findById(id).orElse(null);
	}

}
