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

public class FastDateFormat_getMaxLengthEstimate_187842470337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7502;

    public FastDateFormat_getMaxLengthEstimate_187842470337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7502 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateFormat"));
        Object term7515 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term7520 = (long[]) newLongArray(17);
        int[] term7538 = (int[]) newIntArray(4);
        Object term7563 = newInstance(Class.forName("java.util.Locale"));
        Object term7564 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term7578 = (Object[]) newArray("org.apache.commons.lang3.time.FastDateFormat$Rule", 8);
        setField(term7502, term7502.getClass(), "mPattern", "dWRymuLBtr");
        setIntField(term7515, term7515.getClass(), "rawOffset", -21600000);
        setIntField(term7515, term7515.getClass(), "rawOffsetDiff", 0);
        setIntField(term7515, term7515.getClass(), "checksum", -571247586);
        setIntField(term7515, term7515.getClass(), "dstSavings", 0);
        setLongElement(term7520, 0, -9048018124799999L);
        setLongElement(term7520, 1, -4592048898048000L);
        setLongElement(term7520, 2, 430424064000002L);
        setLongElement(term7520, 3, 662564044800000L);
        setLongElement(term7520, 4, 1190235340800050L);
        setLongElement(term7520, 5, 1225256140800000L);
        setLongElement(term7520, 6, 1319052902400050L);
        setLongElement(term7520, 7, 1354073702400000L);
        setLongElement(term7520, 8, 2843688960000002L);
        setLongElement(term7520, 9, 2938105036800000L);
        setLongElement(term7520, 10, 2973155328000002L);
        setLongElement(term7520, 11, 3490180300800000L);
        setLongElement(term7520, 12, 4559310028800050L);
        setLongElement(term7520, 13, 4621226803200000L);
        setLongElement(term7520, 14, 4695588864000050L);
        setLongElement(term7520, 15, 4750059110400000L);
        setLongElement(term7520, 16, 8660592230400000L);
        setField(term7515, term7515.getClass(), "transitions", term7520);
        setIntElement(term7538, 0, -21600000);
        setIntElement(term7538, 1, -20712000);
        setIntElement(term7538, 2, -18000000);
        setIntElement(term7538, 3, 3600000);
        setField(term7515, term7515.getClass(), "offsets", term7538);
        setField(term7515, term7515.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term7515, term7515.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term7515, term7515.getClass(), "dirty", false);
        setField(term7515, term7515.getClass(), "lastRule", null);
        setField(term7515, term7515.getClass(), "ID", "America/Managua");
        setField(term7515, term7515.getClass(), "zoneId", null);
        setField(term7502, term7502.getClass(), "mTimeZone", term7515);
        setBooleanField(term7502, term7502.getClass(), "mTimeZoneForced", true);
        setField(term7564, term7564.getClass(), "language", "fo");
        setField(term7564, term7564.getClass(), "script", "");
        setField(term7564, term7564.getClass(), "region", "");
        setField(term7564, term7564.getClass(), "variant", "");
        setIntField(term7564, term7564.getClass(), "hash", 97505943);
        setField(term7563, term7563.getClass(), "baseLocale", term7564);
        setField(term7563, term7563.getClass(), "localeExtensions", null);
        setIntField(term7563, term7563.getClass(), "hashCodeValue", 97505943);
        setField(term7563, term7563.getClass(), "languageTag", null);
        setField(term7502, term7502.getClass(), "mLocale", term7563);
        setBooleanField(term7502, term7502.getClass(), "mLocaleForced", true);
        setField(term7502, term7502.getClass(), "mRules", term7578);
        setIntField(term7502, term7502.getClass(), "mMaxLengthEstimate", -112921587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxLengthEstimate", argTypes, term7502, args);
    }

};


