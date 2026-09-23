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
import java.lang.IllegalArgumentException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Period_withFieldAdded_102666155134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1193;
     Object term1221;

    public Period_withFieldAdded_102666155134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1193 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1194 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1207 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1208 = (int[]) newIntArray(5);
        int[] term1214 = (int[]) newIntArray(6);
        setField(term1194, term1194.getClass(), "iName", "MjGYSRKTNF");
        setField(term1194, term1194.getClass(), "iTypes", term1207);
        setIntElement(term1208, 0, -2068769794);
        setIntElement(term1208, 1, -117576464);
        setIntElement(term1208, 2, -1007160944);
        setIntElement(term1208, 3, 1135664017);
        setIntElement(term1208, 4, 590364439);
        setField(term1194, term1194.getClass(), "iIndices", term1208);
        setField(term1193, term1193.getClass(), "iType", term1194);
        setField(term1193, term1193.getClass(), "iValues", term1214);
        term1221 = new Integer(339854490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DurationFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1221;
        try {
            callMethod(klass, "withFieldAdded", argTypes, term1193, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


