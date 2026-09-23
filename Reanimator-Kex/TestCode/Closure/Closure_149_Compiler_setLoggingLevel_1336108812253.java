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

public class Compiler_setLoggingLevel_1336108812253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336504;
     Object term2674110;

    public Compiler_setLoggingLevel_1336108812253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term336504 = newInstance(Class.forName("java.util.logging.Level"));
        Object term336542 = newInstance(Class.forName("java.util.Locale"));
        Object term336543 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term336504, term336504.getClass(), "name", "TwSWGxsbpT");
        setIntField(term336504, term336504.getClass(), "value", -330897705);
        setField(term336504, term336504.getClass(), "resourceBundleName", "hfUAGLGTYY");
        setField(term336504, term336504.getClass(), "localizedLevelName", "pjXjkGlBZo");
        setField(term336543, term336543.getClass(), "language", "kab");
        setField(term336543, term336543.getClass(), "script", "");
        setField(term336543, term336543.getClass(), "region", "");
        setField(term336543, term336543.getClass(), "variant", "");
        setIntField(term336543, term336543.getClass(), "hash", -1139147084);
        setField(term336542, term336542.getClass(), "baseLocale", term336543);
        setField(term336542, term336542.getClass(), "localeExtensions", null);
        setIntField(term336542, term336542.getClass(), "hashCodeValue", -1139147084);
        setField(term336542, term336542.getClass(), "languageTag", null);
        setField(term336504, term336504.getClass(), "cachedLocale", term336542);
        term2674110 = newInstance(Class.forName("java.util.logging.Level"));
        Object term2674144 = newInstance(Class.forName("java.util.Locale"));
        Object term2674145 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2674110, term2674110.getClass(), "name", "TwSWGxsbpT");
        setIntField(term2674110, term2674110.getClass(), "value", -330897705);
        setField(term2674110, term2674110.getClass(), "resourceBundleName", "hfUAGLGTYY");
        setField(term2674110, term2674110.getClass(), "localizedLevelName", "pjXjkGlBZo");
        setField(term2674145, term2674145.getClass(), "language", "kab");
        setField(term2674145, term2674145.getClass(), "script", "");
        setField(term2674145, term2674145.getClass(), "region", "");
        setField(term2674145, term2674145.getClass(), "variant", "");
        setIntField(term2674145, term2674145.getClass(), "hash", -1139147084);
        setField(term2674144, term2674144.getClass(), "baseLocale", term2674145);
        setField(term2674144, term2674144.getClass(), "localeExtensions", null);
        setIntField(term2674144, term2674144.getClass(), "hashCodeValue", -1139147084);
        setField(term2674144, term2674144.getClass(), "languageTag", null);
        setField(term2674110, term2674110.getClass(), "cachedLocale", term2674144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.logging.Level");
        Object[] args = new Object[1];
        args[0] = term336504;
        callMethod(klass, "setLoggingLevel", argTypes, null, args);
        assertTrue(recursiveEquals(term336504, term2674110));
    }

};


