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

public class BasicMonthOfYearDateTimeField_getLeapDurationField_183101145630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88;

    public BasicMonthOfYearDateTimeField_getLeapDurationField_183101145630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term88, term88.getClass(), "iChronology", null);
        setIntField(term88, term88.getClass(), "iMax", -226514366);
        setIntField(term88, term88.getClass(), "iLeapMonth", 1193880199);
        setLongField(term88, term88.getClass(), "iUnitMillis", -2585684163342970173L);
        setField(term88, term88.getClass(), "iDurationField", null);
        setField(term88, term88.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getLeapDurationField", argTypes, term88, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


