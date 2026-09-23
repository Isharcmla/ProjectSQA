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

public class TimeSeries_equals_62694408101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3948;
     Object term3999;
     Object term16789;
     Object term16803;

    public TimeSeries_equals_62694408101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3973 = new ArrayList();
        term3948 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3993 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3994 = (Object[]) newArray("java.lang.Object", 0);
        Object term3995 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3996 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3997 = newInstance(Class.forName("java.lang.Object"));
        setField(term3948, term3948.getClass(), "domain", "OqbwYQfvAe");
        setField(term3948, term3948.getClass(), "range", "tRxZafjqIx");
        setField(term3948, term3948.getClass(), "timePeriodClass", null);
        setField(term3948, term3948.getClass(), "data", term3973);
        setIntField(term3948, term3948.getClass(), "maximumItemCount", 1328271830);
        setLongField(term3948, term3948.getClass(), "maximumItemAge", -3842548265506930260L);
        setDoubleField(term3948, term3948.getClass(), "minY", 0.5617009352394552);
        setDoubleField(term3948, term3948.getClass(), "maxY", 0.09067063848644474);
        setField(term3948, term3948.getClass(), "key", null);
        setField(term3948, term3948.getClass(), "description", "DhjNLmRMCu");
        setField(term3993, term3993.getClass(), "listenerList", term3994);
        setField(term3948, term3948.getClass(), "listeners", term3993);
        setField(term3996, term3996.getClass(), "map", null);
        setField(term3995, term3995.getClass(), "map", term3996);
        setField(term3995, term3995.getClass(), "source", term3997);
        setField(term3948, term3948.getClass(), "propertyChangeSupport", term3995);
        setBooleanField(term3948, term3948.getClass(), "notify", false);
        term3999 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term16794 = new ArrayList();
        term16789 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term16798 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term16799 = (Object[]) newArray("java.lang.Object", 0);
        Object term16800 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term16801 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term16802 = newInstance(Class.forName("java.lang.Object"));
        setField(term16789, term16789.getClass(), "domain", "OqbwYQfvAe");
        setField(term16789, term16789.getClass(), "range", "tRxZafjqIx");
        setField(term16789, term16789.getClass(), "timePeriodClass", null);
        setField(term16789, term16789.getClass(), "data", term16794);
        setIntField(term16789, term16789.getClass(), "maximumItemCount", 1328271830);
        setLongField(term16789, term16789.getClass(), "maximumItemAge", -3842548265506930260L);
        setDoubleField(term16789, term16789.getClass(), "minY", 0.5617009352394552);
        setDoubleField(term16789, term16789.getClass(), "maxY", 0.09067063848644474);
        setField(term16789, term16789.getClass(), "key", null);
        setField(term16789, term16789.getClass(), "description", "DhjNLmRMCu");
        setField(term16798, term16798.getClass(), "listenerList", term16799);
        setField(term16789, term16789.getClass(), "listeners", term16798);
        setField(term16801, term16801.getClass(), "map", null);
        setField(term16800, term16800.getClass(), "map", term16801);
        setField(term16800, term16800.getClass(), "source", term16802);
        setField(term16789, term16789.getClass(), "propertyChangeSupport", term16800);
        setBooleanField(term16789, term16789.getClass(), "notify", false);
        term16803 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3999;
        Object retValue = callMethod(klass, "equals", argTypes, term3948, args);
        assertTrue(recursiveEquals(term3948, term16789));
        assertTrue(recursiveEquals(term3999, term16803));
        assertTrue(recursiveEquals(retValue, false));
    }

};


