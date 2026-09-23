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

public class DateTimeFormatter_withPivotYear_387747408178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34680;
     Object term34974;
     Object term34971;

    public DateTimeFormatter_withPivotYear_387747408178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34680 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term34680, term34680.getClass(), "iPivotYear", null);
        term34974 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term34974, term34974.getClass(), "iPrinter", null);
        setField(term34974, term34974.getClass(), "iParser", null);
        setField(term34974, term34974.getClass(), "iLocale", null);
        setBooleanField(term34974, term34974.getClass(), "iOffsetParsed", false);
        setField(term34974, term34974.getClass(), "iChrono", null);
        setField(term34974, term34974.getClass(), "iZone", null);
        setField(term34974, term34974.getClass(), "iPivotYear", null);
        setIntField(term34974, term34974.getClass(), "iDefaultYear", 0);
        term34971 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term34971, term34971.getClass(), "iPrinter", null);
        setField(term34971, term34971.getClass(), "iParser", null);
        setField(term34971, term34971.getClass(), "iLocale", null);
        setBooleanField(term34971, term34971.getClass(), "iOffsetParsed", false);
        setField(term34971, term34971.getClass(), "iChrono", null);
        setField(term34971, term34971.getClass(), "iZone", null);
        setField(term34971, term34971.getClass(), "iPivotYear", null);
        setIntField(term34971, term34971.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "withPivotYear", argTypes, term34680, args);
        assertTrue(recursiveEquals(term34680, term34974));
        assertTrue(recursiveEquals(retValue, term34971));
    }

};


