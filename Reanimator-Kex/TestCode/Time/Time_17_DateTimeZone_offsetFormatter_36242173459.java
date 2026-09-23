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
     Object term4994;

    public DateTimeZone_offsetFormatter_36242173459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4994 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term4995 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        setField(term4995, term4995.getClass(), "iZeroOffsetPrintText", null);
        setField(term4995, term4995.getClass(), "iZeroOffsetParseText", null);
        setBooleanField(term4995, term4995.getClass(), "iShowSeparators", true);
        setIntField(term4995, term4995.getClass(), "iMinFields", 2);
        setIntField(term4995, term4995.getClass(), "iMaxFields", 4);
        setField(term4994, term4994.getClass(), "iPrinter", term4995);
        setField(term4994, term4994.getClass(), "iParser", term4995);
        setField(term4994, term4994.getClass(), "iLocale", null);
        setBooleanField(term4994, term4994.getClass(), "iOffsetParsed", false);
        setField(term4994, term4994.getClass(), "iChrono", null);
        setField(term4994, term4994.getClass(), "iZone", null);
        setField(term4994, term4994.getClass(), "iPivotYear", null);
        setIntField(term4994, term4994.getClass(), "iDefaultYear", 2000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "offsetFormatter", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term4994));
    }

};


