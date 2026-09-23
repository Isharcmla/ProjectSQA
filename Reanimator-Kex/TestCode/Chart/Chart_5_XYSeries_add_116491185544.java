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
import java.lang.Double;

public class XYSeries_add_116491185544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262;
     Object term288;
     Object term290;
     Object term3038;

    public XYSeries_add_116491185544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term263 = new ArrayList();
        term262 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term282 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term283 = (Object[]) newArray("java.lang.Object", 0);
        Object term284 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term285 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term286 = newInstance(Class.forName("java.lang.Object"));
        setField(term262, term262.getClass(), "data", term263);
        setIntField(term262, term262.getClass(), "maximumItemCount", 1227103734);
        setBooleanField(term262, term262.getClass(), "autoSort", true);
        setBooleanField(term262, term262.getClass(), "allowDuplicateXValues", false);
        setField(term262, term262.getClass(), "key", null);
        setField(term262, term262.getClass(), "description", "oVcInYnLWB");
        setField(term282, term282.getClass(), "listenerList", term283);
        setField(term262, term262.getClass(), "listeners", term282);
        setField(term285, term285.getClass(), "map", null);
        setField(term284, term284.getClass(), "map", term285);
        setField(term284, term284.getClass(), "source", term286);
        setField(term262, term262.getClass(), "propertyChangeSupport", term284);
        setBooleanField(term262, term262.getClass(), "notify", false);
        term288 = new Double(0.13238746331190498);
        term290 = new Double(0.3455959125047594);
        Double term3042 = new Double(0.13238746331190498);
        Double term3043 = new Double(0.3455959125047594);
        Object term3041 = newInstance(Class.forName("org.jfree.data.xy.XYDataItem"));
        setField(term3041, term3041.getClass(), "x", term3042);
        setField(term3041, term3041.getClass(), "y", term3043);
        ArrayList term3039 = new ArrayList();
        ((ArrayList) term3039).add(term3041);
        term3038 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term3046 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3047 = (Object[]) newArray("java.lang.Object", 0);
        Object term3048 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3049 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3050 = newInstance(Class.forName("java.lang.Object"));
        setField(term3038, term3038.getClass(), "data", term3039);
        setIntField(term3038, term3038.getClass(), "maximumItemCount", 1227103734);
        setBooleanField(term3038, term3038.getClass(), "autoSort", true);
        setBooleanField(term3038, term3038.getClass(), "allowDuplicateXValues", false);
        setField(term3038, term3038.getClass(), "key", null);
        setField(term3038, term3038.getClass(), "description", "oVcInYnLWB");
        setField(term3046, term3046.getClass(), "listenerList", term3047);
        setField(term3038, term3038.getClass(), "listeners", term3046);
        setField(term3049, term3049.getClass(), "map", null);
        setField(term3048, term3048.getClass(), "map", term3049);
        setField(term3048, term3048.getClass(), "source", term3050);
        setField(term3038, term3038.getClass(), "propertyChangeSupport", term3048);
        setBooleanField(term3038, term3038.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term288;
        args[1] = term290;
        callMethod(klass, "add", argTypes, term262, args);
        assertTrue(recursiveEquals(term262, term3038));
        assertTrue(recursiveEquals(term288, 0.13238746331190498));
        assertTrue(recursiveEquals(term290, 0.3455959125047594));
    }

};


