import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;

@ManagedBean
@ViewScoped
public class GraficoBean implements Serializable {

	private BarChartModel barModel;

	@PostConstruct
	public void init() {
		criarBarModel();
	}

	public BarChartModel getBarModel() {
		return barModel;
	}

	private void criarBarModel() {
		barModel = new BarChartModel();
		barModel.setTitle("Clientes registrados");
		ChartSeries clientes = new ChartSeries();
		clientes.set("Janeiro", 100);
		clientes.set("Fevereiro", 200);
		clientes.set("Mar�o", 50);
		barModel.addSeries(clientes);
		barModel.setShowPointLabels(true);
	}
}
