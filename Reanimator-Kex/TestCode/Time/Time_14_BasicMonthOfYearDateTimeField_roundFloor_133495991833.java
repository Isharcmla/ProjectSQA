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
import java.lang.NullPointerException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class BasicMonthOfYearDateTimeField_roundFloor_133495991833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100;
     Object term104;

    public BasicMonthOfYearDateTimeField_roundFloor_133495991833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term100, term100.getClass(), "iChronology", null);
        setIntField(term100, term100.getClass(), "iMax", 679763016);
        setIntField(term100, term100.getClass(), "iLeapMonth", 1962444399);
        setLongField(term100, term100.getClass(), "iUnitMillis", 2486810210675247493L);
        setField(term100, term100.getClass(), "iDurationField", null);
        setField(term100, term100.getClass(), "iType", null);
        term104 = new Long(7009926388951271268L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term104;
        try {
            callMethod(klass, "roundFloor", argTypes, term100, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


