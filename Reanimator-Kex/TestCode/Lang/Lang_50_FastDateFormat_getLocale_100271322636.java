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

public class FastDateFormat_getLocale_100271322636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7308;

    public FastDateFormat_getLocale_100271322636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7308 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        Object term7321 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term7326 = (long[]) newLongArray(53);
        int[] term7380 = (int[]) newIntArray(6);
        Object term7401 = newInstance(Class.forName("java.util.Locale"));
        Object term7402 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term7418 = (Object[]) newArray("org.apache.commons.lang.time.FastDateFormat$Rule", 2);
        setField(term7308, term7308.getClass(), "mPattern", "OWDIEULEFu");
        setIntField(term7321, term7321.getClass(), "rawOffset", 18000000);
        setIntField(term7321, term7321.getClass(), "rawOffsetDiff", 0);
        setIntField(term7321, term7321.getClass(), "checksum", -214351420);
        setIntField(term7321, term7321.getClass(), "dstSavings", 0);
        setLongElement(term7326, 0, -9048018124799999L);
        setLongElement(term7326, 1, -5903009071103998L);
        setLongElement(term7326, 2, -5109925478400000L);
        setLongElement(term7326, 3, 1453724467200067L);
        setLongElement(term7326, 4, 1518472396800003L);
        setLongElement(term7326, 5, 1582881177600067L);
        setLongElement(term7326, 6, 1647643852800000L);
        setLongElement(term7326, 7, 1712067379200067L);
        setLongElement(term7326, 8, 1776815308800000L);
        setLongElement(term7326, 9, 1841592729600067L);
        setLongElement(term7326, 10, 1906031001600000L);
        setLongElement(term7326, 11, 1970439782400067L);
        setLongElement(term7326, 12, 2034848563200000L);
        setLongElement(term7326, 13, 2099257344000067L);
        setLongElement(term7326, 14, 2163666124800000L);
        setLongElement(term7326, 15, 2228074905600067L);
        setLongElement(term7326, 16, 2292483686400000L);
        setLongElement(term7326, 17, 2356892467200067L);
        setLongElement(term7326, 18, 2421301248000000L);
        setLongElement(term7326, 19, 2485710028800064L);
        setLongElement(term7326, 20, 2550133555200005L);
        setLongElement(term7326, 21, 2614542336000064L);
        setLongElement(term7326, 22, 2681428377600005L);
        setLongElement(term7326, 23, 2745837158400064L);
        setLongElement(term7326, 24, 2810245939200005L);
        setLongElement(term7326, 25, 2849882112000000L);
        setLongElement(term7326, 26, 2874639974400064L);
        setLongElement(term7326, 27, 2939063500800005L);
        setLongElement(term7326, 28, 3003472281600064L);
        setLongElement(term7326, 29, 3067881062400005L);
        setLongElement(term7326, 30, 3132289843200064L);
        setLongElement(term7326, 31, 3196698624000005L);
        setLongElement(term7326, 32, 3261107404800064L);
        setLongElement(term7326, 33, 3325516185600005L);
        setLongElement(term7326, 34, 3392402227200064L);
        setLongElement(term7326, 35, 3466720051200005L);
        setLongElement(term7326, 36, 3521219788800064L);
        setLongElement(term7326, 37, 3595537612800005L);
        setLongElement(term7326, 38, 3650037350400064L);
        setLongElement(term7326, 39, 3724355174400005L);
        setLongElement(term7326, 40, 3778854912000064L);
        setLongElement(term7326, 41, 3855649996800005L);
        setLongElement(term7326, 42, 3907672473600064L);
        setLongElement(term7326, 43, 3984467558400005L);
        setLongElement(term7326, 44, 4036490035200064L);
        setLongElement(term7326, 45, 4113285120000005L);
        setLongElement(term7326, 46, 4167784857600064L);
        setLongElement(term7326, 47, 4242102681600005L);
        setLongElement(term7326, 48, 4296602419200064L);
        setLongElement(term7326, 49, 4370920243200005L);
        setLongElement(term7326, 50, 4425419980800064L);
        setLongElement(term7326, 51, 4502215065600000L);
        setLongElement(term7326, 52, 8660430028800000L);
        setField(term7321, term7321.getClass(), "transitions", term7326);
        setIntElement(term7380, 0, 18000000);
        setIntElement(term7380, 1, 12324000);
        setIntElement(term7380, 2, 10800000);
        setIntElement(term7380, 3, 21600000);
        setIntElement(term7380, 4, 3600000);
        setIntElement(term7380, 5, 14400000);
        setField(term7321, term7321.getClass(), "offsets", term7380);
        setField(term7321, term7321.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term7321, term7321.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term7321, term7321.getClass(), "dirty", false);
        setField(term7321, term7321.getClass(), "lastRule", null);
        setField(term7321, term7321.getClass(), "ID", "Asia/Oral");
        setField(term7321, term7321.getClass(), "zoneId", null);
        setField(term7308, term7308.getClass(), "mTimeZone", term7321);
        setBooleanField(term7308, term7308.getClass(), "mTimeZoneForced", true);
        setField(term7402, term7402.getClass(), "language", "es");
        setField(term7402, term7402.getClass(), "script", "");
        setField(term7402, term7402.getClass(), "region", "EA");
        setField(term7402, term7402.getClass(), "variant", "");
        setIntField(term7402, term7402.getClass(), "hash", 96769910);
        setField(term7401, term7401.getClass(), "baseLocale", term7402);
        setField(term7401, term7401.getClass(), "localeExtensions", null);
        setIntField(term7401, term7401.getClass(), "hashCodeValue", 96769910);
        setField(term7401, term7401.getClass(), "languageTag", null);
        setField(term7308, term7308.getClass(), "mLocale", term7401);
        setBooleanField(term7308, term7308.getClass(), "mLocaleForced", false);
        setField(term7308, term7308.getClass(), "mRules", term7418);
        setIntField(term7308, term7308.getClass(), "mMaxLengthEstimate", -1588772968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocale", argTypes, term7308, args);
    }

};


