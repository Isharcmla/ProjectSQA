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
import java.lang.Long;

public class DateTimeFormatter_print_125781359676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944;
     Object term965;

    public DateTimeFormatter_print_125781359676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term962 = new Integer(-1179120542);
        term944 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term945 = newInstance(Class.forName("java.util.Locale"));
        Object term946 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term944, term944.getClass(), "iPrinter", null);
        setField(term944, term944.getClass(), "iParser", null);
        setField(term946, term946.getClass(), "language", "ln");
        setField(term946, term946.getClass(), "script", "");
        setField(term946, term946.getClass(), "region", "CF");
        setField(term946, term946.getClass(), "variant", "");
        setIntField(term946, term946.getClass(), "hash", 103083835);
        setField(term945, term945.getClass(), "baseLocale", term946);
        setField(term945, term945.getClass(), "localeExtensions", null);
        setIntField(term945, term945.getClass(), "hashCodeValue", 103083835);
        setField(term945, term945.getClass(), "languageTag", null);
        setField(term944, term944.getClass(), "iLocale", term945);
        setBooleanField(term944, term944.getClass(), "iOffsetParsed", true);
        setField(term944, term944.getClass(), "iChrono", null);
        setField(term944, term944.getClass(), "iZone", null);
        setField(term944, term944.getClass(), "iPivotYear", term962);
        setIntField(term944, term944.getClass(), "iDefaultYear", -1087774327);
        term965 = new Long(-8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term965;
        try {
            callMethod(klass, "print", argTypes, term944, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


