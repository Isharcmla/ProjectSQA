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
import java.lang.Integer;
import java.lang.Object;

public class FastDateFormat_getDateInstance_4173843918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term580;
     Object term582;
     Object term680;

    public FastDateFormat_getDateInstance_4173843918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term580 = new Integer(391863371);
        term582 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term587 = (long[]) newLongArray(68);
        int[] term656 = (int[]) newIntArray(6);
        setIntField(term582, term582.getClass(), "rawOffset", 39600000);
        setIntField(term582, term582.getClass(), "rawOffsetDiff", 0);
        setIntField(term582, term582.getClass(), "checksum", -482986545);
        setIntField(term582, term582.getClass(), "dstSavings", 0);
        setLongElement(term587, 0, -9048018124799999L);
        setLongElement(term587, 1, -8319135940607998L);
        setLongElement(term587, 2, -3148023398400000L);
        setLongElement(term587, 3, 1453635993600067L);
        setLongElement(term587, 4, 1518383923200000L);
        setLongElement(term587, 5, 1582807449600067L);
        setLongElement(term587, 6, 1647555379200000L);
        setLongElement(term587, 7, 1711978905600067L);
        setLongElement(term587, 8, 1776726835200000L);
        setLongElement(term587, 9, 1841504256000067L);
        setLongElement(term587, 10, 1905942528000000L);
        setLongElement(term587, 11, 1970351308800067L);
        setLongElement(term587, 12, 2034760089600000L);
        setLongElement(term587, 13, 2099168870400067L);
        setLongElement(term587, 14, 2163577651200000L);
        setLongElement(term587, 15, 2227986432000067L);
        setLongElement(term587, 16, 2292395212800000L);
        setLongElement(term587, 17, 2356803993600067L);
        setLongElement(term587, 18, 2421212774400000L);
        setLongElement(term587, 19, 2485621555200067L);
        setLongElement(term587, 20, 2550030336000000L);
        setLongElement(term587, 21, 2614439116800067L);
        setLongElement(term587, 22, 2681325158400000L);
        setLongElement(term587, 23, 2745733939200064L);
        setLongElement(term587, 24, 2810157465600005L);
        setLongElement(term587, 25, 2849793638400000L);
        setLongElement(term587, 26, 2874551500800067L);
        setLongElement(term587, 27, 2938960281600000L);
        setLongElement(term587, 28, 3003369062400067L);
        setLongElement(term587, 29, 3067777843200000L);
        setLongElement(term587, 30, 3132186624000067L);
        setLongElement(term587, 31, 3196595404800000L);
        setLongElement(term587, 32, 3261004185600067L);
        setLongElement(term587, 33, 3325412966400000L);
        setLongElement(term587, 34, 3392299008000067L);
        setLongElement(term587, 35, 3466616832000000L);
        setLongElement(term587, 36, 3521116569600064L);
        setLongElement(term587, 37, 3595449139200005L);
        setLongElement(term587, 38, 3649948876800064L);
        setLongElement(term587, 39, 3724266700800005L);
        setLongElement(term587, 40, 3778766438400064L);
        setLongElement(term587, 41, 3855561523200005L);
        setLongElement(term587, 42, 3907584000000064L);
        setLongElement(term587, 43, 3984379084800005L);
        setLongElement(term587, 44, 4036401561600064L);
        setLongElement(term587, 45, 4113196646400005L);
        setLongElement(term587, 46, 4167696384000064L);
        setLongElement(term587, 47, 4242014208000005L);
        setLongElement(term587, 48, 4296513945600064L);
        setLongElement(term587, 49, 4370831769600005L);
        setLongElement(term587, 50, 4425331507200064L);
        setLongElement(term587, 51, 4502126592000005L);
        setLongElement(term587, 52, 4554149068800064L);
        setLongElement(term587, 53, 4630944153600005L);
        setLongElement(term587, 54, 4682966630400064L);
        setLongElement(term587, 55, 4759761715200005L);
        setLongElement(term587, 56, 4811784192000064L);
        setLongElement(term587, 57, 4888579276800005L);
        setLongElement(term587, 58, 4943079014400064L);
        setLongElement(term587, 59, 5017396838400005L);
        setLongElement(term587, 60, 5071896576000064L);
        setLongElement(term587, 61, 5146214400000005L);
        setLongElement(term587, 62, 5200714137600064L);
        setLongElement(term587, 63, 5277509222400005L);
        setLongElement(term587, 64, 5329531699200000L);
        setLongElement(term587, 65, 5792764723200005L);
        setLongElement(term587, 66, 5976096768000000L);
        setLongElement(term587, 67, 8660341555200000L);
        setField(term582, term582.getClass(), "transitions", term587);
        setIntElement(term656, 0, 39600000);
        setIntElement(term656, 1, 34248000);
        setIntElement(term656, 2, 32400000);
        setIntElement(term656, 3, 43200000);
        setIntElement(term656, 4, 3600000);
        setIntElement(term656, 5, 36000000);
        setField(term582, term582.getClass(), "offsets", term656);
        setField(term582, term582.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term582, term582.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term582, term582.getClass(), "dirty", false);
        setField(term582, term582.getClass(), "lastRule", null);
        setField(term582, term582.getClass(), "ID", "Asia/Sakhalin");
        setField(term582, term582.getClass(), "zoneId", null);
        term680 = newInstance(Class.forName("java.util.Locale"));
        Object term681 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term681, term681.getClass(), "language", "ee");
        setField(term681, term681.getClass(), "script", "");
        setField(term681, term681.getClass(), "region", "GH");
        setField(term681, term681.getClass(), "variant", "");
        setIntField(term681, term681.getClass(), "hash", 96354975);
        setField(term680, term680.getClass(), "baseLocale", term681);
        setField(term680, term680.getClass(), "localeExtensions", null);
        setIntField(term680, term680.getClass(), "hashCodeValue", 96354975);
        setField(term680, term680.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.TimeZone");
        argTypes[2] = Class.forName("java.util.Locale");
        Object[] args = new Object[3];
        args[0] = term580;
        args[1] = term582;
        args[2] = term680;
        callMethod(klass, "getDateInstance", argTypes, null, args);
    }

};


