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
import static org.jfree.data.time.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class TimePeriodValues_getMinEndIndex_191795411153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2020;
     Object term8037;

    public TimePeriodValues_getMinEndIndex_191795411153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2045 = new ArrayList();
        term2020 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term2067 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2068 = (Object[]) newArray("java.lang.Object", 0);
        Object term2069 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2070 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2071 = newInstance(Class.forName("java.lang.Object"));
        setField(term2020, term2020.getClass(), "domain", "XqgfKFvPSD");
        setField(term2020, term2020.getClass(), "range", "JiVRgTZvKc");
        setField(term2020, term2020.getClass(), "data", term2045);
        setIntField(term2020, term2020.getClass(), "minStartIndex", 202001407);
        setIntField(term2020, term2020.getClass(), "maxStartIndex", 158873461);
        setIntField(term2020, term2020.getClass(), "minMiddleIndex", -430151637);
        setIntField(term2020, term2020.getClass(), "maxMiddleIndex", -1697741339);
        setIntField(term2020, term2020.getClass(), "minEndIndex", 98922530);
        setIntField(term2020, term2020.getClass(), "maxEndIndex", -1388471422);
        setField(term2020, term2020.getClass(), "key", null);
        setField(term2020, term2020.getClass(), "description", "XPKmummaqg");
        setField(term2067, term2067.getClass(), "listenerList", term2068);
        setField(term2020, term2020.getClass(), "listeners", term2067);
        setField(term2070, term2070.getClass(), "map", null);
        setField(term2069, term2069.getClass(), "map", term2070);
        setField(term2069, term2069.getClass(), "source", term2071);
        setField(term2020, term2020.getClass(), "propertyChangeSupport", term2069);
        setBooleanField(term2020, term2020.getClass(), "notify", true);
        ArrayList term8042 = new ArrayList();
        term8037 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term8046 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term8047 = (Object[]) newArray("java.lang.Object", 0);
        Object term8048 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term8049 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term8050 = newInstance(Class.forName("java.lang.Object"));
        setField(term8037, term8037.getClass(), "domain", "XqgfKFvPSD");
        setField(term8037, term8037.getClass(), "range", "JiVRgTZvKc");
        setField(term8037, term8037.getClass(), "data", term8042);
        setIntField(term8037, term8037.getClass(), "minStartIndex", 202001407);
        setIntField(term8037, term8037.getClass(), "maxStartIndex", 158873461);
        setIntField(term8037, term8037.getClass(), "minMiddleIndex", -430151637);
        setIntField(term8037, term8037.getClass(), "maxMiddleIndex", -1697741339);
        setIntField(term8037, term8037.getClass(), "minEndIndex", 98922530);
        setIntField(term8037, term8037.getClass(), "maxEndIndex", -1388471422);
        setField(term8037, term8037.getClass(), "key", null);
        setField(term8037, term8037.getClass(), "description", "XPKmummaqg");
        setField(term8046, term8046.getClass(), "listenerList", term8047);
        setField(term8037, term8037.getClass(), "listeners", term8046);
        setField(term8049, term8049.getClass(), "map", null);
        setField(term8048, term8048.getClass(), "map", term8049);
        setField(term8048, term8048.getClass(), "source", term8050);
        setField(term8037, term8037.getClass(), "propertyChangeSupport", term8048);
        setBooleanField(term8037, term8037.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMinEndIndex", argTypes, term2020, args);
        assertTrue(recursiveEquals(term2020, term8037));
        assertTrue(recursiveEquals(retValue, 98922530));
    }

};


