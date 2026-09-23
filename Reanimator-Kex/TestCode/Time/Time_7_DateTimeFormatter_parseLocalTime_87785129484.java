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

public class DateTimeFormatter_parseLocalTime_87785129484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1268;

    public DateTimeFormatter_parseLocalTime_87785129484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1286 = new Integer(679763016);
        term1268 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1269 = newInstance(Class.forName("java.util.Locale"));
        Object term1270 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1268, term1268.getClass(), "iPrinter", null);
        setField(term1268, term1268.getClass(), "iParser", null);
        setField(term1270, term1270.getClass(), "language", "ar");
        setField(term1270, term1270.getClass(), "script", "");
        setField(term1270, term1270.getClass(), "region", "SA");
        setField(term1270, term1270.getClass(), "variant", "");
        setIntField(term1270, term1270.getClass(), "hash", 93059489);
        setField(term1269, term1269.getClass(), "baseLocale", term1270);
        setField(term1269, term1269.getClass(), "localeExtensions", null);
        setIntField(term1269, term1269.getClass(), "hashCodeValue", 93059489);
        setField(term1269, term1269.getClass(), "languageTag", null);
        setField(term1268, term1268.getClass(), "iLocale", term1269);
        setBooleanField(term1268, term1268.getClass(), "iOffsetParsed", true);
        setField(term1268, term1268.getClass(), "iChrono", null);
        setField(term1268, term1268.getClass(), "iZone", null);
        setField(term1268, term1268.getClass(), "iPivotYear", term1286);
        setIntField(term1268, term1268.getClass(), "iDefaultYear", -817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MjGYSRKTNF";
        try {
            callMethod(klass, "parseLocalTime", argTypes, term1268, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


