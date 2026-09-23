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
import java.lang.Integer;

public class FastDateFormat_getDateInstance_15874640957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281;
     Object term283;

    public FastDateFormat_getDateInstance_15874640957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281 = new Integer(1484323161);
        term283 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term288 = (long[]) newLongArray(118);
        int[] term407 = (int[]) newIntArray(5);
        setIntField(term283, term283.getClass(), "rawOffset", -10800000);
        setIntField(term283, term283.getClass(), "rawOffsetDiff", 0);
        setIntField(term283, term283.getClass(), "checksum", 1279121726);
        setIntField(term283, term283.getClass(), "dstSavings", 0);
        setLongElement(term288, 0, -9048018124799999L);
        setLongElement(term288, 1, -7752341237759998L);
        setLongElement(term288, 2, -6915730636799999L);
        setLongElement(term288, 3, -6632265461759997L);
        setLongElement(term288, 4, -6528231014399999L);
        setLongElement(term288, 5, -5472199618559933L);
        setLongElement(term288, 6, -5396830617599998L);
        setLongElement(term288, 7, -5342670028799933L);
        setLongElement(term288, 8, -5267659161599998L);
        setLongElement(term288, 9, -5213498572799933L);
        setLongElement(term288, 10, -5138487705599998L);
        setLongElement(term288, 11, -5084327116799933L);
        setLongElement(term288, 12, -5009316249599998L);
        setLongElement(term288, 13, -4955155660799933L);
        setLongElement(term288, 14, -4879790899199998L);
        setLongElement(term288, 15, -4825630310399997L);
        setLongElement(term288, 16, -3565780991999998L);
        setLongElement(term288, 17, -3544178687999997L);
        setLongElement(term288, 18, -3017244671999933L);
        setLongElement(term288, 19, -2941157375999998L);
        setLongElement(term288, 20, -2923108761599997L);
        setLongElement(term288, 21, -149992243199936L);
        setLongElement(term288, 22, -97984511999997L);
        setLongElement(term288, 23, -13742899199936L);
        setLongElement(term288, 24, 30833049600003L);
        setLongElement(term288, 25, 100211097600064L);
        setLongElement(term288, 26, 154696089600003L);
        setLongElement(term288, 27, 229028659200064L);
        setLongElement(term288, 28, 283513651200003L);
        setLongElement(term288, 29, 360323481600064L);
        setLongElement(term288, 30, 412331212800003L);
        setLongElement(term288, 31, 484186521600064L);
        setLongElement(term288, 32, 541148774400003L);
        setLongElement(term288, 33, 617958604800064L);
        setLongElement(term288, 34, 669966336000003L);
        setLongElement(term288, 35, 746776166400064L);
        setLongElement(term288, 36, 801261158400003L);
        setLongElement(term288, 37, 875593728000064L);
        setLongElement(term288, 38, 930078720000003L);
        setLongElement(term288, 39, 1004411289600064L);
        setLongElement(term288, 40, 1058896281600003L);
        setLongElement(term288, 41, 1135706112000064L);
        setLongElement(term288, 42, 1187713843200003L);
        setLongElement(term288, 43, 1264523673600064L);
        setLongElement(term288, 44, 1316531404800003L);
        setLongElement(term288, 45, 1393341235200064L);
        setLongElement(term288, 46, 1447826227200003L);
        setLongElement(term288, 47, 1522158796800064L);
        setLongElement(term288, 48, 1576643788800003L);
        setLongElement(term288, 49, 1650976358400064L);
        setLongElement(term288, 50, 1705461350400003L);
        setLongElement(term288, 51, 1779793920000064L);
        setLongElement(term288, 52, 1834278912000003L);
        setLongElement(term288, 53, 1911088742400064L);
        setLongElement(term288, 54, 1963096473600003L);
        setLongElement(term288, 55, 2039906304000064L);
        setLongElement(term288, 56, 2091914035200003L);
        setLongElement(term288, 57, 2168723865600064L);
        setLongElement(term288, 58, 2233117900800003L);
        setLongElement(term288, 59, 2297541427200064L);
        setLongElement(term288, 60, 2352026419200003L);
        setLongElement(term288, 61, 2426358988800064L);
        setLongElement(term288, 62, 2480843980800003L);
        setLongElement(term288, 63, 2557653811200064L);
        setLongElement(term288, 64, 2609661542400003L);
        setLongElement(term288, 65, 2676562329600064L);
        setLongElement(term288, 66, 2738479104000003L);
        setLongElement(term288, 67, 2815288934400064L);
        setLongElement(term288, 68, 2869773926400003L);
        setLongElement(term288, 69, 2944106496000064L);
        setLongElement(term288, 70, 2998591488000003L);
        setLongElement(term288, 71, 3072924057600064L);
        setLongElement(term288, 72, 3127409049600003L);
        setLongElement(term288, 73, 3201741619200064L);
        setLongElement(term288, 74, 3256226611200003L);
        setLongElement(term288, 75, 3333036441600064L);
        setLongElement(term288, 76, 3385044172800003L);
        setLongElement(term288, 77, 3461854003200064L);
        setLongElement(term288, 78, 3521293516800003L);
        setLongElement(term288, 79, 3590671564800064L);
        setLongElement(term288, 80, 3645156556800003L);
        setLongElement(term288, 81, 3714534604800064L);
        setLongElement(term288, 82, 3781405900800003L);
        setLongElement(term288, 83, 3848306688000064L);
        setLongElement(term288, 84, 3902791680000003L);
        setLongElement(term288, 85, 3979601510400064L);
        setLongElement(term288, 86, 4031609241600003L);
        setLongElement(term288, 87, 4108419072000064L);
        setLongElement(term288, 88, 4160426803200003L);
        setLongElement(term288, 89, 4237236633600064L);
        setLongElement(term288, 90, 4289244364800003L);
        setLongElement(term288, 91, 4366054195200064L);
        setLongElement(term288, 92, 4420539187200003L);
        setLongElement(term288, 93, 4494871756800064L);
        setLongElement(term288, 94, 4549356748800003L);
        setLongElement(term288, 95, 4623689318400064L);
        setLongElement(term288, 96, 4678174310400003L);
        setLongElement(term288, 97, 4754984140800064L);
        setLongElement(term288, 98, 4806991872000003L);
        setLongElement(term288, 99, 4883801702400064L);
        setLongElement(term288, 100, 4943241216000003L);
        setLongElement(term288, 101, 5012619264000064L);
        setLongElement(term288, 102, 5067104256000003L);
        setLongElement(term288, 103, 5141436825600064L);
        setLongElement(term288, 104, 5203353600000003L);
        setLongElement(term288, 105, 5270254387200064L);
        setLongElement(term288, 106, 5344557465600003L);
        setLongElement(term288, 107, 5381731123200064L);
        setLongElement(term288, 108, 5470897766400003L);
        setLongElement(term288, 109, 5515503206400064L);
        setLongElement(term288, 110, 5599715328000003L);
        setLongElement(term288, 111, 5646798028800064L);
        setLongElement(term288, 112, 5728532889600003L);
        setLongElement(term288, 113, 5775615590400064L);
        setLongElement(term288, 114, 5993599795200003L);
        setLongElement(term288, 115, 6025818931200064L);
        setLongElement(term288, 116, 6065440358400000L);
        setLongElement(term288, 117, 8660547993600000L);
        setField(term283, term283.getClass(), "transitions", term288);
        setIntElement(term407, 0, -10800000);
        setIntElement(term407, 1, -16965000);
        setIntElement(term407, 2, -18000000);
        setIntElement(term407, 3, -14400000);
        setIntElement(term407, 4, 3600000);
        setField(term283, term283.getClass(), "offsets", term407);
        setField(term283, term283.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term283, term283.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term283, term283.getClass(), "dirty", false);
        setField(term283, term283.getClass(), "lastRule", null);
        setField(term283, term283.getClass(), "ID", "America/Punta_Arenas");
        setField(term283, term283.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[2];
        args[0] = term281;
        args[1] = term283;
        callMethod(klass, "getDateInstance", argTypes, null, args);
    }

};


