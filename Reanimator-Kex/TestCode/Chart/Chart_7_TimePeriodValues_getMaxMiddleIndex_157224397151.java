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

public class TimePeriodValues_getMaxMiddleIndex_157224397151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1937;
     Object term7835;

    public TimePeriodValues_getMaxMiddleIndex_157224397151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1962 = new ArrayList();
        term1937 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term1984 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1985 = (Object[]) newArray("java.lang.Object", 0);
        Object term1986 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term1987 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term1988 = newInstance(Class.forName("java.lang.Object"));
        setField(term1937, term1937.getClass(), "domain", "GVizqqzXpy");
        setField(term1937, term1937.getClass(), "range", "JqXGgAhZPl");
        setField(term1937, term1937.getClass(), "data", term1962);
        setIntField(term1937, term1937.getClass(), "minStartIndex", 2095798786);
        setIntField(term1937, term1937.getClass(), "maxStartIndex", -1565502840);
        setIntField(term1937, term1937.getClass(), "minMiddleIndex", 344323424);
        setIntField(term1937, term1937.getClass(), "maxMiddleIndex", 9726679);
        setIntField(term1937, term1937.getClass(), "minEndIndex", -25637976);
        setIntField(term1937, term1937.getClass(), "maxEndIndex", 1555897383);
        setField(term1937, term1937.getClass(), "key", null);
        setField(term1937, term1937.getClass(), "description", "jiKYgYHqIS");
        setField(term1984, term1984.getClass(), "listenerList", term1985);
        setField(term1937, term1937.getClass(), "listeners", term1984);
        setField(term1987, term1987.getClass(), "map", null);
        setField(term1986, term1986.getClass(), "map", term1987);
        setField(term1986, term1986.getClass(), "source", term1988);
        setField(term1937, term1937.getClass(), "propertyChangeSupport", term1986);
        setBooleanField(term1937, term1937.getClass(), "notify", true);
        ArrayList term7840 = new ArrayList();
        term7835 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        Object term7844 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term7845 = (Object[]) newArray("java.lang.Object", 0);
        Object term7846 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term7847 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term7848 = newInstance(Class.forName("java.lang.Object"));
        setField(term7835, term7835.getClass(), "domain", "GVizqqzXpy");
        setField(term7835, term7835.getClass(), "range", "JqXGgAhZPl");
        setField(term7835, term7835.getClass(), "data", term7840);
        setIntField(term7835, term7835.getClass(), "minStartIndex", 2095798786);
        setIntField(term7835, term7835.getClass(), "maxStartIndex", -1565502840);
        setIntField(term7835, term7835.getClass(), "minMiddleIndex", 344323424);
        setIntField(term7835, term7835.getClass(), "maxMiddleIndex", 9726679);
        setIntField(term7835, term7835.getClass(), "minEndIndex", -25637976);
        setIntField(term7835, term7835.getClass(), "maxEndIndex", 1555897383);
        setField(term7835, term7835.getClass(), "key", null);
        setField(term7835, term7835.getClass(), "description", "jiKYgYHqIS");
        setField(term7844, term7844.getClass(), "listenerList", term7845);
        setField(term7835, term7835.getClass(), "listeners", term7844);
        setField(term7847, term7847.getClass(), "map", null);
        setField(term7846, term7846.getClass(), "map", term7847);
        setField(term7846, term7846.getClass(), "source", term7848);
        setField(term7835, term7835.getClass(), "propertyChangeSupport", term7846);
        setBooleanField(term7835, term7835.getClass(), "notify", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxMiddleIndex", argTypes, term1937, args);
        assertTrue(recursiveEquals(term1937, term7835));
        assertTrue(recursiveEquals(retValue, 9726679));
    }

};


