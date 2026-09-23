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

public class FastDatePrinter_toString_105545541919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6412;

    public FastDatePrinter_toString_105545541919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6412 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        Object term6425 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term6430 = (long[]) newLongArray(3);
        int[] term6434 = (int[]) newIntArray(2);
        Object term6455 = newInstance(Class.forName("java.util.Locale"));
        Object term6456 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term6470 = (Object[]) newArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 6);
        setField(term6412, term6412.getClass(), "mPattern", "flxyYxBRtu");
        setIntField(term6425, term6425.getClass(), "rawOffset", -18000000);
        setIntField(term6425, term6425.getClass(), "rawOffsetDiff", 0);
        setIntField(term6425, term6425.getClass(), "checksum", -498778870);
        setIntField(term6425, term6425.getClass(), "dstSavings", 0);
        setLongElement(term6430, 0, -9048018124799999L);
        setLongElement(term6430, 1, -7974577864704000L);
        setLongElement(term6430, 2, 8660577484800000L);
        setField(term6425, term6425.getClass(), "transitions", term6430);
        setIntElement(term6434, 0, -18000000);
        setIntElement(term6434, 1, -19176000);
        setField(term6425, term6425.getClass(), "offsets", term6434);
        setField(term6425, term6425.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term6425, term6425.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term6425, term6425.getClass(), "dirty", false);
        setField(term6425, term6425.getClass(), "lastRule", null);
        setField(term6425, term6425.getClass(), "ID", "America/Panama");
        setField(term6425, term6425.getClass(), "zoneId", null);
        setField(term6412, term6412.getClass(), "mTimeZone", term6425);
        setField(term6456, term6456.getClass(), "language", "ses");
        setField(term6456, term6456.getClass(), "script", "");
        setField(term6456, term6456.getClass(), "region", "");
        setField(term6456, term6456.getClass(), "variant", "");
        setIntField(term6456, term6456.getClass(), "hash", -905913345);
        setField(term6455, term6455.getClass(), "baseLocale", term6456);
        setField(term6455, term6455.getClass(), "localeExtensions", null);
        setIntField(term6455, term6455.getClass(), "hashCodeValue", -905913345);
        setField(term6455, term6455.getClass(), "languageTag", null);
        setField(term6412, term6412.getClass(), "mLocale", term6455);
        setField(term6412, term6412.getClass(), "mRules", term6470);
        setIntField(term6412, term6412.getClass(), "mMaxLengthEstimate", 454281060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6412, args);
    }

};


