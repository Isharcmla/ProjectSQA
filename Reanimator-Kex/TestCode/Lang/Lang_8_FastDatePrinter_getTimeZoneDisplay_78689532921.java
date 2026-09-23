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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class FastDatePrinter_getTimeZoneDisplay_78689532921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8458;
     Object term8496;
     Object term8498;
     Object term8500;

    public FastDatePrinter_getTimeZoneDisplay_78689532921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8458 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term8463 = (long[]) newLongArray(5);
        int[] term8469 = (int[]) newIntArray(4);
        setIntField(term8458, term8458.getClass(), "rawOffset", 50400000);
        setIntField(term8458, term8458.getClass(), "rawOffsetDiff", 0);
        setIntField(term8458, term8458.getClass(), "checksum", -1355106365);
        setIntField(term8458, term8458.getClass(), "dstSavings", 0);
        setLongElement(term8463, 0, -9048018124799999L);
        setLongElement(term8463, 1, -8918692003839998L);
        setLongElement(term8463, 2, 1260021350400003L);
        setLongElement(term8463, 3, 3231203328000000L);
        setLongElement(term8463, 4, 8660297318400000L);
        setField(term8458, term8458.getClass(), "transitions", term8463);
        setIntElement(term8469, 0, 50400000);
        setIntElement(term8469, 1, -37760000);
        setIntElement(term8469, 2, -38400000);
        setIntElement(term8469, 3, -36000000);
        setField(term8458, term8458.getClass(), "offsets", term8469);
        setField(term8458, term8458.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term8458, term8458.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term8458, term8458.getClass(), "dirty", false);
        setField(term8458, term8458.getClass(), "lastRule", null);
        setField(term8458, term8458.getClass(), "ID", "Pacific/Kiritimati");
        setField(term8458, term8458.getClass(), "zoneId", null);
        term8496 = new Boolean(false);
        term8498 = new Integer(-93135961);
        term8500 = newInstance(Class.forName("java.util.Locale"));
        Object term8501 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term8501, term8501.getClass(), "language", "de");
        setField(term8501, term8501.getClass(), "script", "");
        setField(term8501, term8501.getClass(), "region", "AT");
        setField(term8501, term8501.getClass(), "variant", "");
        setIntField(term8501, term8501.getClass(), "hash", 95426060);
        setField(term8500, term8500.getClass(), "baseLocale", term8501);
        setField(term8500, term8500.getClass(), "localeExtensions", null);
        setIntField(term8500, term8500.getClass(), "hashCodeValue", 95426060);
        setField(term8500, term8500.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.TimeZone");
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.util.Locale");
        Object[] args = new Object[4];
        args[0] = term8458;
        args[1] = term8496;
        args[2] = term8498;
        args[3] = term8500;
        callMethod(klass, "getTimeZoneDisplay", argTypes, null, args);
    }

};


