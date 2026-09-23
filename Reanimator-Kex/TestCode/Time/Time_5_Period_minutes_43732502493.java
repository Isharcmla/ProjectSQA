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
import java.lang.Integer;
import java.lang.Object;

public class Period_minutes_43732502493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105;
     Object term10369;

    public Period_minutes_43732502493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105 = new Integer(1193880199);
        term10369 = newInstance(Class.forName("org.joda.time.Period"));
        Object term10370 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term10381 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        Object term10382 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10385 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10388 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10391 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10394 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10397 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10400 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10403 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term10406 = (int[]) newIntArray(8);
        int[] term10415 = (int[]) newIntArray(8);
        setField(term10370, term10370.getClass(), "iName", "Standard");
        setByteField(term10382, term10382.getClass(), "iOrdinal", (byte) 4);
        setField(term10382, term10382.getClass(), "iName", "");
        setElement(term10381, 0, term10382);
        setByteField(term10385, term10385.getClass(), "iOrdinal", (byte) 5);
        setField(term10385, term10385.getClass(), "iName", "");
        setElement(term10381, 1, term10385);
        setByteField(term10388, term10388.getClass(), "iOrdinal", (byte) 6);
        setField(term10388, term10388.getClass(), "iName", "");
        setElement(term10381, 2, term10388);
        setByteField(term10391, term10391.getClass(), "iOrdinal", (byte) 7);
        setField(term10391, term10391.getClass(), "iName", "");
        setElement(term10381, 3, term10391);
        setByteField(term10394, term10394.getClass(), "iOrdinal", (byte) 9);
        setField(term10394, term10394.getClass(), "iName", "");
        setElement(term10381, 4, term10394);
        setByteField(term10397, term10397.getClass(), "iOrdinal", (byte) 10);
        setField(term10397, term10397.getClass(), "iName", "");
        setElement(term10381, 5, term10397);
        setByteField(term10400, term10400.getClass(), "iOrdinal", (byte) 11);
        setField(term10400, term10400.getClass(), "iName", "");
        setElement(term10381, 6, term10400);
        setByteField(term10403, term10403.getClass(), "iOrdinal", (byte) 12);
        setField(term10403, term10403.getClass(), "iName", "");
        setElement(term10381, 7, term10403);
        setField(term10370, term10370.getClass(), "iTypes", term10381);
        setIntElement(term10406, 1, 1);
        setIntElement(term10406, 2, 2);
        setIntElement(term10406, 3, 3);
        setIntElement(term10406, 4, 4);
        setIntElement(term10406, 5, 5);
        setIntElement(term10406, 6, 6);
        setIntElement(term10406, 7, 7);
        setField(term10370, term10370.getClass(), "iIndices", term10406);
        setField(term10369, term10369.getClass(), "iType", term10370);
        setIntElement(term10415, 5, 1193880199);
        setField(term10369, term10369.getClass(), "iValues", term10415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term105;
        Object retValue = callMethod(klass, "minutes", argTypes, null, args);
        assertTrue(recursiveEquals(term105, 1193880199));
        assertTrue(recursiveEquals(retValue, term10369));
    }

};


