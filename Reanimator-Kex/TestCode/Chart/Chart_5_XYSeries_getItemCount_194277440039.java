package org.jfree.data.xy;

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
import static org.jfree.data.xy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.xy.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class XYSeries_getItemCount_194277440039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;
     Object term2448;

    public XYSeries_getItemCount_194277440039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term80 = new ArrayList();
        term79 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term99 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term100 = (Object[]) newArray("java.lang.Object", 0);
        Object term101 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term102 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term103 = newInstance(Class.forName("java.lang.Object"));
        setField(term79, term79.getClass(), "data", term80);
        setIntField(term79, term79.getClass(), "maximumItemCount", 1484323161);
        setBooleanField(term79, term79.getClass(), "autoSort", true);
        setBooleanField(term79, term79.getClass(), "allowDuplicateXValues", false);
        setField(term79, term79.getClass(), "key", null);
        setField(term79, term79.getClass(), "description", "jJCZpVmanW");
        setField(term99, term99.getClass(), "listenerList", term100);
        setField(term79, term79.getClass(), "listeners", term99);
        setField(term102, term102.getClass(), "map", null);
        setField(term101, term101.getClass(), "map", term102);
        setField(term101, term101.getClass(), "source", term103);
        setField(term79, term79.getClass(), "propertyChangeSupport", term101);
        setBooleanField(term79, term79.getClass(), "notify", true);
        ArrayList term2449 = new ArrayList();
        term2448 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term2453 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2454 = (Object[]) newArray("java.lang.Object", 0);
        Object term2455 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2456 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2457 = newInstance(Class.forName("java.lang.Object"));
        setField(term2448, term2448.getClass(), "data", term2449);
        setIntField(term2448, term2448.getClass(), "maximumItemCount", 1484323161);
        setBooleanField(term2448, term2448.getClass(), "autoSort", true);
        setBooleanField(term2448, term2448.getClass(), "allowDuplicateXValues", false);
        setField(term2448, term2448.getClass(), "key", null);
        setField(term2448, term2448.getClass(), "description", "jJCZpVmanW");
        setField(term2453, term2453.getClass(), "listenerList", term2454);
        setField(term2448, term2448.getClass(), "listeners", term2453);
        setField(term2456, term2456.getClass(), "map", null);
        setField(term2455, term2455.getClass(), "map", term2456);
        setField(term2455, term2455.getClass(), "source", term2457);
        setField(term2448, term2448.getClass(), "propertyChangeSupport", term2455);
        setBooleanField(term2448, term2448.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getItemCount", argTypes, term79, args);
        assertTrue(recursiveEquals(term79, term2448));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


