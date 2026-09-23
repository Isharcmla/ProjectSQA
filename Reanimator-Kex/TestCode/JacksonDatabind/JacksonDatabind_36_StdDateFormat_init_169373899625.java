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

public class StdDateFormat_init_169373899625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term19;
     Object term1899;
     Object term1913;
     Object term1916;

    public StdDateFormat_init_169373899625() {
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
        term1899 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Object term1900 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        Object term1903 = newInstance(Class.forName("java.util.Locale"));
        Object term1904 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setIntField(term1900, term1900.getClass(), "rawOffset", 18000000);
        setIntField(term1900, term1900.getClass(), "rawOffsetDiff", 0);
        setIntField(term1900, term1900.getClass(), "checksum", 0);
        setIntField(term1900, term1900.getClass(), "dstSavings", 0);
        setField(term1900, term1900.getClass(), "transitions", null);
        setField(term1900, term1900.getClass(), "offsets", null);
        setField(term1900, term1900.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1900, term1900.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1900, term1900.getClass(), "dirty", false);
        setField(term1900, term1900.getClass(), "lastRule", null);
        setField(term1900, term1900.getClass(), "ID", "Etc/GMT-5");
        setField(term1900, term1900.getClass(), "zoneId", null);
        setField(term1899, term1899.getClass(), "_timezone", term1900);
        setField(term1904, term1904.getClass(), "language", "pt");
        setField(term1904, term1904.getClass(), "script", "");
        setField(term1904, term1904.getClass(), "region", "MO");
        setField(term1904, term1904.getClass(), "variant", "");
        setIntField(term1904, term1904.getClass(), "hash", 106966554);
        setField(term1903, term1903.getClass(), "baseLocale", term1904);
        setField(term1903, term1903.getClass(), "localeExtensions", null);
        setIntField(term1903, term1903.getClass(), "hashCodeValue", 106966554);
        setField(term1903, term1903.getClass(), "languageTag", null);
        setField(term1899, term1899.getClass(), "_locale", term1903);
        setField(term1899, term1899.getClass(), "_lenient", null);
        setField(term1899, term1899.getClass(), "_formatRFC1123", null);
        setField(term1899, term1899.getClass(), "_formatISO8601", null);
        setField(term1899, term1899.getClass(), "_formatISO8601_z", null);
        setField(term1899, term1899.getClass(), "_formatPlain", null);
        setField(term1899, term1899.getClass(), "calendar", null);
        setField(term1899, term1899.getClass(), "numberFormat", null);
        term1913 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term1913, term1913.getClass(), "rawOffset", 18000000);
        setIntField(term1913, term1913.getClass(), "rawOffsetDiff", 0);
        setIntField(term1913, term1913.getClass(), "checksum", 0);
        setIntField(term1913, term1913.getClass(), "dstSavings", 0);
        setField(term1913, term1913.getClass(), "transitions", null);
        setField(term1913, term1913.getClass(), "offsets", null);
        setField(term1913, term1913.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1913, term1913.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1913, term1913.getClass(), "dirty", false);
        setField(term1913, term1913.getClass(), "lastRule", null);
        setField(term1913, term1913.getClass(), "ID", "Etc/GMT-5");
        setField(term1913, term1913.getClass(), "zoneId", null);
        term1916 = newInstance(Class.forName("java.util.Locale"));
        Object term1917 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1917, term1917.getClass(), "language", "pt");
        setField(term1917, term1917.getClass(), "script", "");
        setField(term1917, term1917.getClass(), "region", "MO");
        setField(term1917, term1917.getClass(), "variant", "");
        setIntField(term1917, term1917.getClass(), "hash", 106966554);
        setField(term1916, term1916.getClass(), "baseLocale", term1917);
        setField(term1916, term1916.getClass(), "localeExtensions", null);
        setIntField(term1916, term1916.getClass(), "hashCodeValue", 106966554);
        setField(term1916, term1916.getClass(), "languageTag", null);
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
        assertTrue(recursiveEquals(instance, term1899));
        assertTrue(recursiveEquals(term1, term1913));
        assertTrue(recursiveEquals(term19, term1916));
    }

};


