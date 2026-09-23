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
import java.lang.Double;
import java.lang.Boolean;

public class TimeSeries_add_944456983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2377;
     Object term2428;
     Object term2430;

    public TimeSeries_add_944456983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2402 = new ArrayList();
        term2377 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2422 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2423 = (Object[]) newArray("java.lang.Object", 0);
        Object term2424 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2425 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2426 = newInstance(Class.forName("java.lang.Object"));
        setField(term2377, term2377.getClass(), "domain", "iNwOJRBEjp");
        setField(term2377, term2377.getClass(), "range", "XylxrMBraH");
        setField(term2377, term2377.getClass(), "timePeriodClass", null);
        setField(term2377, term2377.getClass(), "data", term2402);
        setIntField(term2377, term2377.getClass(), "maximumItemCount", -226514366);
        setLongField(term2377, term2377.getClass(), "maximumItemAge", 2120084523938730454L);
        setDoubleField(term2377, term2377.getClass(), "minY", 0.20737514139742264);
        setDoubleField(term2377, term2377.getClass(), "maxY", 0.7919370314903882);
        setField(term2377, term2377.getClass(), "key", null);
        setField(term2377, term2377.getClass(), "description", "pORebkoRdD");
        setField(term2422, term2422.getClass(), "listenerList", term2423);
        setField(term2377, term2377.getClass(), "listeners", term2422);
        setField(term2425, term2425.getClass(), "map", null);
        setField(term2424, term2424.getClass(), "map", term2425);
        setField(term2424, term2424.getClass(), "source", term2426);
        setField(term2377, term2377.getClass(), "propertyChangeSupport", term2424);
        setBooleanField(term2377, term2377.getClass(), "notify", true);
        term2428 = new Double(0.2109867221632754);
        term2430 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = double.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term2428;
        args[2] = term2430;
        try {
            callMethod(klass, "add", argTypes, term2377, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


