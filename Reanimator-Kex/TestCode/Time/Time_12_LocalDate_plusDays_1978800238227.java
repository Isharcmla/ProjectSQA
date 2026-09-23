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

public class LocalDate_plusDays_1978800238227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125771;

    public LocalDate_plusDays_1978800238227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125771 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term125845 = newInstance(Class.forName("org.joda.time.chrono.ISOChronology"));
        Object term125931 = newInstance(Class.forName("org.joda.time.field.PreciseDurationField"));
        Object term126035 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        setLongField(term125931, term125931.getClass(), "iUnitMillis", 592425919L);
        setField(term125845, term125845.getClass(), "iDays", term125931);
        setField(term125845, term125845.getClass(), "iDayOfMonth", term126035);
        setField(term125771, term125771.getClass(), "iChronology", term125845);
        setLongField(term125771, term125771.getClass(), "iLocalMillis", 4294967295L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1489093569;
        try {
            callMethod(klass, "plusDays", argTypes, term125771, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


