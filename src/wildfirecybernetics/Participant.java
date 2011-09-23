package wildfirecybernetics;

public class Participant {
    private String _name;

    public Participant(String name)
    {
        _name = name;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }
}
