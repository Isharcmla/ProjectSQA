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

public class FastDateFormat_init_28715344420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2132;

    public FastDateFormat_init_28715344420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2132 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        Object term2145 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term2150 = (long[]) newLongArray(62);
        int[] term2213 = (int[]) newIntArray(5);
        Object term2251 = newInstance(Class.forName("java.util.Locale"));
        Object term2252 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term2266 = (Object[]) newArray("org.apache.commons.lang.time.FastDateFormat$Rule", 5);
        setField(term2132, term2132.getClass(), "mPattern", "SzjVpOQTyS");
        setIntField(term2145, term2145.getClass(), "rawOffset", -10800000);
        setIntField(term2145, term2145.getClass(), "rawOffsetDiff", 0);
        setIntField(term2145, term2145.getClass(), "checksum", 931206084);
        setIntField(term2145, term2145.getClass(), "dstSavings", 0);
        setLongElement(term2150, 0, -9048018124799999L);
        setLongElement(term2150, 1, -6420289093631998L);
        setLongElement(term2150, 2, -5052137471999952L);
        setLongElement(term2150, 3, -5009330995199998L);
        setLongElement(term2150, 4, -4939599052799952L);
        setLongElement(term2150, 5, -4890776371199998L);
        setLongElement(term2150, 6, -4804057497599952L);
        setLongElement(term2150, 7, -4761604915199998L);
        setLongElement(term2150, 8, -4674886041599952L);
        setLongElement(term2150, 9, -4632433459199998L);
        setLongElement(term2150, 10, -4545714585599952L);
        setLongElement(term2150, 11, -4503262003199998L);
        setLongElement(term2150, 12, -4416543129599952L);
        setLongElement(term2150, 13, -4373736652799998L);
        setLongElement(term2150, 14, -4287017779199952L);
        setLongElement(term2150, 15, -4244565196799998L);
        setLongElement(term2150, 16, -4157846323199952L);
        setLongElement(term2150, 17, -4115393740799998L);
        setLongElement(term2150, 18, -4028674867199952L);
        setLongElement(term2150, 19, -3986222284799998L);
        setLongElement(term2150, 20, -3899503411199952L);
        setLongElement(term2150, 21, -3856696934399998L);
        setLongElement(term2150, 22, -3813507071999952L);
        setLongElement(term2150, 23, -3690012671999998L);
        setLongElement(term2150, 24, -3646822809599952L);
        setLongElement(term2150, 25, -3415036723199998L);
        setLongElement(term2150, 26, -3388479897599952L);
        setLongElement(term2150, 27, -3081314303999998L);
        setLongElement(term2150, 28, -3005566156799952L);
        setLongElement(term2150, 29, -808250572799998L);
        setLongElement(term2150, 30, -781693747199952L);
        setLongElement(term2150, 31, -754458623999998L);
        setLongElement(term2150, 32, -673755955199952L);
        setLongElement(term2150, 33, -625287167999998L);
        setLongElement(term2150, 34, -544584499199952L);
        setLongElement(term2150, 35, -496115711999998L);
        setLongElement(term2150, 36, -415413043199952L);
        setLongElement(term2150, 37, -355619635199998L);
        setLongElement(term2150, 38, -291196108799952L);
        setLongElement(term2150, 39, -224324812799998L);
        setLongElement(term2150, 40, -159901286399952L);
        setLongElement(term2150, 41, -95507251199998L);
        setLongElement(term2150, 42, -31083724800000L);
        setLongElement(term2150, 43, 524869632000052L);
        setLongElement(term2150, 44, 559536537600000L);
        setLongElement(term2150, 45, 2445100646400052L);
        setLongElement(term2150, 46, 2478351974400000L);
        setLongElement(term2150, 47, 2557639065600052L);
        setLongElement(term2150, 48, 2607169536000000L);
        setLongElement(term2150, 49, 2688933888000052L);
        setLongElement(term2150, 50, 2735987097600002L);
        setLongElement(term2150, 51, 2817766195200052L);
        setLongElement(term2150, 52, 2864804659200000L);
        setLongElement(term2150, 53, 2946569011200052L);
        setLongElement(term2150, 54, 2996099481600000L);
        setLongElement(term2150, 55, 3845814681600048L);
        setLongElement(term2150, 56, 3899606630400000L);
        setLongElement(term2150, 57, 4448496844800002L);
        setLongElement(term2150, 58, 4455235584000000L);
        setLongElement(term2150, 59, 4911036825600052L);
        setLongElement(term2150, 60, 4938271948800000L);
        setLongElement(term2150, 61, 8660547993600000L);
        setField(term2145, term2145.getClass(), "transitions", term2150);
        setIntElement(term2213, 0, -10800000);
        setIntElement(term2213, 1, -15408000);
        setIntElement(term2213, 2, -14400000);
        setIntElement(term2213, 3, 3600000);
        setIntElement(term2213, 4, -7200000);
        setField(term2145, term2145.getClass(), "offsets", term2213);
        setField(term2145, term2145.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term2145, term2145.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term2145, term2145.getClass(), "dirty", false);
        setField(term2145, term2145.getClass(), "lastRule", null);
        setField(term2145, term2145.getClass(), "ID", "America/Argentina/Catamarca");
        setField(term2145, term2145.getClass(), "zoneId", null);
        setField(term2132, term2132.getClass(), "mTimeZone", term2145);
        setBooleanField(term2132, term2132.getClass(), "mTimeZoneForced", false);
        setField(term2252, term2252.getClass(), "language", "pl");
        setField(term2252, term2252.getClass(), "script", "");
        setField(term2252, term2252.getClass(), "region", "");
        setField(term2252, term2252.getClass(), "variant", "");
        setIntField(term2252, term2252.getClass(), "hash", 106651780);
        setField(term2251, term2251.getClass(), "baseLocale", term2252);
        setField(term2251, term2251.getClass(), "localeExtensions", null);
        setIntField(term2251, term2251.getClass(), "hashCodeValue", 106651780);
        setField(term2251, term2251.getClass(), "languageTag", null);
        setField(term2132, term2132.getClass(), "mLocale", term2251);
        setBooleanField(term2132, term2132.getClass(), "mLocaleForced", false);
        setField(term2132, term2132.getClass(), "mRules", term2266);
        setIntField(term2132, term2132.getClass(), "mMaxLengthEstimate", 1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term2132, args);
    }

};


