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
     Object term1083;
     Object term1096;

    public StdDateFormat_getRFC1123Format_164964254311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1083 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term1083, term1083.getClass(), "rawOffset", 0);
        setIntField(term1083, term1083.getClass(), "rawOffsetDiff", 0);
        setIntField(term1083, term1083.getClass(), "checksum", 0);
        setIntField(term1083, term1083.getClass(), "dstSavings", 0);
        setField(term1083, term1083.getClass(), "transitions", null);
        setField(term1083, term1083.getClass(), "offsets", null);
        setField(term1083, term1083.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1083, term1083.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1083, term1083.getClass(), "dirty", false);
        setField(term1083, term1083.getClass(), "lastRule", null);
        setField(term1083, term1083.getClass(), "ID", "Zulu");
        setField(term1083, term1083.getClass(), "zoneId", null);
        term1096 = newInstance(Class.forName("java.util.Locale"));
        Object term1097 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1097, term1097.getClass(), "language", "en");
        setField(term1097, term1097.getClass(), "script", "");
        setField(term1097, term1097.getClass(), "region", "GU");
        setField(term1097, term1097.getClass(), "variant", "");
        setIntField(term1097, term1097.getClass(), "hash", 96623497);
        setField(term1096, term1096.getClass(), "baseLocale", term1097);
        setField(term1096, term1096.getClass(), "localeExtensions", null);
        setIntField(term1096, term1096.getClass(), "hashCodeValue", 96623497);
        setField(term1096, term1096.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.TimeZone");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = term1083;
        args[1] = term1096;
        callMethod(klass, "getRFC1123Format", argTypes, null, args);
    }

};


