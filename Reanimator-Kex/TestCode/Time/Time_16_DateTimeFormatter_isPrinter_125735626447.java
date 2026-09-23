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

public class DateTimeFormatter_isPrinter_125735626447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;
     Object term1583;

    public DateTimeFormatter_isPrinter_125735626447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term43 = new Integer(1162663216);
        term27 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term28 = newInstance(Class.forName("java.util.Locale"));
        Object term29 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term27, term27.getClass(), "iPrinter", null);
        setField(term27, term27.getClass(), "iParser", null);
        setField(term29, term29.getClass(), "language", "ps");
        setField(term29, term29.getClass(), "script", "");
        setField(term29, term29.getClass(), "region", "");
        setField(term29, term29.getClass(), "variant", "");
        setIntField(term29, term29.getClass(), "hash", 106860317);
        setField(term28, term28.getClass(), "baseLocale", term29);
        setField(term28, term28.getClass(), "localeExtensions", null);
        setIntField(term28, term28.getClass(), "hashCodeValue", 106860317);
        setField(term28, term28.getClass(), "languageTag", null);
        setField(term27, term27.getClass(), "iLocale", term28);
        setBooleanField(term27, term27.getClass(), "iOffsetParsed", false);
        setField(term27, term27.getClass(), "iChrono", null);
        setField(term27, term27.getClass(), "iZone", null);
        setField(term27, term27.getClass(), "iPivotYear", term43);
        setIntField(term27, term27.getClass(), "iDefaultYear", 1162663216);
        Integer term1594 = new Integer(1162663216);
        term1583 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1584 = newInstance(Class.forName("java.util.Locale"));
        Object term1585 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1583, term1583.getClass(), "iPrinter", null);
        setField(term1583, term1583.getClass(), "iParser", null);
        setField(term1585, term1585.getClass(), "language", "ps");
        setField(term1585, term1585.getClass(), "script", "");
        setField(term1585, term1585.getClass(), "region", "");
        setField(term1585, term1585.getClass(), "variant", "");
        setIntField(term1585, term1585.getClass(), "hash", 106860317);
        setField(term1584, term1584.getClass(), "baseLocale", term1585);
        setField(term1584, term1584.getClass(), "localeExtensions", null);
        setIntField(term1584, term1584.getClass(), "hashCodeValue", 106860317);
        setField(term1584, term1584.getClass(), "languageTag", null);
        setField(term1583, term1583.getClass(), "iLocale", term1584);
        setBooleanField(term1583, term1583.getClass(), "iOffsetParsed", false);
        setField(term1583, term1583.getClass(), "iChrono", null);
        setField(term1583, term1583.getClass(), "iZone", null);
        setField(term1583, term1583.getClass(), "iPivotYear", term1594);
        setIntField(term1583, term1583.getClass(), "iDefaultYear", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isPrinter", argTypes, term27, args);
        assertTrue(recursiveEquals(term27, term1583));
        assertTrue(recursiveEquals(retValue, false));
    }

};


