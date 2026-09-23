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

public class StdDateFormat_cloneFormat_63753880025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1756;
     Object term1777;
     Object term1793;

    public StdDateFormat_cloneFormat_63753880025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1756 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term1756, term1756.getClass(), "rawOffset", -25200000);
        setIntField(term1756, term1756.getClass(), "rawOffsetDiff", 0);
        setIntField(term1756, term1756.getClass(), "checksum", 0);
        setIntField(term1756, term1756.getClass(), "dstSavings", 0);
        setField(term1756, term1756.getClass(), "transitions", null);
        setField(term1756, term1756.getClass(), "offsets", null);
        setField(term1756, term1756.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1756, term1756.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1756, term1756.getClass(), "dirty", false);
        setField(term1756, term1756.getClass(), "lastRule", null);
        setField(term1756, term1756.getClass(), "ID", "SystemV/MST7");
        setField(term1756, term1756.getClass(), "zoneId", null);
        term1777 = newInstance(Class.forName("java.util.Locale"));
        Object term1778 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1778, term1778.getClass(), "language", "en");
        setField(term1778, term1778.getClass(), "script", "");
        setField(term1778, term1778.getClass(), "region", "GU");
        setField(term1778, term1778.getClass(), "variant", "");
        setIntField(term1778, term1778.getClass(), "hash", 96623497);
        setField(term1777, term1777.getClass(), "baseLocale", term1778);
        setField(term1777, term1777.getClass(), "localeExtensions", null);
        setIntField(term1777, term1777.getClass(), "hashCodeValue", 96623497);
        setField(term1777, term1777.getClass(), "languageTag", null);
        term1793 = new Boolean(false);
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
        args[1] = "hRNSzYYIrc";
        args[2] = term1756;
        args[3] = term1777;
        args[4] = term1793;
        callMethod(klass, "_cloneFormat", argTypes, null, args);
    }

};


