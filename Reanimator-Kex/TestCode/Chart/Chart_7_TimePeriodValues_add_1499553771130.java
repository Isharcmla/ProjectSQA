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

public class TimePeriodValues_add_1499553771130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25710;
     Object term25840;
     Object term26233;
     Object term26238;

    public TimePeriodValues_add_1499553771130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term25762 = new ArrayList();
        term25710 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term25710, term25710.getClass(), "data", term25762);
        term25840 = newInstance(Class.forName("org.jfree.data.time.FixedMillisecond"));
        Object term26236 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValue"));
        Object term26237 = newInstance(Class.forName("org.jfree.data.time.FixedMillisecond"));
        setLongField(term26237, term26237.getClass(), "time", 0L);
        setField(term26236, term26236.getClass(), "period", term26237);
        setField(term26236, term26236.getClass(), "value", null);
        ArrayList term26234 = new ArrayList();
        ((ArrayList) term26234).add(term26236);
        term26233 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term26233, term26233.getClass(), "domain", null);
        setField(term26233, term26233.getClass(), "range", null);
        setField(term26233, term26233.getClass(), "data", term26234);
        setIntField(term26233, term26233.getClass(), "minStartIndex", 0);
        setIntField(term26233, term26233.getClass(), "maxStartIndex", 0);
        setIntField(term26233, term26233.getClass(), "minMiddleIndex", 0);
        setIntField(term26233, term26233.getClass(), "maxMiddleIndex", 0);
        setIntField(term26233, term26233.getClass(), "minEndIndex", 0);
        setIntField(term26233, term26233.getClass(), "maxEndIndex", 0);
        setField(term26233, term26233.getClass(), "key", null);
        setField(term26233, term26233.getClass(), "description", null);
        setField(term26233, term26233.getClass(), "listeners", null);
        setField(term26233, term26233.getClass(), "propertyChangeSupport", null);
        setBooleanField(term26233, term26233.getClass(), "notify", false);
        term26238 = newInstance(Class.forName("org.jfree.data.time.FixedMillisecond"));
        setLongField(term26238, term26238.getClass(), "time", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimePeriod");
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = term25840;
        args[1] = null;
        callMethod(klass, "add", argTypes, term25710, args);
        assertTrue(recursiveEquals(term25710, term26233));
        assertTrue(recursiveEquals(term25840, term26238));
    }

};


