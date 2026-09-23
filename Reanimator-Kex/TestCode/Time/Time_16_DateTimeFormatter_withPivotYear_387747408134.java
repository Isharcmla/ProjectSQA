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

public class DateTimeFormatter_withPivotYear_387747408134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23537;
     Object term23609;
     Object term23753;
     Object term23755;
     Object term23746;

    public DateTimeFormatter_withPivotYear_387747408134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23609 = new Integer(0);
        term23537 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term23537, term23537.getClass(), "iPivotYear", term23609);
        Integer term23754 = new Integer(0);
        term23753 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term23753, term23753.getClass(), "iPrinter", null);
        setField(term23753, term23753.getClass(), "iParser", null);
        setField(term23753, term23753.getClass(), "iLocale", null);
        setBooleanField(term23753, term23753.getClass(), "iOffsetParsed", false);
        setField(term23753, term23753.getClass(), "iChrono", null);
        setField(term23753, term23753.getClass(), "iZone", null);
        setField(term23753, term23753.getClass(), "iPivotYear", term23754);
        setIntField(term23753, term23753.getClass(), "iDefaultYear", 0);
        term23755 = new Integer(0);
        Integer term23748 = new Integer(0);
        term23746 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term23746, term23746.getClass(), "iPrinter", null);
        setField(term23746, term23746.getClass(), "iParser", null);
        setField(term23746, term23746.getClass(), "iLocale", null);
        setBooleanField(term23746, term23746.getClass(), "iOffsetParsed", false);
        setField(term23746, term23746.getClass(), "iChrono", null);
        setField(term23746, term23746.getClass(), "iZone", null);
        setField(term23746, term23746.getClass(), "iPivotYear", term23748);
        setIntField(term23746, term23746.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term23609;
        Object retValue = callMethod(klass, "withPivotYear", argTypes, term23537, args);
        assertTrue(recursiveEquals(term23537, term23753));
        assertTrue(recursiveEquals(term23609, term23755));
        assertTrue(recursiveEquals(retValue, term23746));
    }

};


