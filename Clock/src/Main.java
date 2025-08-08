public class Main {
    public static void main(String[] args) {
        Clock brlClock = new BRLClock();
        brlClock.setHour(14); // Corrigido para um valor válido
        brlClock.setMinute(30);
        brlClock.setSecond(15);

        System.out.println("Horário no Brasil:");
        System.out.println(brlClock.getTime()); // Agora o método existe

        Clock usClock = new USClock();
        usClock.convert(brlClock);

        System.out.println("\nHorário nos EUA (convertido):");
        System.out.println(usClock.getTime()); // Agora o método existe e está sobrescrito
    }
}