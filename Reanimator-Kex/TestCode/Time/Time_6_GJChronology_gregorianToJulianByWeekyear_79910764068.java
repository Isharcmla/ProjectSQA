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

public class GJChronology_gregorianToJulianByWeekyear_79910764068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26954;

    public GJChronology_gregorianToJulianByWeekyear_79910764068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26954 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term27040 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        Object term27132 = newInstance(Class.forName("org.joda.time.chrono.BasicYearDateTimeField"));
        Object term27212 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        setField(term27040, term27040.getClass(), "iWeekyear", term27132);
        setField(term26954, term26954.getClass(), "iGregorianChronology", term27040);
        setField(term27212, term27212.getClass(), "iWeekyear", term27132);
        setField(term26954, term26954.getClass(), "iJulianChronology", term27212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        try {
            callMethod(klass, "gregorianToJulianByWeekyear", argTypes, term26954, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


