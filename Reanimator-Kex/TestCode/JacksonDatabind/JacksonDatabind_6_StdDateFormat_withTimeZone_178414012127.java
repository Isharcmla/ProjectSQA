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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StdDateFormat_withTimeZone_178414012127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155;

    public StdDateFormat_withTimeZone_178414012127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term160 = (long[]) newLongArray(118);
        int[] term279 = (int[]) newIntArray(5);
        setIntField(term155, term155.getClass(), "rawOffset", -10800000);
        setIntField(term155, term155.getClass(), "rawOffsetDiff", 0);
        setIntField(term155, term155.getClass(), "checksum", 1279121726);
        setIntField(term155, term155.getClass(), "dstSavings", 0);
        setLongElement(term160, 0, -9048018124799999L);
        setLongElement(term160, 1, -7752341237759998L);
        setLongElement(term160, 2, -6915730636799999L);
        setLongElement(term160, 3, -6632265461759997L);
        setLongElement(term160, 4, -6528231014399999L);
        setLongElement(term160, 5, -5472199618559933L);
        setLongElement(term160, 6, -5396830617599998L);
        setLongElement(term160, 7, -5342670028799933L);
        setLongElement(term160, 8, -5267659161599998L);
        setLongElement(term160, 9, -5213498572799933L);
        setLongElement(term160, 10, -5138487705599998L);
        setLongElement(term160, 11, -5084327116799933L);
        setLongElement(term160, 12, -5009316249599998L);
        setLongElement(term160, 13, -4955155660799933L);
        setLongElement(term160, 14, -4879790899199998L);
        setLongElement(term160, 15, -4825630310399997L);
        setLongElement(term160, 16, -3565780991999998L);
        setLongElement(term160, 17, -3544178687999997L);
        setLongElement(term160, 18, -3017244671999933L);
        setLongElement(term160, 19, -2941157375999998L);
        setLongElement(term160, 20, -2923108761599997L);
        setLongElement(term160, 21, -149992243199936L);
        setLongElement(term160, 22, -97984511999997L);
        setLongElement(term160, 23, -13742899199936L);
        setLongElement(term160, 24, 30833049600003L);
        setLongElement(term160, 25, 100211097600064L);
        setLongElement(term160, 26, 154696089600003L);
        setLongElement(term160, 27, 229028659200064L);
        setLongElement(term160, 28, 283513651200003L);
        setLongElement(term160, 29, 360323481600064L);
        setLongElement(term160, 30, 412331212800003L);
        setLongElement(term160, 31, 484186521600064L);
        setLongElement(term160, 32, 541148774400003L);
        setLongElement(term160, 33, 617958604800064L);
        setLongElement(term160, 34, 669966336000003L);
        setLongElement(term160, 35, 746776166400064L);
        setLongElement(term160, 36, 801261158400003L);
        setLongElement(term160, 37, 875593728000064L);
        setLongElement(term160, 38, 930078720000003L);
        setLongElement(term160, 39, 1004411289600064L);
        setLongElement(term160, 40, 1058896281600003L);
        setLongElement(term160, 41, 1135706112000064L);
        setLongElement(term160, 42, 1187713843200003L);
        setLongElement(term160, 43, 1264523673600064L);
        setLongElement(term160, 44, 1316531404800003L);
        setLongElement(term160, 45, 1393341235200064L);
        setLongElement(term160, 46, 1447826227200003L);
        setLongElement(term160, 47, 1522158796800064L);
        setLongElement(term160, 48, 1576643788800003L);
        setLongElement(term160, 49, 1650976358400064L);
        setLongElement(term160, 50, 1705461350400003L);
        setLongElement(term160, 51, 1779793920000064L);
        setLongElement(term160, 52, 1834278912000003L);
        setLongElement(term160, 53, 1911088742400064L);
        setLongElement(term160, 54, 1963096473600003L);
        setLongElement(term160, 55, 2039906304000064L);
        setLongElement(term160, 56, 2091914035200003L);
        setLongElement(term160, 57, 2168723865600064L);
        setLongElement(term160, 58, 2233117900800003L);
        setLongElement(term160, 59, 2297541427200064L);
        setLongElement(term160, 60, 2352026419200003L);
        setLongElement(term160, 61, 2426358988800064L);
        setLongElement(term160, 62, 2480843980800003L);
        setLongElement(term160, 63, 2557653811200064L);
        setLongElement(term160, 64, 2609661542400003L);
        setLongElement(term160, 65, 2676562329600064L);
        setLongElement(term160, 66, 2738479104000003L);
        setLongElement(term160, 67, 2815288934400064L);
        setLongElement(term160, 68, 2869773926400003L);
        setLongElement(term160, 69, 2944106496000064L);
        setLongElement(term160, 70, 2998591488000003L);
        setLongElement(term160, 71, 3072924057600064L);
        setLongElement(term160, 72, 3127409049600003L);
        setLongElement(term160, 73, 3201741619200064L);
        setLongElement(term160, 74, 3256226611200003L);
        setLongElement(term160, 75, 3333036441600064L);
        setLongElement(term160, 76, 3385044172800003L);
        setLongElement(term160, 77, 3461854003200064L);
        setLongElement(term160, 78, 3521293516800003L);
        setLongElement(term160, 79, 3590671564800064L);
        setLongElement(term160, 80, 3645156556800003L);
        setLongElement(term160, 81, 3714534604800064L);
        setLongElement(term160, 82, 3781405900800003L);
        setLongElement(term160, 83, 3848306688000064L);
        setLongElement(term160, 84, 3902791680000003L);
        setLongElement(term160, 85, 3979601510400064L);
        setLongElement(term160, 86, 4031609241600003L);
        setLongElement(term160, 87, 4108419072000064L);
        setLongElement(term160, 88, 4160426803200003L);
        setLongElement(term160, 89, 4237236633600064L);
        setLongElement(term160, 90, 4289244364800003L);
        setLongElement(term160, 91, 4366054195200064L);
        setLongElement(term160, 92, 4420539187200003L);
        setLongElement(term160, 93, 4494871756800064L);
        setLongElement(term160, 94, 4549356748800003L);
        setLongElement(term160, 95, 4623689318400064L);
        setLongElement(term160, 96, 4678174310400003L);
        setLongElement(term160, 97, 4754984140800064L);
        setLongElement(term160, 98, 4806991872000003L);
        setLongElement(term160, 99, 4883801702400064L);
        setLongElement(term160, 100, 4943241216000003L);
        setLongElement(term160, 101, 5012619264000064L);
        setLongElement(term160, 102, 5067104256000003L);
        setLongElement(term160, 103, 5141436825600064L);
        setLongElement(term160, 104, 5203353600000003L);
        setLongElement(term160, 105, 5270254387200064L);
        setLongElement(term160, 106, 5344557465600003L);
        setLongElement(term160, 107, 5381731123200064L);
        setLongElement(term160, 108, 5470897766400003L);
        setLongElement(term160, 109, 5515503206400064L);
        setLongElement(term160, 110, 5599715328000003L);
        setLongElement(term160, 111, 5646798028800064L);
        setLongElement(term160, 112, 5728532889600003L);
        setLongElement(term160, 113, 5775615590400064L);
        setLongElement(term160, 114, 5993599795200003L);
        setLongElement(term160, 115, 6025818931200064L);
        setLongElement(term160, 116, 6065440358400000L);
        setLongElement(term160, 117, 8660547993600000L);
        setField(term155, term155.getClass(), "transitions", term160);
        setIntElement(term279, 0, -10800000);
        setIntElement(term279, 1, -16965000);
        setIntElement(term279, 2, -18000000);
        setIntElement(term279, 3, -14400000);
        setIntElement(term279, 4, 3600000);
        setField(term155, term155.getClass(), "offsets", term279);
        setField(term155, term155.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term155, term155.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term155, term155.getClass(), "dirty", false);
        setField(term155, term155.getClass(), "lastRule", null);
        setField(term155, term155.getClass(), "ID", "America/Punta_Arenas");
        setField(term155, term155.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[1];
        args[0] = term155;
        try {
            callMethod(klass, "withTimeZone", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


