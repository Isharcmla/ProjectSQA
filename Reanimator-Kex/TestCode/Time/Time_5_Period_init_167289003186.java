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

public class Period_init_167289003186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89328;
     Object term91080;
     Object term91086;

    public Period_init_167289003186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term89220 = newInstance(Class.forName("org.joda.time.Period"));
        Object term89274 = newInstance(Class.forName("org.joda.time.PeriodType"));
        setField(term89220, term89220.getClass(), "iType", term89274);
        term89328 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term89130 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        Object term89448 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term89568 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setElement(term89130, 0, term89448);
        setElement(term89130, 1, term89568);
        setField(term89328, term89328.getClass(), "iTypes", term89130);
        term91080 = newInstance(Class.forName("org.joda.time.Period"));
        Object term91081 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term91082 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        Object term91083 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term91084 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term91085 = (int[]) newIntArray(2);
        setField(term91081, term91081.getClass(), "iName", null);
        setByteField(term91083, term91083.getClass(), "iOrdinal", (byte) 0);
        setField(term91083, term91083.getClass(), "iName", null);
        setElement(term91082, 0, term91083);
        setByteField(term91084, term91084.getClass(), "iOrdinal", (byte) 0);
        setField(term91084, term91084.getClass(), "iName", null);
        setElement(term91082, 1, term91084);
        setField(term91081, term91081.getClass(), "iTypes", term91082);
        setField(term91081, term91081.getClass(), "iIndices", null);
        setField(term91080, term91080.getClass(), "iType", term91081);
        setField(term91080, term91080.getClass(), "iValues", term91085);
        term91086 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term91087 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        Object term91088 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term91089 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term91086, term91086.getClass(), "iName", null);
        setByteField(term91088, term91088.getClass(), "iOrdinal", (byte) 0);
        setField(term91088, term91088.getClass(), "iName", null);
        setElement(term91087, 0, term91088);
        setByteField(term91089, term91089.getClass(), "iOrdinal", (byte) 0);
        setField(term91089, term91089.getClass(), "iName", null);
        setElement(term91087, 1, term91089);
        setField(term91086, term91086.getClass(), "iTypes", term91087);
        setField(term91086, term91086.getClass(), "iIndices", null);
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
        args[8] = term89328;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term91080));
        assertTrue(recursiveEquals(term89328, 0));
    }

};


