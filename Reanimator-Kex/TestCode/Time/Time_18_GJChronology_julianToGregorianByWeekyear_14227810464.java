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

public class GJChronology_julianToGregorianByWeekyear_14227810464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16899;

    public GJChronology_julianToGregorianByWeekyear_14227810464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16899 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term16979 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object term17075 = newInstance(Class.forName("org.joda.time.chrono.GJYearOfEraDateTimeField"));
        Object term17161 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term16979, term16979.getClass(), "iWeekyear", term17075);
        setField(term16899, term16899.getClass(), "iJulianChronology", term16979);
        setField(term17161, term17161.getClass(), "iWeekyear", term17075);
        setField(term16899, term16899.getClass(), "iGregorianChronology", term17161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        try {
            callMethod(klass, "julianToGregorianByWeekyear", argTypes, term16899, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


