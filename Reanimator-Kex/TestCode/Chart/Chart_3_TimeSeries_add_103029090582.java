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

public class TimeSeries_add_103029090582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2294;
     Object term2345;

    public TimeSeries_add_103029090582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2319 = new ArrayList();
        term2294 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2339 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2340 = (Object[]) newArray("java.lang.Object", 0);
        Object term2341 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2342 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2343 = newInstance(Class.forName("java.lang.Object"));
        setField(term2294, term2294.getClass(), "domain", "OEXDRUKcFl");
        setField(term2294, term2294.getClass(), "range", "RYdKCNNMBR");
        setField(term2294, term2294.getClass(), "timePeriodClass", null);
        setField(term2294, term2294.getClass(), "data", term2319);
        setIntField(term2294, term2294.getClass(), "maximumItemCount", -73683645);
        setLongField(term2294, term2294.getClass(), "maximumItemAge", 1967728129628047933L);
        setDoubleField(term2294, term2294.getClass(), "minY", 0.8566567697571895);
        setDoubleField(term2294, term2294.getClass(), "maxY", 0.9203805380592256);
        setField(term2294, term2294.getClass(), "key", null);
        setField(term2294, term2294.getClass(), "description", "yGtHPyvYiQ");
        setField(term2339, term2339.getClass(), "listenerList", term2340);
        setField(term2294, term2294.getClass(), "listeners", term2339);
        setField(term2342, term2342.getClass(), "map", null);
        setField(term2341, term2341.getClass(), "map", term2342);
        setField(term2341, term2341.getClass(), "source", term2343);
        setField(term2294, term2294.getClass(), "propertyChangeSupport", term2341);
        setBooleanField(term2294, term2294.getClass(), "notify", true);
        term2345 = new Double(0.5804948995371725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2345;
        try {
            callMethod(klass, "add", argTypes, term2294, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


