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
import java.lang.Double;

public class TimePeriodValues_add_616425729124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23767;
     Object term23877;
     Object term24296;
     Object term24302;

    public TimePeriodValues_add_616425729124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23819 = new ArrayList();
        term23767 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term23767, term23767.getClass(), "data", term23819);
        term23877 = newInstance(Class.forName("org.jfree.data.time.Minute"));
        Double term24301 = new Double(0.0);
        Object term24299 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValue"));
        Object term24300 = newInstance(Class.forName("org.jfree.data.time.Minute"));
        setField(term24300, term24300.getClass(), "day", null);
        setByteField(term24300, term24300.getClass(), "hour", (byte) 0);
        setByteField(term24300, term24300.getClass(), "minute", (byte) 0);
        setLongField(term24300, term24300.getClass(), "firstMillisecond", 0L);
        setLongField(term24300, term24300.getClass(), "lastMillisecond", 0L);
        setField(term24299, term24299.getClass(), "period", term24300);
        setField(term24299, term24299.getClass(), "value", term24301);
        ArrayList term24297 = new ArrayList();
        ((ArrayList) term24297).add(term24299);
        term24296 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term24296, term24296.getClass(), "domain", null);
        setField(term24296, term24296.getClass(), "range", null);
        setField(term24296, term24296.getClass(), "data", term24297);
        setIntField(term24296, term24296.getClass(), "minStartIndex", 0);
        setIntField(term24296, term24296.getClass(), "maxStartIndex", 0);
        setIntField(term24296, term24296.getClass(), "minMiddleIndex", 0);
        setIntField(term24296, term24296.getClass(), "maxMiddleIndex", 0);
        setIntField(term24296, term24296.getClass(), "minEndIndex", 0);
        setIntField(term24296, term24296.getClass(), "maxEndIndex", 0);
        setField(term24296, term24296.getClass(), "key", null);
        setField(term24296, term24296.getClass(), "description", null);
        setField(term24296, term24296.getClass(), "listeners", null);
        setField(term24296, term24296.getClass(), "propertyChangeSupport", null);
        setBooleanField(term24296, term24296.getClass(), "notify", false);
        term24302 = newInstance(Class.forName("org.jfree.data.time.Minute"));
        setField(term24302, term24302.getClass(), "day", null);
        setByteField(term24302, term24302.getClass(), "hour", (byte) 0);
        setByteField(term24302, term24302.getClass(), "minute", (byte) 0);
        setLongField(term24302, term24302.getClass(), "firstMillisecond", 0L);
        setLongField(term24302, term24302.getClass(), "lastMillisecond", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.time.TimePeriod");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term23877;
        args[1] = 0.0;
        callMethod(klass, "add", argTypes, term23767, args);
        assertTrue(recursiveEquals(term23767, term24296));
        assertTrue(recursiveEquals(term23877, term24302));
    }

};


