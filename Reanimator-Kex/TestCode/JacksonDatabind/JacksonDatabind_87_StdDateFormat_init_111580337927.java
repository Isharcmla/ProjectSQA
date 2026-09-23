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

public class StdDateFormat_init_111580337927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1845;

    public StdDateFormat_init_111580337927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1845 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Object term1846 = newInstance(Class.forName("java.util.Locale"));
        Object term1847 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1845, term1845.getClass(), "_timezone", null);
        setField(term1847, term1847.getClass(), "language", "en");
        setField(term1847, term1847.getClass(), "script", "");
        setField(term1847, term1847.getClass(), "region", "US");
        setField(term1847, term1847.getClass(), "variant", "");
        setIntField(term1847, term1847.getClass(), "hash", 96636889);
        setField(term1846, term1846.getClass(), "baseLocale", term1847);
        setField(term1846, term1846.getClass(), "localeExtensions", null);
        setIntField(term1846, term1846.getClass(), "hashCodeValue", 96636889);
        setField(term1846, term1846.getClass(), "languageTag", "en-US");
        setField(term1845, term1845.getClass(), "_locale", term1846);
        setField(term1845, term1845.getClass(), "_lenient", null);
        setField(term1845, term1845.getClass(), "_formatRFC1123", null);
        setField(term1845, term1845.getClass(), "_formatISO8601", null);
        setField(term1845, term1845.getClass(), "_formatISO8601_z", null);
        setField(term1845, term1845.getClass(), "_formatPlain", null);
        setField(term1845, term1845.getClass(), "calendar", null);
        setField(term1845, term1845.getClass(), "numberFormat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1845));
    }

};


