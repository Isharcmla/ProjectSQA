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

public class ObjectReader_with_1996786029164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37;

    public ObjectReader_with_1996786029164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37 = newInstance(Class.forName("java.util.Locale"));
        Object term38 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term38, term38.getClass(), "language", "pt");
        setField(term38, term38.getClass(), "script", "");
        setField(term38, term38.getClass(), "region", "MO");
        setField(term38, term38.getClass(), "variant", "");
        setIntField(term38, term38.getClass(), "hash", 106966554);
        setField(term37, term37.getClass(), "baseLocale", term38);
        setField(term37, term37.getClass(), "localeExtensions", null);
        setIntField(term37, term37.getClass(), "hashCodeValue", 106966554);
        setField(term37, term37.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = term37;
        try {
            callMethod(klass, "with", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


