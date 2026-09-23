package com.fasterxml.jackson.databind.util;

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
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StdDateFormat_getCalendar_186026832338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2208;

    public StdDateFormat_getCalendar_186026832338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2208 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term2213 = (long[]) newLongArray(129);
        int[] term2343 = (int[]) newIntArray(4);
        int[] term2348 = (int[]) newIntArray(10);
        setIntField(term2208, term2208.getClass(), "rawOffset", 45900000);
        setIntField(term2208, term2208.getClass(), "rawOffsetDiff", 0);
        setIntField(term2208, term2208.getClass(), "checksum", 1642562780);
        setIntField(term2208, term2208.getClass(), "dstSavings", 3600000);
        setLongElement(term2213, 0, -9048018124799999L);
        setLongElement(term2213, 1, -3102418944000000L);
        setLongElement(term2213, 2, 625183948800050L);
        setLongElement(term2213, 3, 664820121600000L);
        setLongElement(term2213, 4, 751524249600050L);
        setLongElement(term2213, 5, 798592204800000L);
        setLongElement(term2213, 6, 882819072000050L);
        setLongElement(term2213, 7, 927409766400000L);
        setLongElement(term2213, 8, 1011636633600050L);
        setLongElement(term2213, 9, 1056227328000000L);
        setLongElement(term2213, 10, 1140454195200050L);
        setLongElement(term2213, 11, 1185044889600000L);
        setLongElement(term2213, 12, 1269271756800050L);
        setLongElement(term2213, 13, 1313862451200000L);
        setLongElement(term2213, 14, 1398089318400050L);
        setLongElement(term2213, 15, 1442680012800000L);
        setLongElement(term2213, 16, 1526906880000050L);
        setLongElement(term2213, 17, 1573974835200000L);
        setLongElement(term2213, 18, 1658201702400050L);
        setLongElement(term2213, 19, 1702792396800000L);
        setLongElement(term2213, 20, 1787019264000050L);
        setLongElement(term2213, 21, 1831609958400000L);
        setLongElement(term2213, 22, 1915836825600050L);
        setLongElement(term2213, 23, 1960427520000000L);
        setLongElement(term2213, 24, 2044654387200050L);
        setLongElement(term2213, 25, 2089245081600000L);
        setLongElement(term2213, 26, 2173471948800050L);
        setLongElement(term2213, 27, 2218062643200000L);
        setLongElement(term2213, 28, 2302289510400050L);
        setLongElement(term2213, 29, 2349357465600000L);
        setLongElement(term2213, 30, 2433584332800050L);
        setLongElement(term2213, 31, 2478175027200000L);
        setLongElement(term2213, 32, 2554970112000050L);
        setLongElement(term2213, 33, 2611947110400000L);
        setLongElement(term2213, 34, 2683787673600050L);
        setLongElement(term2213, 35, 2740764672000000L);
        setLongElement(term2213, 36, 2812605235200050L);
        setLongElement(term2213, 37, 2869582233600000L);
        setLongElement(term2213, 38, 2941422796800050L);
        setLongElement(term2213, 39, 3000877056000000L);
        setLongElement(term2213, 40, 3070240358400050L);
        setLongElement(term2213, 41, 3129694617600000L);
        setLongElement(term2213, 42, 3199057920000050L);
        setLongElement(term2213, 43, 3258512179200000L);
        setLongElement(term2213, 44, 3327875481600050L);
        setLongElement(term2213, 45, 3387329740800000L);
        setLongElement(term2213, 46, 3459170304000050L);
        setLongElement(term2213, 47, 3516147302400000L);
        setLongElement(term2213, 48, 3587987865600050L);
        setLongElement(term2213, 49, 3644964864000000L);
        setLongElement(term2213, 50, 3716805427200050L);
        setLongElement(term2213, 51, 3776259686400000L);
        setLongElement(term2213, 52, 3845622988800050L);
        setLongElement(term2213, 53, 3905077248000000L);
        setLongElement(term2213, 54, 3974440550400050L);
        setLongElement(term2213, 55, 4033894809600000L);
        setLongElement(term2213, 56, 4105735372800050L);
        setLongElement(term2213, 57, 4162712371200000L);
        setLongElement(term2213, 58, 4234552934400050L);
        setLongElement(term2213, 59, 4291529932800000L);
        setLongElement(term2213, 60, 4363370496000050L);
        setLongElement(term2213, 61, 4422824755200000L);
        setLongElement(term2213, 62, 4492188057600050L);
        setLongElement(term2213, 63, 4551642316800000L);
        setLongElement(term2213, 64, 4621005619200050L);
        setLongElement(term2213, 65, 4680459878400000L);
        setLongElement(term2213, 66, 4749823180800050L);
        setLongElement(term2213, 67, 4809277440000000L);
        setLongElement(term2213, 68, 4878640742400050L);
        setLongElement(term2213, 69, 4945526784000000L);
        setLongElement(term2213, 70, 5007458304000050L);
        setLongElement(term2213, 71, 5074344345600000L);
        setLongElement(term2213, 72, 5136275865600050L);
        setLongElement(term2213, 73, 5203161907200000L);
        setLongElement(term2213, 74, 5265093427200050L);
        setLongElement(term2213, 75, 5331979468800000L);
        setLongElement(term2213, 76, 5393910988800050L);
        setLongElement(term2213, 77, 5460797030400000L);
        setLongElement(term2213, 78, 5525205811200050L);
        setLongElement(term2213, 79, 5592091852800000L);
        setLongElement(term2213, 80, 5654023372800050L);
        setLongElement(term2213, 81, 5720909414400000L);
        setLongElement(term2213, 82, 5782840934400050L);
        setLongElement(term2213, 83, 5849726976000000L);
        setLongElement(term2213, 84, 5911658496000050L);
        setLongElement(term2213, 85, 5978544537600000L);
        setLongElement(term2213, 86, 6040476057600050L);
        setLongElement(term2213, 87, 6107362099200000L);
        setLongElement(term2213, 88, 6169293619200050L);
        setLongElement(term2213, 89, 6236179660800000L);
        setLongElement(term2213, 90, 6300588441600050L);
        setLongElement(term2213, 91, 6367474483200000L);
        setLongElement(term2213, 92, 6429406003200050L);
        setLongElement(term2213, 93, 6496292044800000L);
        setLongElement(term2213, 94, 6558223564800050L);
        setLongElement(term2213, 95, 6625109606400000L);
        setLongElement(term2213, 96, 6687041126400050L);
        setLongElement(term2213, 97, 6753927168000000L);
        setLongElement(term2213, 98, 6815858688000050L);
        setLongElement(term2213, 99, 6882744729600000L);
        setLongElement(term2213, 100, 6944676249600050L);
        setLongElement(term2213, 101, 7014039552000000L);
        setLongElement(term2213, 102, 7075971072000050L);
        setLongElement(term2213, 103, 7142857113600000L);
        setLongElement(term2213, 104, 7204788633600050L);
        setLongElement(term2213, 105, 7271674675200000L);
        setLongElement(term2213, 106, 7333606195200050L);
        setLongElement(term2213, 107, 7400492236800000L);
        setLongElement(term2213, 108, 7462423756800050L);
        setLongElement(term2213, 109, 7529309798400000L);
        setLongElement(term2213, 110, 7591241318400050L);
        setLongElement(term2213, 111, 7658127360000000L);
        setLongElement(term2213, 112, 7722536140800050L);
        setLongElement(term2213, 113, 7789422182400000L);
        setLongElement(term2213, 114, 7851353702400050L);
        setLongElement(term2213, 115, 7918239744000000L);
        setLongElement(term2213, 116, 7980171264000050L);
        setLongElement(term2213, 117, 8047057305600000L);
        setLongElement(term2213, 118, 8108988825600050L);
        setLongElement(term2213, 119, 8175874867200000L);
        setLongElement(term2213, 120, 8237806387200050L);
        setLongElement(term2213, 121, 8304692428800000L);
        setLongElement(term2213, 122, 8366623948800050L);
        setLongElement(term2213, 123, 8433509990400000L);
        setLongElement(term2213, 124, 8497918771200050L);
        setLongElement(term2213, 125, 8564804812800000L);
        setLongElement(term2213, 126, 8626736332800050L);
        setLongElement(term2213, 127, 8693622374400000L);
        setLongElement(term2213, 128, 8755553894400050L);
        setField(term2208, term2208.getClass(), "transitions", term2213);
        setIntElement(term2343, 0, 45900000);
        setIntElement(term2343, 1, 44100000);
        setIntElement(term2343, 2, 49500000);
        setIntElement(term2343, 3, 3600000);
        setField(term2208, term2208.getClass(), "offsets", term2343);
        setIntElement(term2348, 0, 8);
        setIntElement(term2348, 1, -1);
        setIntElement(term2348, 2, 1);
        setIntElement(term2348, 3, 9900000);
        setIntElement(term2348, 4, 1);
        setIntElement(term2348, 5, 3);
        setIntElement(term2348, 6, 1);
        setIntElement(term2348, 7, -1);
        setIntElement(term2348, 8, 9900000);
        setIntElement(term2348, 9, 1);
        setField(term2208, term2208.getClass(), "simpleTimeZoneParams", term2348);
        setBooleanField(term2208, term2208.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term2208, term2208.getClass(), "dirty", false);
        setField(term2208, term2208.getClass(), "lastRule", null);
        setField(term2208, term2208.getClass(), "ID", "Pacific/Chatham");
        setField(term2208, term2208.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[1];
        args[0] = term2208;
        callMethod(klass, "_getCalendar", argTypes, null, args);
    }

};


