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
import java.lang.NullPointerException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LocalDate_plusWeeks_1292937466332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165948;

    public LocalDate_plusWeeks_1292937466332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165948 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term166022 = newInstance(Class.forName("org.joda.time.chrono.ISOChronology"));
        Object term166108 = newInstance(Class.forName("org.joda.time.field.PreciseDurationField"));
        Object term166212 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        setLongField(term166108, term166108.getClass(), "iUnitMillis", 2386158946869869204L);
        setField(term166022, term166022.getClass(), "iWeeks", term166108);
        setLongField(term166212, term166212.getClass(), "iUnitMillis", -9640568L);
        setField(term166022, term166022.getClass(), "iDayOfMonth", term166212);
        setField(term165948, term165948.getClass(), "iChronology", term166022);
        setLongField(term165948, term165948.getClass(), "iLocalMillis", -9223372036847717336L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1770824898;
        try {
            callMethod(klass, "plusWeeks", argTypes, term165948, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


