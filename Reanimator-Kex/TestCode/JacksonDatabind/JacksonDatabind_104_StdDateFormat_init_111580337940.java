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
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.util.EqualityUtils.*;
import java.lang.Object;

public class StdDateFormat_init_111580337940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2563;

    public StdDateFormat_init_111580337940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2563 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Object term2564 = newInstance(Class.forName("java.util.Locale"));
        Object term2565 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2563, term2563.getClass(), "_timezone", null);
        setField(term2565, term2565.getClass(), "language", "en");
        setField(term2565, term2565.getClass(), "script", "");
        setField(term2565, term2565.getClass(), "region", "US");
        setField(term2565, term2565.getClass(), "variant", "");
        setIntField(term2565, term2565.getClass(), "hash", 96636889);
        setField(term2564, term2564.getClass(), "baseLocale", term2565);
        setField(term2564, term2564.getClass(), "localeExtensions", null);
        setIntField(term2564, term2564.getClass(), "hashCodeValue", 96636889);
        setField(term2564, term2564.getClass(), "languageTag", "en-US");
        setField(term2563, term2563.getClass(), "_locale", term2564);
        setField(term2563, term2563.getClass(), "_lenient", null);
        setField(term2563, term2563.getClass(), "_calendar", null);
        setField(term2563, term2563.getClass(), "_formatRFC1123", null);
        setBooleanField(term2563, term2563.getClass(), "_tzSerializedWithColon", false);
        setField(term2563, term2563.getClass(), "calendar", null);
        setField(term2563, term2563.getClass(), "numberFormat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2563));
    }

};


