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
import java.lang.IllegalArgumentException;
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FastDatePrinter_parsePattern_159743913124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218;

    public FastDatePrinter_parsePattern_159743913124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        Object term231 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term236 = (long[]) newLongArray(118);
        int[] term355 = (int[]) newIntArray(5);
        Object term385 = newInstance(Class.forName("java.util.Locale"));
        Object term386 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term400 = (Object[]) newArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 4);
        setField(term218, term218.getClass(), "mPattern", "MuLcgQHgqz");
        setIntField(term231, term231.getClass(), "rawOffset", -10800000);
        setIntField(term231, term231.getClass(), "rawOffsetDiff", 0);
        setIntField(term231, term231.getClass(), "checksum", 1279121726);
        setIntField(term231, term231.getClass(), "dstSavings", 0);
        setLongElement(term236, 0, -9048018124799999L);
        setLongElement(term236, 1, -7752341237759998L);
        setLongElement(term236, 2, -6915730636799999L);
        setLongElement(term236, 3, -6632265461759997L);
        setLongElement(term236, 4, -6528231014399999L);
        setLongElement(term236, 5, -5472199618559933L);
        setLongElement(term236, 6, -5396830617599998L);
        setLongElement(term236, 7, -5342670028799933L);
        setLongElement(term236, 8, -5267659161599998L);
        setLongElement(term236, 9, -5213498572799933L);
        setLongElement(term236, 10, -5138487705599998L);
        setLongElement(term236, 11, -5084327116799933L);
        setLongElement(term236, 12, -5009316249599998L);
        setLongElement(term236, 13, -4955155660799933L);
        setLongElement(term236, 14, -4879790899199998L);
        setLongElement(term236, 15, -4825630310399997L);
        setLongElement(term236, 16, -3565780991999998L);
        setLongElement(term236, 17, -3544178687999997L);
        setLongElement(term236, 18, -3017244671999933L);
        setLongElement(term236, 19, -2941157375999998L);
        setLongElement(term236, 20, -2923108761599997L);
        setLongElement(term236, 21, -149992243199936L);
        setLongElement(term236, 22, -97984511999997L);
        setLongElement(term236, 23, -13742899199936L);
        setLongElement(term236, 24, 30833049600003L);
        setLongElement(term236, 25, 100211097600064L);
        setLongElement(term236, 26, 154696089600003L);
        setLongElement(term236, 27, 229028659200064L);
        setLongElement(term236, 28, 283513651200003L);
        setLongElement(term236, 29, 360323481600064L);
        setLongElement(term236, 30, 412331212800003L);
        setLongElement(term236, 31, 484186521600064L);
        setLongElement(term236, 32, 541148774400003L);
        setLongElement(term236, 33, 617958604800064L);
        setLongElement(term236, 34, 669966336000003L);
        setLongElement(term236, 35, 746776166400064L);
        setLongElement(term236, 36, 801261158400003L);
        setLongElement(term236, 37, 875593728000064L);
        setLongElement(term236, 38, 930078720000003L);
        setLongElement(term236, 39, 1004411289600064L);
        setLongElement(term236, 40, 1058896281600003L);
        setLongElement(term236, 41, 1135706112000064L);
        setLongElement(term236, 42, 1187713843200003L);
        setLongElement(term236, 43, 1264523673600064L);
        setLongElement(term236, 44, 1316531404800003L);
        setLongElement(term236, 45, 1393341235200064L);
        setLongElement(term236, 46, 1447826227200003L);
        setLongElement(term236, 47, 1522158796800064L);
        setLongElement(term236, 48, 1576643788800003L);
        setLongElement(term236, 49, 1650976358400064L);
        setLongElement(term236, 50, 1705461350400003L);
        setLongElement(term236, 51, 1779793920000064L);
        setLongElement(term236, 52, 1834278912000003L);
        setLongElement(term236, 53, 1911088742400064L);
        setLongElement(term236, 54, 1963096473600003L);
        setLongElement(term236, 55, 2039906304000064L);
        setLongElement(term236, 56, 2091914035200003L);
        setLongElement(term236, 57, 2168723865600064L);
        setLongElement(term236, 58, 2233117900800003L);
        setLongElement(term236, 59, 2297541427200064L);
        setLongElement(term236, 60, 2352026419200003L);
        setLongElement(term236, 61, 2426358988800064L);
        setLongElement(term236, 62, 2480843980800003L);
        setLongElement(term236, 63, 2557653811200064L);
        setLongElement(term236, 64, 2609661542400003L);
        setLongElement(term236, 65, 2676562329600064L);
        setLongElement(term236, 66, 2738479104000003L);
        setLongElement(term236, 67, 2815288934400064L);
        setLongElement(term236, 68, 2869773926400003L);
        setLongElement(term236, 69, 2944106496000064L);
        setLongElement(term236, 70, 2998591488000003L);
        setLongElement(term236, 71, 3072924057600064L);
        setLongElement(term236, 72, 3127409049600003L);
        setLongElement(term236, 73, 3201741619200064L);
        setLongElement(term236, 74, 3256226611200003L);
        setLongElement(term236, 75, 3333036441600064L);
        setLongElement(term236, 76, 3385044172800003L);
        setLongElement(term236, 77, 3461854003200064L);
        setLongElement(term236, 78, 3521293516800003L);
        setLongElement(term236, 79, 3590671564800064L);
        setLongElement(term236, 80, 3645156556800003L);
        setLongElement(term236, 81, 3714534604800064L);
        setLongElement(term236, 82, 3781405900800003L);
        setLongElement(term236, 83, 3848306688000064L);
        setLongElement(term236, 84, 3902791680000003L);
        setLongElement(term236, 85, 3979601510400064L);
        setLongElement(term236, 86, 4031609241600003L);
        setLongElement(term236, 87, 4108419072000064L);
        setLongElement(term236, 88, 4160426803200003L);
        setLongElement(term236, 89, 4237236633600064L);
        setLongElement(term236, 90, 4289244364800003L);
        setLongElement(term236, 91, 4366054195200064L);
        setLongElement(term236, 92, 4420539187200003L);
        setLongElement(term236, 93, 4494871756800064L);
        setLongElement(term236, 94, 4549356748800003L);
        setLongElement(term236, 95, 4623689318400064L);
        setLongElement(term236, 96, 4678174310400003L);
        setLongElement(term236, 97, 4754984140800064L);
        setLongElement(term236, 98, 4806991872000003L);
        setLongElement(term236, 99, 4883801702400064L);
        setLongElement(term236, 100, 4943241216000003L);
        setLongElement(term236, 101, 5012619264000064L);
        setLongElement(term236, 102, 5067104256000003L);
        setLongElement(term236, 103, 5141436825600064L);
        setLongElement(term236, 104, 5203353600000003L);
        setLongElement(term236, 105, 5270254387200064L);
        setLongElement(term236, 106, 5344557465600003L);
        setLongElement(term236, 107, 5381731123200064L);
        setLongElement(term236, 108, 5470897766400003L);
        setLongElement(term236, 109, 5515503206400064L);
        setLongElement(term236, 110, 5599715328000003L);
        setLongElement(term236, 111, 5646798028800064L);
        setLongElement(term236, 112, 5728532889600003L);
        setLongElement(term236, 113, 5775615590400064L);
        setLongElement(term236, 114, 5993599795200003L);
        setLongElement(term236, 115, 6025818931200064L);
        setLongElement(term236, 116, 6065440358400000L);
        setLongElement(term236, 117, 8660547993600000L);
        setField(term231, term231.getClass(), "transitions", term236);
        setIntElement(term355, 0, -10800000);
        setIntElement(term355, 1, -16965000);
        setIntElement(term355, 2, -18000000);
        setIntElement(term355, 3, -14400000);
        setIntElement(term355, 4, 3600000);
        setField(term231, term231.getClass(), "offsets", term355);
        setField(term231, term231.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term231, term231.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term231, term231.getClass(), "dirty", false);
        setField(term231, term231.getClass(), "lastRule", null);
        setField(term231, term231.getClass(), "ID", "America/Punta_Arenas");
        setField(term231, term231.getClass(), "zoneId", null);
        setField(term218, term218.getClass(), "mTimeZone", term231);
        setField(term386, term386.getClass(), "language", "kab");
        setField(term386, term386.getClass(), "script", "");
        setField(term386, term386.getClass(), "region", "");
        setField(term386, term386.getClass(), "variant", "");
        setIntField(term386, term386.getClass(), "hash", -1139147084);
        setField(term385, term385.getClass(), "baseLocale", term386);
        setField(term385, term385.getClass(), "localeExtensions", null);
        setIntField(term385, term385.getClass(), "hashCodeValue", -1139147084);
        setField(term385, term385.getClass(), "languageTag", null);
        setField(term218, term218.getClass(), "mLocale", term385);
        setField(term218, term218.getClass(), "mRules", term400);
        setIntField(term218, term218.getClass(), "mMaxLengthEstimate", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parsePattern", argTypes, term218, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


