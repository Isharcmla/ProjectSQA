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
import java.lang.Long;
import java.lang.Boolean;

public class TimeSeries_removeAgedItems_2792143593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3282;
     Object term3333;
     Object term3335;
     Object term14654;

    public TimeSeries_removeAgedItems_2792143593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3307 = new ArrayList();
        term3282 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3327 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3328 = (Object[]) newArray("java.lang.Object", 0);
        Object term3329 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3330 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3331 = newInstance(Class.forName("java.lang.Object"));
        setField(term3282, term3282.getClass(), "domain", "VeDtgDzGAN");
        setField(term3282, term3282.getClass(), "range", "aWYOWZFyaX");
        setField(term3282, term3282.getClass(), "timePeriodClass", null);
        setField(term3282, term3282.getClass(), "data", term3307);
        setIntField(term3282, term3282.getClass(), "maximumItemCount", -817164822);
        setLongField(term3282, term3282.getClass(), "maximumItemAge", 4178434741742309755L);
        setDoubleField(term3282, term3282.getClass(), "minY", 0.32554480512985284);
        setDoubleField(term3282, term3282.getClass(), "maxY", 0.8924855581421237);
        setField(term3282, term3282.getClass(), "key", null);
        setField(term3282, term3282.getClass(), "description", "BRIVNtfUWU");
        setField(term3327, term3327.getClass(), "listenerList", term3328);
        setField(term3282, term3282.getClass(), "listeners", term3327);
        setField(term3330, term3330.getClass(), "map", null);
        setField(term3329, term3329.getClass(), "map", term3330);
        setField(term3329, term3329.getClass(), "source", term3331);
        setField(term3282, term3282.getClass(), "propertyChangeSupport", term3329);
        setBooleanField(term3282, term3282.getClass(), "notify", true);
        term3333 = new Long(-2068172595987555756L);
        term3335 = new Boolean(true);
        ArrayList term14659 = new ArrayList();
        term14654 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term14663 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term14664 = (Object[]) newArray("java.lang.Object", 0);
        Object term14665 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term14666 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term14667 = newInstance(Class.forName("java.lang.Object"));
        setField(term14654, term14654.getClass(), "domain", "VeDtgDzGAN");
        setField(term14654, term14654.getClass(), "range", "aWYOWZFyaX");
        setField(term14654, term14654.getClass(), "timePeriodClass", null);
        setField(term14654, term14654.getClass(), "data", term14659);
        setIntField(term14654, term14654.getClass(), "maximumItemCount", -817164822);
        setLongField(term14654, term14654.getClass(), "maximumItemAge", 4178434741742309755L);
        setDoubleField(term14654, term14654.getClass(), "minY", 0.32554480512985284);
        setDoubleField(term14654, term14654.getClass(), "maxY", 0.8924855581421237);
        setField(term14654, term14654.getClass(), "key", null);
        setField(term14654, term14654.getClass(), "description", "BRIVNtfUWU");
        setField(term14663, term14663.getClass(), "listenerList", term14664);
        setField(term14654, term14654.getClass(), "listeners", term14663);
        setField(term14666, term14666.getClass(), "map", null);
        setField(term14665, term14665.getClass(), "map", term14666);
        setField(term14665, term14665.getClass(), "source", term14667);
        setField(term14654, term14654.getClass(), "propertyChangeSupport", term14665);
        setBooleanField(term14654, term14654.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term3333;
        args[1] = term3335;
        callMethod(klass, "removeAgedItems", argTypes, term3282, args);
        assertTrue(recursiveEquals(term3282, term14654));
        assertTrue(recursiveEquals(term3333, -2068172595987555756L));
        assertTrue(recursiveEquals(term3335, true));
    }

};


