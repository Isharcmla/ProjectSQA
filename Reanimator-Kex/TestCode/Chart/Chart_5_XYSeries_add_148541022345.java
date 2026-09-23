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
import java.lang.Boolean;

public class XYSeries_add_148541022345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302;
     Object term328;
     Object term330;
     Object term332;
     Object term3145;

    public XYSeries_add_148541022345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term303 = new ArrayList();
        term302 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term322 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term323 = (Object[]) newArray("java.lang.Object", 0);
        Object term324 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term325 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term326 = newInstance(Class.forName("java.lang.Object"));
        setField(term302, term302.getClass(), "data", term303);
        setIntField(term302, term302.getClass(), "maximumItemCount", -1339778481);
        setBooleanField(term302, term302.getClass(), "autoSort", false);
        setBooleanField(term302, term302.getClass(), "allowDuplicateXValues", true);
        setField(term302, term302.getClass(), "key", null);
        setField(term302, term302.getClass(), "description", "ZiaGIbnzTs");
        setField(term322, term322.getClass(), "listenerList", term323);
        setField(term302, term302.getClass(), "listeners", term322);
        setField(term325, term325.getClass(), "map", null);
        setField(term324, term324.getClass(), "map", term325);
        setField(term324, term324.getClass(), "source", term326);
        setField(term302, term302.getClass(), "propertyChangeSupport", term324);
        setBooleanField(term302, term302.getClass(), "notify", true);
        term328 = new Double(0.5523635872663106);
        term330 = new Double(0.544608645520025);
        term332 = new Boolean(true);
        ArrayList term3146 = new ArrayList();
        term3145 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term3150 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3151 = (Object[]) newArray("java.lang.Object", 0);
        Object term3152 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3153 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3154 = newInstance(Class.forName("java.lang.Object"));
        setField(term3145, term3145.getClass(), "data", term3146);
        setIntField(term3145, term3145.getClass(), "maximumItemCount", -1339778481);
        setBooleanField(term3145, term3145.getClass(), "autoSort", false);
        setBooleanField(term3145, term3145.getClass(), "allowDuplicateXValues", true);
        setField(term3145, term3145.getClass(), "key", null);
        setField(term3145, term3145.getClass(), "description", "ZiaGIbnzTs");
        setField(term3150, term3150.getClass(), "listenerList", term3151);
        setField(term3145, term3145.getClass(), "listeners", term3150);
        setField(term3153, term3153.getClass(), "map", null);
        setField(term3152, term3152.getClass(), "map", term3153);
        setField(term3152, term3152.getClass(), "source", term3154);
        setField(term3145, term3145.getClass(), "propertyChangeSupport", term3152);
        setBooleanField(term3145, term3145.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term328;
        args[1] = term330;
        args[2] = term332;
        callMethod(klass, "add", argTypes, term302, args);
        assertTrue(recursiveEquals(term302, term3145));
        assertTrue(recursiveEquals(term328, true));
        assertTrue(recursiveEquals(term330, 0.5523635872663106));
        assertTrue(recursiveEquals(term332, 0.544608645520025));
    }

};


