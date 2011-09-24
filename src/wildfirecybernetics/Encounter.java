package wildfirecybernetics;

import java.util.ArrayList;
import java.util.Date;

public class Encounter {

    private ArrayList<Participant> _participants;
    private Date _date;
    private Check _check;

    public Encounter() {
        _check = new Check();
        _date = new Date();
        _participants = new ArrayList<Participant>();
        _participants.add(new Participant("Guest"));
    }

    public int AddParticipant(Participant participant) {
         _participants.add(participant);
        return 1;
    }

    public Date get_date() {
        return this._date;
    }

    public void set_date(Date date) {
        this._date = date;
    }

    public Check get_check() {
        return this._check;
    }

    public void set_check(Check check) {
        this._check = check;
    }
}
