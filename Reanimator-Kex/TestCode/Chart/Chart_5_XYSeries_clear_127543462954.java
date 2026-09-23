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

public class XYSeries_clear_127543462954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term649;
     Object term5006;

    public XYSeries_clear_127543462954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term650 = new ArrayList();
        term649 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term669 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term670 = (Object[]) newArray("java.lang.Object", 0);
        Object term671 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term672 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term673 = newInstance(Class.forName("java.lang.Object"));
        setField(term649, term649.getClass(), "data", term650);
        setIntField(term649, term649.getClass(), "maximumItemCount", -6029667);
        setBooleanField(term649, term649.getClass(), "autoSort", false);
        setBooleanField(term649, term649.getClass(), "allowDuplicateXValues", false);
        setField(term649, term649.getClass(), "key", null);
        setField(term649, term649.getClass(), "description", "kuTXqwMtDB");
        setField(term669, term669.getClass(), "listenerList", term670);
        setField(term649, term649.getClass(), "listeners", term669);
        setField(term672, term672.getClass(), "map", null);
        setField(term671, term671.getClass(), "map", term672);
        setField(term671, term671.getClass(), "source", term673);
        setField(term649, term649.getClass(), "propertyChangeSupport", term671);
        setBooleanField(term649, term649.getClass(), "notify", false);
        ArrayList term5007 = new ArrayList();
        term5006 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term5011 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term5012 = (Object[]) newArray("java.lang.Object", 0);
        Object term5013 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term5014 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term5015 = newInstance(Class.forName("java.lang.Object"));
        setField(term5006, term5006.getClass(), "data", term5007);
        setIntField(term5006, term5006.getClass(), "maximumItemCount", -6029667);
        setBooleanField(term5006, term5006.getClass(), "autoSort", false);
        setBooleanField(term5006, term5006.getClass(), "allowDuplicateXValues", false);
        setField(term5006, term5006.getClass(), "key", null);
        setField(term5006, term5006.getClass(), "description", "kuTXqwMtDB");
        setField(term5011, term5011.getClass(), "listenerList", term5012);
        setField(term5006, term5006.getClass(), "listeners", term5011);
        setField(term5014, term5014.getClass(), "map", null);
        setField(term5013, term5013.getClass(), "map", term5014);
        setField(term5013, term5013.getClass(), "source", term5015);
        setField(term5006, term5006.getClass(), "propertyChangeSupport", term5013);
        setBooleanField(term5006, term5006.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term649, args);
        assertTrue(recursiveEquals(term649, term5006));
    }

};


