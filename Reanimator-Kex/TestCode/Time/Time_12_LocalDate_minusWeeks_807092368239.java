package org.joda.time;

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
import java.lang.ArithmeticException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LocalDate_minusWeeks_807092368239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128024;

    public LocalDate_minusWeeks_807092368239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128024 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term128098 = newInstance(Class.forName("org.joda.time.chrono.ISOChronology"));
        Object term128184 = newInstance(Class.forName("org.joda.time.field.PreciseDurationField"));
        Object term128288 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        setLongField(term128184, term128184.getClass(), "iUnitMillis", 1997799167L);
        setField(term128098, term128098.getClass(), "iWeeks", term128184);
        setField(term128098, term128098.getClass(), "iDayOfMonth", term128288);
        setField(term128024, term128024.getClass(), "iChronology", term128098);
        setLongField(term128024, term128024.getClass(), "iLocalMillis", 4250369279L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1130659843;
        try {
            callMethod(klass, "minusWeeks", argTypes, term128024, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


