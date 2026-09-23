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

public class TimeSeries_getNextTimePeriod_71544149861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1203;

    public TimeSeries_getNextTimePeriod_71544149861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1228 = new ArrayList();
        term1203 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1246 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1247 = (Object[]) newArray("java.lang.Object", 0);
        Object term1248 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1249 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1250 = newInstance(Class.forName("java.lang.Object"));
        setField(term1203, term1203.getClass(), "domain", "ieCtQFdkii");
        setField(term1203, term1203.getClass(), "range", "dEnhdmILtU");
        setField(term1203, term1203.getClass(), "timePeriodClass", null);
        setField(term1203, term1203.getClass(), "data", term1228);
        setIntField(term1203, term1203.getClass(), "maximumItemCount", -1456670397);
        setLongField(term1203, term1203.getClass(), "maximumItemAge", -872011222785455006L);
        setField(term1203, term1203.getClass(), "key", null);
        setField(term1203, term1203.getClass(), "description", "hoicvmsovO");
        setField(term1246, term1246.getClass(), "listenerList", term1247);
        setField(term1203, term1203.getClass(), "listeners", term1246);
        setField(term1249, term1249.getClass(), "map", null);
        setField(term1248, term1248.getClass(), "map", term1249);
        setField(term1248, term1248.getClass(), "source", term1250);
        setField(term1203, term1203.getClass(), "propertyChangeSupport", term1248);
        setBooleanField(term1203, term1203.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNextTimePeriod", argTypes, term1203, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


