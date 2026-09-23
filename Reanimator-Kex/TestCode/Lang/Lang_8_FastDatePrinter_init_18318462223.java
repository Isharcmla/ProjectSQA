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

public class FastDatePrinter_init_18318462223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70;

    public FastDatePrinter_init_18318462223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        Object term83 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term88 = (long[]) newLongArray(31);
        int[] term120 = (int[]) newIntArray(4);
        Object term142 = newInstance(Class.forName("java.util.Locale"));
        Object term143 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term156 = (Object[]) newArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 5);
        setField(term70, term70.getClass(), "mPattern", "sjlJAEtRrb");
        setIntField(term83, term83.getClass(), "rawOffset", 28800000);
        setIntField(term83, term83.getClass(), "rawOffsetDiff", 0);
        setIntField(term83, term83.getClass(), "checksum", -1650057198);
        setIntField(term83, term83.getClass(), "dstSavings", 0);
        setLongElement(term88, 0, -9048018124799999L);
        setLongElement(term88, 1, -8918966038528000L);
        setLongElement(term88, 2, -6556365619199950L);
        setLongElement(term88, 3, -6495864422400000L);
        setLongElement(term88, 4, -3824300851199950L);
        setLongElement(term88, 5, -3776893747200000L);
        setLongElement(term88, 6, -3722733158399950L);
        setLongElement(term88, 7, -3640644403200000L);
        setLongElement(term88, 8, -3608779161599950L);
        setLongElement(term88, 9, -3145192243200000L);
        setLongElement(term88, 10, -3054934425599950L);
        setLongElement(term88, 11, -3005757849600000L);
        setLongElement(term88, 12, -2936379801599950L);
        setLongElement(term88, 13, -2865615667200000L);
        setLongElement(term88, 14, -2801192140799950L);
        setLongElement(term88, 15, -2747061043200000L);
        setLongElement(term88, 16, -2672020684799950L);
        setLongElement(term88, 17, -2662480281600000L);
        setLongElement(term88, 18, 2111599411200050L);
        setLongElement(term88, 19, 2158652620800000L);
        setLongElement(term88, 20, 2232985190400050L);
        setLongElement(term88, 21, 2287470182400000L);
        setLongElement(term88, 22, 2364280012800050L);
        setLongElement(term88, 23, 2416287744000000L);
        setLongElement(term88, 24, 2493097574400050L);
        setLongElement(term88, 25, 2547582566400000L);
        setLongElement(term88, 26, 2621915136000050L);
        setLongElement(term88, 27, 2676400128000000L);
        setLongElement(term88, 28, 2750732697600050L);
        setLongElement(term88, 29, 2805217689600000L);
        setLongElement(term88, 30, 8660385792000000L);
        setField(term83, term83.getClass(), "transitions", term88);
        setIntElement(term120, 0, 28800000);
        setIntElement(term120, 1, 29143000);
        setIntElement(term120, 2, 32400000);
        setIntElement(term120, 3, 3600000);
        setField(term83, term83.getClass(), "offsets", term120);
        setField(term83, term83.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term83, term83.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term83, term83.getClass(), "dirty", false);
        setField(term83, term83.getClass(), "lastRule", null);
        setField(term83, term83.getClass(), "ID", "Asia/Shanghai");
        setField(term83, term83.getClass(), "zoneId", null);
        setField(term70, term70.getClass(), "mTimeZone", term83);
        setField(term143, term143.getClass(), "language", "ps");
        setField(term143, term143.getClass(), "script", "");
        setField(term143, term143.getClass(), "region", "");
        setField(term143, term143.getClass(), "variant", "");
        setIntField(term143, term143.getClass(), "hash", 106860317);
        setField(term142, term142.getClass(), "baseLocale", term143);
        setField(term142, term142.getClass(), "localeExtensions", null);
        setIntField(term142, term142.getClass(), "hashCodeValue", 106860317);
        setField(term142, term142.getClass(), "languageTag", null);
        setField(term70, term70.getClass(), "mLocale", term142);
        setField(term70, term70.getClass(), "mRules", term156);
        setIntField(term70, term70.getClass(), "mMaxLengthEstimate", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "init", argTypes, term70, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


