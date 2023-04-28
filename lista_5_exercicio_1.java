import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Heroi h1 = new Heroi(1)
    }
    class Heroi {
        private int id;
        private String nome;
        private int quantidadeDeMoedasDeOuro;

        public Heroi(int id, String nome, int quantidadeDeMoedasDeOuro) {
            this.id = id;
            this.nome = nome;
            this.quantidadeDeMoedasDeOuro = quantidadeDeMoedasDeOuro;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getQuantidadeDeMoedasDeOuro() {
            return quantidadeDeMoedasDeOuro;
        }

        public void setQuantidadeDeMoedasDeOuro(int quantidadeDeMoedasDeOuro) {
            this.quantidadeDeMoedasDeOuro = quantidadeDeMoedasDeOuro;
        }
    }

    class Grupo {
        private ArrayList<Heroi> herois;
        private int totalMoedasDeOuro;

        public Grupo() {
            this.herois = new ArrayList<>();
            this.totalMoedasDeOuro = 0;
        }

        public void adicionarHeroi(Heroi heroi) {
            if (this.herois.contains(heroi)) {
                System.out.println("O herói já está no grupo");
                return;
            }

            this.herois.add(heroi);
            this.totalMoedasDeOuro += heroi.getQuantidadeDeMoedasDeOuro();

            System.out.println("O heroi " + heroi.getNome() + " foi adicionado ao grupo!");
        }

        public void removerHeroi(int idHeroi) {
            Heroi heroiRemovido = null;

            for (Heroi heroi : this.herois) {
                if (heroi.getId() == idHeroi) {
                    heroiRemovido = heroi;
                    break;
                }
            }

            if (heroiRemovido == null) {
                System.out.println("O herói não está no grupo");
                return;
            }

            this.herois.remove(heroiRemovido);
            this.totalMoedasDeOuro -= heroiRemovido.getQuantidadeDeMoedasDeOuro();

            System.out.println("O heroi " + heroiRemovido.getNome() + " foi removido do grupo!");
        }

        public ArrayList<Heroi> getHerois() {
            return herois;
        }

        public void setHerois(ArrayList<Heroi> herois) {
            this.herois = herois;
        }

        public int getTotalMoedasDeOuro() {
            return totalMoedasDeOuro;
        }

        public void setTotalMoedasDeOuro(int totalMoedasDeOuro) {
            this.totalMoedasDeOuro = totalMoedasDeOuro;
        }
    }
}

