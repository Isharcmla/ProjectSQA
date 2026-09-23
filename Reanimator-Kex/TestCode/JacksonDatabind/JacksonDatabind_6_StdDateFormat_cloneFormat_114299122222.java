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

public class StdDateFormat_cloneFormat_114299122222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1727;
     Object term1748;

    public StdDateFormat_cloneFormat_114299122222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1727 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term1727, term1727.getClass(), "rawOffset", -25200000);
        setIntField(term1727, term1727.getClass(), "rawOffsetDiff", 0);
        setIntField(term1727, term1727.getClass(), "checksum", 0);
        setIntField(term1727, term1727.getClass(), "dstSavings", 0);
        setField(term1727, term1727.getClass(), "transitions", null);
        setField(term1727, term1727.getClass(), "offsets", null);
        setField(term1727, term1727.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1727, term1727.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1727, term1727.getClass(), "dirty", false);
        setField(term1727, term1727.getClass(), "lastRule", null);
        setField(term1727, term1727.getClass(), "ID", "SystemV/MST7");
        setField(term1727, term1727.getClass(), "zoneId", null);
        term1748 = newInstance(Class.forName("java.util.Locale"));
        Object term1749 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1749, term1749.getClass(), "language", "chr");
        setField(term1749, term1749.getClass(), "script", "");
        setField(term1749, term1749.getClass(), "region", "US");
        setField(term1749, term1749.getClass(), "variant", "");
        setIntField(term1749, term1749.getClass(), "hash", -1361154731);
        setField(term1748, term1748.getClass(), "baseLocale", term1749);
        setField(term1748, term1748.getClass(), "localeExtensions", null);
        setIntField(term1748, term1748.getClass(), "hashCodeValue", -1361154731);
        setField(term1748, term1748.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.text.DateFormat");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.TimeZone");
        argTypes[3] = Class.forName("java.util.Locale");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "hRNSzYYIrc";
        args[2] = term1727;
        args[3] = term1748;
        callMethod(klass, "_cloneFormat", argTypes, null, args);
    }

};


