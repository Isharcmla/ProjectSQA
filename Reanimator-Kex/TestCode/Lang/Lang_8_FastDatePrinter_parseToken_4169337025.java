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
import java.lang.StringIndexOutOfBoundsException;
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FastDatePrinter_parseToken_4169337025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558;
     Object term699;

    public FastDatePrinter_parseToken_4169337025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        Object term571 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term576 = (long[]) newLongArray(68);
        int[] term645 = (int[]) newIntArray(6);
        Object term669 = newInstance(Class.forName("java.util.Locale"));
        Object term670 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term685 = (Object[]) newArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 3);
        setField(term558, term558.getClass(), "mPattern", "xxtlPwDYFs");
        setIntField(term571, term571.getClass(), "rawOffset", 39600000);
        setIntField(term571, term571.getClass(), "rawOffsetDiff", 0);
        setIntField(term571, term571.getClass(), "checksum", -482986545);
        setIntField(term571, term571.getClass(), "dstSavings", 0);
        setLongElement(term576, 0, -9048018124799999L);
        setLongElement(term576, 1, -8319135940607998L);
        setLongElement(term576, 2, -3148023398400000L);
        setLongElement(term576, 3, 1453635993600067L);
        setLongElement(term576, 4, 1518383923200000L);
        setLongElement(term576, 5, 1582807449600067L);
        setLongElement(term576, 6, 1647555379200000L);
        setLongElement(term576, 7, 1711978905600067L);
        setLongElement(term576, 8, 1776726835200000L);
        setLongElement(term576, 9, 1841504256000067L);
        setLongElement(term576, 10, 1905942528000000L);
        setLongElement(term576, 11, 1970351308800067L);
        setLongElement(term576, 12, 2034760089600000L);
        setLongElement(term576, 13, 2099168870400067L);
        setLongElement(term576, 14, 2163577651200000L);
        setLongElement(term576, 15, 2227986432000067L);
        setLongElement(term576, 16, 2292395212800000L);
        setLongElement(term576, 17, 2356803993600067L);
        setLongElement(term576, 18, 2421212774400000L);
        setLongElement(term576, 19, 2485621555200067L);
        setLongElement(term576, 20, 2550030336000000L);
        setLongElement(term576, 21, 2614439116800067L);
        setLongElement(term576, 22, 2681325158400000L);
        setLongElement(term576, 23, 2745733939200064L);
        setLongElement(term576, 24, 2810157465600005L);
        setLongElement(term576, 25, 2849793638400000L);
        setLongElement(term576, 26, 2874551500800067L);
        setLongElement(term576, 27, 2938960281600000L);
        setLongElement(term576, 28, 3003369062400067L);
        setLongElement(term576, 29, 3067777843200000L);
        setLongElement(term576, 30, 3132186624000067L);
        setLongElement(term576, 31, 3196595404800000L);
        setLongElement(term576, 32, 3261004185600067L);
        setLongElement(term576, 33, 3325412966400000L);
        setLongElement(term576, 34, 3392299008000067L);
        setLongElement(term576, 35, 3466616832000000L);
        setLongElement(term576, 36, 3521116569600064L);
        setLongElement(term576, 37, 3595449139200005L);
        setLongElement(term576, 38, 3649948876800064L);
        setLongElement(term576, 39, 3724266700800005L);
        setLongElement(term576, 40, 3778766438400064L);
        setLongElement(term576, 41, 3855561523200005L);
        setLongElement(term576, 42, 3907584000000064L);
        setLongElement(term576, 43, 3984379084800005L);
        setLongElement(term576, 44, 4036401561600064L);
        setLongElement(term576, 45, 4113196646400005L);
        setLongElement(term576, 46, 4167696384000064L);
        setLongElement(term576, 47, 4242014208000005L);
        setLongElement(term576, 48, 4296513945600064L);
        setLongElement(term576, 49, 4370831769600005L);
        setLongElement(term576, 50, 4425331507200064L);
        setLongElement(term576, 51, 4502126592000005L);
        setLongElement(term576, 52, 4554149068800064L);
        setLongElement(term576, 53, 4630944153600005L);
        setLongElement(term576, 54, 4682966630400064L);
        setLongElement(term576, 55, 4759761715200005L);
        setLongElement(term576, 56, 4811784192000064L);
        setLongElement(term576, 57, 4888579276800005L);
        setLongElement(term576, 58, 4943079014400064L);
        setLongElement(term576, 59, 5017396838400005L);
        setLongElement(term576, 60, 5071896576000064L);
        setLongElement(term576, 61, 5146214400000005L);
        setLongElement(term576, 62, 5200714137600064L);
        setLongElement(term576, 63, 5277509222400005L);
        setLongElement(term576, 64, 5329531699200000L);
        setLongElement(term576, 65, 5792764723200005L);
        setLongElement(term576, 66, 5976096768000000L);
        setLongElement(term576, 67, 8660341555200000L);
        setField(term571, term571.getClass(), "transitions", term576);
        setIntElement(term645, 0, 39600000);
        setIntElement(term645, 1, 34248000);
        setIntElement(term645, 2, 32400000);
        setIntElement(term645, 3, 43200000);
        setIntElement(term645, 4, 3600000);
        setIntElement(term645, 5, 36000000);
        setField(term571, term571.getClass(), "offsets", term645);
        setField(term571, term571.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term571, term571.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term571, term571.getClass(), "dirty", false);
        setField(term571, term571.getClass(), "lastRule", null);
        setField(term571, term571.getClass(), "ID", "Asia/Sakhalin");
        setField(term571, term571.getClass(), "zoneId", null);
        setField(term558, term558.getClass(), "mTimeZone", term571);
        setField(term670, term670.getClass(), "language", "ee");
        setField(term670, term670.getClass(), "script", "");
        setField(term670, term670.getClass(), "region", "GH");
        setField(term670, term670.getClass(), "variant", "");
        setIntField(term670, term670.getClass(), "hash", 96354975);
        setField(term669, term669.getClass(), "baseLocale", term670);
        setField(term669, term669.getClass(), "localeExtensions", null);
        setIntField(term669, term669.getClass(), "hashCodeValue", 96354975);
        setField(term669, term669.getClass(), "languageTag", null);
        setField(term558, term558.getClass(), "mLocale", term669);
        setField(term558, term558.getClass(), "mRules", term685);
        setIntField(term558, term558.getClass(), "mMaxLengthEstimate", -616727354);
        term699 = (int[]) newIntArray(4);
        setIntElement(term699, 0, -1955890973);
        setIntElement(term699, 1, -2038273078);
        setIntElement(term699, 2, 1227103734);
        setIntElement(term699, 3, -1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "jJCZpVmanW";
        args[1] = term699;
        try {
            callMethod(klass, "parseToken", argTypes, term558, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


