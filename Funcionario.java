import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private int id;
    private int salario;
    private LocalDate DataAdimissão;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdimissão() {
        return DataAdimissão;
    }
    public void setDataAdimissão(LocalDate dataAdimissão) {
        DataAdimissão = dataAdimissão;
    }

    public void CalcularAumento(LocalDate DataAumento){
        if (this.DataAdimissão.isBefore(DataAumento)){
            System.out.println("Voçê possue um aumento!!!");
            AplicarAumento();
            System.out.println("O novo salário é de: " + this.salario);
        }else{
            System.out.println("Voçê não possue aumento!!!");
        }
    }

    public void AplicarAumento(){
        this.salario += 500;
    }


    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        
        funcionario1.setNome("Carlos");
        funcionario1.setId(001);
        funcionario1.setSalario(1430);
        funcionario1.setDataAdimissão(LocalDate.of(2000, 04, 13));
        
        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getId());
        System.out.println(funcionario1.getSalario());
        System.out.println(funcionario1.getDataAdimissão());

        funcionario1.CalcularAumento(LocalDate.of(2003, 02, 18));

    }
    
}