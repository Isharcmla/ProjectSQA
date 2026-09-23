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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TimeSeries_addAndOrUpdate_37801167831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2404;
     Object term2453;

    public TimeSeries_addAndOrUpdate_37801167831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2429 = new ArrayList();
        term2404 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2447 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2448 = (Object[]) newArray("java.lang.Object", 0);
        Object term2449 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2450 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2451 = newInstance(Class.forName("java.lang.Object"));
        setField(term2404, term2404.getClass(), "domain", "dpNsDgfPso");
        setField(term2404, term2404.getClass(), "range", "hCWPJQKpdc");
        setField(term2404, term2404.getClass(), "timePeriodClass", null);
        setField(term2404, term2404.getClass(), "data", term2429);
        setIntField(term2404, term2404.getClass(), "maximumItemCount", 1193880199);
        setLongField(term2404, term2404.getClass(), "maximumItemAge", 6855071767938501807L);
        setField(term2404, term2404.getClass(), "key", null);
        setField(term2404, term2404.getClass(), "description", "WzMEhMXkKx");
        setField(term2447, term2447.getClass(), "listenerList", term2448);
        setField(term2404, term2404.getClass(), "listeners", term2447);
        setField(term2450, term2450.getClass(), "map", null);
        setField(term2449, term2449.getClass(), "map", term2450);
        setField(term2449, term2449.getClass(), "source", term2451);
        setField(term2404, term2404.getClass(), "propertyChangeSupport", term2449);
        setBooleanField(term2404, term2404.getClass(), "notify", true);
        ArrayList term2478 = new ArrayList();
        term2453 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2496 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2497 = (Object[]) newArray("java.lang.Object", 0);
        Object term2498 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2499 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2500 = newInstance(Class.forName("java.lang.Object"));
        setField(term2453, term2453.getClass(), "domain", "AdxvLJhNLe");
        setField(term2453, term2453.getClass(), "range", "lHfTrWKMPk");
        setField(term2453, term2453.getClass(), "timePeriodClass", null);
        setField(term2453, term2453.getClass(), "data", term2478);
        setIntField(term2453, term2453.getClass(), "maximumItemCount", -1087774327);
        setLongField(term2453, term2453.getClass(), "maximumItemAge", -5892135042702373494L);
        setField(term2453, term2453.getClass(), "key", null);
        setField(term2453, term2453.getClass(), "description", "JDaAnsVTGV");
        setField(term2496, term2496.getClass(), "listenerList", term2497);
        setField(term2453, term2453.getClass(), "listeners", term2496);
        setField(term2499, term2499.getClass(), "map", null);
        setField(term2498, term2498.getClass(), "map", term2499);
        setField(term2498, term2498.getClass(), "source", term2500);
        setField(term2453, term2453.getClass(), "propertyChangeSupport", term2498);
        setBooleanField(term2453, term2453.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeries");
        Object[] args = new Object[1];
        args[0] = term2453;
        callMethod(klass, "addAndOrUpdate", argTypes, term2404, args);
    }

};


