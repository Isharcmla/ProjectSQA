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

public class FastDateFormat_getPattern_65367388933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7034;

    public FastDateFormat_getPattern_65367388933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7034 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        Object term7047 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term7052 = (long[]) newLongArray(8);
        int[] term7061 = (int[]) newIntArray(6);
        Object term7082 = newInstance(Class.forName("java.util.Locale"));
        Object term7083 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term7098 = (Object[]) newArray("org.apache.commons.lang.time.FastDateFormat$Rule", 3);
        setField(term7034, term7034.getClass(), "mPattern", "OclPbYPkcH");
        setIntField(term7047, term7047.getClass(), "rawOffset", 43200000);
        setIntField(term7047, term7047.getClass(), "rawOffsetDiff", 0);
        setIntField(term7047, term7047.getClass(), "checksum", 1808775819);
        setIntField(term7047, term7047.getClass(), "dstSavings", 0);
        setLongElement(term7052, 0, -9048018124799999L);
        setLongElement(term7052, 1, -8919011164159998L);
        setLongElement(term7052, 2, -4265651404799997L);
        setLongElement(term7052, 3, -3716746444799996L);
        setLongElement(term7052, 4, -3348327628799998L);
        setLongElement(term7052, 5, -32720486399995L);
        setLongElement(term7052, 6, 3055347302400000L);
        setLongElement(term7052, 7, 8660326809600000L);
        setField(term7047, term7047.getClass(), "transitions", term7052);
        setIntElement(term7061, 0, 43200000);
        setIntElement(term7061, 1, 40160000);
        setIntElement(term7061, 2, 39600000);
        setIntElement(term7061, 3, 36000000);
        setIntElement(term7061, 4, 32400000);
        setIntElement(term7061, 5, -43200000);
        setField(term7047, term7047.getClass(), "offsets", term7061);
        setField(term7047, term7047.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term7047, term7047.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term7047, term7047.getClass(), "dirty", false);
        setField(term7047, term7047.getClass(), "lastRule", null);
        setField(term7047, term7047.getClass(), "ID", "Kwajalein");
        setField(term7047, term7047.getClass(), "zoneId", null);
        setField(term7034, term7034.getClass(), "mTimeZone", term7047);
        setBooleanField(term7034, term7034.getClass(), "mTimeZoneForced", false);
        setField(term7083, term7083.getClass(), "language", "cgg");
        setField(term7083, term7083.getClass(), "script", "");
        setField(term7083, term7083.getClass(), "region", "");
        setField(term7083, term7083.getClass(), "variant", "");
        setIntField(term7083, term7083.getClass(), "hash", -1362490211);
        setField(term7082, term7082.getClass(), "baseLocale", term7083);
        setField(term7082, term7082.getClass(), "localeExtensions", null);
        setIntField(term7082, term7082.getClass(), "hashCodeValue", -1362490211);
        setField(term7082, term7082.getClass(), "languageTag", null);
        setField(term7034, term7034.getClass(), "mLocale", term7082);
        setBooleanField(term7034, term7034.getClass(), "mLocaleForced", true);
        setField(term7034, term7034.getClass(), "mRules", term7098);
        setIntField(term7034, term7034.getClass(), "mMaxLengthEstimate", 1596070772);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPattern", argTypes, term7034, args);
    }

};


