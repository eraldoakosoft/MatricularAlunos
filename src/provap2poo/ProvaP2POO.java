package provap2poo;

/**
 *ESSE PROJETO FOI A PROVA 2 DE POO, 
 * É UM PROGRAMA PARA GERISTRAR ALUNOS EM UMA TURMA DA FACULDADE
 * @author eraldo
 */
public class ProvaP2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Aluno aluno1 = new Aluno(023, "José");
        Aluno aluno2 = new Aluno(123, "Eraldo");
        Aluno aluno3 = new Aluno(121, "Bruno");
        Aluno aluno4 = new Aluno(123, "Igor");
        Aluno aluno5 = new Aluno(173, "Gabriel");
        Aluno aluno6 = new Aluno(183, "Paulo");
        Aluno aluno7 = new Aluno(193, "Igor Fagner");
        Turma turma = new Turma("ADS",60);
        Turma turma2 = new Turma("Jogos Digitais", 60);
        turma.matricularAluno(aluno1);
        turma.matricularAluno(aluno2);
        turma.matricularAluno(aluno3);
        turma.matricularAluno(aluno4);
        turma.registrarFalta(123);
        turma.registrarFalta(123);
        turma.atribuirNota(123, 10.0);
        turma.atribuirNota(121, 10.0);
        turma.listaTodos();
        turma.ListarAprovados();
        
        turma2.matricularAluno(aluno7);
        turma2.matricularAluno(aluno6);
        turma2.matricularAluno(aluno5);
        turma2.registrarFalta(173);
        turma2.registrarFalta(173);
        turma2.atribuirNota(173, 6.0);
        turma2.atribuirNota(183, 5.0);
        turma2.atribuirNota(193, 9.0);
        turma2.listaTodos();
        turma2.ListarAprovados();
        
        
    }
    
}
