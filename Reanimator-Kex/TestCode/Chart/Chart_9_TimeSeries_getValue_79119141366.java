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

public class TimeSeries_getValue_79119141366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1679;

    public TimeSeries_getValue_79119141366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1704 = new ArrayList();
        term1679 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1722 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1723 = (Object[]) newArray("java.lang.Object", 0);
        Object term1724 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1725 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1726 = newInstance(Class.forName("java.lang.Object"));
        setField(term1679, term1679.getClass(), "domain", "cAPeiZHKGJ");
        setField(term1679, term1679.getClass(), "range", "LvJFtLBaxj");
        setField(term1679, term1679.getClass(), "timePeriodClass", null);
        setField(term1679, term1679.getClass(), "data", term1704);
        setIntField(term1679, term1679.getClass(), "maximumItemCount", -1007160944);
        setLongField(term1679, term1679.getClass(), "maximumItemAge", -2585684163342970173L);
        setField(term1679, term1679.getClass(), "key", null);
        setField(term1679, term1679.getClass(), "description", "PHvxnGHptP");
        setField(term1722, term1722.getClass(), "listenerList", term1723);
        setField(term1679, term1679.getClass(), "listeners", term1722);
        setField(term1725, term1725.getClass(), "map", null);
        setField(term1724, term1724.getClass(), "map", term1725);
        setField(term1724, term1724.getClass(), "source", term1726);
        setField(term1679, term1679.getClass(), "propertyChangeSupport", term1724);
        setBooleanField(term1679, term1679.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getValue", argTypes, term1679, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


