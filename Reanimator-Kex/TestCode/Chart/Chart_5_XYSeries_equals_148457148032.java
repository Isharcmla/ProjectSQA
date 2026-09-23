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
import java.util.ArrayList;
import java.lang.Object;

public class XYSeries_equals_148457148032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1097;
     Object term1123;

    public XYSeries_equals_148457148032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1098 = new ArrayList();
        term1097 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term1117 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1118 = (Object[]) newArray("java.lang.Object", 0);
        Object term1119 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1120 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1121 = newInstance(Class.forName("java.lang.Object"));
        setField(term1097, term1097.getClass(), "data", term1098);
        setIntField(term1097, term1097.getClass(), "maximumItemCount", 679763016);
        setBooleanField(term1097, term1097.getClass(), "autoSort", false);
        setBooleanField(term1097, term1097.getClass(), "allowDuplicateXValues", false);
        setField(term1097, term1097.getClass(), "key", null);
        setField(term1097, term1097.getClass(), "description", "ytSBIKXogI");
        setField(term1117, term1117.getClass(), "listenerList", term1118);
        setField(term1097, term1097.getClass(), "listeners", term1117);
        setField(term1120, term1120.getClass(), "map", null);
        setField(term1119, term1119.getClass(), "map", term1120);
        setField(term1119, term1119.getClass(), "source", term1121);
        setField(term1097, term1097.getClass(), "propertyChangeSupport", term1119);
        setBooleanField(term1097, term1097.getClass(), "notify", true);
        term1123 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1123;
        callMethod(klass, "equals", argTypes, term1097, args);
    }

};


