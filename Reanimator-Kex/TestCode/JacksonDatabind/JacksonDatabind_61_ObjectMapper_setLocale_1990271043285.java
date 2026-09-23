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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ObjectMapper_setLocale_1990271043285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;

    public ObjectMapper_setLocale_1990271043285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = newInstance(Class.forName("java.util.Locale"));
        Object term46 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term46, term46.getClass(), "language", "pt");
        setField(term46, term46.getClass(), "script", "");
        setField(term46, term46.getClass(), "region", "MO");
        setField(term46, term46.getClass(), "variant", "");
        setIntField(term46, term46.getClass(), "hash", 106966554);
        setField(term45, term45.getClass(), "baseLocale", term46);
        setField(term45, term45.getClass(), "localeExtensions", null);
        setIntField(term45, term45.getClass(), "hashCodeValue", 106966554);
        setField(term45, term45.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = term45;
        try {
            callMethod(klass, "setLocale", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


