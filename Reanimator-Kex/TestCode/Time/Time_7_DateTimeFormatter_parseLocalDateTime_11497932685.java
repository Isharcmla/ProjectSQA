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
import java.lang.UnsupportedOperationException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatter_parseLocalDateTime_11497932685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1315;

    public DateTimeFormatter_parseLocalDateTime_11497932685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1333 = new Integer(1962444399);
        term1315 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1316 = newInstance(Class.forName("java.util.Locale"));
        Object term1317 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1315, term1315.getClass(), "iPrinter", null);
        setField(term1315, term1315.getClass(), "iParser", null);
        setField(term1317, term1317.getClass(), "language", "de");
        setField(term1317, term1317.getClass(), "script", "");
        setField(term1317, term1317.getClass(), "region", "IT");
        setField(term1317, term1317.getClass(), "variant", "");
        setIntField(term1317, term1317.getClass(), "hash", 95433748);
        setField(term1316, term1316.getClass(), "baseLocale", term1317);
        setField(term1316, term1316.getClass(), "localeExtensions", null);
        setIntField(term1316, term1316.getClass(), "hashCodeValue", 95433748);
        setField(term1316, term1316.getClass(), "languageTag", null);
        setField(term1315, term1315.getClass(), "iLocale", term1316);
        setBooleanField(term1315, term1315.getClass(), "iOffsetParsed", false);
        setField(term1315, term1315.getClass(), "iChrono", null);
        setField(term1315, term1315.getClass(), "iZone", null);
        setField(term1315, term1315.getClass(), "iPivotYear", term1333);
        setIntField(term1315, term1315.getClass(), "iDefaultYear", -1016503459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        try {
            callMethod(klass, "parseLocalDateTime", argTypes, term1315, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


