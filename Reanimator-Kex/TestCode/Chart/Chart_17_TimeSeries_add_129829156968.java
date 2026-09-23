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
import java.lang.NullPointerException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class TimeSeries_add_129829156968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1838;
     Object term1887;
     Object term1888;

    public TimeSeries_add_129829156968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1863 = new ArrayList();
        term1838 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term1881 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1882 = (Object[]) newArray("java.lang.Object", 0);
        Object term1883 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1884 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1885 = newInstance(Class.forName("java.lang.Object"));
        setField(term1838, term1838.getClass(), "domain", "GVizqqzXpy");
        setField(term1838, term1838.getClass(), "range", "JqXGgAhZPl");
        setField(term1838, term1838.getClass(), "timePeriodClass", null);
        setField(term1838, term1838.getClass(), "data", term1863);
        setIntField(term1838, term1838.getClass(), "maximumItemCount", 590364439);
        setLongField(term1838, term1838.getClass(), "maximumItemAge", -4365849114644724155L);
        setField(term1838, term1838.getClass(), "key", null);
        setField(term1838, term1838.getClass(), "description", "jiKYgYHqIS");
        setField(term1881, term1881.getClass(), "listenerList", term1882);
        setField(term1838, term1838.getClass(), "listeners", term1881);
        setField(term1884, term1884.getClass(), "map", null);
        setField(term1883, term1883.getClass(), "map", term1884);
        setField(term1883, term1883.getClass(), "source", term1885);
        setField(term1838, term1838.getClass(), "propertyChangeSupport", term1883);
        setBooleanField(term1838, term1838.getClass(), "notify", true);
        term1887 = newInstance(Class.forName("org.jfree.data.time.TimeSeriesDataItem"));
        setField(term1887, term1887.getClass(), "period", null);
        setField(term1887, term1887.getClass(), "value", null);
        term1888 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimeSeriesDataItem");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1887;
        args[1] = term1888;
        try {
            callMethod(klass, "add", argTypes, term1838, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


