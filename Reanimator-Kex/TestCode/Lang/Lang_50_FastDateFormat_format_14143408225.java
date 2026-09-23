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
import java.lang.Long;

public class FastDateFormat_format_14143408225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3607;
     Object term3662;

    public FastDateFormat_format_14143408225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3607 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        Object term3620 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        Object term3643 = newInstance(Class.forName("java.util.Locale"));
        Object term3644 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term3660 = (Object[]) newArray("org.apache.commons.lang.time.FastDateFormat$Rule", 2);
        setField(term3607, term3607.getClass(), "mPattern", "oVcInYnLWB");
        setIntField(term3620, term3620.getClass(), "rawOffset", 0);
        setIntField(term3620, term3620.getClass(), "rawOffsetDiff", 0);
        setIntField(term3620, term3620.getClass(), "checksum", 0);
        setIntField(term3620, term3620.getClass(), "dstSavings", 0);
        setField(term3620, term3620.getClass(), "transitions", null);
        setField(term3620, term3620.getClass(), "offsets", null);
        setField(term3620, term3620.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term3620, term3620.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term3620, term3620.getClass(), "dirty", false);
        setField(term3620, term3620.getClass(), "lastRule", null);
        setField(term3620, term3620.getClass(), "ID", "Etc/Universal");
        setField(term3620, term3620.getClass(), "zoneId", null);
        setField(term3607, term3607.getClass(), "mTimeZone", term3620);
        setBooleanField(term3607, term3607.getClass(), "mTimeZoneForced", true);
        setField(term3644, term3644.getClass(), "language", "ca");
        setField(term3644, term3644.getClass(), "script", "");
        setField(term3644, term3644.getClass(), "region", "FR");
        setField(term3644, term3644.getClass(), "variant", "");
        setIntField(term3644, term3644.getClass(), "hash", 94388118);
        setField(term3643, term3643.getClass(), "baseLocale", term3644);
        setField(term3643, term3643.getClass(), "localeExtensions", null);
        setIntField(term3643, term3643.getClass(), "hashCodeValue", 94388118);
        setField(term3643, term3643.getClass(), "languageTag", null);
        setField(term3607, term3607.getClass(), "mLocale", term3643);
        setBooleanField(term3607, term3607.getClass(), "mLocaleForced", false);
        setField(term3607, term3607.getClass(), "mRules", term3660);
        setIntField(term3607, term3607.getClass(), "mMaxLengthEstimate", -1145578966);
        term3662 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3662;
        callMethod(klass, "format", argTypes, term3607, args);
    }

};


