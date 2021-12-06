# pilhas são estruturas de dados que podem adicionar dados ao final ou remover do final
class Stack:
    """Cria uma estrutura de dados stack(pilha)"""
    stack = []

    @classmethod
    def add(cls, valor):
        """Adiciona valor ao final da pilha"""
        Stack.stack.append(valor)

    @classmethod
    def pop(cls):
        """Remove e retorna o último valor"""
        valor = Stack.stack.pop()
        return valor

    @classmethod
    def peek(cls):
        """Retorna o último valor sem remover"""
        return Stack.stack[len(Stack.stack) - 1]

    @classmethod
    def size(cls):
        """retorna o  tamanho da pilha"""
        return len(Stack.stack)


class Main:
    @staticmethod
    def main():
        Stack.add(3)
        Stack.add("oi")
        print(Stack.stack)
        print(Stack.size())
        Stack.pop()
        print(Stack.stack)
        print(Stack.peek())


if __name__ == '__main__':
    Main.main()
