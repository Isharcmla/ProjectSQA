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

public class DateTimeFormatter_withPivotYear_2037588410151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35468;
     Object term35494;
     Object term35488;

    public DateTimeFormatter_withPivotYear_2037588410151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35468 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term35468, term35468.getClass(), "iPivotYear", null);
        term35494 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term35494, term35494.getClass(), "iPrinter", null);
        setField(term35494, term35494.getClass(), "iParser", null);
        setField(term35494, term35494.getClass(), "iLocale", null);
        setBooleanField(term35494, term35494.getClass(), "iOffsetParsed", false);
        setField(term35494, term35494.getClass(), "iChrono", null);
        setField(term35494, term35494.getClass(), "iZone", null);
        setField(term35494, term35494.getClass(), "iPivotYear", null);
        setIntField(term35494, term35494.getClass(), "iDefaultYear", 0);
        Integer term35490 = new Integer(0);
        term35488 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term35488, term35488.getClass(), "iPrinter", null);
        setField(term35488, term35488.getClass(), "iParser", null);
        setField(term35488, term35488.getClass(), "iLocale", null);
        setBooleanField(term35488, term35488.getClass(), "iOffsetParsed", false);
        setField(term35488, term35488.getClass(), "iChrono", null);
        setField(term35488, term35488.getClass(), "iZone", null);
        setField(term35488, term35488.getClass(), "iPivotYear", term35490);
        setIntField(term35488, term35488.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "withPivotYear", argTypes, term35468, args);
        assertTrue(recursiveEquals(term35468, term35494));
        assertTrue(recursiveEquals(retValue, term35488));
    }

};


