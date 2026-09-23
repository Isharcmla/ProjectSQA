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

public class Period_init_167289003189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90109;
     Object term91751;
     Object term91756;

    public Period_init_167289003189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term90055 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term90055, term90055.getClass(), "iType", null);
        term90109 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term89969 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        Object term90229 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setElement(term89969, 1, term90229);
        setField(term90109, term90109.getClass(), "iTypes", term89969);
        term91751 = newInstance(Class.forName("org.joda.time.Period"));
        Object term91752 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term91753 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        Object term91754 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term91755 = (int[]) newIntArray(2);
        setField(term91752, term91752.getClass(), "iName", null);
        setByteField(term91754, term91754.getClass(), "iOrdinal", (byte) 0);
        setField(term91754, term91754.getClass(), "iName", null);
        setElement(term91753, 1, term91754);
        setField(term91752, term91752.getClass(), "iTypes", term91753);
        setField(term91752, term91752.getClass(), "iIndices", null);
        setField(term91751, term91751.getClass(), "iType", term91752);
        setField(term91751, term91751.getClass(), "iValues", term91755);
        term91756 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term91757 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        Object term91758 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term91756, term91756.getClass(), "iName", null);
        setByteField(term91758, term91758.getClass(), "iOrdinal", (byte) 0);
        setField(term91758, term91758.getClass(), "iName", null);
        setElement(term91757, 1, term91758);
        setField(term91756, term91756.getClass(), "iTypes", term91757);
        setField(term91756, term91756.getClass(), "iIndices", null);
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
        args[8] = term90109;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term91751));
        assertTrue(recursiveEquals(term90109, 0));
    }

};


