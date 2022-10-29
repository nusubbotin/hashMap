package passport;

import java.util.*;

public class PassportSet {
    Set<Passport> passportDb = new HashSet<>();

    public void addPasport(Passport passport){
        //passportDb.add(passport);
        for (Iterator<Passport> it = passportDb.iterator(); it.hasNext(); ) {
            if (Objects.equals(((Passport) it.next()).hashCode(), passport.hashCode())) {
                it.remove();
            }
        }
        passportDb.add(passport);
    }

    public Passport getPasportInfo(String passportNumber){
        System.out.println("Поиск по паспорту: " + passportNumber);
        for (Passport passport : passportDb) {
            if (Objects.equals(passport.getPassportNumber().hashCode(), passportNumber.hashCode())) {
                return passport;
            }
        }
        return null;
    }

    public String toString() {
        return Arrays.toString(passportDb.toArray()) + " SIZE="+ passportDb.size();
    }
}
