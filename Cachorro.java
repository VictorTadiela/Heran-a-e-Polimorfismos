package herança_atv01;

class Cachorro extends Animal{

    @Override
    public void fazerSom() {
        super.fazerSom();
        System.out.println("cachorro late");
    }
}
