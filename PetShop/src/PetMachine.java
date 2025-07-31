public class PetMachine {

    private boolean clean =  true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;



    public void takeAShower(){
        if(this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
        }

        this.water -=10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + "está limpo");
    }

    public void addWater(){
        if (water == 30){
            System.out.println("A máquina já está cheia de água.");
        }
            water += 2;

    }

    public void addShampoo(){
        if (shampoo == 30){
            System.out.println("A capacidade de shampoo da máquina está no máximo.");
        }
            water += 2;

    }

    public int getShampoo() {
        return shampoo;
    }

    public int getWater() {
        return water;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A máquina não está limpa. Por favor, limpe-a antes de colocar um pet.");
            return;
        }
        if(hasPet()){
            System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento.");
        }

        this.pet = pet;
    }

    public void removePet() {
        this.clean = this.pet.isClean();

        System.out.println("O pet " + this.pet.getName() + " está limpo");

        this.pet = null;
    }

    public void wash(){
        this.water -=10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina foi limpa.");
    }
}
