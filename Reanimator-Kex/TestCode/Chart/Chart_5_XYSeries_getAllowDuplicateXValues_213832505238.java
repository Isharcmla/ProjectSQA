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

public class XYSeries_getAllowDuplicateXValues_213832505238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;
     Object term2371;

    public XYSeries_getAllowDuplicateXValues_213832505238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term44 = new ArrayList();
        term43 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term63 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term64 = (Object[]) newArray("java.lang.Object", 0);
        Object term65 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term66 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term67 = newInstance(Class.forName("java.lang.Object"));
        setField(term43, term43.getClass(), "data", term44);
        setIntField(term43, term43.getClass(), "maximumItemCount", 1162663216);
        setBooleanField(term43, term43.getClass(), "autoSort", true);
        setBooleanField(term43, term43.getClass(), "allowDuplicateXValues", true);
        setField(term43, term43.getClass(), "key", null);
        setField(term43, term43.getClass(), "description", "MuLcgQHgqz");
        setField(term63, term63.getClass(), "listenerList", term64);
        setField(term43, term43.getClass(), "listeners", term63);
        setField(term66, term66.getClass(), "map", null);
        setField(term65, term65.getClass(), "map", term66);
        setField(term65, term65.getClass(), "source", term67);
        setField(term43, term43.getClass(), "propertyChangeSupport", term65);
        setBooleanField(term43, term43.getClass(), "notify", false);
        ArrayList term2372 = new ArrayList();
        term2371 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term2376 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term2377 = (Object[]) newArray("java.lang.Object", 0);
        Object term2378 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2379 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2380 = newInstance(Class.forName("java.lang.Object"));
        setField(term2371, term2371.getClass(), "data", term2372);
        setIntField(term2371, term2371.getClass(), "maximumItemCount", 1162663216);
        setBooleanField(term2371, term2371.getClass(), "autoSort", true);
        setBooleanField(term2371, term2371.getClass(), "allowDuplicateXValues", true);
        setField(term2371, term2371.getClass(), "key", null);
        setField(term2371, term2371.getClass(), "description", "MuLcgQHgqz");
        setField(term2376, term2376.getClass(), "listenerList", term2377);
        setField(term2371, term2371.getClass(), "listeners", term2376);
        setField(term2379, term2379.getClass(), "map", null);
        setField(term2378, term2378.getClass(), "map", term2379);
        setField(term2378, term2378.getClass(), "source", term2380);
        setField(term2371, term2371.getClass(), "propertyChangeSupport", term2378);
        setBooleanField(term2371, term2371.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllowDuplicateXValues", argTypes, term43, args);
        assertTrue(recursiveEquals(term43, term2371));
    }

};


