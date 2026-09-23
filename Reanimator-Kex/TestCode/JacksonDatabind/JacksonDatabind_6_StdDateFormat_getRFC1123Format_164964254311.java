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
import java.lang.Object;

public class StdDateFormat_getRFC1123Format_164964254311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1031;
     Object term1044;

    public StdDateFormat_getRFC1123Format_164964254311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1031 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term1031, term1031.getClass(), "rawOffset", 0);
        setIntField(term1031, term1031.getClass(), "rawOffsetDiff", 0);
        setIntField(term1031, term1031.getClass(), "checksum", 0);
        setIntField(term1031, term1031.getClass(), "dstSavings", 0);
        setField(term1031, term1031.getClass(), "transitions", null);
        setField(term1031, term1031.getClass(), "offsets", null);
        setField(term1031, term1031.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1031, term1031.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1031, term1031.getClass(), "dirty", false);
        setField(term1031, term1031.getClass(), "lastRule", null);
        setField(term1031, term1031.getClass(), "ID", "Zulu");
        setField(term1031, term1031.getClass(), "zoneId", null);
        term1044 = newInstance(Class.forName("java.util.Locale"));
        Object term1045 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1045, term1045.getClass(), "language", "ee");
        setField(term1045, term1045.getClass(), "script", "");
        setField(term1045, term1045.getClass(), "region", "GH");
        setField(term1045, term1045.getClass(), "variant", "");
        setIntField(term1045, term1045.getClass(), "hash", 96354975);
        setField(term1044, term1044.getClass(), "baseLocale", term1045);
        setField(term1044, term1044.getClass(), "localeExtensions", null);
        setIntField(term1044, term1044.getClass(), "hashCodeValue", 96354975);
        setField(term1044, term1044.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.TimeZone");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = term1031;
        args[1] = term1044;
        callMethod(klass, "getRFC1123Format", argTypes, null, args);
    }

};


