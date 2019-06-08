package br.com.etechoracio.training.view;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.etechoracio.training.business.VeiculoSB;
import br.com.etechoracio.training.model.Veiculo;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Controller
@Scope("view")
public class VeiculoMB extends BaseMB{
	@Autowired
	private VeiculoSB veiculoSB;

	private Veiculo edit = new Veiculo();
	
	public void onSave(){
		edit.getPalca().setVeiculo(edit);
		veiculoSB.save(edit);
		showInsertMessage();
	
	}
	
	private void showInsertMessage() {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage("Registro inserido");
		context.addMessage(null, message);
	}

	
}
