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
import java.lang.Boolean;

public class XYSeries_add_72782031450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496;
     Object term522;
     Object term523;
     Object term3977;
     Object term3988;

    public XYSeries_add_72782031450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term497 = new ArrayList();
        term496 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term516 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term517 = (Object[]) newArray("java.lang.Object", 0);
        Object term518 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term519 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term520 = newInstance(Class.forName("java.lang.Object"));
        setField(term496, term496.getClass(), "data", term497);
        setIntField(term496, term496.getClass(), "maximumItemCount", 1585847225);
        setBooleanField(term496, term496.getClass(), "autoSort", true);
        setBooleanField(term496, term496.getClass(), "allowDuplicateXValues", true);
        setField(term496, term496.getClass(), "key", null);
        setField(term496, term496.getClass(), "description", "flxyYxBRtu");
        setField(term516, term516.getClass(), "listenerList", term517);
        setField(term496, term496.getClass(), "listeners", term516);
        setField(term519, term519.getClass(), "map", null);
        setField(term518, term518.getClass(), "map", term519);
        setField(term518, term518.getClass(), "source", term520);
        setField(term496, term496.getClass(), "propertyChangeSupport", term518);
        setBooleanField(term496, term496.getClass(), "notify", true);
        term522 = newInstance(Class.forName("org.jfree.data.xy.XYDataItem"));
        setField(term522, term522.getClass(), "x", null);
        setField(term522, term522.getClass(), "y", null);
        term523 = new Boolean(false);
        Object term3980 = newInstance(Class.forName("org.jfree.data.xy.XYDataItem"));
        setField(term3980, term3980.getClass(), "x", null);
        setField(term3980, term3980.getClass(), "y", null);
        ArrayList term3978 = new ArrayList();
        ((ArrayList) term3978).add(term3980);
        term3977 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        Object term3983 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term3984 = (Object[]) newArray("java.lang.Object", 0);
        Object term3985 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term3986 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term3987 = newInstance(Class.forName("java.lang.Object"));
        setField(term3977, term3977.getClass(), "data", term3978);
        setIntField(term3977, term3977.getClass(), "maximumItemCount", 1585847225);
        setBooleanField(term3977, term3977.getClass(), "autoSort", true);
        setBooleanField(term3977, term3977.getClass(), "allowDuplicateXValues", true);
        setField(term3977, term3977.getClass(), "key", null);
        setField(term3977, term3977.getClass(), "description", "flxyYxBRtu");
        setField(term3983, term3983.getClass(), "listenerList", term3984);
        setField(term3977, term3977.getClass(), "listeners", term3983);
        setField(term3986, term3986.getClass(), "map", null);
        setField(term3985, term3985.getClass(), "map", term3986);
        setField(term3985, term3985.getClass(), "source", term3987);
        setField(term3977, term3977.getClass(), "propertyChangeSupport", term3985);
        setBooleanField(term3977, term3977.getClass(), "notify", true);
        term3988 = newInstance(Class.forName("org.jfree.data.xy.XYDataItem"));
        setField(term3988, term3988.getClass(), "x", null);
        setField(term3988, term3988.getClass(), "y", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.xy.XYDataItem");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term522;
        args[1] = term523;
        callMethod(klass, "add", argTypes, term496, args);
        assertTrue(recursiveEquals(term496, term3977));
        assertTrue(recursiveEquals(term522, term3988));
        assertTrue(recursiveEquals(term523, false));
    }

};


