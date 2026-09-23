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
import java.lang.Object;

public class GJChronology_julianToGregorianByWeekyear_142278104135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39529;

    public GJChronology_julianToGregorianByWeekyear_142278104135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39529 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term39609 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object term39705 = newInstance(Class.forName("org.joda.time.chrono.GJYearOfEraDateTimeField"));
        Object term39791 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term39609, term39609.getClass(), "iWeekyear", term39705);
        setField(term39529, term39529.getClass(), "iJulianChronology", term39609);
        setField(term39791, term39791.getClass(), "iWeekyear", term39705);
        setField(term39529, term39529.getClass(), "iGregorianChronology", term39791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        try {
            callMethod(klass, "julianToGregorianByWeekyear", argTypes, term39529, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


