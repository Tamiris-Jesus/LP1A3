import java.util.ArrayList;
import java.util.List;

public class Departamento<T extends Funcionario & Ponto> {
    private List<T> funcionariosComPonto = new ArrayList<>();
    private List<Gerente> gerentes = new ArrayList<>();

    public void adicionarFuncionario(T funcionario) {
        funcionariosComPonto.add(funcionario);
    }

    public void adicionarGerente(Gerente gerente) {
        gerentes.add(gerente);
    }

    public List<Funcionario> listarFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.addAll(funcionariosComPonto);
        return funcionarios;
    }

    public List<T> listarAtrasados(int horaReferencia) {
        List<T> atrasados = new ArrayList<>();
        for (T funcionario : funcionariosComPonto) {
            if (funcionario instanceof Programador || funcionario instanceof Analista) {
                if (funcionario.getHoraEntrada() > horaReferencia) {
                    atrasados.add(funcionario);
                }
            }
        }
        return atrasados;
    }
}
