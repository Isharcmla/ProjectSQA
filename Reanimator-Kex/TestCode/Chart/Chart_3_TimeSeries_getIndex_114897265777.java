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

public class TimeSeries_getIndex_114897265777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1881;

    public TimeSeries_getIndex_114897265777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1906 = new ArrayList();
        term1881 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1926 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1927 = (Object[]) newArray("java.lang.Object", 0);
        Object term1928 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1929 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1930 = newInstance(Class.forName("java.lang.Object"));
        setField(term1881, term1881.getClass(), "domain", "GVizqqzXpy");
        setField(term1881, term1881.getClass(), "range", "JqXGgAhZPl");
        setField(term1881, term1881.getClass(), "timePeriodClass", null);
        setField(term1881, term1881.getClass(), "data", term1906);
        setIntField(term1881, term1881.getClass(), "maximumItemCount", 590364439);
        setLongField(term1881, term1881.getClass(), "maximumItemAge", -4365849114644724155L);
        setDoubleField(term1881, term1881.getClass(), "minY", 0.25937345430928016);
        setDoubleField(term1881, term1881.getClass(), "maxY", 0.5873228247510078);
        setField(term1881, term1881.getClass(), "key", null);
        setField(term1881, term1881.getClass(), "description", "jiKYgYHqIS");
        setField(term1926, term1926.getClass(), "listenerList", term1927);
        setField(term1881, term1881.getClass(), "listeners", term1926);
        setField(term1929, term1929.getClass(), "map", null);
        setField(term1928, term1928.getClass(), "map", term1929);
        setField(term1928, term1928.getClass(), "source", term1930);
        setField(term1881, term1881.getClass(), "propertyChangeSupport", term1928);
        setBooleanField(term1881, term1881.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getIndex", argTypes, term1881, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


