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

public class DateTimeFormatter_parseMillis_130658371082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1174;

    public DateTimeFormatter_parseMillis_130658371082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1191 = new Integer(-469968304);
        term1174 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1175 = newInstance(Class.forName("java.util.Locale"));
        Object term1176 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1174, term1174.getClass(), "iPrinter", null);
        setField(term1174, term1174.getClass(), "iParser", null);
        setField(term1176, term1176.getClass(), "language", "ast");
        setField(term1176, term1176.getClass(), "script", "");
        setField(term1176, term1176.getClass(), "region", "");
        setField(term1176, term1176.getClass(), "variant", "");
        setIntField(term1176, term1176.getClass(), "hash", -1408278978);
        setField(term1175, term1175.getClass(), "baseLocale", term1176);
        setField(term1175, term1175.getClass(), "localeExtensions", null);
        setIntField(term1175, term1175.getClass(), "hashCodeValue", -1408278978);
        setField(term1175, term1175.getClass(), "languageTag", null);
        setField(term1174, term1174.getClass(), "iLocale", term1175);
        setBooleanField(term1174, term1174.getClass(), "iOffsetParsed", true);
        setField(term1174, term1174.getClass(), "iChrono", null);
        setField(term1174, term1174.getClass(), "iZone", null);
        setField(term1174, term1174.getClass(), "iPivotYear", term1191);
        setIntField(term1174, term1174.getClass(), "iDefaultYear", -157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        try {
            callMethod(klass, "parseMillis", argTypes, term1174, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


