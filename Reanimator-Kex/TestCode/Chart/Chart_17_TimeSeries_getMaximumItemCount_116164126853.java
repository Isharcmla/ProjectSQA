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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.time.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class TimeSeries_getMaximumItemCount_116164126853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563;
     Object term5625;

    public TimeSeries_getMaximumItemCount_116164126853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term588 = new ArrayList();
        term563 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term606 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term607 = (Object[]) newArray("java.lang.Object", 0);
        Object term608 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term609 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term610 = newInstance(Class.forName("java.lang.Object"));
        setField(term563, term563.getClass(), "domain", "IoAlmYsBwc");
        setField(term563, term563.getClass(), "range", "TEParAifyi");
        setField(term563, term563.getClass(), "timePeriodClass", null);
        setField(term563, term563.getClass(), "data", term588);
        setIntField(term563, term563.getClass(), "maximumItemCount", -1955890973);
        setLongField(term563, term563.getClass(), "maximumItemAge", 4872422362414183754L);
        setField(term563, term563.getClass(), "key", null);
        setField(term563, term563.getClass(), "description", "OWDIEULEFu");
        setField(term606, term606.getClass(), "listenerList", term607);
        setField(term563, term563.getClass(), "listeners", term606);
        setField(term609, term609.getClass(), "map", null);
        setField(term608, term608.getClass(), "map", term609);
        setField(term608, term608.getClass(), "source", term610);
        setField(term563, term563.getClass(), "propertyChangeSupport", term608);
        setBooleanField(term563, term563.getClass(), "notify", true);
        ArrayList term5630 = new ArrayList();
        term5625 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term5634 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term5635 = (Object[]) newArray("java.lang.Object", 0);
        Object term5636 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term5637 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term5638 = newInstance(Class.forName("java.lang.Object"));
        setField(term5625, term5625.getClass(), "domain", "IoAlmYsBwc");
        setField(term5625, term5625.getClass(), "range", "TEParAifyi");
        setField(term5625, term5625.getClass(), "timePeriodClass", null);
        setField(term5625, term5625.getClass(), "data", term5630);
        setIntField(term5625, term5625.getClass(), "maximumItemCount", -1955890973);
        setLongField(term5625, term5625.getClass(), "maximumItemAge", 4872422362414183754L);
        setField(term5625, term5625.getClass(), "key", null);
        setField(term5625, term5625.getClass(), "description", "OWDIEULEFu");
        setField(term5634, term5634.getClass(), "listenerList", term5635);
        setField(term5625, term5625.getClass(), "listeners", term5634);
        setField(term5637, term5637.getClass(), "map", null);
        setField(term5636, term5636.getClass(), "map", term5637);
        setField(term5636, term5636.getClass(), "source", term5638);
        setField(term5625, term5625.getClass(), "propertyChangeSupport", term5636);
        setBooleanField(term5625, term5625.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaximumItemCount", argTypes, term563, args);
        assertTrue(recursiveEquals(term563, term5625));
        assertTrue(recursiveEquals(retValue, -1955890973));
    }

};


