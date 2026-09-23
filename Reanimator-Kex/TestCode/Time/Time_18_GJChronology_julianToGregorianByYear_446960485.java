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
import java.lang.ArithmeticException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GJChronology_julianToGregorianByYear_446960485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26754;

    public GJChronology_julianToGregorianByYear_446960485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26754 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term26834 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object term26920 = newInstance(Class.forName("org.joda.time.field.PreciseDateTimeField"));
        setField(term26834, term26834.getClass(), "iYear", term26920);
        setField(term26754, term26754.getClass(), "iJulianChronology", term26834);
        setField(term26754, term26754.getClass(), "iGregorianChronology", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        try {
            callMethod(klass, "julianToGregorianByYear", argTypes, term26754, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


