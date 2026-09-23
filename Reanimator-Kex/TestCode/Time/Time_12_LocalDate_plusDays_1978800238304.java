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

public class LocalDate_plusDays_1978800238304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150112;

    public LocalDate_plusDays_1978800238304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150112 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term150186 = newInstance(Class.forName("org.joda.time.chrono.ISOChronology"));
        Object term150272 = newInstance(Class.forName("org.joda.time.field.PreciseDurationField"));
        Object term150376 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        setLongField(term150272, term150272.getClass(), "iUnitMillis", 1150888568963259398L);
        setField(term150186, term150186.getClass(), "iDays", term150272);
        setLongField(term150376, term150376.getClass(), "iUnitMillis", -2249293936998906L);
        setField(term150186, term150186.getClass(), "iDayOfMonth", term150376);
        setField(term150112, term150112.getClass(), "iChronology", term150186);
        setLongField(term150112, term150112.getClass(), "iLocalMillis", 8360625563824933602L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 982667865;
        try {
            callMethod(klass, "plusDays", argTypes, term150112, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


