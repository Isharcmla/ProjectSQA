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

public class StdDateFormat_init_53819938224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term1903;
     Object term1919;

    public StdDateFormat_init_53819938224() {
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
        term1903 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Object term1904 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        Object term1907 = newInstance(Class.forName("java.util.Locale"));
        Object term1908 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setIntField(term1904, term1904.getClass(), "rawOffset", 18000000);
        setIntField(term1904, term1904.getClass(), "rawOffsetDiff", 0);
        setIntField(term1904, term1904.getClass(), "checksum", 0);
        setIntField(term1904, term1904.getClass(), "dstSavings", 0);
        setField(term1904, term1904.getClass(), "transitions", null);
        setField(term1904, term1904.getClass(), "offsets", null);
        setField(term1904, term1904.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1904, term1904.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1904, term1904.getClass(), "dirty", false);
        setField(term1904, term1904.getClass(), "lastRule", null);
        setField(term1904, term1904.getClass(), "ID", "Etc/GMT-5");
        setField(term1904, term1904.getClass(), "zoneId", null);
        setField(term1903, term1903.getClass(), "_timezone", term1904);
        setField(term1908, term1908.getClass(), "language", "en");
        setField(term1908, term1908.getClass(), "script", "");
        setField(term1908, term1908.getClass(), "region", "US");
        setField(term1908, term1908.getClass(), "variant", "");
        setIntField(term1908, term1908.getClass(), "hash", 96636889);
        setField(term1907, term1907.getClass(), "baseLocale", term1908);
        setField(term1907, term1907.getClass(), "localeExtensions", null);
        setIntField(term1907, term1907.getClass(), "hashCodeValue", 96636889);
        setField(term1907, term1907.getClass(), "languageTag", "en-US");
        setField(term1903, term1903.getClass(), "_locale", term1907);
        setField(term1903, term1903.getClass(), "_formatRFC1123", null);
        setField(term1903, term1903.getClass(), "_formatISO8601", null);
        setField(term1903, term1903.getClass(), "_formatISO8601_z", null);
        setField(term1903, term1903.getClass(), "_formatPlain", null);
        setField(term1903, term1903.getClass(), "calendar", null);
        setField(term1903, term1903.getClass(), "numberFormat", null);
        term1919 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term1919, term1919.getClass(), "rawOffset", 18000000);
        setIntField(term1919, term1919.getClass(), "rawOffsetDiff", 0);
        setIntField(term1919, term1919.getClass(), "checksum", 0);
        setIntField(term1919, term1919.getClass(), "dstSavings", 0);
        setField(term1919, term1919.getClass(), "transitions", null);
        setField(term1919, term1919.getClass(), "offsets", null);
        setField(term1919, term1919.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1919, term1919.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1919, term1919.getClass(), "dirty", false);
        setField(term1919, term1919.getClass(), "lastRule", null);
        setField(term1919, term1919.getClass(), "ID", "Etc/GMT-5");
        setField(term1919, term1919.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1903));
        assertTrue(recursiveEquals(term1, term1919));
    }

};


