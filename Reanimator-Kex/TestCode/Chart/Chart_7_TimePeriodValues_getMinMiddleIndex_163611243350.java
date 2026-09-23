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
import java.util.ArrayList;
import java.lang.Object;

public class TimePeriodValues_getMinMiddleIndex_163611243350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1854;
     Object term7653;

    public TimePeriodValues_getMinMiddleIndex_163611243350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1879 = new ArrayList();
        term1854 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term1901 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1902 = (Object[]) newArray("java.lang.Object", 0);
        Object term1903 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1904 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1905 = newInstance(Class.forName("java.lang.Object"));
        setField(term1854, term1854.getClass(), "domain", "PkWMRdJcBb");
        setField(term1854, term1854.getClass(), "range", "jSpAteRute");
        setField(term1854, term1854.getClass(), "data", term1879);
        setIntField(term1854, term1854.getClass(), "minStartIndex", -1963464809);
        setIntField(term1854, term1854.getClass(), "maxStartIndex", 71190297);
        setIntField(term1854, term1854.getClass(), "minMiddleIndex", 1202361360);
        setIntField(term1854, term1854.getClass(), "maxMiddleIndex", -2015048153);
        setIntField(term1854, term1854.getClass(), "minEndIndex", -2063457669);
        setIntField(term1854, term1854.getClass(), "maxEndIndex", -1222006000);
        setField(term1854, term1854.getClass(), "key", null);
        setField(term1854, term1854.getClass(), "description", "swZVeJAxjt");
        setField(term1901, term1901.getClass(), "listenerList", term1902);
        setField(term1854, term1854.getClass(), "listeners", term1901);
        setField(term1904, term1904.getClass(), "map", null);
        setField(term1903, term1903.getClass(), "map", term1904);
        setField(term1903, term1903.getClass(), "source", term1905);
        setField(term1854, term1854.getClass(), "propertyChangeSupport", term1903);
        setBooleanField(term1854, term1854.getClass(), "notify", true);
        ArrayList term7658 = new ArrayList();
        term7653 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term7662 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term7663 = (Object[]) newArray("java.lang.Object", 0);
        Object term7664 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term7665 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term7666 = newInstance(Class.forName("java.lang.Object"));
        setField(term7653, term7653.getClass(), "domain", "PkWMRdJcBb");
        setField(term7653, term7653.getClass(), "range", "jSpAteRute");
        setField(term7653, term7653.getClass(), "data", term7658);
        setIntField(term7653, term7653.getClass(), "minStartIndex", -1963464809);
        setIntField(term7653, term7653.getClass(), "maxStartIndex", 71190297);
        setIntField(term7653, term7653.getClass(), "minMiddleIndex", 1202361360);
        setIntField(term7653, term7653.getClass(), "maxMiddleIndex", -2015048153);
        setIntField(term7653, term7653.getClass(), "minEndIndex", -2063457669);
        setIntField(term7653, term7653.getClass(), "maxEndIndex", -1222006000);
        setField(term7653, term7653.getClass(), "key", null);
        setField(term7653, term7653.getClass(), "description", "swZVeJAxjt");
        setField(term7662, term7662.getClass(), "listenerList", term7663);
        setField(term7653, term7653.getClass(), "listeners", term7662);
        setField(term7665, term7665.getClass(), "map", null);
        setField(term7664, term7664.getClass(), "map", term7665);
        setField(term7664, term7664.getClass(), "source", term7666);
        setField(term7653, term7653.getClass(), "propertyChangeSupport", term7664);
        setBooleanField(term7653, term7653.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMinMiddleIndex", argTypes, term1854, args);
        assertTrue(recursiveEquals(term1854, term7653));
        assertTrue(recursiveEquals(retValue, 1202361360));
    }

};


