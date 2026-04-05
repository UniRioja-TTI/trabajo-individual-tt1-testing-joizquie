package servicios;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ServicioContactoSim implements InterfazContactoSim {
    private List<DatosSolicitud> solicitudesTemporales = new ArrayList<>();
    private Random random = new Random();

    @Override
    public int solicitarSimulation(DatosSolicitud sol) {
        solicitudesTemporales.add(sol);
        return random.nextInt(1000, 9999);
    }

    @Override
    public DatosSimulation descargarDatos(int ticket) {
        return null;
    }

    @Override
    public List<Entidad> getEntities() {
        Entidad e1 = new Entidad();
        e1.setId(1);
        e1.setName("Planta Fotovoltaica A1");
        e1.setDescripcion("Ubicada en el sector norte del complejo");

        Entidad e2 = new Entidad();
        e2.setId(2);
        e2.setName("Aerogenerador E-44");
        e2.setDescripcion("Turbina de alta eficiencia");

        return List.of(e1, e2);
    }

    @Override
    public boolean isValidEntityId() {
        return true;
    }
}
