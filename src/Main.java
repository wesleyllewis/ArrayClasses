public class Main {

    public static void main(String[] args) {

        Seinfeld seinfeld = new Seinfeld();
        seinfeld.onAir = true;
        seinfeld.whatTime = 19.30;
        seinfeld.whatChannel = "TBS";
        seinfeld.worthWatching = true;

        Resume resume = new Resume();
        resume.name = "Bob Log III";
        resume.address = "123 House St.";
        resume.phone = 1234567;
        resume.referenceName = "David Yow";
        resume.referencePhone = 9876543;
        resume.workDates = "Oct/15-Jan/16";
        resume.workHistory = "Bob Loblaw's Law Blog";

        StanleyKubrick stanleykubrick = new StanleyKubrick();
        stanleykubrick.bestFilm = "Full Metal Jacket";
        stanleykubrick.isAlive = false;
        stanleykubrick.numberOfFilms = 16;
        stanleykubrick.winOscar = true;

        Mogwai mogwai = new Mogwai();
        mogwai.cute = true;
        mogwai.feedAfterMidnight = false;
        mogwai.isGremlin = false;
        mogwai.gizmo = "is Mogwai";

        AfternoonTraffic afternoonTraffic = new AfternoonTraffic();
        afternoonTraffic.construction = true;
        afternoonTraffic.howManyMiles = 7;
        afternoonTraffic.trafficJam = true;
        afternoonTraffic.interstates = new int[2];
    }
}
