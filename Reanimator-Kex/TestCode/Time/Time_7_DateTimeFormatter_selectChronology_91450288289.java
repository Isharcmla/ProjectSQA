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
import java.lang.IllegalArgumentException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatter_selectChronology_91450288289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1477;

    public DateTimeFormatter_selectChronology_91450288289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1493 = new Integer(1876565163);
        term1477 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1478 = newInstance(Class.forName("java.util.Locale"));
        Object term1479 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1477, term1477.getClass(), "iPrinter", null);
        setField(term1477, term1477.getClass(), "iParser", null);
        setField(term1479, term1479.getClass(), "language", "ko");
        setField(term1479, term1479.getClass(), "script", "");
        setField(term1479, term1479.getClass(), "region", "");
        setField(term1479, term1479.getClass(), "variant", "");
        setIntField(term1479, term1479.getClass(), "hash", 102123548);
        setField(term1478, term1478.getClass(), "baseLocale", term1479);
        setField(term1478, term1478.getClass(), "localeExtensions", null);
        setIntField(term1478, term1478.getClass(), "hashCodeValue", 102123548);
        setField(term1478, term1478.getClass(), "languageTag", null);
        setField(term1477, term1477.getClass(), "iLocale", term1478);
        setBooleanField(term1477, term1477.getClass(), "iOffsetParsed", true);
        setField(term1477, term1477.getClass(), "iChrono", null);
        setField(term1477, term1477.getClass(), "iZone", null);
        setField(term1477, term1477.getClass(), "iPivotYear", term1493);
        setIntField(term1477, term1477.getClass(), "iDefaultYear", 1632125673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "selectChronology", argTypes, term1477, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


