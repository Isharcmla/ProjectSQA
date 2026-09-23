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
import java.lang.Integer;

public class DateTimeFormatter_getPrinter_102937611548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term1620;

    public DateTimeFormatter_getPrinter_102937611548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term65 = new Integer(1484323161);
        term48 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term49 = newInstance(Class.forName("java.util.Locale"));
        Object term50 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term48, term48.getClass(), "iPrinter", null);
        setField(term48, term48.getClass(), "iParser", null);
        setField(term50, term50.getClass(), "language", "kab");
        setField(term50, term50.getClass(), "script", "");
        setField(term50, term50.getClass(), "region", "");
        setField(term50, term50.getClass(), "variant", "");
        setIntField(term50, term50.getClass(), "hash", -1139147084);
        setField(term49, term49.getClass(), "baseLocale", term50);
        setField(term49, term49.getClass(), "localeExtensions", null);
        setIntField(term49, term49.getClass(), "hashCodeValue", -1139147084);
        setField(term49, term49.getClass(), "languageTag", null);
        setField(term48, term48.getClass(), "iLocale", term49);
        setBooleanField(term48, term48.getClass(), "iOffsetParsed", false);
        setField(term48, term48.getClass(), "iChrono", null);
        setField(term48, term48.getClass(), "iZone", null);
        setField(term48, term48.getClass(), "iPivotYear", term65);
        setIntField(term48, term48.getClass(), "iDefaultYear", 1484323161);
        Integer term1631 = new Integer(1484323161);
        term1620 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1621 = newInstance(Class.forName("java.util.Locale"));
        Object term1622 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1620, term1620.getClass(), "iPrinter", null);
        setField(term1620, term1620.getClass(), "iParser", null);
        setField(term1622, term1622.getClass(), "language", "kab");
        setField(term1622, term1622.getClass(), "script", "");
        setField(term1622, term1622.getClass(), "region", "");
        setField(term1622, term1622.getClass(), "variant", "");
        setIntField(term1622, term1622.getClass(), "hash", -1139147084);
        setField(term1621, term1621.getClass(), "baseLocale", term1622);
        setField(term1621, term1621.getClass(), "localeExtensions", null);
        setIntField(term1621, term1621.getClass(), "hashCodeValue", -1139147084);
        setField(term1621, term1621.getClass(), "languageTag", null);
        setField(term1620, term1620.getClass(), "iLocale", term1621);
        setBooleanField(term1620, term1620.getClass(), "iOffsetParsed", false);
        setField(term1620, term1620.getClass(), "iChrono", null);
        setField(term1620, term1620.getClass(), "iZone", null);
        setField(term1620, term1620.getClass(), "iPivotYear", term1631);
        setIntField(term1620, term1620.getClass(), "iDefaultYear", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPrinter", argTypes, term48, args);
        assertTrue(recursiveEquals(term48, term1620));
        assertTrue(recursiveEquals(retValue, null));
    }

};


