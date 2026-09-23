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

public class DateTimeFormatter_withPivotYear_387747408142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24391;
     Object term24487;
     Object term24640;
     Object term24642;
     Object term24633;

    public DateTimeFormatter_withPivotYear_387747408142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term24439 = new Integer(0);
        term24391 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term24391, term24391.getClass(), "iPivotYear", term24439);
        term24487 = new Integer(0);
        Integer term24641 = new Integer(0);
        term24640 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term24640, term24640.getClass(), "iPrinter", null);
        setField(term24640, term24640.getClass(), "iParser", null);
        setField(term24640, term24640.getClass(), "iLocale", null);
        setBooleanField(term24640, term24640.getClass(), "iOffsetParsed", false);
        setField(term24640, term24640.getClass(), "iChrono", null);
        setField(term24640, term24640.getClass(), "iZone", null);
        setField(term24640, term24640.getClass(), "iPivotYear", term24641);
        setIntField(term24640, term24640.getClass(), "iDefaultYear", 0);
        term24642 = new Integer(0);
        Integer term24635 = new Integer(0);
        term24633 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term24633, term24633.getClass(), "iPrinter", null);
        setField(term24633, term24633.getClass(), "iParser", null);
        setField(term24633, term24633.getClass(), "iLocale", null);
        setBooleanField(term24633, term24633.getClass(), "iOffsetParsed", false);
        setField(term24633, term24633.getClass(), "iChrono", null);
        setField(term24633, term24633.getClass(), "iZone", null);
        setField(term24633, term24633.getClass(), "iPivotYear", term24635);
        setIntField(term24633, term24633.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term24487;
        Object retValue = callMethod(klass, "withPivotYear", argTypes, term24391, args);
        assertTrue(recursiveEquals(term24391, term24640));
        assertTrue(recursiveEquals(term24487, term24642));
        assertTrue(recursiveEquals(retValue, term24633));
    }

};


