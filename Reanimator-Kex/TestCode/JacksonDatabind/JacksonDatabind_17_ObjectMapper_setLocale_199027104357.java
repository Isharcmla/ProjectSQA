package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ObjectMapper_setLocale_199027104357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;

    public ObjectMapper_setLocale_199027104357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35 = newInstance(Class.forName("java.util.Locale"));
        Object term36 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term36, term36.getClass(), "language", "pt");
        setField(term36, term36.getClass(), "script", "");
        setField(term36, term36.getClass(), "region", "MO");
        setField(term36, term36.getClass(), "variant", "");
        setIntField(term36, term36.getClass(), "hash", 106966554);
        setField(term35, term35.getClass(), "baseLocale", term36);
        setField(term35, term35.getClass(), "localeExtensions", null);
        setIntField(term35, term35.getClass(), "hashCodeValue", 106966554);
        setField(term35, term35.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = term35;
        callMethod(klass, "setLocale", argTypes, null, args);
    }

};


