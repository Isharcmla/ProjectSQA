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

public class TimeSeries_add_116141049172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2163;
     Object term2212;

    public TimeSeries_add_116141049172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2188 = new ArrayList();
        term2163 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2206 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2207 = (Object[]) newArray("java.lang.Object", 0);
        Object term2208 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2209 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2210 = newInstance(Class.forName("java.lang.Object"));
        setField(term2163, term2163.getClass(), "domain", "ZVecLZMLHF");
        setField(term2163, term2163.getClass(), "range", "fztQhjqwdP");
        setField(term2163, term2163.getClass(), "timePeriodClass", null);
        setField(term2163, term2163.getClass(), "data", term2188);
        setIntField(term2163, term2163.getClass(), "maximumItemCount", -203030934);
        setLongField(term2163, term2163.getClass(), "maximumItemAge", -4502405999831680926L);
        setField(term2163, term2163.getClass(), "key", null);
        setField(term2163, term2163.getClass(), "description", "eVpkWxjuki");
        setField(term2206, term2206.getClass(), "listenerList", term2207);
        setField(term2163, term2163.getClass(), "listeners", term2206);
        setField(term2209, term2209.getClass(), "map", null);
        setField(term2208, term2208.getClass(), "map", term2209);
        setField(term2208, term2208.getClass(), "source", term2210);
        setField(term2163, term2163.getClass(), "propertyChangeSupport", term2208);
        setBooleanField(term2163, term2163.getClass(), "notify", true);
        term2212 = new Boolean(true);
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
        args[2] = term2212;
        try {
            callMethod(klass, "add", argTypes, term2163, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


