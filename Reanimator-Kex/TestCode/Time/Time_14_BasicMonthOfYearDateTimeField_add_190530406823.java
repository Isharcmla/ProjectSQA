package org.joda.time.chrono;

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
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BasicMonthOfYearDateTimeField_add_190530406823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;
     Object term33;
     Object term35;
     Object term41;

    public BasicMonthOfYearDateTimeField_add_190530406823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term29, term29.getClass(), "iChronology", null);
        setIntField(term29, term29.getClass(), "iMax", 1725571209);
        setIntField(term29, term29.getClass(), "iLeapMonth", -522618178);
        setLongField(term29, term29.getClass(), "iUnitMillis", -7237588299778557629L);
        setField(term29, term29.getClass(), "iDurationField", null);
        setField(term29, term29.getClass(), "iType", null);
        term33 = new Integer(1134449235);
        term35 = (int[]) newIntArray(5);
        setIntElement(term35, 0, -883034806);
        setIntElement(term35, 1, 1585847225);
        setIntElement(term35, 2, 597278769);
        setIntElement(term35, 3, -1685132342);
        setIntElement(term35, 4, -1456670397);
        term41 = new Integer(1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term33;
        args[2] = term35;
        args[3] = term41;
        try {
            callMethod(klass, "add", argTypes, term29, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


