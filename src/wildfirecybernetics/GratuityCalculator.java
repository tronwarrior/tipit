/**
 * 
 */
package wildfirecybernetics;

import java.util.ArrayList;

/**
 * @author Tony
 *
 */
public class GratuityCalculator {
    private ArrayList<Encounter> _encounters;
    private Encounter _currentEncounter = null;

    public GratuityCalculator() {
        _encounters = new ArrayList<Encounter>();
        _encounters.add(_currentEncounter = new Encounter());
    }

    public int NewEncounter() {
        int rv = 0;
        _encounters.add(_currentEncounter = new Encounter());
        return rv;
    }

    public void DeleteCurrentEncounter() {
        if(_currentEncounter != null) {
            _encounters.remove(_currentEncounter);
            _currentEncounter = null;
        }
    }

    Encounter GetCurrentEncounter() {
        return _currentEncounter;
    }
}
