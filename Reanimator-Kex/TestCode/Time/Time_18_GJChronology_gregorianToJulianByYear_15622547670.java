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

public class GJChronology_gregorianToJulianByYear_15622547670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18278;

    public GJChronology_gregorianToJulianByYear_15622547670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18278 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term18364 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object term18480 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        setField(term18364, term18364.getClass(), "iYear", term18480);
        setField(term18278, term18278.getClass(), "iGregorianChronology", term18364);
        setField(term18278, term18278.getClass(), "iJulianChronology", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        try {
            callMethod(klass, "gregorianToJulianByYear", argTypes, term18278, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


