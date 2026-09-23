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

public class Period_init_125663811697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13388;

    public Period_init_125663811697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13388 = newInstance(Class.forName("org.joda.time.Period"));
        Object term13389 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term13392 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        Object term13393 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term13395 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term13397 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term13399 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term13401 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term13403 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term13405 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term13407 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term13409 = (int[]) newIntArray(8);
        int[] term13410 = (int[]) newIntArray(8);
        setField(term13389, term13389.getClass(), "iName", "Standard");
        setByteField(term13393, term13393.getClass(), "iOrdinal", (byte) 4);
        setField(term13393, term13393.getClass(), "iName", "");
        setElement(term13392, 0, term13393);
        setByteField(term13395, term13395.getClass(), "iOrdinal", (byte) 5);
        setField(term13395, term13395.getClass(), "iName", "");
        setElement(term13392, 1, term13395);
        setByteField(term13397, term13397.getClass(), "iOrdinal", (byte) 6);
        setField(term13397, term13397.getClass(), "iName", "");
        setElement(term13392, 2, term13397);
        setByteField(term13399, term13399.getClass(), "iOrdinal", (byte) 7);
        setField(term13399, term13399.getClass(), "iName", "");
        setElement(term13392, 3, term13399);
        setByteField(term13401, term13401.getClass(), "iOrdinal", (byte) 9);
        setField(term13401, term13401.getClass(), "iName", "");
        setElement(term13392, 4, term13401);
        setByteField(term13403, term13403.getClass(), "iOrdinal", (byte) 10);
        setField(term13403, term13403.getClass(), "iName", "");
        setElement(term13392, 5, term13403);
        setByteField(term13405, term13405.getClass(), "iOrdinal", (byte) 11);
        setField(term13405, term13405.getClass(), "iName", "");
        setElement(term13392, 6, term13405);
        setByteField(term13407, term13407.getClass(), "iOrdinal", (byte) 12);
        setField(term13407, term13407.getClass(), "iName", "");
        setElement(term13392, 7, term13407);
        setField(term13389, term13389.getClass(), "iTypes", term13392);
        setIntElement(term13409, 1, 1);
        setIntElement(term13409, 2, 2);
        setIntElement(term13409, 3, 3);
        setIntElement(term13409, 4, 4);
        setIntElement(term13409, 5, 5);
        setIntElement(term13409, 6, 6);
        setIntElement(term13409, 7, 7);
        setField(term13389, term13389.getClass(), "iIndices", term13409);
        setField(term13388, term13388.getClass(), "iType", term13389);
        setField(term13388, term13388.getClass(), "iValues", term13410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13388));
    }

};


