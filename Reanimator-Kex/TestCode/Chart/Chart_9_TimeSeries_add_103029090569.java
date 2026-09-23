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

public class TimeSeries_add_103029090569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1920;
     Object term1969;

    public TimeSeries_add_103029090569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1945 = new ArrayList();
        term1920 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1963 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1964 = (Object[]) newArray("java.lang.Object", 0);
        Object term1965 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1966 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1967 = newInstance(Class.forName("java.lang.Object"));
        setField(term1920, term1920.getClass(), "domain", "XqgfKFvPSD");
        setField(term1920, term1920.getClass(), "range", "JiVRgTZvKc");
        setField(term1920, term1920.getClass(), "timePeriodClass", null);
        setField(term1920, term1920.getClass(), "data", term1945);
        setIntField(term1920, term1920.getClass(), "maximumItemCount", 865208305);
        setLongField(term1920, term1920.getClass(), "maximumItemAge", 2486810210675247493L);
        setField(term1920, term1920.getClass(), "key", null);
        setField(term1920, term1920.getClass(), "description", "XPKmummaqg");
        setField(term1963, term1963.getClass(), "listenerList", term1964);
        setField(term1920, term1920.getClass(), "listeners", term1963);
        setField(term1966, term1966.getClass(), "map", null);
        setField(term1965, term1965.getClass(), "map", term1966);
        setField(term1965, term1965.getClass(), "source", term1967);
        setField(term1920, term1920.getClass(), "propertyChangeSupport", term1965);
        setBooleanField(term1920, term1920.getClass(), "notify", true);
        term1969 = new Double(0.13238746331190498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1969;
        try {
            callMethod(klass, "add", argTypes, term1920, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


