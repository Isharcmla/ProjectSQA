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
import java.lang.Object;

public class DateTimeFormatter_requirePrinter_660305732128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22397;
     Object term23349;
     Object term23342;

    public DateTimeFormatter_requirePrinter_660305732128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22397 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term22503 = newInstance(Class.forName("org.joda.time.format.DateTimeFormat$StyleFormatter"));
        setField(term22397, term22397.getClass(), "iPrinter", term22503);
        term23349 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term23350 = newInstance(Class.forName("org.joda.time.format.DateTimeFormat$StyleFormatter"));
        setIntField(term23350, term23350.getClass(), "iDateStyle", 0);
        setIntField(term23350, term23350.getClass(), "iTimeStyle", 0);
        setIntField(term23350, term23350.getClass(), "iType", 0);
        setField(term23349, term23349.getClass(), "iPrinter", term23350);
        setField(term23349, term23349.getClass(), "iParser", null);
        setField(term23349, term23349.getClass(), "iLocale", null);
        setBooleanField(term23349, term23349.getClass(), "iOffsetParsed", false);
        setField(term23349, term23349.getClass(), "iChrono", null);
        setField(term23349, term23349.getClass(), "iZone", null);
        setField(term23349, term23349.getClass(), "iPivotYear", null);
        setIntField(term23349, term23349.getClass(), "iDefaultYear", 0);
        term23342 = newInstance(Class.forName("org.joda.time.format.DateTimeFormat$StyleFormatter"));
        setIntField(term23342, term23342.getClass(), "iDateStyle", 0);
        setIntField(term23342, term23342.getClass(), "iTimeStyle", 0);
        setIntField(term23342, term23342.getClass(), "iType", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "requirePrinter", argTypes, term22397, args);
        assertTrue(recursiveEquals(term22397, term23349));
        assertTrue(recursiveEquals(retValue, term23342));
    }

};


