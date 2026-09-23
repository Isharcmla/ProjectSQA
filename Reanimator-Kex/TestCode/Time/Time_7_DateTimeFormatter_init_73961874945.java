package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;

public class DateTimeFormatter_init_73961874945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1501;

    public DateTimeFormatter_init_73961874945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1501 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term1501, term1501.getClass(), "iPrinter", null);
        setField(term1501, term1501.getClass(), "iParser", null);
        setField(term1501, term1501.getClass(), "iLocale", null);
        setBooleanField(term1501, term1501.getClass(), "iOffsetParsed", false);
        setField(term1501, term1501.getClass(), "iChrono", null);
        setField(term1501, term1501.getClass(), "iZone", null);
        setField(term1501, term1501.getClass(), "iPivotYear", null);
        setIntField(term1501, term1501.getClass(), "iDefaultYear", 2000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Class.forName("org.joda.time.format.DateTimeParser");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1501));
    }

};


