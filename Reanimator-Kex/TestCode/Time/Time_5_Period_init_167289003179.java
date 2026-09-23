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

public class Period_init_167289003179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87022;
     Object term88085;
     Object term88092;

    public Period_init_167289003179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term86968 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term86968, term86968.getClass(), "iType", null);
        term87022 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term86867 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        Object term87142 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term87262 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term87382 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setElement(term86867, 0, term87142);
        setElement(term86867, 1, term87262);
        setElement(term86867, 2, term87382);
        setField(term87022, term87022.getClass(), "iTypes", term86867);
        term88085 = newInstance(Class.forName("org.joda.time.Period"));
        Object term88086 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term88087 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        Object term88088 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term88089 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term88090 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term88091 = (int[]) newIntArray(3);
        setField(term88086, term88086.getClass(), "iName", null);
        setByteField(term88088, term88088.getClass(), "iOrdinal", (byte) 0);
        setField(term88088, term88088.getClass(), "iName", null);
        setElement(term88087, 0, term88088);
        setByteField(term88089, term88089.getClass(), "iOrdinal", (byte) 0);
        setField(term88089, term88089.getClass(), "iName", null);
        setElement(term88087, 1, term88089);
        setByteField(term88090, term88090.getClass(), "iOrdinal", (byte) 0);
        setField(term88090, term88090.getClass(), "iName", null);
        setElement(term88087, 2, term88090);
        setField(term88086, term88086.getClass(), "iTypes", term88087);
        setField(term88086, term88086.getClass(), "iIndices", null);
        setField(term88085, term88085.getClass(), "iType", term88086);
        setField(term88085, term88085.getClass(), "iValues", term88091);
        term88092 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term88093 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        Object term88094 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term88095 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term88096 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term88092, term88092.getClass(), "iName", null);
        setByteField(term88094, term88094.getClass(), "iOrdinal", (byte) 0);
        setField(term88094, term88094.getClass(), "iName", null);
        setElement(term88093, 0, term88094);
        setByteField(term88095, term88095.getClass(), "iOrdinal", (byte) 0);
        setField(term88095, term88095.getClass(), "iName", null);
        setElement(term88093, 1, term88095);
        setByteField(term88096, term88096.getClass(), "iOrdinal", (byte) 0);
        setField(term88096, term88096.getClass(), "iName", null);
        setElement(term88093, 2, term88096);
        setField(term88092, term88092.getClass(), "iTypes", term88093);
        setField(term88092, term88092.getClass(), "iIndices", null);
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
        args[8] = term87022;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term88085));
        assertTrue(recursiveEquals(term87022, 0));
    }

};


