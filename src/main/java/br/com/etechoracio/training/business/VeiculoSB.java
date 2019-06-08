package br.com.etechoracio.training.business;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import br.com.etechoracio.training.dao.VeiculoDAO;
import br.com.etechoracio.training.model.Veiculo;

@Service
public class VeiculoSB extends BaseSB {

	private VeiculoDAO veiculoDAO;

	protected void postConstructImpl(){
		veiculoDAO = getDAO(VeiculoDAO.class);
	}

	private VeiculoDAO getDAO(Class<VeiculoDAO> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void save(veiculo veiculo) {
		VeiculoDAO.save(veiculo);
	}

}
