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

public class Period_withField_1080885235133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1142;
     Object term1170;

    public Period_withField_1080885235133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1142 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1143 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1156 = (Object[]) newArray("org.joda.time.DurationFieldType", 6);
        int[] term1157 = (int[]) newIntArray(5);
        int[] term1163 = (int[]) newIntArray(6);
        setField(term1143, term1143.getClass(), "iName", "MjGYSRKTNF");
        setField(term1143, term1143.getClass(), "iTypes", term1156);
        setIntElement(term1157, 0, -2068769794);
        setIntElement(term1157, 1, -117576464);
        setIntElement(term1157, 2, -1007160944);
        setIntElement(term1157, 3, 1135664017);
        setIntElement(term1157, 4, 590364439);
        setField(term1143, term1143.getClass(), "iIndices", term1157);
        setField(term1142, term1142.getClass(), "iType", term1143);
        setField(term1142, term1142.getClass(), "iValues", term1163);
        term1170 = new Integer(-663691365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DurationFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1170;
        try {
            callMethod(klass, "withField", argTypes, term1142, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


