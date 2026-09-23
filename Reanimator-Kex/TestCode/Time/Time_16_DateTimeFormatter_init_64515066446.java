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
import java.lang.Boolean;
import java.lang.Integer;

public class DateTimeFormatter_init_64515066446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term17;
     Object term19;
     Object term21;
     Object term1527;
     Object term1539;
     Object term1549;

    public DateTimeFormatter_init_64515066446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.util.Locale"));
        Object term2 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2, term2.getClass(), "language", "pt");
        setField(term2, term2.getClass(), "script", "");
        setField(term2, term2.getClass(), "region", "MO");
        setField(term2, term2.getClass(), "variant", "");
        setIntField(term2, term2.getClass(), "hash", 106966554);
        setField(term1, term1.getClass(), "baseLocale", term2);
        setField(term1, term1.getClass(), "localeExtensions", null);
        setIntField(term1, term1.getClass(), "hashCodeValue", 106966554);
        setField(term1, term1.getClass(), "languageTag", null);
        term17 = new Boolean(false);
        term19 = new Integer(568599855);
        term21 = new Integer(568599855);
        Integer term1538 = new Integer(568599855);
        term1527 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1528 = newInstance(Class.forName("java.util.Locale"));
        Object term1529 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1527, term1527.getClass(), "iPrinter", null);
        setField(term1527, term1527.getClass(), "iParser", null);
        setField(term1529, term1529.getClass(), "language", "pt");
        setField(term1529, term1529.getClass(), "script", "");
        setField(term1529, term1529.getClass(), "region", "MO");
        setField(term1529, term1529.getClass(), "variant", "");
        setIntField(term1529, term1529.getClass(), "hash", 106966554);
        setField(term1528, term1528.getClass(), "baseLocale", term1529);
        setField(term1528, term1528.getClass(), "localeExtensions", null);
        setIntField(term1528, term1528.getClass(), "hashCodeValue", 106966554);
        setField(term1528, term1528.getClass(), "languageTag", null);
        setField(term1527, term1527.getClass(), "iLocale", term1528);
        setBooleanField(term1527, term1527.getClass(), "iOffsetParsed", false);
        setField(term1527, term1527.getClass(), "iChrono", null);
        setField(term1527, term1527.getClass(), "iZone", null);
        setField(term1527, term1527.getClass(), "iPivotYear", term1538);
        setIntField(term1527, term1527.getClass(), "iDefaultYear", 568599855);
        term1539 = newInstance(Class.forName("java.util.Locale"));
        Object term1540 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1540, term1540.getClass(), "language", "pt");
        setField(term1540, term1540.getClass(), "script", "");
        setField(term1540, term1540.getClass(), "region", "MO");
        setField(term1540, term1540.getClass(), "variant", "");
        setIntField(term1540, term1540.getClass(), "hash", 106966554);
        setField(term1539, term1539.getClass(), "baseLocale", term1540);
        setField(term1539, term1539.getClass(), "localeExtensions", null);
        setIntField(term1539, term1539.getClass(), "hashCodeValue", 106966554);
        setField(term1539, term1539.getClass(), "languageTag", null);
        term1549 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Class.forName("org.joda.time.format.DateTimeParser");
        argTypes[2] = Class.forName("java.util.Locale");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("org.joda.time.Chronology");
        argTypes[5] = Class.forName("org.joda.time.DateTimeZone");
        argTypes[6] = Class.forName("java.lang.Integer");
        argTypes[7] = int.class;
        Object[] args = new Object[8];
        args[0] = null;
        args[1] = null;
        args[2] = term1;
        args[3] = term17;
        args[4] = null;
        args[5] = null;
        args[6] = term19;
        args[7] = term21;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1527));
        assertTrue(recursiveEquals(term1, term1539));
        assertTrue(recursiveEquals(term17, false));
        assertTrue(recursiveEquals(term19, term1549));
        assertTrue(recursiveEquals(term21, 568599855));
    }

};


