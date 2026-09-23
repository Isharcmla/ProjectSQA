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
import java.lang.Long;
import java.lang.Object;

public class Period_init_911750199175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29253;
     Object term78083;

    public Period_init_911750199175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29253 = new Long(0L);
        term78083 = newInstance(Class.forName("org.joda.time.Period"));
        Object term78084 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term78087 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        Object term78088 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term78090 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term78092 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term78094 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term78096 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term78098 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term78100 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term78102 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term78104 = (int[]) newIntArray(8);
        int[] term78105 = (int[]) newIntArray(8);
        setField(term78084, term78084.getClass(), "iName", "Standard");
        setByteField(term78088, term78088.getClass(), "iOrdinal", (byte) 4);
        setField(term78088, term78088.getClass(), "iName", "");
        setElement(term78087, 0, term78088);
        setByteField(term78090, term78090.getClass(), "iOrdinal", (byte) 5);
        setField(term78090, term78090.getClass(), "iName", "");
        setElement(term78087, 1, term78090);
        setByteField(term78092, term78092.getClass(), "iOrdinal", (byte) 6);
        setField(term78092, term78092.getClass(), "iName", "");
        setElement(term78087, 2, term78092);
        setByteField(term78094, term78094.getClass(), "iOrdinal", (byte) 7);
        setField(term78094, term78094.getClass(), "iName", "");
        setElement(term78087, 3, term78094);
        setByteField(term78096, term78096.getClass(), "iOrdinal", (byte) 9);
        setField(term78096, term78096.getClass(), "iName", "");
        setElement(term78087, 4, term78096);
        setByteField(term78098, term78098.getClass(), "iOrdinal", (byte) 10);
        setField(term78098, term78098.getClass(), "iName", "");
        setElement(term78087, 5, term78098);
        setByteField(term78100, term78100.getClass(), "iOrdinal", (byte) 11);
        setField(term78100, term78100.getClass(), "iName", "");
        setElement(term78087, 6, term78100);
        setByteField(term78102, term78102.getClass(), "iOrdinal", (byte) 12);
        setField(term78102, term78102.getClass(), "iName", "");
        setElement(term78087, 7, term78102);
        setField(term78084, term78084.getClass(), "iTypes", term78087);
        setIntElement(term78104, 1, 1);
        setIntElement(term78104, 2, 2);
        setIntElement(term78104, 3, 3);
        setIntElement(term78104, 4, 4);
        setIntElement(term78104, 5, 5);
        setIntElement(term78104, 6, 6);
        setIntElement(term78104, 7, 7);
        setField(term78084, term78084.getClass(), "iIndices", term78104);
        setField(term78083, term78083.getClass(), "iType", term78084);
        setField(term78083, term78083.getClass(), "iValues", term78105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("org.joda.time.PeriodType");
        argTypes[2] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[3];
        args[0] = term29253;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term78083));
        assertTrue(recursiveEquals(term29253, null));
    }

};


