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

public class DateTimeFormatter_getParser_203033086350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96;
     Object term1704;

    public DateTimeFormatter_getParser_203033086350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term115 = new Integer(-1922583790);
        term96 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term97 = newInstance(Class.forName("java.util.Locale"));
        Object term98 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term96, term96.getClass(), "iPrinter", null);
        setField(term96, term96.getClass(), "iParser", null);
        setField(term98, term98.getClass(), "language", "chr");
        setField(term98, term98.getClass(), "script", "");
        setField(term98, term98.getClass(), "region", "US");
        setField(term98, term98.getClass(), "variant", "");
        setIntField(term98, term98.getClass(), "hash", -1361154731);
        setField(term97, term97.getClass(), "baseLocale", term98);
        setField(term97, term97.getClass(), "localeExtensions", null);
        setIntField(term97, term97.getClass(), "hashCodeValue", -1361154731);
        setField(term97, term97.getClass(), "languageTag", null);
        setField(term96, term96.getClass(), "iLocale", term97);
        setBooleanField(term96, term96.getClass(), "iOffsetParsed", true);
        setField(term96, term96.getClass(), "iChrono", null);
        setField(term96, term96.getClass(), "iZone", null);
        setField(term96, term96.getClass(), "iPivotYear", term115);
        setIntField(term96, term96.getClass(), "iDefaultYear", -1922583790);
        Integer term1715 = new Integer(-1922583790);
        term1704 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1705 = newInstance(Class.forName("java.util.Locale"));
        Object term1706 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1704, term1704.getClass(), "iPrinter", null);
        setField(term1704, term1704.getClass(), "iParser", null);
        setField(term1706, term1706.getClass(), "language", "chr");
        setField(term1706, term1706.getClass(), "script", "");
        setField(term1706, term1706.getClass(), "region", "US");
        setField(term1706, term1706.getClass(), "variant", "");
        setIntField(term1706, term1706.getClass(), "hash", -1361154731);
        setField(term1705, term1705.getClass(), "baseLocale", term1706);
        setField(term1705, term1705.getClass(), "localeExtensions", null);
        setIntField(term1705, term1705.getClass(), "hashCodeValue", -1361154731);
        setField(term1705, term1705.getClass(), "languageTag", null);
        setField(term1704, term1704.getClass(), "iLocale", term1705);
        setBooleanField(term1704, term1704.getClass(), "iOffsetParsed", true);
        setField(term1704, term1704.getClass(), "iChrono", null);
        setField(term1704, term1704.getClass(), "iZone", null);
        setField(term1704, term1704.getClass(), "iPivotYear", term1715);
        setIntField(term1704, term1704.getClass(), "iDefaultYear", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getParser", argTypes, term96, args);
        assertTrue(recursiveEquals(term96, term1704));
        assertTrue(recursiveEquals(retValue, null));
    }

};


