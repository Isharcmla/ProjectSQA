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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Period_normalizedStandard_1980587539170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3031;

    public Period_normalizedStandard_1980587539170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3031 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3032 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3045 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term3046 = (int[]) newIntArray(5);
        int[] term3052 = (int[]) newIntArray(6);
        setField(term3032, term3032.getClass(), "iName", "MjGYSRKTNF");
        setField(term3032, term3032.getClass(), "iTypes", term3045);
        setIntElement(term3046, 0, -2068769794);
        setIntElement(term3046, 1, -117576464);
        setIntElement(term3046, 2, -1007160944);
        setIntElement(term3046, 3, 1135664017);
        setIntElement(term3046, 4, 590364439);
        setField(term3032, term3032.getClass(), "iIndices", term3046);
        setField(term3031, term3031.getClass(), "iType", term3032);
        setField(term3031, term3031.getClass(), "iValues", term3052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "normalizedStandard", argTypes, term3031, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


