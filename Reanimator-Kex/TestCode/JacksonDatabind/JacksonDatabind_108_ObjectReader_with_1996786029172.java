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

public class ObjectReader_with_1996786029172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;

    public ObjectReader_with_1996786029172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = newInstance(Class.forName("java.util.Locale"));
        Object term60 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term60, term60.getClass(), "language", "pt");
        setField(term60, term60.getClass(), "script", "");
        setField(term60, term60.getClass(), "region", "MO");
        setField(term60, term60.getClass(), "variant", "");
        setIntField(term60, term60.getClass(), "hash", 106966554);
        setField(term59, term59.getClass(), "baseLocale", term60);
        setField(term59, term59.getClass(), "localeExtensions", null);
        setIntField(term59, term59.getClass(), "hashCodeValue", 106966554);
        setField(term59, term59.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = term59;
        try {
            callMethod(klass, "with", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


