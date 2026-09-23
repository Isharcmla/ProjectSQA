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
import java.lang.Long;

public class FastDatePrinter_format_116426915131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2571;
     Object term2776;
     Object term2778;

    public FastDatePrinter_format_116426915131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2571 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        Object term2584 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term2589 = (long[]) newLongArray(129);
        int[] term2719 = (int[]) newIntArray(4);
        int[] term2724 = (int[]) newIntArray(10);
        Object term2754 = newInstance(Class.forName("java.util.Locale"));
        Object term2755 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term2774 = (Object[]) newArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 1);
        setField(term2571, term2571.getClass(), "mPattern", "MxlszYVzRf");
        setIntField(term2584, term2584.getClass(), "rawOffset", 45900000);
        setIntField(term2584, term2584.getClass(), "rawOffsetDiff", 0);
        setIntField(term2584, term2584.getClass(), "checksum", 1642562780);
        setIntField(term2584, term2584.getClass(), "dstSavings", 3600000);
        setLongElement(term2589, 0, -9048018124799999L);
        setLongElement(term2589, 1, -3102418944000000L);
        setLongElement(term2589, 2, 625183948800050L);
        setLongElement(term2589, 3, 664820121600000L);
        setLongElement(term2589, 4, 751524249600050L);
        setLongElement(term2589, 5, 798592204800000L);
        setLongElement(term2589, 6, 882819072000050L);
        setLongElement(term2589, 7, 927409766400000L);
        setLongElement(term2589, 8, 1011636633600050L);
        setLongElement(term2589, 9, 1056227328000000L);
        setLongElement(term2589, 10, 1140454195200050L);
        setLongElement(term2589, 11, 1185044889600000L);
        setLongElement(term2589, 12, 1269271756800050L);
        setLongElement(term2589, 13, 1313862451200000L);
        setLongElement(term2589, 14, 1398089318400050L);
        setLongElement(term2589, 15, 1442680012800000L);
        setLongElement(term2589, 16, 1526906880000050L);
        setLongElement(term2589, 17, 1573974835200000L);
        setLongElement(term2589, 18, 1658201702400050L);
        setLongElement(term2589, 19, 1702792396800000L);
        setLongElement(term2589, 20, 1787019264000050L);
        setLongElement(term2589, 21, 1831609958400000L);
        setLongElement(term2589, 22, 1915836825600050L);
        setLongElement(term2589, 23, 1960427520000000L);
        setLongElement(term2589, 24, 2044654387200050L);
        setLongElement(term2589, 25, 2089245081600000L);
        setLongElement(term2589, 26, 2173471948800050L);
        setLongElement(term2589, 27, 2218062643200000L);
        setLongElement(term2589, 28, 2302289510400050L);
        setLongElement(term2589, 29, 2349357465600000L);
        setLongElement(term2589, 30, 2433584332800050L);
        setLongElement(term2589, 31, 2478175027200000L);
        setLongElement(term2589, 32, 2554970112000050L);
        setLongElement(term2589, 33, 2611947110400000L);
        setLongElement(term2589, 34, 2683787673600050L);
        setLongElement(term2589, 35, 2740764672000000L);
        setLongElement(term2589, 36, 2812605235200050L);
        setLongElement(term2589, 37, 2869582233600000L);
        setLongElement(term2589, 38, 2941422796800050L);
        setLongElement(term2589, 39, 3000877056000000L);
        setLongElement(term2589, 40, 3070240358400050L);
        setLongElement(term2589, 41, 3129694617600000L);
        setLongElement(term2589, 42, 3199057920000050L);
        setLongElement(term2589, 43, 3258512179200000L);
        setLongElement(term2589, 44, 3327875481600050L);
        setLongElement(term2589, 45, 3387329740800000L);
        setLongElement(term2589, 46, 3459170304000050L);
        setLongElement(term2589, 47, 3516147302400000L);
        setLongElement(term2589, 48, 3587987865600050L);
        setLongElement(term2589, 49, 3644964864000000L);
        setLongElement(term2589, 50, 3716805427200050L);
        setLongElement(term2589, 51, 3776259686400000L);
        setLongElement(term2589, 52, 3845622988800050L);
        setLongElement(term2589, 53, 3905077248000000L);
        setLongElement(term2589, 54, 3974440550400050L);
        setLongElement(term2589, 55, 4033894809600000L);
        setLongElement(term2589, 56, 4105735372800050L);
        setLongElement(term2589, 57, 4162712371200000L);
        setLongElement(term2589, 58, 4234552934400050L);
        setLongElement(term2589, 59, 4291529932800000L);
        setLongElement(term2589, 60, 4363370496000050L);
        setLongElement(term2589, 61, 4422824755200000L);
        setLongElement(term2589, 62, 4492188057600050L);
        setLongElement(term2589, 63, 4551642316800000L);
        setLongElement(term2589, 64, 4621005619200050L);
        setLongElement(term2589, 65, 4680459878400000L);
        setLongElement(term2589, 66, 4749823180800050L);
        setLongElement(term2589, 67, 4809277440000000L);
        setLongElement(term2589, 68, 4878640742400050L);
        setLongElement(term2589, 69, 4945526784000000L);
        setLongElement(term2589, 70, 5007458304000050L);
        setLongElement(term2589, 71, 5074344345600000L);
        setLongElement(term2589, 72, 5136275865600050L);
        setLongElement(term2589, 73, 5203161907200000L);
        setLongElement(term2589, 74, 5265093427200050L);
        setLongElement(term2589, 75, 5331979468800000L);
        setLongElement(term2589, 76, 5393910988800050L);
        setLongElement(term2589, 77, 5460797030400000L);
        setLongElement(term2589, 78, 5525205811200050L);
        setLongElement(term2589, 79, 5592091852800000L);
        setLongElement(term2589, 80, 5654023372800050L);
        setLongElement(term2589, 81, 5720909414400000L);
        setLongElement(term2589, 82, 5782840934400050L);
        setLongElement(term2589, 83, 5849726976000000L);
        setLongElement(term2589, 84, 5911658496000050L);
        setLongElement(term2589, 85, 5978544537600000L);
        setLongElement(term2589, 86, 6040476057600050L);
        setLongElement(term2589, 87, 6107362099200000L);
        setLongElement(term2589, 88, 6169293619200050L);
        setLongElement(term2589, 89, 6236179660800000L);
        setLongElement(term2589, 90, 6300588441600050L);
        setLongElement(term2589, 91, 6367474483200000L);
        setLongElement(term2589, 92, 6429406003200050L);
        setLongElement(term2589, 93, 6496292044800000L);
        setLongElement(term2589, 94, 6558223564800050L);
        setLongElement(term2589, 95, 6625109606400000L);
        setLongElement(term2589, 96, 6687041126400050L);
        setLongElement(term2589, 97, 6753927168000000L);
        setLongElement(term2589, 98, 6815858688000050L);
        setLongElement(term2589, 99, 6882744729600000L);
        setLongElement(term2589, 100, 6944676249600050L);
        setLongElement(term2589, 101, 7014039552000000L);
        setLongElement(term2589, 102, 7075971072000050L);
        setLongElement(term2589, 103, 7142857113600000L);
        setLongElement(term2589, 104, 7204788633600050L);
        setLongElement(term2589, 105, 7271674675200000L);
        setLongElement(term2589, 106, 7333606195200050L);
        setLongElement(term2589, 107, 7400492236800000L);
        setLongElement(term2589, 108, 7462423756800050L);
        setLongElement(term2589, 109, 7529309798400000L);
        setLongElement(term2589, 110, 7591241318400050L);
        setLongElement(term2589, 111, 7658127360000000L);
        setLongElement(term2589, 112, 7722536140800050L);
        setLongElement(term2589, 113, 7789422182400000L);
        setLongElement(term2589, 114, 7851353702400050L);
        setLongElement(term2589, 115, 7918239744000000L);
        setLongElement(term2589, 116, 7980171264000050L);
        setLongElement(term2589, 117, 8047057305600000L);
        setLongElement(term2589, 118, 8108988825600050L);
        setLongElement(term2589, 119, 8175874867200000L);
        setLongElement(term2589, 120, 8237806387200050L);
        setLongElement(term2589, 121, 8304692428800000L);
        setLongElement(term2589, 122, 8366623948800050L);
        setLongElement(term2589, 123, 8433509990400000L);
        setLongElement(term2589, 124, 8497918771200050L);
        setLongElement(term2589, 125, 8564804812800000L);
        setLongElement(term2589, 126, 8626736332800050L);
        setLongElement(term2589, 127, 8693622374400000L);
        setLongElement(term2589, 128, 8755553894400050L);
        setField(term2584, term2584.getClass(), "transitions", term2589);
        setIntElement(term2719, 0, 45900000);
        setIntElement(term2719, 1, 44100000);
        setIntElement(term2719, 2, 49500000);
        setIntElement(term2719, 3, 3600000);
        setField(term2584, term2584.getClass(), "offsets", term2719);
        setIntElement(term2724, 0, 8);
        setIntElement(term2724, 1, -1);
        setIntElement(term2724, 2, 1);
        setIntElement(term2724, 3, 9900000);
        setIntElement(term2724, 4, 1);
        setIntElement(term2724, 5, 3);
        setIntElement(term2724, 6, 1);
        setIntElement(term2724, 7, -1);
        setIntElement(term2724, 8, 9900000);
        setIntElement(term2724, 9, 1);
        setField(term2584, term2584.getClass(), "simpleTimeZoneParams", term2724);
        setBooleanField(term2584, term2584.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term2584, term2584.getClass(), "dirty", false);
        setField(term2584, term2584.getClass(), "lastRule", null);
        setField(term2584, term2584.getClass(), "ID", "Pacific/Chatham");
        setField(term2584, term2584.getClass(), "zoneId", null);
        setField(term2571, term2571.getClass(), "mTimeZone", term2584);
        setField(term2755, term2755.getClass(), "language", "zh");
        setField(term2755, term2755.getClass(), "script", "Hans");
        setField(term2755, term2755.getClass(), "region", "MO");
        setField(term2755, term2755.getClass(), "variant", "");
        setIntField(term2755, term2755.getClass(), "hash", -2024855090);
        setField(term2754, term2754.getClass(), "baseLocale", term2755);
        setField(term2754, term2754.getClass(), "localeExtensions", null);
        setIntField(term2754, term2754.getClass(), "hashCodeValue", -2024855090);
        setField(term2754, term2754.getClass(), "languageTag", null);
        setField(term2571, term2571.getClass(), "mLocale", term2754);
        setField(term2571, term2571.getClass(), "mRules", term2774);
        setIntField(term2571, term2571.getClass(), "mMaxLengthEstimate", 865208305);
        term2776 = new Long(6375119433582206027L);
        term2778 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term2791 = (byte[]) newByteArray(16);
        setField(term2778, term2778.getClass(), "toStringCache", "LQFpaHEwXR");
        setField(term2778, term2778.getClass(), "value", term2791);
        setByteField(term2778, term2778.getClass(), "coder", (byte) 48);
        setIntField(term2778, term2778.getClass(), "count", -1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[2];
        args[0] = term2776;
        args[1] = term2778;
        try {
            callMethod(klass, "format", argTypes, term2571, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


