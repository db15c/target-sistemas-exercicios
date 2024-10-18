import java.lang.reflect.Array;

public class FindLogic {
    public static void main(String[] args) {

        System.out.println("a) Next element: " + nextOddNumber(7));
        System.out.println("b) Next element: " + nextPowerOfTwo(64));
        System.out.println("c) Next element: " + nextSquareNumber(36));
        System.out.println("d) Next element: " + nextEvenSquare(64));
        System.out.println("e) Next element: " + nextFibonacci(8));
        }

        // a) 1, 3, 5, 7;
        // visualmente eu percebi que é i + 2;
        public static int nextOddNumber(int current) {
            return current + 2;
        }

        // b) 2, 4, 8, 16, 32, 64
        // Sequencia de potenciação do 2
        public static int nextPowerOfTwo(int current) {
            return current * 2;
        }

        // 0, 1, 4, 9, 16, 25, 36
        // quadrados perfeitos
        public static int nextSquareNumber(int current) {
            int n = (int) Math.sqrt(current);
            return (n + 1) * (n + 1);
        }

        // 4, 16, 36, 64,
        // são quadrados de números pares
        public static int nextEvenSquare(int current) {
            int n = (int) Math.sqrt(current);
            if (n % 2 != 0) n++;
            return (n + 2) * (n + 2);
        }

        //  Fibonacci do primeiro exercício
        public static int nextFibonacci(int current) {
            int a = 0, b = 1;
            while (b <= current) {  // Encontra o próximo número de Fibonacci
                int next = a + b;
                a = b;
                b = next;
            }
            return b;
        }

        // f) Não aparenta ter lógica matemática, infelizmente não consegui resolver.


    }

    // Aproveito o mesmo para realizar o exercício das três lâmpadas:

    /*
    Como eu já conhecia o referido exercício, sei que devemos ligar duas lâmpadas e aguardar um tempo,
    após certo tempo desligamos uma delas e então teremos:
    - 1 interruptor ligado, 1 acabou de ser desligado e o outro nem foi tocado.
    - Nas salas temos 1 lâmpada acessa (corresponde ao interruptor que ficou ligado),
    1 lâmpada desligada (corresponde ao que nem foi tocado)
    1 lâmpada desligada, poréeeeeem, quente. Então essa lâmpada pertence ao interruptor que acabou de ser desligado.

    TODO
    Caro Recrutador,
    levei aproximadamente 2 horas fazendo o exercício, gostaria do mesmo comprometimento e ao menos receber um feedback,
    no caso de negativa da empresa ao menos eu sei onde posso melhorar (isso ajuda o mercado como um todo).
    */




