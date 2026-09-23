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

public class FastDateFormat_getTimeZone_68256469334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7136;

    public FastDateFormat_getTimeZone_68256469334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7136 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateFormat"));
        Object term7149 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        Object term7168 = newInstance(Class.forName("java.util.Locale"));
        Object term7169 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term7183 = (Object[]) newArray("org.apache.commons.lang3.time.FastDateFormat$Rule", 1);
        setField(term7136, term7136.getClass(), "mPattern", "IoAlmYsBwc");
        setIntField(term7149, term7149.getClass(), "rawOffset", 0);
        setIntField(term7149, term7149.getClass(), "rawOffsetDiff", 0);
        setIntField(term7149, term7149.getClass(), "checksum", 0);
        setIntField(term7149, term7149.getClass(), "dstSavings", 0);
        setField(term7149, term7149.getClass(), "transitions", null);
        setField(term7149, term7149.getClass(), "offsets", null);
        setField(term7149, term7149.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term7149, term7149.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term7149, term7149.getClass(), "dirty", false);
        setField(term7149, term7149.getClass(), "lastRule", null);
        setField(term7149, term7149.getClass(), "ID", "Etc/GMT+0");
        setField(term7149, term7149.getClass(), "zoneId", null);
        setField(term7136, term7136.getClass(), "mTimeZone", term7149);
        setBooleanField(term7136, term7136.getClass(), "mTimeZoneForced", true);
        setField(term7169, term7169.getClass(), "language", "pa");
        setField(term7169, term7169.getClass(), "script", "");
        setField(term7169, term7169.getClass(), "region", "");
        setField(term7169, term7169.getClass(), "variant", "");
        setIntField(term7169, term7169.getClass(), "hash", 106324079);
        setField(term7168, term7168.getClass(), "baseLocale", term7169);
        setField(term7168, term7168.getClass(), "localeExtensions", null);
        setIntField(term7168, term7168.getClass(), "hashCodeValue", 106324079);
        setField(term7168, term7168.getClass(), "languageTag", null);
        setField(term7136, term7136.getClass(), "mLocale", term7168);
        setBooleanField(term7136, term7136.getClass(), "mLocaleForced", true);
        setField(term7136, term7136.getClass(), "mRules", term7183);
        setIntField(term7136, term7136.getClass(), "mMaxLengthEstimate", -1371869594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeZone", argTypes, term7136, args);
    }

};


