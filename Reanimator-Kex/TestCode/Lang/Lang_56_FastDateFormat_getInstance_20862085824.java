package org.apache.commons.lang.time;

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
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FastDateFormat_getInstance_20862085824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;
     Object term185;

    public FastDateFormat_getInstance_20862085824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term131 = (long[]) newLongArray(31);
        int[] term163 = (int[]) newIntArray(4);
        setIntField(term126, term126.getClass(), "rawOffset", 28800000);
        setIntField(term126, term126.getClass(), "rawOffsetDiff", 0);
        setIntField(term126, term126.getClass(), "checksum", -1650057198);
        setIntField(term126, term126.getClass(), "dstSavings", 0);
        setLongElement(term131, 0, -9048018124799999L);
        setLongElement(term131, 1, -8918966038528000L);
        setLongElement(term131, 2, -6556365619199950L);
        setLongElement(term131, 3, -6495864422400000L);
        setLongElement(term131, 4, -3824300851199950L);
        setLongElement(term131, 5, -3776893747200000L);
        setLongElement(term131, 6, -3722733158399950L);
        setLongElement(term131, 7, -3640644403200000L);
        setLongElement(term131, 8, -3608779161599950L);
        setLongElement(term131, 9, -3145192243200000L);
        setLongElement(term131, 10, -3054934425599950L);
        setLongElement(term131, 11, -3005757849600000L);
        setLongElement(term131, 12, -2936379801599950L);
        setLongElement(term131, 13, -2865615667200000L);
        setLongElement(term131, 14, -2801192140799950L);
        setLongElement(term131, 15, -2747061043200000L);
        setLongElement(term131, 16, -2672020684799950L);
        setLongElement(term131, 17, -2662480281600000L);
        setLongElement(term131, 18, 2111599411200050L);
        setLongElement(term131, 19, 2158652620800000L);
        setLongElement(term131, 20, 2232985190400050L);
        setLongElement(term131, 21, 2287470182400000L);
        setLongElement(term131, 22, 2364280012800050L);
        setLongElement(term131, 23, 2416287744000000L);
        setLongElement(term131, 24, 2493097574400050L);
        setLongElement(term131, 25, 2547582566400000L);
        setLongElement(term131, 26, 2621915136000050L);
        setLongElement(term131, 27, 2676400128000000L);
        setLongElement(term131, 28, 2750732697600050L);
        setLongElement(term131, 29, 2805217689600000L);
        setLongElement(term131, 30, 8660385792000000L);
        setField(term126, term126.getClass(), "transitions", term131);
        setIntElement(term163, 0, 28800000);
        setIntElement(term163, 1, 29143000);
        setIntElement(term163, 2, 32400000);
        setIntElement(term163, 3, 3600000);
        setField(term126, term126.getClass(), "offsets", term163);
        setField(term126, term126.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term126, term126.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term126, term126.getClass(), "dirty", false);
        setField(term126, term126.getClass(), "lastRule", null);
        setField(term126, term126.getClass(), "ID", "Asia/Shanghai");
        setField(term126, term126.getClass(), "zoneId", null);
        term185 = newInstance(Class.forName("java.util.Locale"));
        Object term186 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term186, term186.getClass(), "language", "ps");
        setField(term186, term186.getClass(), "script", "");
        setField(term186, term186.getClass(), "region", "");
        setField(term186, term186.getClass(), "variant", "");
        setIntField(term186, term186.getClass(), "hash", 106860317);
        setField(term185, term185.getClass(), "baseLocale", term186);
        setField(term185, term185.getClass(), "localeExtensions", null);
        setIntField(term185, term185.getClass(), "hashCodeValue", 106860317);
        setField(term185, term185.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.TimeZone");
        argTypes[2] = Class.forName("java.util.Locale");
        Object[] args = new Object[3];
        args[0] = "xxtlPwDYFs";
        args[1] = term126;
        args[2] = term185;
        callMethod(klass, "getInstance", argTypes, null, args);
    }

};


