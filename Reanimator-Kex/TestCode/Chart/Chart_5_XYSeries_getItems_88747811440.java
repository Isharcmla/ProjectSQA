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

public class XYSeries_getItems_88747811440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115;
     Object term2505;
     Object term2478;

    public XYSeries_getItems_88747811440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term116 = new ArrayList();
        term115 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term135 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term136 = (Object[]) newArray("java.lang.Object", 0);
        Object term137 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term138 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term139 = newInstance(Class.forName("java.lang.Object"));
        setField(term115, term115.getClass(), "data", term116);
        setIntField(term115, term115.getClass(), "maximumItemCount", 391863371);
        setBooleanField(term115, term115.getClass(), "autoSort", false);
        setBooleanField(term115, term115.getClass(), "allowDuplicateXValues", true);
        setField(term115, term115.getClass(), "key", null);
        setField(term115, term115.getClass(), "description", "SzjVpOQTyS");
        setField(term135, term135.getClass(), "listenerList", term136);
        setField(term115, term115.getClass(), "listeners", term135);
        setField(term138, term138.getClass(), "map", null);
        setField(term137, term137.getClass(), "map", term138);
        setField(term137, term137.getClass(), "source", term139);
        setField(term115, term115.getClass(), "propertyChangeSupport", term137);
        setBooleanField(term115, term115.getClass(), "notify", false);
        ArrayList term2506 = new ArrayList();
        term2505 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term2510 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2511 = (Object[]) newArray("java.lang.Object", 0);
        Object term2512 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2513 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2514 = newInstance(Class.forName("java.lang.Object"));
        setField(term2505, term2505.getClass(), "data", term2506);
        setIntField(term2505, term2505.getClass(), "maximumItemCount", 391863371);
        setBooleanField(term2505, term2505.getClass(), "autoSort", false);
        setBooleanField(term2505, term2505.getClass(), "allowDuplicateXValues", true);
        setField(term2505, term2505.getClass(), "key", null);
        setField(term2505, term2505.getClass(), "description", "SzjVpOQTyS");
        setField(term2510, term2510.getClass(), "listenerList", term2511);
        setField(term2505, term2505.getClass(), "listeners", term2510);
        setField(term2513, term2513.getClass(), "map", null);
        setField(term2512, term2512.getClass(), "map", term2513);
        setField(term2512, term2512.getClass(), "source", term2514);
        setField(term2505, term2505.getClass(), "propertyChangeSupport", term2512);
        setBooleanField(term2505, term2505.getClass(), "notify", false);
        ArrayList term2479 = new ArrayList();
        term2478 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term2478, term2478.getClass(), "list", term2479);
        setField(term2478, term2478.getClass(), "c", term2479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getItems", argTypes, term115, args);
        assertTrue(recursiveEquals(term115, term2505));
        assertTrue(recursiveEquals(retValue, term2478));
    }

};


