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

public class Compiler_setLoggingLevel_1336108812120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490288;

    public Compiler_setLoggingLevel_1336108812120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term490288 = newInstance(Class.forName("java.util.logging.Level"));
        Object term490326 = newInstance(Class.forName("java.util.Locale"));
        Object term490327 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term490288, term490288.getClass(), "name", "oKzUOrAFFo");
        setIntField(term490288, term490288.getClass(), "value", 575249858);
        setField(term490288, term490288.getClass(), "resourceBundleName", "cShhTkvRUF");
        setField(term490288, term490288.getClass(), "localizedLevelName", "qgiseKtoqu");
        setField(term490327, term490327.getClass(), "language", "kab");
        setField(term490327, term490327.getClass(), "script", "");
        setField(term490327, term490327.getClass(), "region", "");
        setField(term490327, term490327.getClass(), "variant", "");
        setIntField(term490327, term490327.getClass(), "hash", -1139147084);
        setField(term490326, term490326.getClass(), "baseLocale", term490327);
        setField(term490326, term490326.getClass(), "localeExtensions", null);
        setIntField(term490326, term490326.getClass(), "hashCodeValue", -1139147084);
        setField(term490326, term490326.getClass(), "languageTag", null);
        setField(term490288, term490288.getClass(), "cachedLocale", term490326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.logging.Level");
        Object[] args = new Object[1];
        args[0] = term490288;
        callMethod(klass, "setLoggingLevel", argTypes, null, args);
    }

};


