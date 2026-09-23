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
import java.lang.Integer;

public class DateTimeFormatter_withPivotYear_387747408143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24580;
     Object term24628;
     Object term24662;
     Object term24663;
     Object term24654;

    public DateTimeFormatter_withPivotYear_387747408143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24580 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term24580, term24580.getClass(), "iPivotYear", null);
        term24628 = new Integer(0);
        term24662 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term24662, term24662.getClass(), "iPrinter", null);
        setField(term24662, term24662.getClass(), "iParser", null);
        setField(term24662, term24662.getClass(), "iLocale", null);
        setBooleanField(term24662, term24662.getClass(), "iOffsetParsed", false);
        setField(term24662, term24662.getClass(), "iChrono", null);
        setField(term24662, term24662.getClass(), "iZone", null);
        setField(term24662, term24662.getClass(), "iPivotYear", null);
        setIntField(term24662, term24662.getClass(), "iDefaultYear", 0);
        term24663 = new Integer(0);
        Integer term24656 = new Integer(0);
        term24654 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term24654, term24654.getClass(), "iPrinter", null);
        setField(term24654, term24654.getClass(), "iParser", null);
        setField(term24654, term24654.getClass(), "iLocale", null);
        setBooleanField(term24654, term24654.getClass(), "iOffsetParsed", false);
        setField(term24654, term24654.getClass(), "iChrono", null);
        setField(term24654, term24654.getClass(), "iZone", null);
        setField(term24654, term24654.getClass(), "iPivotYear", term24656);
        setIntField(term24654, term24654.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term24628;
        Object retValue = callMethod(klass, "withPivotYear", argTypes, term24580, args);
        assertTrue(recursiveEquals(term24580, term24662));
        assertTrue(recursiveEquals(term24628, term24663));
        assertTrue(recursiveEquals(retValue, term24654));
    }

};


