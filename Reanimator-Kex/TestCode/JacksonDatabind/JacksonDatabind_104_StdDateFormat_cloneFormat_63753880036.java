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
import java.lang.Boolean;

public class StdDateFormat_cloneFormat_63753880036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2143;
     Object term2164;
     Object term2180;

    public StdDateFormat_cloneFormat_63753880036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2143 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term2143, term2143.getClass(), "rawOffset", -25200000);
        setIntField(term2143, term2143.getClass(), "rawOffsetDiff", 0);
        setIntField(term2143, term2143.getClass(), "checksum", 0);
        setIntField(term2143, term2143.getClass(), "dstSavings", 0);
        setField(term2143, term2143.getClass(), "transitions", null);
        setField(term2143, term2143.getClass(), "offsets", null);
        setField(term2143, term2143.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term2143, term2143.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term2143, term2143.getClass(), "dirty", false);
        setField(term2143, term2143.getClass(), "lastRule", null);
        setField(term2143, term2143.getClass(), "ID", "SystemV/MST7");
        setField(term2143, term2143.getClass(), "zoneId", null);
        term2164 = newInstance(Class.forName("java.util.Locale"));
        Object term2165 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2165, term2165.getClass(), "language", "fr");
        setField(term2165, term2165.getClass(), "script", "");
        setField(term2165, term2165.getClass(), "region", "CI");
        setField(term2165, term2165.getClass(), "variant", "");
        setIntField(term2165, term2165.getClass(), "hash", 97661966);
        setField(term2164, term2164.getClass(), "baseLocale", term2165);
        setField(term2164, term2164.getClass(), "localeExtensions", null);
        setIntField(term2164, term2164.getClass(), "hashCodeValue", 97661966);
        setField(term2164, term2164.getClass(), "languageTag", null);
        term2180 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.text.DateFormat");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.TimeZone");
        argTypes[3] = Class.forName("java.util.Locale");
        argTypes[4] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = "ZiaGIbnzTs";
        args[2] = term2143;
        args[3] = term2164;
        args[4] = term2180;
        callMethod(klass, "_cloneFormat", argTypes, null, args);
    }

};


