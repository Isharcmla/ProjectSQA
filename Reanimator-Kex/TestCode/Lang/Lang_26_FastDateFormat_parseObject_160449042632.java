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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FastDateFormat_parseObject_160449042632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6877;
     Object term6970;

    public FastDateFormat_parseObject_160449042632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6877 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateFormat"));
        Object term6890 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term6895 = (long[]) newLongArray(15);
        int[] term6911 = (int[]) newIntArray(4);
        Object term6939 = newInstance(Class.forName("java.util.Locale"));
        Object term6940 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term6956 = (Object[]) newArray("org.apache.commons.lang3.time.FastDateFormat$Rule", 2);
        setField(term6877, term6877.getClass(), "mPattern", "vrQLuWIDJX");
        setIntField(term6890, term6890.getClass(), "rawOffset", -25200000);
        setIntField(term6890, term6890.getClass(), "rawOffsetDiff", 0);
        setIntField(term6890, term6890.getClass(), "checksum", 655694291);
        setIntField(term6890, term6890.getClass(), "dstSavings", 0);
        setLongElement(term6895, 0, -9048018124799999L);
        setLongElement(term6895, 1, -6204373401600000L);
        setLongElement(term6895, 2, -5501539123199998L);
        setLongElement(term6895, 3, -5057770291200000L);
        setLongElement(term6895, 4, -4999009075199950L);
        setLongElement(term6895, 5, -4944524083200000L);
        setLongElement(term6895, 6, -4879746662399998L);
        setLongElement(term6895, 7, -3579199488000000L);
        setLongElement(term6895, 8, 3395041689600050L);
        setLongElement(term6895, 9, 3466867507200000L);
        setLongElement(term6895, 10, 3523859251200050L);
        setLongElement(term6895, 11, 3595685068800000L);
        setLongElement(term6895, 12, 3652676812800050L);
        setLongElement(term6895, 13, 3724502630400000L);
        setLongElement(term6895, 14, 8660606976000000L);
        setField(term6890, term6890.getClass(), "transitions", term6895);
        setIntElement(term6911, 0, -25200000);
        setIntElement(term6911, 1, -26632000);
        setIntElement(term6911, 2, -21600000);
        setIntElement(term6911, 3, 3600000);
        setField(term6890, term6890.getClass(), "offsets", term6911);
        setField(term6890, term6890.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term6890, term6890.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term6890, term6890.getClass(), "dirty", false);
        setField(term6890, term6890.getClass(), "lastRule", null);
        setField(term6890, term6890.getClass(), "ID", "America/Hermosillo");
        setField(term6890, term6890.getClass(), "zoneId", null);
        setField(term6877, term6877.getClass(), "mTimeZone", term6890);
        setBooleanField(term6877, term6877.getClass(), "mTimeZoneForced", false);
        setField(term6940, term6940.getClass(), "language", "ar");
        setField(term6940, term6940.getClass(), "script", "");
        setField(term6940, term6940.getClass(), "region", "LY");
        setField(term6940, term6940.getClass(), "variant", "");
        setIntField(term6940, term6940.getClass(), "hash", 93053506);
        setField(term6939, term6939.getClass(), "baseLocale", term6940);
        setField(term6939, term6939.getClass(), "localeExtensions", null);
        setIntField(term6939, term6939.getClass(), "hashCodeValue", 93053506);
        setField(term6939, term6939.getClass(), "languageTag", null);
        setField(term6877, term6877.getClass(), "mLocale", term6939);
        setBooleanField(term6877, term6877.getClass(), "mLocaleForced", false);
        setField(term6877, term6877.getClass(), "mRules", term6956);
        setIntField(term6877, term6877.getClass(), "mMaxLengthEstimate", 458147407);
        term6970 = newInstance(Class.forName("java.text.ParsePosition"));
        setIntField(term6970, term6970.getClass(), "index", -184153539);
        setIntField(term6970, term6970.getClass(), "errorIndex", 493620644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.text.ParsePosition");
        Object[] args = new Object[2];
        args[0] = "flxyYxBRtu";
        args[1] = term6970;
        callMethod(klass, "parseObject", argTypes, term6877, args);
    }

};


