package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Object;

public class Period_init_167289003183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88301;
     Object term89947;
     Object term89953;

    public Period_init_167289003183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term88193 = newInstance(Class.forName("org.joda.time.Period"));
        Object term88247 = newInstance(Class.forName("org.joda.time.PeriodType"));
        setField(term88193, term88193.getClass(), "iType", term88247);
        term88301 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term88111 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        Object term88421 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term88541 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setElement(term88111, 0, term88421);
        setElement(term88111, 1, term88541);
        setField(term88301, term88301.getClass(), "iTypes", term88111);
        term89947 = newInstance(Class.forName("org.joda.time.Period"));
        Object term89948 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term89949 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        Object term89950 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term89951 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term89952 = (int[]) newIntArray(2);
        setField(term89948, term89948.getClass(), "iName", null);
        setByteField(term89950, term89950.getClass(), "iOrdinal", (byte) 0);
        setField(term89950, term89950.getClass(), "iName", null);
        setElement(term89949, 0, term89950);
        setByteField(term89951, term89951.getClass(), "iOrdinal", (byte) 0);
        setField(term89951, term89951.getClass(), "iName", null);
        setElement(term89949, 1, term89951);
        setField(term89948, term89948.getClass(), "iTypes", term89949);
        setField(term89948, term89948.getClass(), "iIndices", null);
        setField(term89947, term89947.getClass(), "iType", term89948);
        setField(term89947, term89947.getClass(), "iValues", term89952);
        term89953 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term89954 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        Object term89955 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term89956 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term89953, term89953.getClass(), "iName", null);
        setByteField(term89955, term89955.getClass(), "iOrdinal", (byte) 0);
        setField(term89955, term89955.getClass(), "iName", null);
        setElement(term89954, 0, term89955);
        setByteField(term89956, term89956.getClass(), "iOrdinal", (byte) 0);
        setField(term89956, term89956.getClass(), "iName", null);
        setElement(term89954, 1, term89956);
        setField(term89953, term89953.getClass(), "iTypes", term89954);
        setField(term89953, term89953.getClass(), "iIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[9];
        args[0] = 0;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = term88301;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term89947));
        assertTrue(recursiveEquals(term88301, 0));
    }

};


