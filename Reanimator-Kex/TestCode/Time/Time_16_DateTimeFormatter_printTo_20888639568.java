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

public class DateTimeFormatter_printTo_20888639568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term630;

    public DateTimeFormatter_printTo_20888639568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term647 = new Integer(-117576464);
        term630 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term631 = newInstance(Class.forName("java.util.Locale"));
        Object term632 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term630, term630.getClass(), "iPrinter", null);
        setField(term630, term630.getClass(), "iParser", null);
        setField(term632, term632.getClass(), "language", "cgg");
        setField(term632, term632.getClass(), "script", "");
        setField(term632, term632.getClass(), "region", "");
        setField(term632, term632.getClass(), "variant", "");
        setIntField(term632, term632.getClass(), "hash", -1362490211);
        setField(term631, term631.getClass(), "baseLocale", term632);
        setField(term631, term631.getClass(), "localeExtensions", null);
        setIntField(term631, term631.getClass(), "hashCodeValue", -1362490211);
        setField(term631, term631.getClass(), "languageTag", null);
        setField(term630, term630.getClass(), "iLocale", term631);
        setBooleanField(term630, term630.getClass(), "iOffsetParsed", true);
        setField(term630, term630.getClass(), "iChrono", null);
        setField(term630, term630.getClass(), "iZone", null);
        setField(term630, term630.getClass(), "iPivotYear", term647);
        setIntField(term630, term630.getClass(), "iDefaultYear", 1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("org.joda.time.ReadableInstant");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "printTo", argTypes, term630, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


