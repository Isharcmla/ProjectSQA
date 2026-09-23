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

public class StdDateFormat_init_169373899628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term19;
     Object term1902;
     Object term1916;
     Object term1919;

    public StdDateFormat_init_169373899628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term1, term1.getClass(), "rawOffset", 18000000);
        setIntField(term1, term1.getClass(), "rawOffsetDiff", 0);
        setIntField(term1, term1.getClass(), "checksum", 0);
        setIntField(term1, term1.getClass(), "dstSavings", 0);
        setField(term1, term1.getClass(), "transitions", null);
        setField(term1, term1.getClass(), "offsets", null);
        setField(term1, term1.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1, term1.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1, term1.getClass(), "dirty", false);
        setField(term1, term1.getClass(), "lastRule", null);
        setField(term1, term1.getClass(), "ID", "Etc/GMT-5");
        setField(term1, term1.getClass(), "zoneId", null);
        term19 = newInstance(Class.forName("java.util.Locale"));
        Object term20 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term20, term20.getClass(), "language", "pt");
        setField(term20, term20.getClass(), "script", "");
        setField(term20, term20.getClass(), "region", "MO");
        setField(term20, term20.getClass(), "variant", "");
        setIntField(term20, term20.getClass(), "hash", 106966554);
        setField(term19, term19.getClass(), "baseLocale", term20);
        setField(term19, term19.getClass(), "localeExtensions", null);
        setIntField(term19, term19.getClass(), "hashCodeValue", 106966554);
        setField(term19, term19.getClass(), "languageTag", null);
        term1902 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Object term1903 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        Object term1906 = newInstance(Class.forName("java.util.Locale"));
        Object term1907 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setIntField(term1903, term1903.getClass(), "rawOffset", 18000000);
        setIntField(term1903, term1903.getClass(), "rawOffsetDiff", 0);
        setIntField(term1903, term1903.getClass(), "checksum", 0);
        setIntField(term1903, term1903.getClass(), "dstSavings", 0);
        setField(term1903, term1903.getClass(), "transitions", null);
        setField(term1903, term1903.getClass(), "offsets", null);
        setField(term1903, term1903.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1903, term1903.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1903, term1903.getClass(), "dirty", false);
        setField(term1903, term1903.getClass(), "lastRule", null);
        setField(term1903, term1903.getClass(), "ID", "Etc/GMT-5");
        setField(term1903, term1903.getClass(), "zoneId", null);
        setField(term1902, term1902.getClass(), "_timezone", term1903);
        setField(term1907, term1907.getClass(), "language", "pt");
        setField(term1907, term1907.getClass(), "script", "");
        setField(term1907, term1907.getClass(), "region", "MO");
        setField(term1907, term1907.getClass(), "variant", "");
        setIntField(term1907, term1907.getClass(), "hash", 106966554);
        setField(term1906, term1906.getClass(), "baseLocale", term1907);
        setField(term1906, term1906.getClass(), "localeExtensions", null);
        setIntField(term1906, term1906.getClass(), "hashCodeValue", 106966554);
        setField(term1906, term1906.getClass(), "languageTag", null);
        setField(term1902, term1902.getClass(), "_locale", term1906);
        setField(term1902, term1902.getClass(), "_lenient", null);
        setField(term1902, term1902.getClass(), "_formatRFC1123", null);
        setField(term1902, term1902.getClass(), "_formatISO8601", null);
        setField(term1902, term1902.getClass(), "_formatISO8601_z", null);
        setField(term1902, term1902.getClass(), "_formatPlain", null);
        setField(term1902, term1902.getClass(), "calendar", null);
        setField(term1902, term1902.getClass(), "numberFormat", null);
        term1916 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term1916, term1916.getClass(), "rawOffset", 18000000);
        setIntField(term1916, term1916.getClass(), "rawOffsetDiff", 0);
        setIntField(term1916, term1916.getClass(), "checksum", 0);
        setIntField(term1916, term1916.getClass(), "dstSavings", 0);
        setField(term1916, term1916.getClass(), "transitions", null);
        setField(term1916, term1916.getClass(), "offsets", null);
        setField(term1916, term1916.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1916, term1916.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1916, term1916.getClass(), "dirty", false);
        setField(term1916, term1916.getClass(), "lastRule", null);
        setField(term1916, term1916.getClass(), "ID", "Etc/GMT-5");
        setField(term1916, term1916.getClass(), "zoneId", null);
        term1919 = newInstance(Class.forName("java.util.Locale"));
        Object term1920 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1920, term1920.getClass(), "language", "pt");
        setField(term1920, term1920.getClass(), "script", "");
        setField(term1920, term1920.getClass(), "region", "MO");
        setField(term1920, term1920.getClass(), "variant", "");
        setIntField(term1920, term1920.getClass(), "hash", 106966554);
        setField(term1919, term1919.getClass(), "baseLocale", term1920);
        setField(term1919, term1919.getClass(), "localeExtensions", null);
        setIntField(term1919, term1919.getClass(), "hashCodeValue", 106966554);
        setField(term1919, term1919.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.TimeZone");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term19;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1902));
        assertTrue(recursiveEquals(term1, term1916));
        assertTrue(recursiveEquals(term19, term1919));
    }

};


