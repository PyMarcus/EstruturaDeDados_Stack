import java.util.Stack;


public class Stack_pilha {
    public static void main(String[] args){
        Stack pilha = new Stack();

        //adicionar:
        pilha.push("oi");
        pilha.push("oi");
        pilha.push("oi");
        pilha.push(1);

        System.out.println(pilha);
        //remover
        System.out.println(pilha.pop());
        //retorna objeto superior sem o remover
        System.out.println(pilha.peek());
        //tamanho
        System.out.println(pilha.size());
        //esvaziar
        pilha.clear();
        System.out.println(pilha);

    }
}
