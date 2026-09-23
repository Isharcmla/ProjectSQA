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

public class GJChronology_julianToGregorianByYear_4469604140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40501;

    public GJChronology_julianToGregorianByYear_4469604140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40501 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term40581 = newInstance(Class.forName("org.joda.time.chrono.JulianChronology"));
        Object term40697 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        setField(term40581, term40581.getClass(), "iYear", term40697);
        setField(term40501, term40501.getClass(), "iJulianChronology", term40581);
        setField(term40501, term40501.getClass(), "iGregorianChronology", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        try {
            callMethod(klass, "julianToGregorianByYear", argTypes, term40501, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


