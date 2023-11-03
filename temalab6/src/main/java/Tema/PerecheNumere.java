package Tema;

public class PerecheNumere {

        private int numar1;
        private int numar2;

        public PerecheNumere() {
        }

        public PerecheNumere(int numar1, int numar2) {
            this.numar1 = numar1;
            this.numar2 = numar2;
        }


        public int getNumar1() {
            return numar1;
        }

        public void setNumar1(int numar1) {
            this.numar1 = numar1;
        }

        public int getNumar2() {
            return numar2;
        }

        public void setNumar2(int numar2) {
            this.numar2 = numar2;
        }

        @Override
        public String toString() {
            return "PerecheNumere{" +
                    "numar1=" + numar1 +
                    ", numar2=" + numar2 +
                    '}';
        }

        //Fibonacci
        public boolean suntConsecutiveInFibonacci() {
            int a = numar1;
            int b = numar2;
            while (a > 0 && b > 0) {
                int temp = a;
                a = b;
                b = temp - b;
            }
            return (a == 0 && b == 1) || (a == 1 && b == 0);
        }

        // cmmc
        public int cmmc() {
            int a = numar1;
            int b = numar2;
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        // suma egala
        public boolean auSumaCifrelorEgala() {
            int sumaCifre1 = 0;
            int sumaCifre2 = 0;
            int n1 = numar1;
            int n2 = numar2;
            while (n1 > 0) {
                sumaCifre1 += n1 % 10;
                n1 /= 10;
            }
            while (n2 > 0) {
                sumaCifre2 += n2 % 10;
                n2 /= 10;
            }
            return sumaCifre1 == sumaCifre2;
        }

        // nr cifre pare
        public boolean auAcelasiNrCifrePare() {
            int numCifrePare1 = 0;
            int numCifrePare2 = 0;
            int n1 = numar1;
            int n2 = numar2;
            while (n1 > 0) {
                int cifra = n1 % 10;
                if (cifra % 2 == 0) {
                    numCifrePare1++;
                }
                n1 /= 10;
            }
            while (n2 > 0) {
                int cifra = n2 % 10;
                if (cifra % 2 == 0) {
                    numCifrePare2++;
                }
                n2 /= 10;
            }
            return numCifrePare1 == numCifrePare2;
        }


}
