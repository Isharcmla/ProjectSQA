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

public class TimeSeries_getValue_79119141379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2045;

    public TimeSeries_getValue_79119141379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2070 = new ArrayList();
        term2045 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2090 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2091 = (Object[]) newArray("java.lang.Object", 0);
        Object term2092 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2093 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2094 = newInstance(Class.forName("java.lang.Object"));
        setField(term2045, term2045.getClass(), "domain", "SPpkrGcPRr");
        setField(term2045, term2045.getClass(), "range", "sEccwbJKYE");
        setField(term2045, term2045.getClass(), "timePeriodClass", null);
        setField(term2045, term2045.getClass(), "data", term2070);
        setIntField(term2045, term2045.getClass(), "maximumItemCount", -244121226);
        setLongField(term2045, term2045.getClass(), "maximumItemAge", 7009926388951271268L);
        setDoubleField(term2045, term2045.getClass(), "minY", 0.7591353014991907);
        setDoubleField(term2045, term2045.getClass(), "maxY", 0.791695029600875);
        setField(term2045, term2045.getClass(), "key", null);
        setField(term2045, term2045.getClass(), "description", "AWRooQKkdW");
        setField(term2090, term2090.getClass(), "listenerList", term2091);
        setField(term2045, term2045.getClass(), "listeners", term2090);
        setField(term2093, term2093.getClass(), "map", null);
        setField(term2092, term2092.getClass(), "map", term2093);
        setField(term2092, term2092.getClass(), "source", term2094);
        setField(term2045, term2045.getClass(), "propertyChangeSupport", term2092);
        setBooleanField(term2045, term2045.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.time.RegularTimePeriod");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getValue", argTypes, term2045, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


