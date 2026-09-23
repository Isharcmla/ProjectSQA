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
import java.lang.reflect.InaccessibleObjectException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Period_withPeriodType_408142087131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1011;
     Object term1039;

    public Period_withPeriodType_408142087131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1011 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1012 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1025 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1026 = (int[]) newIntArray(5);
        int[] term1032 = (int[]) newIntArray(6);
        setField(term1012, term1012.getClass(), "iName", "MjGYSRKTNF");
        setField(term1012, term1012.getClass(), "iTypes", term1025);
        setIntElement(term1026, 0, -2068769794);
        setIntElement(term1026, 1, -117576464);
        setIntElement(term1026, 2, -1007160944);
        setIntElement(term1026, 3, 1135664017);
        setIntElement(term1026, 4, 590364439);
        setField(term1012, term1012.getClass(), "iIndices", term1026);
        setField(term1011, term1011.getClass(), "iType", term1012);
        setField(term1011, term1011.getClass(), "iValues", term1032);
        term1039 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1052 = (Object[]) newArray("org.joda.time.DurationFieldType", 9);
        int[] term1053 = (int[]) newIntArray(4);
        setField(term1039, term1039.getClass(), "iName", "RkybSrpybU");
        setField(term1039, term1039.getClass(), "iTypes", term1052);
        setIntElement(term1053, 0, 683666002);
        setIntElement(term1053, 1, 1596213415);
        setIntElement(term1053, 2, -268815336);
        setIntElement(term1053, 3, -1210583429);
        setField(term1039, term1039.getClass(), "iIndices", term1053);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[1];
        args[0] = term1039;
        try {
            callMethod(klass, "withPeriodType", argTypes, term1011, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


