package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class Compiler_setLoggingLevel_1336108812293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330360;
     Object term2310737;

    public Compiler_setLoggingLevel_1336108812293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330360 = newInstance(Class.forName("java.util.logging.Level"));
        Object term330398 = newInstance(Class.forName("java.util.Locale"));
        Object term330399 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term330360, term330360.getClass(), "name", "kuzULljuRL");
        setIntField(term330360, term330360.getClass(), "value", 57189932);
        setField(term330360, term330360.getClass(), "resourceBundleName", "DNgbgDcryI");
        setField(term330360, term330360.getClass(), "localizedLevelName", "NHOLoiInVI");
        setField(term330399, term330399.getClass(), "language", "ps");
        setField(term330399, term330399.getClass(), "script", "");
        setField(term330399, term330399.getClass(), "region", "");
        setField(term330399, term330399.getClass(), "variant", "");
        setIntField(term330399, term330399.getClass(), "hash", 106860317);
        setField(term330398, term330398.getClass(), "baseLocale", term330399);
        setField(term330398, term330398.getClass(), "localeExtensions", null);
        setIntField(term330398, term330398.getClass(), "hashCodeValue", 106860317);
        setField(term330398, term330398.getClass(), "languageTag", null);
        setField(term330360, term330360.getClass(), "cachedLocale", term330398);
        term2310737 = newInstance(Class.forName("java.util.logging.Level"));
        Object term2310744 = newInstance(Class.forName("java.util.Locale"));
        Object term2310745 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2310737, term2310737.getClass(), "name", "kuzULljuRL");
        setIntField(term2310737, term2310737.getClass(), "value", 57189932);
        setField(term2310737, term2310737.getClass(), "resourceBundleName", "DNgbgDcryI");
        setField(term2310737, term2310737.getClass(), "localizedLevelName", "NHOLoiInVI");
        setField(term2310745, term2310745.getClass(), "language", "ps");
        setField(term2310745, term2310745.getClass(), "script", "");
        setField(term2310745, term2310745.getClass(), "region", "");
        setField(term2310745, term2310745.getClass(), "variant", "");
        setIntField(term2310745, term2310745.getClass(), "hash", 106860317);
        setField(term2310744, term2310744.getClass(), "baseLocale", term2310745);
        setField(term2310744, term2310744.getClass(), "localeExtensions", null);
        setIntField(term2310744, term2310744.getClass(), "hashCodeValue", 106860317);
        setField(term2310744, term2310744.getClass(), "languageTag", null);
        setField(term2310737, term2310737.getClass(), "cachedLocale", term2310744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.logging.Level");
        Object[] args = new Object[1];
        args[0] = term330360;
        callMethod(klass, "setLoggingLevel", argTypes, null, args);
        assertTrue(recursiveEquals(term330360, term2310737));
    }

};


