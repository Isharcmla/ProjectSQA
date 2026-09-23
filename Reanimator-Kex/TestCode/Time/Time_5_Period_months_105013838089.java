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

public class Period_months_105013838089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;
     Object term9437;

    public Period_months_105013838089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97 = new Integer(-203030934);
        term9437 = newInstance(Class.forName("org.joda.time.Period"));
        Object term9438 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term9449 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        Object term9450 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9453 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9456 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9459 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9462 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9465 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9468 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9471 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term9474 = (int[]) newIntArray(8);
        int[] term9483 = (int[]) newIntArray(8);
        setField(term9438, term9438.getClass(), "iName", "Standard");
        setByteField(term9450, term9450.getClass(), "iOrdinal", (byte) 4);
        setField(term9450, term9450.getClass(), "iName", "");
        setElement(term9449, 0, term9450);
        setByteField(term9453, term9453.getClass(), "iOrdinal", (byte) 5);
        setField(term9453, term9453.getClass(), "iName", "");
        setElement(term9449, 1, term9453);
        setByteField(term9456, term9456.getClass(), "iOrdinal", (byte) 6);
        setField(term9456, term9456.getClass(), "iName", "");
        setElement(term9449, 2, term9456);
        setByteField(term9459, term9459.getClass(), "iOrdinal", (byte) 7);
        setField(term9459, term9459.getClass(), "iName", "");
        setElement(term9449, 3, term9459);
        setByteField(term9462, term9462.getClass(), "iOrdinal", (byte) 9);
        setField(term9462, term9462.getClass(), "iName", "");
        setElement(term9449, 4, term9462);
        setByteField(term9465, term9465.getClass(), "iOrdinal", (byte) 10);
        setField(term9465, term9465.getClass(), "iName", "");
        setElement(term9449, 5, term9465);
        setByteField(term9468, term9468.getClass(), "iOrdinal", (byte) 11);
        setField(term9468, term9468.getClass(), "iName", "");
        setElement(term9449, 6, term9468);
        setByteField(term9471, term9471.getClass(), "iOrdinal", (byte) 12);
        setField(term9471, term9471.getClass(), "iName", "");
        setElement(term9449, 7, term9471);
        setField(term9438, term9438.getClass(), "iTypes", term9449);
        setIntElement(term9474, 1, 1);
        setIntElement(term9474, 2, 2);
        setIntElement(term9474, 3, 3);
        setIntElement(term9474, 4, 4);
        setIntElement(term9474, 5, 5);
        setIntElement(term9474, 6, 6);
        setIntElement(term9474, 7, 7);
        setField(term9438, term9438.getClass(), "iIndices", term9474);
        setField(term9437, term9437.getClass(), "iType", term9438);
        setIntElement(term9483, 1, -203030934);
        setField(term9437, term9437.getClass(), "iValues", term9483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term97;
        Object retValue = callMethod(klass, "months", argTypes, null, args);
        assertTrue(recursiveEquals(term97, -203030934));
        assertTrue(recursiveEquals(retValue, term9437));
    }

};


