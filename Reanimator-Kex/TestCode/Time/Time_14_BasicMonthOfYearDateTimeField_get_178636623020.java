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

public class BasicMonthOfYearDateTimeField_get_178636623020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term11;

    public BasicMonthOfYearDateTimeField_get_178636623020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term7, term7.getClass(), "iChronology", null);
        setIntField(term7, term7.getClass(), "iMax", 391863371);
        setIntField(term7, term7.getClass(), "iLeapMonth", -1922583790);
        setLongField(term7, term7.getClass(), "iUnitMillis", 6375119433582206027L);
        setField(term7, term7.getClass(), "iDurationField", null);
        setField(term7, term7.getClass(), "iType", null);
        term11 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term11;
        try {
            callMethod(klass, "get", argTypes, term7, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


