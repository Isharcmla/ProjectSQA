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

public class BasicMonthOfYearDateTimeField_getRangeDurationField_77737311127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;

    public BasicMonthOfYearDateTimeField_getRangeDurationField_77737311127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = newInstance(Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField"));
        setField(term72, term72.getClass(), "iChronology", null);
        setIntField(term72, term72.getClass(), "iMax", 865208305);
        setIntField(term72, term72.getClass(), "iLeapMonth", -1275173084);
        setLongField(term72, term72.getClass(), "iUnitMillis", -316468845751588286L);
        setField(term72, term72.getClass(), "iDurationField", null);
        setField(term72, term72.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.BasicMonthOfYearDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRangeDurationField", argTypes, term72, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


