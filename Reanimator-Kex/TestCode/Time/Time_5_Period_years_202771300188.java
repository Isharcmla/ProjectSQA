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

public class Period_years_202771300188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;
     Object term9201;

    public Period_years_202771300188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95 = new Integer(-244121226);
        term9201 = newInstance(Class.forName("org.joda.time.Period"));
        Object term9202 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term9213 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        Object term9214 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9217 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9220 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9223 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9226 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9229 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9232 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9235 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term9238 = (int[]) newIntArray(8);
        int[] term9247 = (int[]) newIntArray(9);
        setField(term9202, term9202.getClass(), "iName", "Standard");
        setByteField(term9214, term9214.getClass(), "iOrdinal", (byte) 4);
        setField(term9214, term9214.getClass(), "iName", "");
        setElement(term9213, 0, term9214);
        setByteField(term9217, term9217.getClass(), "iOrdinal", (byte) 5);
        setField(term9217, term9217.getClass(), "iName", "");
        setElement(term9213, 1, term9217);
        setByteField(term9220, term9220.getClass(), "iOrdinal", (byte) 6);
        setField(term9220, term9220.getClass(), "iName", "");
        setElement(term9213, 2, term9220);
        setByteField(term9223, term9223.getClass(), "iOrdinal", (byte) 7);
        setField(term9223, term9223.getClass(), "iName", "");
        setElement(term9213, 3, term9223);
        setByteField(term9226, term9226.getClass(), "iOrdinal", (byte) 9);
        setField(term9226, term9226.getClass(), "iName", "");
        setElement(term9213, 4, term9226);
        setByteField(term9229, term9229.getClass(), "iOrdinal", (byte) 10);
        setField(term9229, term9229.getClass(), "iName", "");
        setElement(term9213, 5, term9229);
        setByteField(term9232, term9232.getClass(), "iOrdinal", (byte) 11);
        setField(term9232, term9232.getClass(), "iName", "");
        setElement(term9213, 6, term9232);
        setByteField(term9235, term9235.getClass(), "iOrdinal", (byte) 12);
        setField(term9235, term9235.getClass(), "iName", "");
        setElement(term9213, 7, term9235);
        setField(term9202, term9202.getClass(), "iTypes", term9213);
        setIntElement(term9238, 1, 1);
        setIntElement(term9238, 2, 2);
        setIntElement(term9238, 3, 3);
        setIntElement(term9238, 4, 4);
        setIntElement(term9238, 5, 5);
        setIntElement(term9238, 6, 6);
        setIntElement(term9238, 7, 7);
        setField(term9202, term9202.getClass(), "iIndices", term9238);
        setField(term9201, term9201.getClass(), "iType", term9202);
        setIntElement(term9247, 0, -244121226);
        setField(term9201, term9201.getClass(), "iValues", term9247);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term95;
        Object retValue = callMethod(klass, "years", argTypes, null, args);
        assertTrue(recursiveEquals(term95, -244121226));
        assertTrue(recursiveEquals(retValue, term9201));
    }

};


