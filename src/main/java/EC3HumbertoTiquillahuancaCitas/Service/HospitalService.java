package EC3HumbertoTiquillahuancaCitas.Service;

import java.util.List;

import EC3HumbertoTiquillahuancaCitas.Model.Hospital;



public interface HospitalService {
	
	void guardar(Hospital hospital);
	void actualizar(Hospital hospital);
	void eliminar(Integer id);
	List<Hospital> listar();
	Hospital obtener(Integer id);

}
