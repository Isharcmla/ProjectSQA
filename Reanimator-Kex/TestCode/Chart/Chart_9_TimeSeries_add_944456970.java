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
import java.lang.Boolean;

public class TimeSeries_add_944456970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2001;
     Object term2050;
     Object term2052;

    public TimeSeries_add_944456970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2026 = new ArrayList();
        term2001 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2044 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2045 = (Object[]) newArray("java.lang.Object", 0);
        Object term2046 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2047 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2048 = newInstance(Class.forName("java.lang.Object"));
        setField(term2001, term2001.getClass(), "domain", "SPpkrGcPRr");
        setField(term2001, term2001.getClass(), "range", "sEccwbJKYE");
        setField(term2001, term2001.getClass(), "timePeriodClass", null);
        setField(term2001, term2001.getClass(), "data", term2026);
        setIntField(term2001, term2001.getClass(), "maximumItemCount", -1275173084);
        setLongField(term2001, term2001.getClass(), "maximumItemAge", 7009926388951271268L);
        setField(term2001, term2001.getClass(), "key", null);
        setField(term2001, term2001.getClass(), "description", "AWRooQKkdW");
        setField(term2044, term2044.getClass(), "listenerList", term2045);
        setField(term2001, term2001.getClass(), "listeners", term2044);
        setField(term2047, term2047.getClass(), "map", null);
        setField(term2046, term2046.getClass(), "map", term2047);
        setField(term2046, term2046.getClass(), "source", term2048);
        setField(term2001, term2001.getClass(), "propertyChangeSupport", term2046);
        setBooleanField(term2001, term2001.getClass(), "notify", false);
        term2050 = new Double(0.3455959125047594);
        term2052 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        argTypes[1] = double.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term2050;
        args[2] = term2052;
        try {
            callMethod(klass, "add", argTypes, term2001, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


