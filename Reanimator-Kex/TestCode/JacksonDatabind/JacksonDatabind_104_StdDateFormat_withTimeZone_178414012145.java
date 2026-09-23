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

public class StdDateFormat_withTimeZone_178414012145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492;

    public StdDateFormat_withTimeZone_178414012145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term497 = (long[]) newLongArray(68);
        int[] term566 = (int[]) newIntArray(6);
        setIntField(term492, term492.getClass(), "rawOffset", 39600000);
        setIntField(term492, term492.getClass(), "rawOffsetDiff", 0);
        setIntField(term492, term492.getClass(), "checksum", -482986545);
        setIntField(term492, term492.getClass(), "dstSavings", 0);
        setLongElement(term497, 0, -9048018124799999L);
        setLongElement(term497, 1, -8319135940607998L);
        setLongElement(term497, 2, -3148023398400000L);
        setLongElement(term497, 3, 1453635993600067L);
        setLongElement(term497, 4, 1518383923200000L);
        setLongElement(term497, 5, 1582807449600067L);
        setLongElement(term497, 6, 1647555379200000L);
        setLongElement(term497, 7, 1711978905600067L);
        setLongElement(term497, 8, 1776726835200000L);
        setLongElement(term497, 9, 1841504256000067L);
        setLongElement(term497, 10, 1905942528000000L);
        setLongElement(term497, 11, 1970351308800067L);
        setLongElement(term497, 12, 2034760089600000L);
        setLongElement(term497, 13, 2099168870400067L);
        setLongElement(term497, 14, 2163577651200000L);
        setLongElement(term497, 15, 2227986432000067L);
        setLongElement(term497, 16, 2292395212800000L);
        setLongElement(term497, 17, 2356803993600067L);
        setLongElement(term497, 18, 2421212774400000L);
        setLongElement(term497, 19, 2485621555200067L);
        setLongElement(term497, 20, 2550030336000000L);
        setLongElement(term497, 21, 2614439116800067L);
        setLongElement(term497, 22, 2681325158400000L);
        setLongElement(term497, 23, 2745733939200064L);
        setLongElement(term497, 24, 2810157465600005L);
        setLongElement(term497, 25, 2849793638400000L);
        setLongElement(term497, 26, 2874551500800067L);
        setLongElement(term497, 27, 2938960281600000L);
        setLongElement(term497, 28, 3003369062400067L);
        setLongElement(term497, 29, 3067777843200000L);
        setLongElement(term497, 30, 3132186624000067L);
        setLongElement(term497, 31, 3196595404800000L);
        setLongElement(term497, 32, 3261004185600067L);
        setLongElement(term497, 33, 3325412966400000L);
        setLongElement(term497, 34, 3392299008000067L);
        setLongElement(term497, 35, 3466616832000000L);
        setLongElement(term497, 36, 3521116569600064L);
        setLongElement(term497, 37, 3595449139200005L);
        setLongElement(term497, 38, 3649948876800064L);
        setLongElement(term497, 39, 3724266700800005L);
        setLongElement(term497, 40, 3778766438400064L);
        setLongElement(term497, 41, 3855561523200005L);
        setLongElement(term497, 42, 3907584000000064L);
        setLongElement(term497, 43, 3984379084800005L);
        setLongElement(term497, 44, 4036401561600064L);
        setLongElement(term497, 45, 4113196646400005L);
        setLongElement(term497, 46, 4167696384000064L);
        setLongElement(term497, 47, 4242014208000005L);
        setLongElement(term497, 48, 4296513945600064L);
        setLongElement(term497, 49, 4370831769600005L);
        setLongElement(term497, 50, 4425331507200064L);
        setLongElement(term497, 51, 4502126592000005L);
        setLongElement(term497, 52, 4554149068800064L);
        setLongElement(term497, 53, 4630944153600005L);
        setLongElement(term497, 54, 4682966630400064L);
        setLongElement(term497, 55, 4759761715200005L);
        setLongElement(term497, 56, 4811784192000064L);
        setLongElement(term497, 57, 4888579276800005L);
        setLongElement(term497, 58, 4943079014400064L);
        setLongElement(term497, 59, 5017396838400005L);
        setLongElement(term497, 60, 5071896576000064L);
        setLongElement(term497, 61, 5146214400000005L);
        setLongElement(term497, 62, 5200714137600064L);
        setLongElement(term497, 63, 5277509222400005L);
        setLongElement(term497, 64, 5329531699200000L);
        setLongElement(term497, 65, 5792764723200005L);
        setLongElement(term497, 66, 5976096768000000L);
        setLongElement(term497, 67, 8660341555200000L);
        setField(term492, term492.getClass(), "transitions", term497);
        setIntElement(term566, 0, 39600000);
        setIntElement(term566, 1, 34248000);
        setIntElement(term566, 2, 32400000);
        setIntElement(term566, 3, 43200000);
        setIntElement(term566, 4, 3600000);
        setIntElement(term566, 5, 36000000);
        setField(term492, term492.getClass(), "offsets", term566);
        setField(term492, term492.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term492, term492.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term492, term492.getClass(), "dirty", false);
        setField(term492, term492.getClass(), "lastRule", null);
        setField(term492, term492.getClass(), "ID", "Asia/Sakhalin");
        setField(term492, term492.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[1];
        args[0] = term492;
        try {
            callMethod(klass, "withTimeZone", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


