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

public class FastDatePrinter_equals_201490178417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5950;
     Object term6008;

    public FastDatePrinter_equals_201490178417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5950 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        Object term5963 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term5968 = (long[]) newLongArray(3);
        int[] term5972 = (int[]) newIntArray(2);
        Object term5990 = newInstance(Class.forName("java.util.Locale"));
        Object term5991 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term6006 = (Object[]) newArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 2);
        setField(term5950, term5950.getClass(), "mPattern", "BYqFIqCKAV");
        setIntField(term5963, term5963.getClass(), "rawOffset", 0);
        setIntField(term5963, term5963.getClass(), "rawOffsetDiff", 0);
        setIntField(term5963, term5963.getClass(), "checksum", -22610163);
        setIntField(term5963, term5963.getClass(), "dstSavings", 0);
        setLongElement(term5968, 0, -9048018124799999L);
        setLongElement(term5968, 1, -7497248899072000L);
        setLongElement(term5968, 2, 8660503756800000L);
        setField(term5963, term5963.getClass(), "transitions", term5968);
        setIntElement(term5972, 1, -968000);
        setField(term5963, term5963.getClass(), "offsets", term5972);
        setField(term5963, term5963.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term5963, term5963.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term5963, term5963.getClass(), "dirty", false);
        setField(term5963, term5963.getClass(), "lastRule", null);
        setField(term5963, term5963.getClass(), "ID", "Africa/Lome");
        setField(term5963, term5963.getClass(), "zoneId", null);
        setField(term5950, term5950.getClass(), "mTimeZone", term5963);
        setField(term5991, term5991.getClass(), "language", "ru");
        setField(term5991, term5991.getClass(), "script", "");
        setField(term5991, term5991.getClass(), "region", "KZ");
        setField(term5991, term5991.getClass(), "variant", "");
        setIntField(term5991, term5991.getClass(), "hash", 108841806);
        setField(term5990, term5990.getClass(), "baseLocale", term5991);
        setField(term5990, term5990.getClass(), "localeExtensions", null);
        setIntField(term5990, term5990.getClass(), "hashCodeValue", 108841806);
        setField(term5990, term5990.getClass(), "languageTag", null);
        setField(term5950, term5950.getClass(), "mLocale", term5990);
        setField(term5950, term5950.getClass(), "mRules", term6006);
        setIntField(term5950, term5950.getClass(), "mMaxLengthEstimate", -1968847291);
        term6008 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6008;
        callMethod(klass, "equals", argTypes, term5950, args);
    }

};


