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

public class TimePeriodValues_getMaxStartIndex_65511306849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1771;
     Object term7525;

    public TimePeriodValues_getMaxStartIndex_65511306849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1796 = new ArrayList();
        term1771 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term1818 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1819 = (Object[]) newArray("java.lang.Object", 0);
        Object term1820 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1821 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1822 = newInstance(Class.forName("java.lang.Object"));
        setField(term1771, term1771.getClass(), "domain", "cAPeiZHKGJ");
        setField(term1771, term1771.getClass(), "range", "LvJFtLBaxj");
        setField(term1771, term1771.getClass(), "data", term1796);
        setIntField(term1771, term1771.getClass(), "minStartIndex", -341152642);
        setIntField(term1771, term1771.getClass(), "maxStartIndex", -2015854073);
        setIntField(term1771, term1771.getClass(), "minMiddleIndex", 538259104);
        setIntField(term1771, term1771.getClass(), "maxMiddleIndex", 96566506);
        setIntField(term1771, term1771.getClass(), "minEndIndex", -343325701);
        setIntField(term1771, term1771.getClass(), "maxEndIndex", 107945604);
        setField(term1771, term1771.getClass(), "key", null);
        setField(term1771, term1771.getClass(), "description", "PHvxnGHptP");
        setField(term1818, term1818.getClass(), "listenerList", term1819);
        setField(term1771, term1771.getClass(), "listeners", term1818);
        setField(term1821, term1821.getClass(), "map", null);
        setField(term1820, term1820.getClass(), "map", term1821);
        setField(term1820, term1820.getClass(), "source", term1822);
        setField(term1771, term1771.getClass(), "propertyChangeSupport", term1820);
        setBooleanField(term1771, term1771.getClass(), "notify", true);
        ArrayList term7530 = new ArrayList();
        term7525 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term7534 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term7535 = (Object[]) newArray("java.lang.Object", 0);
        Object term7536 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term7537 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term7538 = newInstance(Class.forName("java.lang.Object"));
        setField(term7525, term7525.getClass(), "domain", "cAPeiZHKGJ");
        setField(term7525, term7525.getClass(), "range", "LvJFtLBaxj");
        setField(term7525, term7525.getClass(), "data", term7530);
        setIntField(term7525, term7525.getClass(), "minStartIndex", -341152642);
        setIntField(term7525, term7525.getClass(), "maxStartIndex", -2015854073);
        setIntField(term7525, term7525.getClass(), "minMiddleIndex", 538259104);
        setIntField(term7525, term7525.getClass(), "maxMiddleIndex", 96566506);
        setIntField(term7525, term7525.getClass(), "minEndIndex", -343325701);
        setIntField(term7525, term7525.getClass(), "maxEndIndex", 107945604);
        setField(term7525, term7525.getClass(), "key", null);
        setField(term7525, term7525.getClass(), "description", "PHvxnGHptP");
        setField(term7534, term7534.getClass(), "listenerList", term7535);
        setField(term7525, term7525.getClass(), "listeners", term7534);
        setField(term7537, term7537.getClass(), "map", null);
        setField(term7536, term7536.getClass(), "map", term7537);
        setField(term7536, term7536.getClass(), "source", term7538);
        setField(term7525, term7525.getClass(), "propertyChangeSupport", term7536);
        setBooleanField(term7525, term7525.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxStartIndex", argTypes, term1771, args);
        assertTrue(recursiveEquals(term1771, term7525));
        assertTrue(recursiveEquals(retValue, -2015854073));
    }

};


