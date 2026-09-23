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
import java.lang.Boolean;

public class TimeSeries_removeAgedItems_2801176978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2722;
     Object term2771;
     Object term12754;

    public TimeSeries_removeAgedItems_2801176978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2747 = new ArrayList();
        term2722 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term2765 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2766 = (Object[]) newArray("java.lang.Object", 0);
        Object term2767 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2768 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2769 = newInstance(Class.forName("java.lang.Object"));
        setField(term2722, term2722.getClass(), "domain", "wfaXBpWAUH");
        setField(term2722, term2722.getClass(), "range", "VMeAzAHwZj");
        setField(term2722, term2722.getClass(), "timePeriodClass", null);
        setField(term2722, term2722.getClass(), "data", term2747);
        setIntField(term2722, term2722.getClass(), "maximumItemCount", -1145578966);
        setLongField(term2722, term2722.getClass(), "maximumItemAge", -484994522244390100L);
        setField(term2722, term2722.getClass(), "key", null);
        setField(term2722, term2722.getClass(), "description", "PznxWXsZME");
        setField(term2765, term2765.getClass(), "listenerList", term2766);
        setField(term2722, term2722.getClass(), "listeners", term2765);
        setField(term2768, term2768.getClass(), "map", null);
        setField(term2767, term2767.getClass(), "map", term2768);
        setField(term2767, term2767.getClass(), "source", term2769);
        setField(term2722, term2722.getClass(), "propertyChangeSupport", term2767);
        setBooleanField(term2722, term2722.getClass(), "notify", true);
        term2771 = new Boolean(true);
        ArrayList term12759 = new ArrayList();
        term12754 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term12763 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term12764 = (Object[]) newArray("java.lang.Object", 0);
        Object term12765 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term12766 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term12767 = newInstance(Class.forName("java.lang.Object"));
        setField(term12754, term12754.getClass(), "domain", "wfaXBpWAUH");
        setField(term12754, term12754.getClass(), "range", "VMeAzAHwZj");
        setField(term12754, term12754.getClass(), "timePeriodClass", null);
        setField(term12754, term12754.getClass(), "data", term12759);
        setIntField(term12754, term12754.getClass(), "maximumItemCount", -1145578966);
        setLongField(term12754, term12754.getClass(), "maximumItemAge", -484994522244390100L);
        setField(term12754, term12754.getClass(), "key", null);
        setField(term12754, term12754.getClass(), "description", "PznxWXsZME");
        setField(term12763, term12763.getClass(), "listenerList", term12764);
        setField(term12754, term12754.getClass(), "listeners", term12763);
        setField(term12766, term12766.getClass(), "map", null);
        setField(term12765, term12765.getClass(), "map", term12766);
        setField(term12765, term12765.getClass(), "source", term12767);
        setField(term12754, term12754.getClass(), "propertyChangeSupport", term12765);
        setBooleanField(term12754, term12754.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2771;
        callMethod(klass, "removeAgedItems", argTypes, term2722, args);
        assertTrue(recursiveEquals(term2722, term12754));
        assertTrue(recursiveEquals(term2771, true));
    }

};


