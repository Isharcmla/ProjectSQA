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

public class Compiler_setLoggingLevel_1336108812126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term517155;

    public Compiler_setLoggingLevel_1336108812126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term517155 = newInstance(Class.forName("java.util.logging.Level"));
        Object term517193 = newInstance(Class.forName("java.util.Locale"));
        Object term517194 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term517155, term517155.getClass(), "name", "FJPRnSrJmK");
        setIntField(term517155, term517155.getClass(), "value", -524352937);
        setField(term517155, term517155.getClass(), "resourceBundleName", "fYRcUEKErh");
        setField(term517155, term517155.getClass(), "localizedLevelName", "ObBNcwkdKb");
        setField(term517194, term517194.getClass(), "language", "kab");
        setField(term517194, term517194.getClass(), "script", "");
        setField(term517194, term517194.getClass(), "region", "");
        setField(term517194, term517194.getClass(), "variant", "");
        setIntField(term517194, term517194.getClass(), "hash", -1139147084);
        setField(term517193, term517193.getClass(), "baseLocale", term517194);
        setField(term517193, term517193.getClass(), "localeExtensions", null);
        setIntField(term517193, term517193.getClass(), "hashCodeValue", -1139147084);
        setField(term517193, term517193.getClass(), "languageTag", null);
        setField(term517155, term517155.getClass(), "cachedLocale", term517193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.logging.Level");
        Object[] args = new Object[1];
        args[0] = term517155;
        callMethod(klass, "setLoggingLevel", argTypes, null, args);
    }

};


