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

public class DateTimeFormatter_requirePrinter_66030573280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1104;

    public DateTimeFormatter_requirePrinter_66030573280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1120 = new Integer(-1087774327);
        term1104 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1105 = newInstance(Class.forName("java.util.Locale"));
        Object term1106 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1104, term1104.getClass(), "iPrinter", null);
        setField(term1104, term1104.getClass(), "iParser", null);
        setField(term1106, term1106.getClass(), "language", "sq");
        setField(term1106, term1106.getClass(), "script", "");
        setField(term1106, term1106.getClass(), "region", "");
        setField(term1106, term1106.getClass(), "variant", "");
        setIntField(term1106, term1106.getClass(), "hash", 109571298);
        setField(term1105, term1105.getClass(), "baseLocale", term1106);
        setField(term1105, term1105.getClass(), "localeExtensions", null);
        setIntField(term1105, term1105.getClass(), "hashCodeValue", 109571298);
        setField(term1105, term1105.getClass(), "languageTag", null);
        setField(term1104, term1104.getClass(), "iLocale", term1105);
        setBooleanField(term1104, term1104.getClass(), "iOffsetParsed", false);
        setField(term1104, term1104.getClass(), "iChrono", null);
        setField(term1104, term1104.getClass(), "iZone", null);
        setField(term1104, term1104.getClass(), "iPivotYear", term1120);
        setIntField(term1104, term1104.getClass(), "iDefaultYear", 1962444399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "requirePrinter", argTypes, term1104, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


