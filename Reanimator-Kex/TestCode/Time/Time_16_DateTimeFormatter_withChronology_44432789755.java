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

public class DateTimeFormatter_withChronology_44432789755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259;
     Object term2051;
     Object term2032;

    public DateTimeFormatter_withChronology_44432789755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term275 = new Integer(-1339778481);
        term259 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term260 = newInstance(Class.forName("java.util.Locale"));
        Object term261 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term259, term259.getClass(), "iPrinter", null);
        setField(term259, term259.getClass(), "iParser", null);
        setField(term261, term261.getClass(), "language", "pl");
        setField(term261, term261.getClass(), "script", "");
        setField(term261, term261.getClass(), "region", "");
        setField(term261, term261.getClass(), "variant", "");
        setIntField(term261, term261.getClass(), "hash", 106651780);
        setField(term260, term260.getClass(), "baseLocale", term261);
        setField(term260, term260.getClass(), "localeExtensions", null);
        setIntField(term260, term260.getClass(), "hashCodeValue", 106651780);
        setField(term260, term260.getClass(), "languageTag", null);
        setField(term259, term259.getClass(), "iLocale", term260);
        setBooleanField(term259, term259.getClass(), "iOffsetParsed", true);
        setField(term259, term259.getClass(), "iChrono", null);
        setField(term259, term259.getClass(), "iZone", null);
        setField(term259, term259.getClass(), "iPivotYear", term275);
        setIntField(term259, term259.getClass(), "iDefaultYear", -1339778481);
        Integer term2062 = new Integer(-1339778481);
        term2051 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2052 = newInstance(Class.forName("java.util.Locale"));
        Object term2053 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2051, term2051.getClass(), "iPrinter", null);
        setField(term2051, term2051.getClass(), "iParser", null);
        setField(term2053, term2053.getClass(), "language", "pl");
        setField(term2053, term2053.getClass(), "script", "");
        setField(term2053, term2053.getClass(), "region", "");
        setField(term2053, term2053.getClass(), "variant", "");
        setIntField(term2053, term2053.getClass(), "hash", 106651780);
        setField(term2052, term2052.getClass(), "baseLocale", term2053);
        setField(term2052, term2052.getClass(), "localeExtensions", null);
        setIntField(term2052, term2052.getClass(), "hashCodeValue", 106651780);
        setField(term2052, term2052.getClass(), "languageTag", null);
        setField(term2051, term2051.getClass(), "iLocale", term2052);
        setBooleanField(term2051, term2051.getClass(), "iOffsetParsed", true);
        setField(term2051, term2051.getClass(), "iChrono", null);
        setField(term2051, term2051.getClass(), "iZone", null);
        setField(term2051, term2051.getClass(), "iPivotYear", term2062);
        setIntField(term2051, term2051.getClass(), "iDefaultYear", -1339778481);
        Integer term2048 = new Integer(-1339778481);
        term2032 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2033 = newInstance(Class.forName("java.util.Locale"));
        Object term2034 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2032, term2032.getClass(), "iPrinter", null);
        setField(term2032, term2032.getClass(), "iParser", null);
        setField(term2034, term2034.getClass(), "language", "pl");
        setField(term2034, term2034.getClass(), "script", "");
        setField(term2034, term2034.getClass(), "region", "");
        setField(term2034, term2034.getClass(), "variant", "");
        setIntField(term2034, term2034.getClass(), "hash", 106651780);
        setField(term2033, term2033.getClass(), "baseLocale", term2034);
        setField(term2033, term2033.getClass(), "localeExtensions", null);
        setIntField(term2033, term2033.getClass(), "hashCodeValue", 106651780);
        setField(term2033, term2033.getClass(), "languageTag", null);
        setField(term2032, term2032.getClass(), "iLocale", term2033);
        setBooleanField(term2032, term2032.getClass(), "iOffsetParsed", true);
        setField(term2032, term2032.getClass(), "iChrono", null);
        setField(term2032, term2032.getClass(), "iZone", null);
        setField(term2032, term2032.getClass(), "iPivotYear", term2048);
        setIntField(term2032, term2032.getClass(), "iDefaultYear", -1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "withChronology", argTypes, term259, args);
        assertTrue(recursiveEquals(term259, term2051));
        assertTrue(recursiveEquals(retValue, term2032));
    }

};


