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

public class BasicMonthOfYearDateTimeField_add_179186215770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12157;
     Object term12277;

    public BasicMonthOfYearDateTimeField_add_179186215770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12157 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        term12277 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term12277, term12277.getClass(), "iChronology", null);
        setIntField(term12277, term12277.getClass(), "iMax", 0);
        setIntField(term12277, term12277.getClass(), "iLeapMonth", 0);
        setLongField(term12277, term12277.getClass(), "iUnitMillis", 0L);
        setField(term12277, term12277.getClass(), "iDurationField", null);
        setField(term12277, term12277.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = 0L;
        args[1] = 0L;
        Object retValue = callMethod(klass, "add", argTypes, term12157, args);
        assertTrue(recursiveEquals(term12157, term12277));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


