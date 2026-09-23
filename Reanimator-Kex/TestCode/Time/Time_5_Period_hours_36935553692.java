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

public class Period_hours_36935553692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103;
     Object term10136;

    public Period_hours_36935553692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103 = new Integer(-226514366);
        term10136 = newInstance(Class.forName("org.joda.time.Period"));
        Object term10137 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term10148 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        Object term10149 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10152 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10155 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10158 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10161 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10164 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10167 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term10170 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term10173 = (int[]) newIntArray(8);
        int[] term10182 = (int[]) newIntArray(8);
        setField(term10137, term10137.getClass(), "iName", "Standard");
        setByteField(term10149, term10149.getClass(), "iOrdinal", (byte) 4);
        setField(term10149, term10149.getClass(), "iName", "");
        setElement(term10148, 0, term10149);
        setByteField(term10152, term10152.getClass(), "iOrdinal", (byte) 5);
        setField(term10152, term10152.getClass(), "iName", "");
        setElement(term10148, 1, term10152);
        setByteField(term10155, term10155.getClass(), "iOrdinal", (byte) 6);
        setField(term10155, term10155.getClass(), "iName", "");
        setElement(term10148, 2, term10155);
        setByteField(term10158, term10158.getClass(), "iOrdinal", (byte) 7);
        setField(term10158, term10158.getClass(), "iName", "");
        setElement(term10148, 3, term10158);
        setByteField(term10161, term10161.getClass(), "iOrdinal", (byte) 9);
        setField(term10161, term10161.getClass(), "iName", "");
        setElement(term10148, 4, term10161);
        setByteField(term10164, term10164.getClass(), "iOrdinal", (byte) 10);
        setField(term10164, term10164.getClass(), "iName", "");
        setElement(term10148, 5, term10164);
        setByteField(term10167, term10167.getClass(), "iOrdinal", (byte) 11);
        setField(term10167, term10167.getClass(), "iName", "");
        setElement(term10148, 6, term10167);
        setByteField(term10170, term10170.getClass(), "iOrdinal", (byte) 12);
        setField(term10170, term10170.getClass(), "iName", "");
        setElement(term10148, 7, term10170);
        setField(term10137, term10137.getClass(), "iTypes", term10148);
        setIntElement(term10173, 1, 1);
        setIntElement(term10173, 2, 2);
        setIntElement(term10173, 3, 3);
        setIntElement(term10173, 4, 4);
        setIntElement(term10173, 5, 5);
        setIntElement(term10173, 6, 6);
        setIntElement(term10173, 7, 7);
        setField(term10137, term10137.getClass(), "iIndices", term10173);
        setField(term10136, term10136.getClass(), "iType", term10137);
        setIntElement(term10182, 4, -226514366);
        setField(term10136, term10136.getClass(), "iValues", term10182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term103;
        Object retValue = callMethod(klass, "hours", argTypes, null, args);
        assertTrue(recursiveEquals(term103, -226514366));
        assertTrue(recursiveEquals(retValue, term10136));
    }

};


