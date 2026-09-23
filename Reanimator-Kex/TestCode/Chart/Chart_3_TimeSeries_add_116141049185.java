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
import java.lang.IllegalArgumentException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class TimeSeries_add_116141049185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2543;
     Object term2594;

    public TimeSeries_add_116141049185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2568 = new ArrayList();
        term2543 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2588 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2589 = (Object[]) newArray("java.lang.Object", 0);
        Object term2590 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2591 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2592 = newInstance(Class.forName("java.lang.Object"));
        setField(term2543, term2543.getClass(), "domain", "AdxvLJhNLe");
        setField(term2543, term2543.getClass(), "range", "lHfTrWKMPk");
        setField(term2543, term2543.getClass(), "timePeriodClass", null);
        setField(term2543, term2543.getClass(), "data", term2568);
        setIntField(term2543, term2543.getClass(), "maximumItemCount", -1087774327);
        setLongField(term2543, term2543.getClass(), "maximumItemAge", -5892135042702373494L);
        setDoubleField(term2543, term2543.getClass(), "minY", 0.13246999699526574);
        setDoubleField(term2543, term2543.getClass(), "maxY", 0.9126850255993704);
        setField(term2543, term2543.getClass(), "key", null);
        setField(term2543, term2543.getClass(), "description", "JDaAnsVTGV");
        setField(term2588, term2588.getClass(), "listenerList", term2589);
        setField(term2543, term2543.getClass(), "listeners", term2588);
        setField(term2591, term2591.getClass(), "map", null);
        setField(term2590, term2590.getClass(), "map", term2591);
        setField(term2590, term2590.getClass(), "source", term2592);
        setField(term2543, term2543.getClass(), "propertyChangeSupport", term2590);
        setBooleanField(term2543, term2543.getClass(), "notify", false);
        term2594 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = Class.forName("java.lang.Number");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term2594;
        try {
            callMethod(klass, "add", argTypes, term2543, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


