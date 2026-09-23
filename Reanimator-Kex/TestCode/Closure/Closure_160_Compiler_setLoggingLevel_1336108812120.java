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
     Object term480271;

    public Compiler_setLoggingLevel_1336108812120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term480271 = newInstance(Class.forName("java.util.logging.Level"));
        Object term480309 = newInstance(Class.forName("java.util.Locale"));
        Object term480310 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term480271, term480271.getClass(), "name", "oKzUOrAFFo");
        setIntField(term480271, term480271.getClass(), "value", 575249858);
        setField(term480271, term480271.getClass(), "resourceBundleName", "cShhTkvRUF");
        setField(term480271, term480271.getClass(), "localizedLevelName", "qgiseKtoqu");
        setField(term480310, term480310.getClass(), "language", "kab");
        setField(term480310, term480310.getClass(), "script", "");
        setField(term480310, term480310.getClass(), "region", "");
        setField(term480310, term480310.getClass(), "variant", "");
        setIntField(term480310, term480310.getClass(), "hash", -1139147084);
        setField(term480309, term480309.getClass(), "baseLocale", term480310);
        setField(term480309, term480309.getClass(), "localeExtensions", null);
        setIntField(term480309, term480309.getClass(), "hashCodeValue", -1139147084);
        setField(term480309, term480309.getClass(), "languageTag", null);
        setField(term480271, term480271.getClass(), "cachedLocale", term480309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.logging.Level");
        Object[] args = new Object[1];
        args[0] = term480271;
        callMethod(klass, "setLoggingLevel", argTypes, null, args);
    }

};


