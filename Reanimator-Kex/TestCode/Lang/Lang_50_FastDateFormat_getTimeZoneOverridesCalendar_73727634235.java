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

public class FastDateFormat_getTimeZoneOverridesCalendar_73727634235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7206;

    public FastDateFormat_getTimeZoneOverridesCalendar_73727634235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7206 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        Object term7219 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term7224 = (long[]) newLongArray(3);
        int[] term7228 = (int[]) newIntArray(2);
        Object term7252 = newInstance(Class.forName("java.util.Locale"));
        Object term7253 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term7270 = (Object[]) newArray("org.apache.commons.lang.time.FastDateFormat$Rule", 0);
        setField(term7206, term7206.getClass(), "mPattern", "TEParAifyi");
        setIntField(term7219, term7219.getClass(), "rawOffset", 10800000);
        setIntField(term7219, term7219.getClass(), "rawOffsetDiff", 0);
        setIntField(term7219, term7219.getClass(), "checksum", -736395844);
        setIntField(term7219, term7219.getClass(), "dstSavings", 0);
        setLongElement(term7224, 0, -9048018124799999L);
        setLongElement(term7224, 1, -2947632381952000L);
        setLongElement(term7224, 2, 8660459520000000L);
        setField(term7219, term7219.getClass(), "transitions", term7224);
        setIntElement(term7228, 0, 10800000);
        setIntElement(term7228, 1, 11212000);
        setField(term7219, term7219.getClass(), "offsets", term7228);
        setField(term7219, term7219.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term7219, term7219.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term7219, term7219.getClass(), "dirty", false);
        setField(term7219, term7219.getClass(), "lastRule", null);
        setField(term7219, term7219.getClass(), "ID", "Antarctica/Syowa");
        setField(term7219, term7219.getClass(), "zoneId", null);
        setField(term7206, term7206.getClass(), "mTimeZone", term7219);
        setBooleanField(term7206, term7206.getClass(), "mTimeZoneForced", true);
        setField(term7253, term7253.getClass(), "language", "saq");
        setField(term7253, term7253.getClass(), "script", "");
        setField(term7253, term7253.getClass(), "region", "KE");
        setField(term7253, term7253.getClass(), "variant", "");
        setIntField(term7253, term7253.getClass(), "hash", -909592797);
        setField(term7252, term7252.getClass(), "baseLocale", term7253);
        setField(term7252, term7252.getClass(), "localeExtensions", null);
        setIntField(term7252, term7252.getClass(), "hashCodeValue", -909592797);
        setField(term7252, term7252.getClass(), "languageTag", null);
        setField(term7206, term7206.getClass(), "mLocale", term7252);
        setBooleanField(term7206, term7206.getClass(), "mLocaleForced", true);
        setField(term7206, term7206.getClass(), "mRules", term7270);
        setIntField(term7206, term7206.getClass(), "mMaxLengthEstimate", 1225272962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeZoneOverridesCalendar", argTypes, term7206, args);
    }

};


