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

public class TimeSeries_update_191633423773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2244;

    public TimeSeries_update_191633423773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2269 = new ArrayList();
        term2244 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2287 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2288 = (Object[]) newArray("java.lang.Object", 0);
        Object term2289 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2290 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2291 = newInstance(Class.forName("java.lang.Object"));
        setField(term2244, term2244.getClass(), "domain", "OEXDRUKcFl");
        setField(term2244, term2244.getClass(), "range", "RYdKCNNMBR");
        setField(term2244, term2244.getClass(), "timePeriodClass", null);
        setField(term2244, term2244.getClass(), "data", term2269);
        setIntField(term2244, term2244.getClass(), "maximumItemCount", -1179120542);
        setLongField(term2244, term2244.getClass(), "maximumItemAge", 1967728129628047933L);
        setField(term2244, term2244.getClass(), "key", null);
        setField(term2244, term2244.getClass(), "description", "yGtHPyvYiQ");
        setField(term2287, term2287.getClass(), "listenerList", term2288);
        setField(term2244, term2244.getClass(), "listeners", term2287);
        setField(term2290, term2290.getClass(), "map", null);
        setField(term2289, term2289.getClass(), "map", term2290);
        setField(term2289, term2289.getClass(), "source", term2291);
        setField(term2244, term2244.getClass(), "propertyChangeSupport", term2289);
        setBooleanField(term2244, term2244.getClass(), "notify", true);
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
            callMethod(klass, "update", argTypes, term2244, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


