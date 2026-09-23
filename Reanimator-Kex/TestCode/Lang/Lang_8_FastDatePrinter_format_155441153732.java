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
import java.lang.NullPointerException;
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FastDatePrinter_format_155441153732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3012;
     Object term3146;
     Object term3148;

    public FastDatePrinter_format_155441153732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3012 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        Object term3025 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term3030 = (long[]) newLongArray(62);
        int[] term3093 = (int[]) newIntArray(5);
        Object term3130 = newInstance(Class.forName("java.util.Locale"));
        Object term3131 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term3144 = (Object[]) newArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 6);
        setField(term3012, term3012.getClass(), "mPattern", "oVcInYnLWB");
        setIntField(term3025, term3025.getClass(), "rawOffset", -10800000);
        setIntField(term3025, term3025.getClass(), "rawOffsetDiff", 0);
        setIntField(term3025, term3025.getClass(), "checksum", 931206084);
        setIntField(term3025, term3025.getClass(), "dstSavings", 0);
        setLongElement(term3030, 0, -9048018124799999L);
        setLongElement(term3030, 1, -6420289093631998L);
        setLongElement(term3030, 2, -5052137471999952L);
        setLongElement(term3030, 3, -5009330995199998L);
        setLongElement(term3030, 4, -4939599052799952L);
        setLongElement(term3030, 5, -4890776371199998L);
        setLongElement(term3030, 6, -4804057497599952L);
        setLongElement(term3030, 7, -4761604915199998L);
        setLongElement(term3030, 8, -4674886041599952L);
        setLongElement(term3030, 9, -4632433459199998L);
        setLongElement(term3030, 10, -4545714585599952L);
        setLongElement(term3030, 11, -4503262003199998L);
        setLongElement(term3030, 12, -4416543129599952L);
        setLongElement(term3030, 13, -4373736652799998L);
        setLongElement(term3030, 14, -4287017779199952L);
        setLongElement(term3030, 15, -4244565196799998L);
        setLongElement(term3030, 16, -4157846323199952L);
        setLongElement(term3030, 17, -4115393740799998L);
        setLongElement(term3030, 18, -4028674867199952L);
        setLongElement(term3030, 19, -3986222284799998L);
        setLongElement(term3030, 20, -3899503411199952L);
        setLongElement(term3030, 21, -3856696934399998L);
        setLongElement(term3030, 22, -3813507071999952L);
        setLongElement(term3030, 23, -3690012671999998L);
        setLongElement(term3030, 24, -3646822809599952L);
        setLongElement(term3030, 25, -3415036723199998L);
        setLongElement(term3030, 26, -3388479897599952L);
        setLongElement(term3030, 27, -3081314303999998L);
        setLongElement(term3030, 28, -3005566156799952L);
        setLongElement(term3030, 29, -808250572799998L);
        setLongElement(term3030, 30, -781693747199952L);
        setLongElement(term3030, 31, -754458623999998L);
        setLongElement(term3030, 32, -673755955199952L);
        setLongElement(term3030, 33, -625287167999998L);
        setLongElement(term3030, 34, -544584499199952L);
        setLongElement(term3030, 35, -496115711999998L);
        setLongElement(term3030, 36, -415413043199952L);
        setLongElement(term3030, 37, -355619635199998L);
        setLongElement(term3030, 38, -291196108799952L);
        setLongElement(term3030, 39, -224324812799998L);
        setLongElement(term3030, 40, -159901286399952L);
        setLongElement(term3030, 41, -95507251199998L);
        setLongElement(term3030, 42, -31083724800000L);
        setLongElement(term3030, 43, 524869632000052L);
        setLongElement(term3030, 44, 559536537600000L);
        setLongElement(term3030, 45, 2445100646400052L);
        setLongElement(term3030, 46, 2478351974400000L);
        setLongElement(term3030, 47, 2557639065600052L);
        setLongElement(term3030, 48, 2607169536000000L);
        setLongElement(term3030, 49, 2688933888000052L);
        setLongElement(term3030, 50, 2735987097600002L);
        setLongElement(term3030, 51, 2817766195200052L);
        setLongElement(term3030, 52, 2864804659200000L);
        setLongElement(term3030, 53, 2946569011200052L);
        setLongElement(term3030, 54, 2996099481600000L);
        setLongElement(term3030, 55, 3845814681600048L);
        setLongElement(term3030, 56, 3899606630400000L);
        setLongElement(term3030, 57, 4448496844800002L);
        setLongElement(term3030, 58, 4455235584000000L);
        setLongElement(term3030, 59, 4911036825600052L);
        setLongElement(term3030, 60, 4938271948800000L);
        setLongElement(term3030, 61, 8660547993600000L);
        setField(term3025, term3025.getClass(), "transitions", term3030);
        setIntElement(term3093, 0, -10800000);
        setIntElement(term3093, 1, -15408000);
        setIntElement(term3093, 2, -14400000);
        setIntElement(term3093, 3, 3600000);
        setIntElement(term3093, 4, -7200000);
        setField(term3025, term3025.getClass(), "offsets", term3093);
        setField(term3025, term3025.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term3025, term3025.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term3025, term3025.getClass(), "dirty", false);
        setField(term3025, term3025.getClass(), "lastRule", null);
        setField(term3025, term3025.getClass(), "ID", "America/Argentina/Catamarca");
        setField(term3025, term3025.getClass(), "zoneId", null);
        setField(term3012, term3012.getClass(), "mTimeZone", term3025);
        setField(term3131, term3131.getClass(), "language", "pl");
        setField(term3131, term3131.getClass(), "script", "");
        setField(term3131, term3131.getClass(), "region", "");
        setField(term3131, term3131.getClass(), "variant", "");
        setIntField(term3131, term3131.getClass(), "hash", 106651780);
        setField(term3130, term3130.getClass(), "baseLocale", term3131);
        setField(term3130, term3130.getClass(), "localeExtensions", null);
        setIntField(term3130, term3130.getClass(), "hashCodeValue", 106651780);
        setField(term3130, term3130.getClass(), "languageTag", null);
        setField(term3012, term3012.getClass(), "mLocale", term3130);
        setField(term3012, term3012.getClass(), "mRules", term3144);
        setIntField(term3012, term3012.getClass(), "mMaxLengthEstimate", -203030934);
        term3146 = newInstance(Class.forName("java.util.Date"));
        setLongField(term3146, term3146.getClass(), "fastTime", 1480456351369L);
        setField(term3146, term3146.getClass(), "cdate", null);
        term3148 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3161 = (byte[]) newByteArray(16);
        setField(term3148, term3148.getClass(), "toStringCache", "aJlieCFVtF");
        setField(term3148, term3148.getClass(), "value", term3161);
        setByteField(term3148, term3148.getClass(), "coder", (byte) 89);
        setIntField(term3148, term3148.getClass(), "count", -1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[2];
        args[0] = term3146;
        args[1] = term3148;
        try {
            callMethod(klass, "format", argTypes, term3012, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


