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

public class DateTimeFormatter_getChronology_33655451056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280;
     Object term2089;

    public DateTimeFormatter_getChronology_33655451056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term297 = new Integer(1725571209);
        term280 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term281 = newInstance(Class.forName("java.util.Locale"));
        Object term282 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term280, term280.getClass(), "iPrinter", null);
        setField(term280, term280.getClass(), "iParser", null);
        setField(term282, term282.getClass(), "language", "mzn");
        setField(term282, term282.getClass(), "script", "");
        setField(term282, term282.getClass(), "region", "");
        setField(term282, term282.getClass(), "variant", "");
        setIntField(term282, term282.getClass(), "hash", -1058443265);
        setField(term281, term281.getClass(), "baseLocale", term282);
        setField(term281, term281.getClass(), "localeExtensions", null);
        setIntField(term281, term281.getClass(), "hashCodeValue", -1058443265);
        setField(term281, term281.getClass(), "languageTag", null);
        setField(term280, term280.getClass(), "iLocale", term281);
        setBooleanField(term280, term280.getClass(), "iOffsetParsed", false);
        setField(term280, term280.getClass(), "iChrono", null);
        setField(term280, term280.getClass(), "iZone", null);
        setField(term280, term280.getClass(), "iPivotYear", term297);
        setIntField(term280, term280.getClass(), "iDefaultYear", 1725571209);
        Integer term2100 = new Integer(1725571209);
        term2089 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2090 = newInstance(Class.forName("java.util.Locale"));
        Object term2091 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2089, term2089.getClass(), "iPrinter", null);
        setField(term2089, term2089.getClass(), "iParser", null);
        setField(term2091, term2091.getClass(), "language", "mzn");
        setField(term2091, term2091.getClass(), "script", "");
        setField(term2091, term2091.getClass(), "region", "");
        setField(term2091, term2091.getClass(), "variant", "");
        setIntField(term2091, term2091.getClass(), "hash", -1058443265);
        setField(term2090, term2090.getClass(), "baseLocale", term2091);
        setField(term2090, term2090.getClass(), "localeExtensions", null);
        setIntField(term2090, term2090.getClass(), "hashCodeValue", -1058443265);
        setField(term2090, term2090.getClass(), "languageTag", null);
        setField(term2089, term2089.getClass(), "iLocale", term2090);
        setBooleanField(term2089, term2089.getClass(), "iOffsetParsed", false);
        setField(term2089, term2089.getClass(), "iChrono", null);
        setField(term2089, term2089.getClass(), "iZone", null);
        setField(term2089, term2089.getClass(), "iPivotYear", term2100);
        setIntField(term2089, term2089.getClass(), "iDefaultYear", 1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getChronology", argTypes, term280, args);
        assertTrue(recursiveEquals(term280, term2089));
        assertTrue(recursiveEquals(retValue, null));
    }

};


