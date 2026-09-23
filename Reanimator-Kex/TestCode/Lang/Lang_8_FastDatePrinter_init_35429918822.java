package org.apache.commons.lang3.time;

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
import java.lang.IllegalArgumentException;
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FastDatePrinter_init_35429918822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term31;

    public FastDatePrinter_init_35429918822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term13, term13.getClass(), "rawOffset", 18000000);
        setIntField(term13, term13.getClass(), "rawOffsetDiff", 0);
        setIntField(term13, term13.getClass(), "checksum", 0);
        setIntField(term13, term13.getClass(), "dstSavings", 0);
        setField(term13, term13.getClass(), "transitions", null);
        setField(term13, term13.getClass(), "offsets", null);
        setField(term13, term13.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term13, term13.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term13, term13.getClass(), "dirty", false);
        setField(term13, term13.getClass(), "lastRule", null);
        setField(term13, term13.getClass(), "ID", "Etc/GMT-5");
        setField(term13, term13.getClass(), "zoneId", null);
        term31 = newInstance(Class.forName("java.util.Locale"));
        Object term32 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term32, term32.getClass(), "language", "pt");
        setField(term32, term32.getClass(), "script", "");
        setField(term32, term32.getClass(), "region", "MO");
        setField(term32, term32.getClass(), "variant", "");
        setIntField(term32, term32.getClass(), "hash", 106966554);
        setField(term31, term31.getClass(), "baseLocale", term32);
        setField(term31, term31.getClass(), "localeExtensions", null);
        setIntField(term31, term31.getClass(), "hashCodeValue", 106966554);
        setField(term31, term31.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.TimeZone");
        argTypes[2] = Class.forName("java.util.Locale");
        Object[] args = new Object[3];
        args[0] = "PAEBtnZtTD";
        args[1] = term13;
        args[2] = term31;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


