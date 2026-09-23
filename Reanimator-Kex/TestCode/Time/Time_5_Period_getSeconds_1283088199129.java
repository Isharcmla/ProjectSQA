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

public class Period_getSeconds_1283088199129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term913;

    public Period_getSeconds_1283088199129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term913 = newInstance(Class.forName("org.joda.time.Period"));
        Object term914 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term927 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term928 = (int[]) newIntArray(5);
        int[] term934 = (int[]) newIntArray(6);
        setField(term914, term914.getClass(), "iName", "MjGYSRKTNF");
        setField(term914, term914.getClass(), "iTypes", term927);
        setIntElement(term928, 0, -2068769794);
        setIntElement(term928, 1, -117576464);
        setIntElement(term928, 2, -1007160944);
        setIntElement(term928, 3, 1135664017);
        setIntElement(term928, 4, 590364439);
        setField(term914, term914.getClass(), "iIndices", term928);
        setField(term913, term913.getClass(), "iType", term914);
        setField(term913, term913.getClass(), "iValues", term934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSeconds", argTypes, term913, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


