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

public class Compiler_setLoggingLevel_1336108812122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489582;

    public Compiler_setLoggingLevel_1336108812122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489582 = newInstance(Class.forName("java.util.logging.Level"));
        Object term489620 = newInstance(Class.forName("java.util.Locale"));
        Object term489621 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term489582, term489582.getClass(), "name", "OgjHGtEkHS");
        setIntField(term489582, term489582.getClass(), "value", 241741655);
        setField(term489582, term489582.getClass(), "resourceBundleName", "kBvfWdWmdw");
        setField(term489582, term489582.getClass(), "localizedLevelName", "aBlTeZjrLS");
        setField(term489621, term489621.getClass(), "language", "kab");
        setField(term489621, term489621.getClass(), "script", "");
        setField(term489621, term489621.getClass(), "region", "");
        setField(term489621, term489621.getClass(), "variant", "");
        setIntField(term489621, term489621.getClass(), "hash", -1139147084);
        setField(term489620, term489620.getClass(), "baseLocale", term489621);
        setField(term489620, term489620.getClass(), "localeExtensions", null);
        setIntField(term489620, term489620.getClass(), "hashCodeValue", -1139147084);
        setField(term489620, term489620.getClass(), "languageTag", null);
        setField(term489582, term489582.getClass(), "cachedLocale", term489620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.logging.Level");
        Object[] args = new Object[1];
        args[0] = term489582;
        callMethod(klass, "setLoggingLevel", argTypes, null, args);
    }

};


