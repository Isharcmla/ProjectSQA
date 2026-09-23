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

public class DateTimeFormatter_parseDateTime_112568235086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1362;

    public DateTimeFormatter_parseDateTime_112568235086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1380 = new Integer(767834723);
        term1362 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1363 = newInstance(Class.forName("java.util.Locale"));
        Object term1364 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1362, term1362.getClass(), "iPrinter", null);
        setField(term1362, term1362.getClass(), "iParser", null);
        setField(term1364, term1364.getClass(), "language", "gu");
        setField(term1364, term1364.getClass(), "script", "");
        setField(term1364, term1364.getClass(), "region", "IN");
        setField(term1364, term1364.getClass(), "variant", "");
        setIntField(term1364, term1364.getClass(), "hash", 98680781);
        setField(term1363, term1363.getClass(), "baseLocale", term1364);
        setField(term1363, term1363.getClass(), "localeExtensions", null);
        setIntField(term1363, term1363.getClass(), "hashCodeValue", 98680781);
        setField(term1363, term1363.getClass(), "languageTag", null);
        setField(term1362, term1362.getClass(), "iLocale", term1363);
        setBooleanField(term1362, term1362.getClass(), "iOffsetParsed", false);
        setField(term1362, term1362.getClass(), "iChrono", null);
        setField(term1362, term1362.getClass(), "iZone", null);
        setField(term1362, term1362.getClass(), "iPivotYear", term1380);
        setIntField(term1362, term1362.getClass(), "iDefaultYear", -1968847291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RMFIsYGgne";
        try {
            callMethod(klass, "parseDateTime", argTypes, term1362, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


