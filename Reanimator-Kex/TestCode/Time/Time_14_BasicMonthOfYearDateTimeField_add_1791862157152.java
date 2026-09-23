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

public class BasicMonthOfYearDateTimeField_add_1791862157152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32435;
     Object term32916;

    public BasicMonthOfYearDateTimeField_add_1791862157152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32435 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        term32916 = newInstance(Class.forName("org.joda.time.chrono.GJMonthOfYearDateTimeField"));
        setField(term32916, term32916.getClass(), "iChronology", null);
        setIntField(term32916, term32916.getClass(), "iMax", 0);
        setIntField(term32916, term32916.getClass(), "iLeapMonth", 0);
        setLongField(term32916, term32916.getClass(), "iUnitMillis", 0L);
        setField(term32916, term32916.getClass(), "iDurationField", null);
        setField(term32916, term32916.getClass(), "iType", null);
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
        Object retValue = callMethod(klass, "add", argTypes, term32435, args);
        assertTrue(recursiveEquals(term32435, term32916));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


