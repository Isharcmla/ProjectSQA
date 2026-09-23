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

public class FastDateFormat_hashCode_167018393139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8224;

    public FastDateFormat_hashCode_167018393139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8224 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        Object term8237 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term8242 = (long[]) newLongArray(3);
        int[] term8246 = (int[]) newIntArray(2);
        Object term8268 = newInstance(Class.forName("java.util.Locale"));
        Object term8269 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term8286 = (Object[]) newArray("org.apache.commons.lang.time.FastDateFormat$Rule", 2);
        setField(term8224, term8224.getClass(), "mPattern", "SbAoxhfrkn");
        setIntField(term8237, term8237.getClass(), "rawOffset", -18000000);
        setIntField(term8237, term8237.getClass(), "rawOffsetDiff", 0);
        setIntField(term8237, term8237.getClass(), "checksum", -498778870);
        setIntField(term8237, term8237.getClass(), "dstSavings", 0);
        setLongElement(term8242, 0, -9048018124799999L);
        setLongElement(term8242, 1, -7974577864704000L);
        setLongElement(term8242, 2, 8660577484800000L);
        setField(term8237, term8237.getClass(), "transitions", term8242);
        setIntElement(term8246, 0, -18000000);
        setIntElement(term8246, 1, -19176000);
        setField(term8237, term8237.getClass(), "offsets", term8246);
        setField(term8237, term8237.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term8237, term8237.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term8237, term8237.getClass(), "dirty", false);
        setField(term8237, term8237.getClass(), "lastRule", null);
        setField(term8237, term8237.getClass(), "ID", "America/Panama");
        setField(term8237, term8237.getClass(), "zoneId", null);
        setField(term8224, term8224.getClass(), "mTimeZone", term8237);
        setBooleanField(term8224, term8224.getClass(), "mTimeZoneForced", false);
        setField(term8269, term8269.getClass(), "language", "fur");
        setField(term8269, term8269.getClass(), "script", "");
        setField(term8269, term8269.getClass(), "region", "IT");
        setField(term8269, term8269.getClass(), "variant", "");
        setIntField(term8269, term8269.getClass(), "hash", -1263273006);
        setField(term8268, term8268.getClass(), "baseLocale", term8269);
        setField(term8268, term8268.getClass(), "localeExtensions", null);
        setIntField(term8268, term8268.getClass(), "hashCodeValue", -1263273006);
        setField(term8268, term8268.getClass(), "languageTag", null);
        setField(term8224, term8224.getClass(), "mLocale", term8268);
        setBooleanField(term8224, term8224.getClass(), "mLocaleForced", false);
        setField(term8224, term8224.getClass(), "mRules", term8286);
        setIntField(term8224, term8224.getClass(), "mMaxLengthEstimate", 1540719661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term8224, args);
    }

};


