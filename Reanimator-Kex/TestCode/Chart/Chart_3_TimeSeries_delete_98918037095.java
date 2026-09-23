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

public class TimeSeries_delete_98918037095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3448;

    public TimeSeries_delete_98918037095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3473 = new ArrayList();
        term3448 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term3493 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3494 = (Object[]) newArray("java.lang.Object", 0);
        Object term3495 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3496 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3497 = newInstance(Class.forName("java.lang.Object"));
        setField(term3448, term3448.getClass(), "domain", "OYbzXylRWW");
        setField(term3448, term3448.getClass(), "range", "DSNsTGYXDF");
        setField(term3448, term3448.getClass(), "timePeriodClass", null);
        setField(term3448, term3448.getClass(), "data", term3473);
        setIntField(term3448, term3448.getClass(), "maximumItemCount", -1968847291);
        setLongField(term3448, term3448.getClass(), "maximumItemAge", -6645965768855543712L);
        setDoubleField(term3448, term3448.getClass(), "minY", 0.146431486357265);
        setDoubleField(term3448, term3448.getClass(), "maxY", 0.24259014218848696);
        setField(term3448, term3448.getClass(), "key", null);
        setField(term3448, term3448.getClass(), "description", "sQvGcVjdEx");
        setField(term3493, term3493.getClass(), "listenerList", term3494);
        setField(term3448, term3448.getClass(), "listeners", term3493);
        setField(term3496, term3496.getClass(), "map", null);
        setField(term3495, term3495.getClass(), "map", term3496);
        setField(term3495, term3495.getClass(), "source", term3497);
        setField(term3448, term3448.getClass(), "propertyChangeSupport", term3495);
        setBooleanField(term3448, term3448.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "delete", argTypes, term3448, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


