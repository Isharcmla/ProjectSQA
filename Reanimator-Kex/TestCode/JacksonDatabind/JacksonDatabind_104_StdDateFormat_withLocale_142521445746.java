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

public class StdDateFormat_withLocale_142521445746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term677;

    public StdDateFormat_withLocale_142521445746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term677 = newInstance(Class.forName("java.util.Locale"));
        Object term678 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term678, term678.getClass(), "language", "ee");
        setField(term678, term678.getClass(), "script", "");
        setField(term678, term678.getClass(), "region", "GH");
        setField(term678, term678.getClass(), "variant", "");
        setIntField(term678, term678.getClass(), "hash", 96354975);
        setField(term677, term677.getClass(), "baseLocale", term678);
        setField(term677, term677.getClass(), "localeExtensions", null);
        setIntField(term677, term677.getClass(), "hashCodeValue", 96354975);
        setField(term677, term677.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = term677;
        try {
            callMethod(klass, "withLocale", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


