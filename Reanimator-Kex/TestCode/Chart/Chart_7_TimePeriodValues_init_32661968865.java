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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class TimePeriodValues_init_32661968865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum1;
     Object term10283;
     Object enum3;

    public TimePeriodValues_init_32661968865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9940 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Class<? extends Object> term10297 = Class.forName((String) "java.lang.ProcessImpl$LaunchMechanism");
        Field term10296 = ((Class) term10297).getDeclaredField((String) "FORK");
        ((Field) term10296).setAccessible(true);
        enum1 = ((Field) term10296).get((Object) null);
        ArrayList term10284 = new ArrayList();
        Class<? extends Object> term10501 = Class.forName((String) "java.lang.ProcessImpl$LaunchMechanism");
        Field term10500 = ((Class) term10501).getDeclaredField((String) "FORK");
        ((Field) term10500).setAccessible(true);
        Object enum2 = ((Field) term10500).get((Object) null);
        term10283 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term10289 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term10290 = (Object[]) newArray("java.lang.Object", 0);
        Object term10291 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term10292 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        setField(term10283, term10283.getClass(), "domain", null);
        setField(term10283, term10283.getClass(), "range", null);
        setField(term10283, term10283.getClass(), "data", term10284);
        setIntField(term10283, term10283.getClass(), "minStartIndex", -1);
        setIntField(term10283, term10283.getClass(), "maxStartIndex", -1);
        setIntField(term10283, term10283.getClass(), "minMiddleIndex", -1);
        setIntField(term10283, term10283.getClass(), "maxMiddleIndex", -1);
        setIntField(term10283, term10283.getClass(), "minEndIndex", -1);
        setIntField(term10283, term10283.getClass(), "maxEndIndex", -1);
        setField(term10283, term10283.getClass(), "key", enum2);
        setField(term10283, term10283.getClass(), "description", null);
        setField(term10289, term10289.getClass(), "listenerList", term10290);
        setField(term10283, term10283.getClass(), "listeners", term10289);
        setField(term10292, term10292.getClass(), "map", null);
        setField(term10291, term10291.getClass(), "map", term10292);
        setField(term10291, term10291.getClass(), "source", term10283);
        setField(term10283, term10283.getClass(), "propertyChangeSupport", term10291);
        setBooleanField(term10283, term10283.getClass(), "notify", true);
        Class<? extends Object> term10705 = Class.forName((String) "java.lang.ProcessImpl$LaunchMechanism");
        Field term10704 = ((Class) term10705).getDeclaredField((String) "FORK");
        ((Field) term10704).setAccessible(true);
        enum3 = ((Field) term10704).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = enum1;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10283));
        assertTrue(recursiveEquals(enum1, enum3));
    }

};


