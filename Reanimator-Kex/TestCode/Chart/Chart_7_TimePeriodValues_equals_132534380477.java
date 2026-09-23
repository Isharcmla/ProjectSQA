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

public class TimePeriodValues_equals_132534380477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13010;
     Object term13573;
     Object term13574;

    public TimePeriodValues_equals_132534380477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13010 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        term13573 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term13573, term13573.getClass(), "domain", null);
        setField(term13573, term13573.getClass(), "range", null);
        setField(term13573, term13573.getClass(), "data", null);
        setIntField(term13573, term13573.getClass(), "minStartIndex", 0);
        setIntField(term13573, term13573.getClass(), "maxStartIndex", 0);
        setIntField(term13573, term13573.getClass(), "minMiddleIndex", 0);
        setIntField(term13573, term13573.getClass(), "maxMiddleIndex", 0);
        setIntField(term13573, term13573.getClass(), "minEndIndex", 0);
        setIntField(term13573, term13573.getClass(), "maxEndIndex", 0);
        setField(term13573, term13573.getClass(), "key", null);
        setField(term13573, term13573.getClass(), "description", null);
        setField(term13573, term13573.getClass(), "listeners", null);
        setField(term13573, term13573.getClass(), "propertyChangeSupport", null);
        setBooleanField(term13573, term13573.getClass(), "notify", false);
        term13574 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term13574, term13574.getClass(), "domain", null);
        setField(term13574, term13574.getClass(), "range", null);
        setField(term13574, term13574.getClass(), "data", null);
        setIntField(term13574, term13574.getClass(), "minStartIndex", 0);
        setIntField(term13574, term13574.getClass(), "maxStartIndex", 0);
        setIntField(term13574, term13574.getClass(), "minMiddleIndex", 0);
        setIntField(term13574, term13574.getClass(), "maxMiddleIndex", 0);
        setIntField(term13574, term13574.getClass(), "minEndIndex", 0);
        setIntField(term13574, term13574.getClass(), "maxEndIndex", 0);
        setField(term13574, term13574.getClass(), "key", null);
        setField(term13574, term13574.getClass(), "description", null);
        setField(term13574, term13574.getClass(), "listeners", null);
        setField(term13574, term13574.getClass(), "propertyChangeSupport", null);
        setBooleanField(term13574, term13574.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13010;
        Object retValue = callMethod(klass, "equals", argTypes, term13010, args);
        assertTrue(recursiveEquals(term13010, term13573));
        assertTrue(recursiveEquals(term13010, term13574));
        assertTrue(recursiveEquals(retValue, true));
    }

};


