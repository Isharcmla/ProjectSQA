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
import java.lang.IllegalArgumentException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Double;

public class TimePeriodValues_add_61642572940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1011;
     Object term1064;

    public TimePeriodValues_add_61642572940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1036 = new ArrayList();
        term1011 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term1058 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1059 = (Object[]) newArray("java.lang.Object", 0);
        Object term1060 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1061 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1062 = newInstance(Class.forName("java.lang.Object"));
        setField(term1011, term1011.getClass(), "domain", "xLbjWUgOIL");
        setField(term1011, term1011.getClass(), "range", "jDtqGUpnZN");
        setField(term1011, term1011.getClass(), "data", term1036);
        setIntField(term1011, term1011.getClass(), "minStartIndex", 287287233);
        setIntField(term1011, term1011.getClass(), "maxStartIndex", 962840079);
        setIntField(term1011, term1011.getClass(), "minMiddleIndex", 1540719661);
        setIntField(term1011, term1011.getClass(), "maxMiddleIndex", 1265463001);
        setIntField(term1011, term1011.getClass(), "minEndIndex", 335112684);
        setIntField(term1011, term1011.getClass(), "maxEndIndex", 1551099402);
        setField(term1011, term1011.getClass(), "key", null);
        setField(term1011, term1011.getClass(), "description", "nGKItKLYNC");
        setField(term1058, term1058.getClass(), "listenerList", term1059);
        setField(term1011, term1011.getClass(), "listeners", term1058);
        setField(term1061, term1061.getClass(), "map", null);
        setField(term1060, term1060.getClass(), "map", term1061);
        setField(term1060, term1060.getClass(), "source", term1062);
        setField(term1011, term1011.getClass(), "propertyChangeSupport", term1060);
        setBooleanField(term1011, term1011.getClass(), "notify", true);
        term1064 = new Double(0.13238746331190498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimePeriod");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1064;
        try {
            callMethod(klass, "add", argTypes, term1011, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


