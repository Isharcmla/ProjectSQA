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
import java.lang.UnsupportedOperationException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GJChronology_gregorianToJulianByWeekyear_79910764071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20154;

    public GJChronology_gregorianToJulianByWeekyear_79910764071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20154 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term20240 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object term20334 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term20414 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        setField(term20240, term20240.getClass(), "iWeekyear", term20334);
        setField(term20154, term20154.getClass(), "iGregorianChronology", term20240);
        setField(term20414, term20414.getClass(), "iWeekyear", term20334);
        setField(term20154, term20154.getClass(), "iJulianChronology", term20414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        try {
            callMethod(klass, "gregorianToJulianByWeekyear", argTypes, term20154, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


