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

public class XYSeries_getAutoSort_147410367737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term2361;

    public XYSeries_getAutoSort_147410367737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8 = new ArrayList();
        term7 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term27 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term28 = (Object[]) newArray("java.lang.Object", 0);
        Object term29 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term30 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term31 = newInstance(Class.forName("java.lang.Object"));
        setField(term7, term7.getClass(), "data", term8);
        setIntField(term7, term7.getClass(), "maximumItemCount", 568599855);
        setBooleanField(term7, term7.getClass(), "autoSort", false);
        setBooleanField(term7, term7.getClass(), "allowDuplicateXValues", true);
        setField(term7, term7.getClass(), "key", null);
        setField(term7, term7.getClass(), "description", "PAEBtnZtTD");
        setField(term27, term27.getClass(), "listenerList", term28);
        setField(term7, term7.getClass(), "listeners", term27);
        setField(term30, term30.getClass(), "map", null);
        setField(term29, term29.getClass(), "map", term30);
        setField(term29, term29.getClass(), "source", term31);
        setField(term7, term7.getClass(), "propertyChangeSupport", term29);
        setBooleanField(term7, term7.getClass(), "notify", true);
        ArrayList term2362 = new ArrayList();
        term2361 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term2366 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2367 = (Object[]) newArray("java.lang.Object", 0);
        Object term2368 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2369 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2370 = newInstance(Class.forName("java.lang.Object"));
        setField(term2361, term2361.getClass(), "data", term2362);
        setIntField(term2361, term2361.getClass(), "maximumItemCount", 568599855);
        setBooleanField(term2361, term2361.getClass(), "autoSort", false);
        setBooleanField(term2361, term2361.getClass(), "allowDuplicateXValues", true);
        setField(term2361, term2361.getClass(), "key", null);
        setField(term2361, term2361.getClass(), "description", "PAEBtnZtTD");
        setField(term2366, term2366.getClass(), "listenerList", term2367);
        setField(term2361, term2361.getClass(), "listeners", term2366);
        setField(term2369, term2369.getClass(), "map", null);
        setField(term2368, term2368.getClass(), "map", term2369);
        setField(term2368, term2368.getClass(), "source", term2370);
        setField(term2361, term2361.getClass(), "propertyChangeSupport", term2368);
        setBooleanField(term2361, term2361.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAutoSort", argTypes, term7, args);
        assertTrue(recursiveEquals(term7, term2361));
    }

};


