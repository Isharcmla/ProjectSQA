package org.jfree.data.xy;

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
import static org.jfree.data.xy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.xy.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class XYSeries_getMaximumItemCount_158606014041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151;
     Object term2562;

    public XYSeries_getMaximumItemCount_158606014041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term152 = new ArrayList();
        term151 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term171 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term172 = (Object[]) newArray("java.lang.Object", 0);
        Object term173 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term174 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term175 = newInstance(Class.forName("java.lang.Object"));
        setField(term151, term151.getClass(), "data", term152);
        setIntField(term151, term151.getClass(), "maximumItemCount", -1922583790);
        setBooleanField(term151, term151.getClass(), "autoSort", false);
        setBooleanField(term151, term151.getClass(), "allowDuplicateXValues", true);
        setField(term151, term151.getClass(), "key", null);
        setField(term151, term151.getClass(), "description", "hRNSzYYIrc");
        setField(term171, term171.getClass(), "listenerList", term172);
        setField(term151, term151.getClass(), "listeners", term171);
        setField(term174, term174.getClass(), "map", null);
        setField(term173, term173.getClass(), "map", term174);
        setField(term173, term173.getClass(), "source", term175);
        setField(term151, term151.getClass(), "propertyChangeSupport", term173);
        setBooleanField(term151, term151.getClass(), "notify", true);
        ArrayList term2563 = new ArrayList();
        term2562 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term2567 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2568 = (Object[]) newArray("java.lang.Object", 0);
        Object term2569 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2570 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2571 = newInstance(Class.forName("java.lang.Object"));
        setField(term2562, term2562.getClass(), "data", term2563);
        setIntField(term2562, term2562.getClass(), "maximumItemCount", -1922583790);
        setBooleanField(term2562, term2562.getClass(), "autoSort", false);
        setBooleanField(term2562, term2562.getClass(), "allowDuplicateXValues", true);
        setField(term2562, term2562.getClass(), "key", null);
        setField(term2562, term2562.getClass(), "description", "hRNSzYYIrc");
        setField(term2567, term2567.getClass(), "listenerList", term2568);
        setField(term2562, term2562.getClass(), "listeners", term2567);
        setField(term2570, term2570.getClass(), "map", null);
        setField(term2569, term2569.getClass(), "map", term2570);
        setField(term2569, term2569.getClass(), "source", term2571);
        setField(term2562, term2562.getClass(), "propertyChangeSupport", term2569);
        setBooleanField(term2562, term2562.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaximumItemCount", argTypes, term151, args);
        assertTrue(recursiveEquals(term151, term2562));
        assertTrue(recursiveEquals(retValue, -1922583790));
    }

};


