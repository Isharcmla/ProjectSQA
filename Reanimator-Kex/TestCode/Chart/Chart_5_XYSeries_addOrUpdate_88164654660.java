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

public class XYSeries_addOrUpdate_88164654660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term873;
     Object term899;
     Object term901;
     Object term6909;

    public XYSeries_addOrUpdate_88164654660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term874 = new ArrayList();
        term873 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term893 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term894 = (Object[]) newArray("java.lang.Object", 0);
        Object term895 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term896 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term897 = newInstance(Class.forName("java.lang.Object"));
        setField(term873, term873.getClass(), "data", term874);
        setIntField(term873, term873.getClass(), "maximumItemCount", -1179120542);
        setBooleanField(term873, term873.getClass(), "autoSort", true);
        setBooleanField(term873, term873.getClass(), "allowDuplicateXValues", false);
        setField(term873, term873.getClass(), "key", null);
        setField(term873, term873.getClass(), "description", "tShwQLRGNe");
        setField(term893, term893.getClass(), "listenerList", term894);
        setField(term873, term873.getClass(), "listeners", term893);
        setField(term896, term896.getClass(), "map", null);
        setField(term895, term895.getClass(), "map", term896);
        setField(term895, term895.getClass(), "source", term897);
        setField(term873, term873.getClass(), "propertyChangeSupport", term895);
        setBooleanField(term873, term873.getClass(), "notify", false);
        term899 = new Double(0.2641345529914265);
        term901 = new Double(0.36923381893433327);
        ArrayList term6910 = new ArrayList();
        term6909 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term6914 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term6915 = (Object[]) newArray("java.lang.Object", 0);
        Object term6916 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term6917 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term6918 = newInstance(Class.forName("java.lang.Object"));
        setField(term6909, term6909.getClass(), "data", term6910);
        setIntField(term6909, term6909.getClass(), "maximumItemCount", -1179120542);
        setBooleanField(term6909, term6909.getClass(), "autoSort", true);
        setBooleanField(term6909, term6909.getClass(), "allowDuplicateXValues", false);
        setField(term6909, term6909.getClass(), "key", null);
        setField(term6909, term6909.getClass(), "description", "tShwQLRGNe");
        setField(term6914, term6914.getClass(), "listenerList", term6915);
        setField(term6909, term6909.getClass(), "listeners", term6914);
        setField(term6917, term6917.getClass(), "map", null);
        setField(term6916, term6916.getClass(), "map", term6917);
        setField(term6916, term6916.getClass(), "source", term6918);
        setField(term6909, term6909.getClass(), "propertyChangeSupport", term6916);
        setBooleanField(term6909, term6909.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term899;
        args[1] = term901;
        Object retValue = callMethod(klass, "addOrUpdate", argTypes, term873, args);
        assertTrue(recursiveEquals(term873, term6909));
        assertTrue(recursiveEquals(term899, 0.2641345529914265));
        assertTrue(recursiveEquals(term901, 0.36923381893433327));
        assertTrue(recursiveEquals(retValue, null));
    }

};


