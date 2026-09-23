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

public class FastDateFormat_toString_90401540440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8322;

    public FastDateFormat_toString_90401540440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8322 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateFormat"));
        Object term8335 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term8340 = (long[]) newLongArray(10);
        int[] term8351 = (int[]) newIntArray(4);
        Object term8377 = newInstance(Class.forName("java.util.Locale"));
        Object term8378 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term8395 = (Object[]) newArray("org.apache.commons.lang3.time.FastDateFormat$Rule", 1);
        setField(term8322, term8322.getClass(), "mPattern", "kuTXqwMtDB");
        setIntField(term8335, term8335.getClass(), "rawOffset", 25200000);
        setIntField(term8335, term8335.getClass(), "rawOffsetDiff", 0);
        setIntField(term8335, term8335.getClass(), "checksum", 2132237010);
        setIntField(term8335, term8335.getClass(), "dstSavings", 0);
        setLongElement(term8340, 0, -9048018124799999L);
        setLongElement(term8340, 1, -7584061808640000L);
        setLongElement(term8340, 2, -3490224537599998L);
        setLongElement(term8340, 3, -3205708185599997L);
        setLongElement(term8340, 4, -3145192243200000L);
        setLongElement(term8340, 5, -2941319577599998L);
        setLongElement(term8340, 6, -1875035750400000L);
        setLongElement(term8340, 7, -1292894207999998L);
        setLongElement(term8340, 8, 703777996800000L);
        setLongElement(term8340, 9, 8660400537600000L);
        setField(term8335, term8335.getClass(), "transitions", term8340);
        setIntElement(term8351, 0, 25200000);
        setIntElement(term8351, 1, 25590000);
        setIntElement(term8351, 2, 28800000);
        setIntElement(term8351, 3, 32400000);
        setField(term8335, term8335.getClass(), "offsets", term8351);
        setField(term8335, term8335.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term8335, term8335.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term8335, term8335.getClass(), "dirty", false);
        setField(term8335, term8335.getClass(), "lastRule", null);
        setField(term8335, term8335.getClass(), "ID", "Asia/Ho_Chi_Minh");
        setField(term8335, term8335.getClass(), "zoneId", null);
        setField(term8322, term8322.getClass(), "mTimeZone", term8335);
        setBooleanField(term8322, term8322.getClass(), "mTimeZoneForced", false);
        setField(term8378, term8378.getClass(), "language", "kok");
        setField(term8378, term8378.getClass(), "script", "");
        setField(term8378, term8378.getClass(), "region", "IN");
        setField(term8378, term8378.getClass(), "variant", "");
        setIntField(term8378, term8378.getClass(), "hash", -1125877100);
        setField(term8377, term8377.getClass(), "baseLocale", term8378);
        setField(term8377, term8377.getClass(), "localeExtensions", null);
        setIntField(term8377, term8377.getClass(), "hashCodeValue", -1125877100);
        setField(term8377, term8377.getClass(), "languageTag", null);
        setField(term8322, term8322.getClass(), "mLocale", term8377);
        setBooleanField(term8322, term8322.getClass(), "mLocaleForced", true);
        setField(term8322, term8322.getClass(), "mRules", term8395);
        setIntField(term8322, term8322.getClass(), "mMaxLengthEstimate", 335112684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8322, args);
    }

};


