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

public class LocalDate_withLocalMillis_1763086540323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160955;

    public LocalDate_withLocalMillis_1763086540323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160955 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term161029 = newInstance(Class.forName("org.joda.time.chrono.ISOChronology"));
        Object term161133 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        setField(term161029, term161029.getClass(), "iDayOfMonth", term161133);
        setField(term160955, term160955.getClass(), "iChronology", term161029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        try {
            callMethod(klass, "withLocalMillis", argTypes, term160955, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


