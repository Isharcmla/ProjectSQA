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

public class BasicMonthOfYearDateTimeField_getLeapAmount_9754557829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;
     Object term86;

    public BasicMonthOfYearDateTimeField_getLeapAmount_9754557829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term82, term82.getClass(), "iChronology", null);
        setIntField(term82, term82.getClass(), "iMax", -1179120542);
        setIntField(term82, term82.getClass(), "iLeapMonth", -73683645);
        setLongField(term82, term82.getClass(), "iUnitMillis", -4920224193275732920L);
        setField(term82, term82.getClass(), "iDurationField", null);
        setField(term82, term82.getClass(), "iType", null);
        term86 = new Long(8428634514691209827L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term86;
        try {
            callMethod(klass, "getLeapAmount", argTypes, term82, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


