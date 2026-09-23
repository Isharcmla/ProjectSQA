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
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.chrono.EqualityUtils.*;

public class BasicMonthOfYearDateTimeField_add_190530406845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4488;
     Object term5695;

    public BasicMonthOfYearDateTimeField_add_190530406845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4488 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term5695 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term5695, term5695.getClass(), "iChronology", null);
        setIntField(term5695, term5695.getClass(), "iMax", 0);
        setIntField(term5695, term5695.getClass(), "iLeapMonth", 0);
        setLongField(term5695, term5695.getClass(), "iUnitMillis", 0L);
        setField(term5695, term5695.getClass(), "iDurationField", null);
        setField(term5695, term5695.getClass(), "iType", null);
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
        args[1] = 0;
        args[2] = null;
        args[3] = 0;
        Object retValue = callMethod(klass, "add", argTypes, term4488, args);
        assertTrue(recursiveEquals(term4488, term5695));
        assertTrue(recursiveEquals(retValue, null));
    }

};


