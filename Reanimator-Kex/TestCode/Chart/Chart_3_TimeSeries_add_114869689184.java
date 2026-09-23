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

public class TimeSeries_add_114869689184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2462;

    public TimeSeries_add_114869689184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2487 = new ArrayList();
        term2462 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2507 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2508 = (Object[]) newArray("java.lang.Object", 0);
        Object term2509 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2510 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2511 = newInstance(Class.forName("java.lang.Object"));
        setField(term2462, term2462.getClass(), "domain", "dpNsDgfPso");
        setField(term2462, term2462.getClass(), "range", "hCWPJQKpdc");
        setField(term2462, term2462.getClass(), "timePeriodClass", null);
        setField(term2462, term2462.getClass(), "data", term2487);
        setIntField(term2462, term2462.getClass(), "maximumItemCount", 1193880199);
        setLongField(term2462, term2462.getClass(), "maximumItemAge", 6855071767938501807L);
        setDoubleField(term2462, term2462.getClass(), "minY", 0.3227335400819148);
        setDoubleField(term2462, term2462.getClass(), "maxY", 0.43337207054070237);
        setField(term2462, term2462.getClass(), "key", null);
        setField(term2462, term2462.getClass(), "description", "WzMEhMXkKx");
        setField(term2507, term2507.getClass(), "listenerList", term2508);
        setField(term2462, term2462.getClass(), "listeners", term2507);
        setField(term2510, term2510.getClass(), "map", null);
        setField(term2509, term2509.getClass(), "map", term2510);
        setField(term2509, term2509.getClass(), "source", term2511);
        setField(term2462, term2462.getClass(), "propertyChangeSupport", term2509);
        setBooleanField(term2462, term2462.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "add", argTypes, term2462, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


