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

public class DateTimeFormatter_withPivotYear_2037588410132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23446;
     Object term23652;
     Object term23646;

    public DateTimeFormatter_withPivotYear_2037588410132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23446 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term23446, term23446.getClass(), "iPivotYear", null);
        term23652 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term23652, term23652.getClass(), "iPrinter", null);
        setField(term23652, term23652.getClass(), "iParser", null);
        setField(term23652, term23652.getClass(), "iLocale", null);
        setBooleanField(term23652, term23652.getClass(), "iOffsetParsed", false);
        setField(term23652, term23652.getClass(), "iChrono", null);
        setField(term23652, term23652.getClass(), "iZone", null);
        setField(term23652, term23652.getClass(), "iPivotYear", null);
        setIntField(term23652, term23652.getClass(), "iDefaultYear", 0);
        Integer term23648 = new Integer(0);
        term23646 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term23646, term23646.getClass(), "iPrinter", null);
        setField(term23646, term23646.getClass(), "iParser", null);
        setField(term23646, term23646.getClass(), "iLocale", null);
        setBooleanField(term23646, term23646.getClass(), "iOffsetParsed", false);
        setField(term23646, term23646.getClass(), "iChrono", null);
        setField(term23646, term23646.getClass(), "iZone", null);
        setField(term23646, term23646.getClass(), "iPivotYear", term23648);
        setIntField(term23646, term23646.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "withPivotYear", argTypes, term23446, args);
        assertTrue(recursiveEquals(term23446, term23652));
        assertTrue(recursiveEquals(retValue, term23646));
    }

};


