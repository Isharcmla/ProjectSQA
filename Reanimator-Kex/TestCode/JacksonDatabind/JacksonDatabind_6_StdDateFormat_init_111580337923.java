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

public class StdDateFormat_init_111580337923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1816;

    public StdDateFormat_init_111580337923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1816 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Object term1817 = newInstance(Class.forName("java.util.Locale"));
        Object term1818 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1816, term1816.getClass(), "_timezone", null);
        setField(term1818, term1818.getClass(), "language", "en");
        setField(term1818, term1818.getClass(), "script", "");
        setField(term1818, term1818.getClass(), "region", "US");
        setField(term1818, term1818.getClass(), "variant", "");
        setIntField(term1818, term1818.getClass(), "hash", 96636889);
        setField(term1817, term1817.getClass(), "baseLocale", term1818);
        setField(term1817, term1817.getClass(), "localeExtensions", null);
        setIntField(term1817, term1817.getClass(), "hashCodeValue", 96636889);
        setField(term1817, term1817.getClass(), "languageTag", "en-US");
        setField(term1816, term1816.getClass(), "_locale", term1817);
        setField(term1816, term1816.getClass(), "_formatRFC1123", null);
        setField(term1816, term1816.getClass(), "_formatISO8601", null);
        setField(term1816, term1816.getClass(), "_formatISO8601_z", null);
        setField(term1816, term1816.getClass(), "_formatPlain", null);
        setField(term1816, term1816.getClass(), "calendar", null);
        setField(term1816, term1816.getClass(), "numberFormat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1816));
    }

};


