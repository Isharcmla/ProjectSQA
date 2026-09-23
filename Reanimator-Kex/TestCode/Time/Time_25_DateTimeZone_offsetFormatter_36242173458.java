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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Object;

public class DateTimeZone_offsetFormatter_36242173458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4912;

    public DateTimeZone_offsetFormatter_36242173458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4912 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term4913 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        setField(term4913, term4913.getClass(), "iZeroOffsetPrintText", null);
        setField(term4913, term4913.getClass(), "iZeroOffsetParseText", null);
        setBooleanField(term4913, term4913.getClass(), "iShowSeparators", true);
        setIntField(term4913, term4913.getClass(), "iMinFields", 2);
        setIntField(term4913, term4913.getClass(), "iMaxFields", 4);
        setField(term4912, term4912.getClass(), "iPrinter", term4913);
        setField(term4912, term4912.getClass(), "iParser", term4913);
        setField(term4912, term4912.getClass(), "iLocale", null);
        setBooleanField(term4912, term4912.getClass(), "iOffsetParsed", false);
        setField(term4912, term4912.getClass(), "iChrono", null);
        setField(term4912, term4912.getClass(), "iZone", null);
        setField(term4912, term4912.getClass(), "iPivotYear", null);
        setIntField(term4912, term4912.getClass(), "iDefaultYear", 2000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "offsetFormatter", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term4912));
    }

};


