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

public class BasicMonthOfYearDateTimeField_remainder_80149148134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106;
     Object term110;

    public BasicMonthOfYearDateTimeField_remainder_80149148134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term106, term106.getClass(), "iChronology", null);
        setIntField(term106, term106.getClass(), "iMax", 767834723);
        setIntField(term106, term106.getClass(), "iLeapMonth", -602026508);
        setLongField(term106, term106.getClass(), "iUnitMillis", -7672528020740371001L);
        setField(term106, term106.getClass(), "iDurationField", null);
        setField(term106, term106.getClass(), "iType", null);
        term110 = new Long(-4502405999831680926L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term110;
        try {
            callMethod(klass, "remainder", argTypes, term106, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


