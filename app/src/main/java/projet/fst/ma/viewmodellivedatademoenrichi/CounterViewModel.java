package projet.fst.ma.viewmodellivedatademoenrichi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {

    // Internal mutable data
    private final MutableLiveData<Integer> counterrrrr =
            new MutableLiveData<>(0);

    // Exposed read-only LiveData
    public LiveData<Integer> getCount() {
        return counterrrrr;
    }

    public void iiincrementtttt() {

        Integer current = counterrrrr.getValue();

        if (current != null) {
            counterrrrr.setValue(current + 1);
        }
    }

    public void deeecrementtttt() {

        Integer current = counterrrrr.getValue();

        if (current != null) {
            counterrrrr.setValue(current - 1);
        }
    }

    public void reset() {
        counterrrrr.setValue(0);
    }
}
