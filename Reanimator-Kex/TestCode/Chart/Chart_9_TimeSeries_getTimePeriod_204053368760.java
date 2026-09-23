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
import java.lang.IndexOutOfBoundsException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class TimeSeries_getTimePeriod_204053368760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1122;
     Object term1171;

    public TimeSeries_getTimePeriod_204053368760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1147 = new ArrayList();
        term1122 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1165 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1166 = (Object[]) newArray("java.lang.Object", 0);
        Object term1167 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1168 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1169 = newInstance(Class.forName("java.lang.Object"));
        setField(term1122, term1122.getClass(), "domain", "ffYhPOzlUs");
        setField(term1122, term1122.getClass(), "range", "MLqYREekMl");
        setField(term1122, term1122.getClass(), "timePeriodClass", null);
        setField(term1122, term1122.getClass(), "data", term1147);
        setIntField(term1122, term1122.getClass(), "maximumItemCount", 597278769);
        setLongField(term1122, term1122.getClass(), "maximumItemAge", -5476826692763582090L);
        setField(term1122, term1122.getClass(), "key", null);
        setField(term1122, term1122.getClass(), "description", "ytSBIKXogI");
        setField(term1165, term1165.getClass(), "listenerList", term1166);
        setField(term1122, term1122.getClass(), "listeners", term1165);
        setField(term1168, term1168.getClass(), "map", null);
        setField(term1167, term1167.getClass(), "map", term1168);
        setField(term1167, term1167.getClass(), "source", term1169);
        setField(term1122, term1122.getClass(), "propertyChangeSupport", term1167);
        setBooleanField(term1122, term1122.getClass(), "notify", true);
        term1171 = new Integer(-1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1171;
        try {
            callMethod(klass, "getTimePeriod", argTypes, term1122, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


