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

public class TimeSeries_update_46669980274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2323;
     Object term2372;

    public TimeSeries_update_46669980274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2348 = new ArrayList();
        term2323 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2366 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2367 = (Object[]) newArray("java.lang.Object", 0);
        Object term2368 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2369 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2370 = newInstance(Class.forName("java.lang.Object"));
        setField(term2323, term2323.getClass(), "domain", "iNwOJRBEjp");
        setField(term2323, term2323.getClass(), "range", "XylxrMBraH");
        setField(term2323, term2323.getClass(), "timePeriodClass", null);
        setField(term2323, term2323.getClass(), "data", term2348);
        setIntField(term2323, term2323.getClass(), "maximumItemCount", -73683645);
        setLongField(term2323, term2323.getClass(), "maximumItemAge", 2120084523938730454L);
        setField(term2323, term2323.getClass(), "key", null);
        setField(term2323, term2323.getClass(), "description", "pORebkoRdD");
        setField(term2366, term2366.getClass(), "listenerList", term2367);
        setField(term2323, term2323.getClass(), "listeners", term2366);
        setField(term2369, term2369.getClass(), "map", null);
        setField(term2368, term2368.getClass(), "map", term2369);
        setField(term2368, term2368.getClass(), "source", term2370);
        setField(term2323, term2323.getClass(), "propertyChangeSupport", term2368);
        setBooleanField(term2323, term2323.getClass(), "notify", true);
        term2372 = new Integer(-226514366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = term2372;
        args[1] = null;
        try {
            callMethod(klass, "update", argTypes, term2323, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


