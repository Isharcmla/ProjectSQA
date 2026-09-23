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

public class FastDateFormat_parsePattern_149347030921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2374;

    public FastDateFormat_parsePattern_149347030921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2374 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        Object term2387 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term2392 = (long[]) newLongArray(3);
        int[] term2396 = (int[]) newIntArray(2);
        Object term2414 = newInstance(Class.forName("java.util.Locale"));
        Object term2415 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term2430 = (Object[]) newArray("org.apache.commons.lang.time.FastDateFormat$Rule", 4);
        setField(term2374, term2374.getClass(), "mPattern", "MjGYSRKTNF");
        setIntField(term2387, term2387.getClass(), "rawOffset", 14400000);
        setIntField(term2387, term2387.getClass(), "rawOffsetDiff", 0);
        setIntField(term2387, term2387.getClass(), "checksum", 193743799);
        setIntField(term2387, term2387.getClass(), "dstSavings", 0);
        setLongElement(term2392, 0, -9048018124799999L);
        setLongElement(term2392, 1, -6463227789312000L);
        setLongElement(term2392, 2, 8660444774400000L);
        setField(term2387, term2387.getClass(), "transitions", term2392);
        setIntElement(term2396, 0, 14400000);
        setIntElement(term2396, 1, 13272000);
        setField(term2387, term2387.getClass(), "offsets", term2396);
        setField(term2387, term2387.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term2387, term2387.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term2387, term2387.getClass(), "dirty", false);
        setField(term2387, term2387.getClass(), "lastRule", null);
        setField(term2387, term2387.getClass(), "ID", "Asia/Dubai");
        setField(term2387, term2387.getClass(), "zoneId", null);
        setField(term2374, term2374.getClass(), "mTimeZone", term2387);
        setBooleanField(term2374, term2374.getClass(), "mTimeZoneForced", false);
        setField(term2415, term2415.getClass(), "language", "mzn");
        setField(term2415, term2415.getClass(), "script", "");
        setField(term2415, term2415.getClass(), "region", "");
        setField(term2415, term2415.getClass(), "variant", "");
        setIntField(term2415, term2415.getClass(), "hash", -1058443265);
        setField(term2414, term2414.getClass(), "baseLocale", term2415);
        setField(term2414, term2414.getClass(), "localeExtensions", null);
        setIntField(term2414, term2414.getClass(), "hashCodeValue", -1058443265);
        setField(term2414, term2414.getClass(), "languageTag", null);
        setField(term2374, term2374.getClass(), "mLocale", term2414);
        setBooleanField(term2374, term2374.getClass(), "mLocaleForced", true);
        setField(term2374, term2374.getClass(), "mRules", term2430);
        setIntField(term2374, term2374.getClass(), "mMaxLengthEstimate", -655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parsePattern", argTypes, term2374, args);
    }

};


