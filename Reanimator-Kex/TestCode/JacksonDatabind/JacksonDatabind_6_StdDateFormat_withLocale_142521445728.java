package com.fasterxml.jackson.databind.util;

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
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StdDateFormat_withLocale_142521445728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452;

    public StdDateFormat_withLocale_142521445728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term452 = newInstance(Class.forName("java.util.Locale"));
        Object term453 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term453, term453.getClass(), "language", "ps");
        setField(term453, term453.getClass(), "script", "");
        setField(term453, term453.getClass(), "region", "");
        setField(term453, term453.getClass(), "variant", "");
        setIntField(term453, term453.getClass(), "hash", 106860317);
        setField(term452, term452.getClass(), "baseLocale", term453);
        setField(term452, term452.getClass(), "localeExtensions", null);
        setIntField(term452, term452.getClass(), "hashCodeValue", 106860317);
        setField(term452, term452.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = term452;
        try {
            callMethod(klass, "withLocale", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


