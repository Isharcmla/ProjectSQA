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

public class StdDateFormat_init_169373899641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term19;
     Object term2621;
     Object term2635;
     Object term2638;

    public StdDateFormat_init_169373899641() {
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
        term2621 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat"));
        Object term2622 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        Object term2625 = newInstance(Class.forName("java.util.Locale"));
        Object term2626 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setIntField(term2622, term2622.getClass(), "rawOffset", 18000000);
        setIntField(term2622, term2622.getClass(), "rawOffsetDiff", 0);
        setIntField(term2622, term2622.getClass(), "checksum", 0);
        setIntField(term2622, term2622.getClass(), "dstSavings", 0);
        setField(term2622, term2622.getClass(), "transitions", null);
        setField(term2622, term2622.getClass(), "offsets", null);
        setField(term2622, term2622.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term2622, term2622.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term2622, term2622.getClass(), "dirty", false);
        setField(term2622, term2622.getClass(), "lastRule", null);
        setField(term2622, term2622.getClass(), "ID", "Etc/GMT-5");
        setField(term2622, term2622.getClass(), "zoneId", null);
        setField(term2621, term2621.getClass(), "_timezone", term2622);
        setField(term2626, term2626.getClass(), "language", "pt");
        setField(term2626, term2626.getClass(), "script", "");
        setField(term2626, term2626.getClass(), "region", "MO");
        setField(term2626, term2626.getClass(), "variant", "");
        setIntField(term2626, term2626.getClass(), "hash", 106966554);
        setField(term2625, term2625.getClass(), "baseLocale", term2626);
        setField(term2625, term2625.getClass(), "localeExtensions", null);
        setIntField(term2625, term2625.getClass(), "hashCodeValue", 106966554);
        setField(term2625, term2625.getClass(), "languageTag", null);
        setField(term2621, term2621.getClass(), "_locale", term2625);
        setField(term2621, term2621.getClass(), "_lenient", null);
        setField(term2621, term2621.getClass(), "_calendar", null);
        setField(term2621, term2621.getClass(), "_formatRFC1123", null);
        setBooleanField(term2621, term2621.getClass(), "_tzSerializedWithColon", false);
        setField(term2621, term2621.getClass(), "calendar", null);
        setField(term2621, term2621.getClass(), "numberFormat", null);
        term2635 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term2635, term2635.getClass(), "rawOffset", 18000000);
        setIntField(term2635, term2635.getClass(), "rawOffsetDiff", 0);
        setIntField(term2635, term2635.getClass(), "checksum", 0);
        setIntField(term2635, term2635.getClass(), "dstSavings", 0);
        setField(term2635, term2635.getClass(), "transitions", null);
        setField(term2635, term2635.getClass(), "offsets", null);
        setField(term2635, term2635.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term2635, term2635.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term2635, term2635.getClass(), "dirty", false);
        setField(term2635, term2635.getClass(), "lastRule", null);
        setField(term2635, term2635.getClass(), "ID", "Etc/GMT-5");
        setField(term2635, term2635.getClass(), "zoneId", null);
        term2638 = newInstance(Class.forName("java.util.Locale"));
        Object term2639 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2639, term2639.getClass(), "language", "pt");
        setField(term2639, term2639.getClass(), "script", "");
        setField(term2639, term2639.getClass(), "region", "MO");
        setField(term2639, term2639.getClass(), "variant", "");
        setIntField(term2639, term2639.getClass(), "hash", 106966554);
        setField(term2638, term2638.getClass(), "baseLocale", term2639);
        setField(term2638, term2638.getClass(), "localeExtensions", null);
        setIntField(term2638, term2638.getClass(), "hashCodeValue", 106966554);
        setField(term2638, term2638.getClass(), "languageTag", null);
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
        assertTrue(recursiveEquals(instance, term2621));
        assertTrue(recursiveEquals(term1, term2635));
        assertTrue(recursiveEquals(term19, term2638));
    }

};


