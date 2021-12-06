// pilhas -> estruturas para armazenamento e remoção ao final
public class Stack {
     String[] vetor;
     int index , index1;
     //construtor
    Stack(int tamanho){
        vetor = new String[tamanho];
        index = 0;
        index1 = 0;
    }

    boolean isFull(){
        if(index1 == vetor.length) return false;
        else return true;
    }
     void addStack(String valor){
       if(isFull()){
           vetor[index1] = valor;
           index1 += 1;
       }else System.out.println("Stack isn't void!");
    }

    String removeStack(){
        String valor = vetor[index1 - 1];
        index1 -= 1;
        for(int i = 0; i < index1 - 1; i++){
            vetor[i] = vetor[i];
        }
        return valor;
    }
    void print(){
        System.out.print("[");
        for(int i = 0; i < index1; i ++){
            System.out.print(vetor[i] + ", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args){
        Stack pilha = new Stack(10);
        pilha.addStack("4");
        pilha.addStack("2");
        pilha.addStack("4");
        pilha.addStack("5");
        pilha.print();
        System.out.println(pilha.removeStack());
    }
}
