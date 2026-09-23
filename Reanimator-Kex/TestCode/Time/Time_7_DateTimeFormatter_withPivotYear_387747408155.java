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

public class DateTimeFormatter_withPivotYear_387747408155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36355;
     Object term36451;
     Object term36462;
     Object term36464;
     Object term36455;

    public DateTimeFormatter_withPivotYear_387747408155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term36403 = new Integer(0);
        term36355 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term36355, term36355.getClass(), "iPivotYear", term36403);
        term36451 = new Integer(0);
        Integer term36463 = new Integer(0);
        term36462 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term36462, term36462.getClass(), "iPrinter", null);
        setField(term36462, term36462.getClass(), "iParser", null);
        setField(term36462, term36462.getClass(), "iLocale", null);
        setBooleanField(term36462, term36462.getClass(), "iOffsetParsed", false);
        setField(term36462, term36462.getClass(), "iChrono", null);
        setField(term36462, term36462.getClass(), "iZone", null);
        setField(term36462, term36462.getClass(), "iPivotYear", term36463);
        setIntField(term36462, term36462.getClass(), "iDefaultYear", 0);
        term36464 = new Integer(0);
        Integer term36457 = new Integer(0);
        term36455 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term36455, term36455.getClass(), "iPrinter", null);
        setField(term36455, term36455.getClass(), "iParser", null);
        setField(term36455, term36455.getClass(), "iLocale", null);
        setBooleanField(term36455, term36455.getClass(), "iOffsetParsed", false);
        setField(term36455, term36455.getClass(), "iChrono", null);
        setField(term36455, term36455.getClass(), "iZone", null);
        setField(term36455, term36455.getClass(), "iPivotYear", term36457);
        setIntField(term36455, term36455.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term36451;
        Object retValue = callMethod(klass, "withPivotYear", argTypes, term36355, args);
        assertTrue(recursiveEquals(term36355, term36462));
        assertTrue(recursiveEquals(term36451, term36464));
        assertTrue(recursiveEquals(retValue, term36455));
    }

};


