package org.jfree.data.time;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.IndexOutOfBoundsException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class TimePeriodValues_getTimePeriod_214094787535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589;
     Object term642;

    public TimePeriodValues_getTimePeriod_214094787535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term614 = new ArrayList();
        term589 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term636 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term637 = (Object[]) newArray("java.lang.Object", 0);
        Object term638 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term639 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term640 = newInstance(Class.forName("java.lang.Object"));
        setField(term589, term589.getClass(), "domain", "IoAlmYsBwc");
        setField(term589, term589.getClass(), "range", "TEParAifyi");
        setField(term589, term589.getClass(), "data", term614);
        setIntField(term589, term589.getClass(), "minStartIndex", -469968304);
        setIntField(term589, term589.getClass(), "maxStartIndex", -1145578966);
        setIntField(term589, term589.getClass(), "minMiddleIndex", 679763016);
        setIntField(term589, term589.getClass(), "maxMiddleIndex", 1962444399);
        setIntField(term589, term589.getClass(), "minEndIndex", 767834723);
        setIntField(term589, term589.getClass(), "maxEndIndex", -602026508);
        setField(term589, term589.getClass(), "key", null);
        setField(term589, term589.getClass(), "description", "OWDIEULEFu");
        setField(term636, term636.getClass(), "listenerList", term637);
        setField(term589, term589.getClass(), "listeners", term636);
        setField(term639, term639.getClass(), "map", null);
        setField(term638, term638.getClass(), "map", term639);
        setField(term638, term638.getClass(), "source", term640);
        setField(term589, term589.getClass(), "propertyChangeSupport", term638);
        setBooleanField(term589, term589.getClass(), "notify", true);
        term642 = new Integer(-157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term642;
        try {
            callMethod(klass, "getTimePeriod", argTypes, term589, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


