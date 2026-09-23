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
import java.lang.Object;

public class Compiler_setLoggingLevel_1336108812129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530562;

    public Compiler_setLoggingLevel_1336108812129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530562 = newInstance(Class.forName("java.util.logging.Level"));
        Object term530600 = newInstance(Class.forName("java.util.Locale"));
        Object term530601 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term530562, term530562.getClass(), "name", "PsuOGjzsiR");
        setIntField(term530562, term530562.getClass(), "value", 2077491675);
        setField(term530562, term530562.getClass(), "resourceBundleName", "KMtZBUgxHg");
        setField(term530562, term530562.getClass(), "localizedLevelName", "HOgLdEUbNT");
        setField(term530601, term530601.getClass(), "language", "kab");
        setField(term530601, term530601.getClass(), "script", "");
        setField(term530601, term530601.getClass(), "region", "");
        setField(term530601, term530601.getClass(), "variant", "");
        setIntField(term530601, term530601.getClass(), "hash", -1139147084);
        setField(term530600, term530600.getClass(), "baseLocale", term530601);
        setField(term530600, term530600.getClass(), "localeExtensions", null);
        setIntField(term530600, term530600.getClass(), "hashCodeValue", -1139147084);
        setField(term530600, term530600.getClass(), "languageTag", null);
        setField(term530562, term530562.getClass(), "cachedLocale", term530600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.logging.Level");
        Object[] args = new Object[1];
        args[0] = term530562;
        callMethod(klass, "setLoggingLevel", argTypes, null, args);
    }

};


