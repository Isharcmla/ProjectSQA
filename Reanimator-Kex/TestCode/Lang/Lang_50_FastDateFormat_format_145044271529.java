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

public class FastDateFormat_format_145044271529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4964;
     Object term5026;
     Object term5028;

    public FastDateFormat_format_145044271529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4964 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        Object term4977 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term4982 = (long[]) newLongArray(3);
        int[] term4986 = (int[]) newIntArray(2);
        Object term5008 = newInstance(Class.forName("java.util.Locale"));
        Object term5009 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term5024 = (Object[]) newArray("org.apache.commons.lang.time.FastDateFormat$Rule", 6);
        setField(term4964, term4964.getClass(), "mPattern", "pCTimMblYc");
        setIntField(term4977, term4977.getClass(), "rawOffset", -18000000);
        setIntField(term4977, term4977.getClass(), "rawOffsetDiff", 0);
        setIntField(term4977, term4977.getClass(), "checksum", -498778870);
        setIntField(term4977, term4977.getClass(), "dstSavings", 0);
        setLongElement(term4982, 0, -9048018124799999L);
        setLongElement(term4982, 1, -7974577864704000L);
        setLongElement(term4982, 2, 8660577484800000L);
        setField(term4977, term4977.getClass(), "transitions", term4982);
        setIntElement(term4986, 0, -18000000);
        setIntElement(term4986, 1, -19176000);
        setField(term4977, term4977.getClass(), "offsets", term4986);
        setField(term4977, term4977.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term4977, term4977.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term4977, term4977.getClass(), "dirty", false);
        setField(term4977, term4977.getClass(), "lastRule", null);
        setField(term4977, term4977.getClass(), "ID", "America/Panama");
        setField(term4977, term4977.getClass(), "zoneId", null);
        setField(term4964, term4964.getClass(), "mTimeZone", term4977);
        setBooleanField(term4964, term4964.getClass(), "mTimeZoneForced", false);
        setField(term5009, term5009.getClass(), "language", "ses");
        setField(term5009, term5009.getClass(), "script", "");
        setField(term5009, term5009.getClass(), "region", "");
        setField(term5009, term5009.getClass(), "variant", "");
        setIntField(term5009, term5009.getClass(), "hash", -905913345);
        setField(term5008, term5008.getClass(), "baseLocale", term5009);
        setField(term5008, term5008.getClass(), "localeExtensions", null);
        setIntField(term5008, term5008.getClass(), "hashCodeValue", -905913345);
        setField(term5008, term5008.getClass(), "languageTag", null);
        setField(term4964, term4964.getClass(), "mLocale", term5008);
        setBooleanField(term4964, term4964.getClass(), "mLocaleForced", true);
        setField(term4964, term4964.getClass(), "mRules", term5024);
        setIntField(term4964, term4964.getClass(), "mMaxLengthEstimate", -1968847291);
        term5026 = newInstance(Class.forName("java.util.Date"));
        setLongField(term5026, term5026.getClass(), "fastTime", 1480456351369L);
        setField(term5026, term5026.getClass(), "cdate", null);
        term5028 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term5041 = (byte[]) newByteArray(16);
        setField(term5028, term5028.getClass(), "toStringCache", "hNxWaHcfhY");
        setField(term5028, term5028.getClass(), "value", term5041);
        setByteField(term5028, term5028.getClass(), "coder", (byte) 89);
        setIntField(term5028, term5028.getClass(), "count", 579005622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[2];
        args[0] = term5026;
        args[1] = term5028;
        callMethod(klass, "format", argTypes, term4964, args);
    }

};


