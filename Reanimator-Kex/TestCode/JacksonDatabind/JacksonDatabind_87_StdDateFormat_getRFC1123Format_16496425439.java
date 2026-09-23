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

public class StdDateFormat_getRFC1123Format_16496425439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1053;
     Object term1066;

    public StdDateFormat_getRFC1123Format_16496425439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1053 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term1053, term1053.getClass(), "rawOffset", 0);
        setIntField(term1053, term1053.getClass(), "rawOffsetDiff", 0);
        setIntField(term1053, term1053.getClass(), "checksum", 0);
        setIntField(term1053, term1053.getClass(), "dstSavings", 0);
        setField(term1053, term1053.getClass(), "transitions", null);
        setField(term1053, term1053.getClass(), "offsets", null);
        setField(term1053, term1053.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1053, term1053.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1053, term1053.getClass(), "dirty", false);
        setField(term1053, term1053.getClass(), "lastRule", null);
        setField(term1053, term1053.getClass(), "ID", "Zulu");
        setField(term1053, term1053.getClass(), "zoneId", null);
        term1066 = newInstance(Class.forName("java.util.Locale"));
        Object term1067 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1067, term1067.getClass(), "language", "chr");
        setField(term1067, term1067.getClass(), "script", "");
        setField(term1067, term1067.getClass(), "region", "US");
        setField(term1067, term1067.getClass(), "variant", "");
        setIntField(term1067, term1067.getClass(), "hash", -1361154731);
        setField(term1066, term1066.getClass(), "baseLocale", term1067);
        setField(term1066, term1066.getClass(), "localeExtensions", null);
        setIntField(term1066, term1066.getClass(), "hashCodeValue", -1361154731);
        setField(term1066, term1066.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.TimeZone");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = term1053;
        args[1] = term1066;
        callMethod(klass, "getRFC1123Format", argTypes, null, args);
    }

};


