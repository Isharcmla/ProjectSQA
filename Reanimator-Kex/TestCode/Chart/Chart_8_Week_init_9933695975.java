package org.jfree.data.time;

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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Week_init_9933695975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42;
     Object term44;
     Object term103;

    public Week_init_9933695975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42 = newInstance(Class.forName("java.util.Date"));
        setLongField(term42, term42.getClass(), "fastTime", 1610958182830L);
        setField(term42, term42.getClass(), "cdate", null);
        term44 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term49 = (long[]) newLongArray(31);
        int[] term81 = (int[]) newIntArray(4);
        setIntField(term44, term44.getClass(), "rawOffset", 28800000);
        setIntField(term44, term44.getClass(), "rawOffsetDiff", 0);
        setIntField(term44, term44.getClass(), "checksum", -1650057198);
        setIntField(term44, term44.getClass(), "dstSavings", 0);
        setLongElement(term49, 0, -9048018124799999L);
        setLongElement(term49, 1, -8918966038528000L);
        setLongElement(term49, 2, -6556365619199950L);
        setLongElement(term49, 3, -6495864422400000L);
        setLongElement(term49, 4, -3824300851199950L);
        setLongElement(term49, 5, -3776893747200000L);
        setLongElement(term49, 6, -3722733158399950L);
        setLongElement(term49, 7, -3640644403200000L);
        setLongElement(term49, 8, -3608779161599950L);
        setLongElement(term49, 9, -3145192243200000L);
        setLongElement(term49, 10, -3054934425599950L);
        setLongElement(term49, 11, -3005757849600000L);
        setLongElement(term49, 12, -2936379801599950L);
        setLongElement(term49, 13, -2865615667200000L);
        setLongElement(term49, 14, -2801192140799950L);
        setLongElement(term49, 15, -2747061043200000L);
        setLongElement(term49, 16, -2672020684799950L);
        setLongElement(term49, 17, -2662480281600000L);
        setLongElement(term49, 18, 2111599411200050L);
        setLongElement(term49, 19, 2158652620800000L);
        setLongElement(term49, 20, 2232985190400050L);
        setLongElement(term49, 21, 2287470182400000L);
        setLongElement(term49, 22, 2364280012800050L);
        setLongElement(term49, 23, 2416287744000000L);
        setLongElement(term49, 24, 2493097574400050L);
        setLongElement(term49, 25, 2547582566400000L);
        setLongElement(term49, 26, 2621915136000050L);
        setLongElement(term49, 27, 2676400128000000L);
        setLongElement(term49, 28, 2750732697600050L);
        setLongElement(term49, 29, 2805217689600000L);
        setLongElement(term49, 30, 8660385792000000L);
        setField(term44, term44.getClass(), "transitions", term49);
        setIntElement(term81, 0, 28800000);
        setIntElement(term81, 1, 29143000);
        setIntElement(term81, 2, 32400000);
        setIntElement(term81, 3, 3600000);
        setField(term44, term44.getClass(), "offsets", term81);
        setField(term44, term44.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term44, term44.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term44, term44.getClass(), "dirty", false);
        setField(term44, term44.getClass(), "lastRule", null);
        setField(term44, term44.getClass(), "ID", "Asia/Shanghai");
        setField(term44, term44.getClass(), "zoneId", null);
        term103 = newInstance(Class.forName("java.util.Locale"));
        Object term104 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term104, term104.getClass(), "language", "pt");
        setField(term104, term104.getClass(), "script", "");
        setField(term104, term104.getClass(), "region", "MO");
        setField(term104, term104.getClass(), "variant", "");
        setIntField(term104, term104.getClass(), "hash", 106966554);
        setField(term103, term103.getClass(), "baseLocale", term104);
        setField(term103, term103.getClass(), "localeExtensions", null);
        setIntField(term103, term103.getClass(), "hashCodeValue", 106966554);
        setField(term103, term103.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.Week");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.TimeZone");
        argTypes[2] = Class.forName("java.util.Locale");
        Object[] args = new Object[3];
        args[0] = term42;
        args[1] = term44;
        args[2] = term103;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


