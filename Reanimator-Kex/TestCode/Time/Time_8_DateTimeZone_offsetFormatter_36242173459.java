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

public class DateTimeZone_offsetFormatter_36242173459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4249;

    public DateTimeZone_offsetFormatter_36242173459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4249 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term4250 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        setField(term4250, term4250.getClass(), "iZeroOffsetPrintText", null);
        setField(term4250, term4250.getClass(), "iZeroOffsetParseText", null);
        setBooleanField(term4250, term4250.getClass(), "iShowSeparators", true);
        setIntField(term4250, term4250.getClass(), "iMinFields", 2);
        setIntField(term4250, term4250.getClass(), "iMaxFields", 4);
        setField(term4249, term4249.getClass(), "iPrinter", term4250);
        setField(term4249, term4249.getClass(), "iParser", term4250);
        setField(term4249, term4249.getClass(), "iLocale", null);
        setBooleanField(term4249, term4249.getClass(), "iOffsetParsed", false);
        setField(term4249, term4249.getClass(), "iChrono", null);
        setField(term4249, term4249.getClass(), "iZone", null);
        setField(term4249, term4249.getClass(), "iPivotYear", null);
        setIntField(term4249, term4249.getClass(), "iDefaultYear", 2000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "offsetFormatter", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term4249));
    }

};


