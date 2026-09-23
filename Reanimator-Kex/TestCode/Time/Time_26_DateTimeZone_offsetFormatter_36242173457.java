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

public class DateTimeZone_offsetFormatter_36242173457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4643;

    public DateTimeZone_offsetFormatter_36242173457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4643 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term4644 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        setField(term4644, term4644.getClass(), "iZeroOffsetPrintText", null);
        setField(term4644, term4644.getClass(), "iZeroOffsetParseText", null);
        setBooleanField(term4644, term4644.getClass(), "iShowSeparators", true);
        setIntField(term4644, term4644.getClass(), "iMinFields", 2);
        setIntField(term4644, term4644.getClass(), "iMaxFields", 4);
        setField(term4643, term4643.getClass(), "iPrinter", term4644);
        setField(term4643, term4643.getClass(), "iParser", term4644);
        setField(term4643, term4643.getClass(), "iLocale", null);
        setBooleanField(term4643, term4643.getClass(), "iOffsetParsed", false);
        setField(term4643, term4643.getClass(), "iChrono", null);
        setField(term4643, term4643.getClass(), "iZone", null);
        setField(term4643, term4643.getClass(), "iPivotYear", null);
        setIntField(term4643, term4643.getClass(), "iDefaultYear", 2000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "offsetFormatter", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term4643));
    }

};


