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
import java.lang.Object;

public class FastDatePrinter_getTimeZone_127690613014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5468;

    public FastDatePrinter_getTimeZone_127690613014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5468 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        Object term5481 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term5486 = (long[]) newLongArray(93);
        int[] term5580 = (int[]) newIntArray(4);
        Object term5592 = newInstance(Class.forName("java.util.Locale"));
        Object term5593 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term5606 = (Object[]) newArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 3);
        setField(term5468, term5468.getClass(), "mPattern", "RkybSrpybU");
        setIntField(term5481, term5481.getClass(), "rawOffset", -10800000);
        setIntField(term5481, term5481.getClass(), "rawOffsetDiff", 0);
        setIntField(term5481, term5481.getClass(), "checksum", -1194895336);
        setIntField(term5481, term5481.getClass(), "dstSavings", 0);
        setLongElement(term5486, 0, -9048018124799999L);
        setLongElement(term5486, 1, -7238510231552000L);
        setLongElement(term5486, 2, -4943698329599950L);
        setLongElement(term5486, 3, -4879820390400000L);
        setLongElement(term5486, 4, -4814335180799950L);
        setLongElement(term5486, 5, -4750648934400000L);
        setLongElement(term5486, 6, -2596125081599950L);
        setLongElement(term5486, 7, -2547995443200000L);
        setLongElement(term5486, 8, -2466953625599950L);
        setLongElement(term5486, 9, -2424147148800000L);
        setLongElement(term5486, 10, -2337782169599950L);
        setLongElement(term5486, 11, -2294621798400000L);
        setLongElement(term5486, 12, -2208256819199950L);
        setLongElement(term5486, 13, -2176421068800000L);
        setLongElement(term5486, 14, -800464895999950L);
        setLongElement(term5486, 15, -754473369600000L);
        setLongElement(term5486, 16, -635550105599950L);
        setLongElement(term5486, 17, -614685081600000L);
        setLongElement(term5486, 18, -527966207999950L);
        setLongElement(term5486, 19, -496130457600000L);
        setLongElement(term5486, 20, -409411583999950L);
        setLongElement(term5486, 21, -366959001600000L);
        setLongElement(term5486, 22, -280240127999950L);
        setLongElement(term5486, 23, -237433651200000L);
        setLongElement(term5486, 24, 2046969446400050L);
        setLongElement(term5486, 25, 2094022656000000L);
        setLongElement(term5486, 26, 2173309747200050L);
        setLongElement(term5486, 27, 2212931174400000L);
        setLongElement(term5486, 28, 2302481203200050L);
        setLongElement(term5486, 29, 2339625369600000L);
        setLongElement(term5486, 30, 2428821504000050L);
        setLongElement(term5486, 31, 2465965670400000L);
        setLongElement(term5486, 32, 2557639065600050L);
        setLongElement(term5486, 33, 2599737753600000L);
        setLongElement(term5486, 34, 2688933888000050L);
        setLongElement(term5486, 35, 2731032576000000L);
        setLongElement(term5486, 36, 2817751449600050L);
        setLongElement(term5486, 37, 2857372876800000L);
        setLongElement(term5486, 38, 2949046272000050L);
        setLongElement(term5486, 39, 2983713177600000L);
        setLongElement(term5486, 40, 3075386572800050L);
        setLongElement(term5486, 41, 3119962521600000L);
        setLongElement(term5486, 42, 3204204134400050L);
        setLongElement(term5486, 43, 3248780083200000L);
        setLongElement(term5486, 44, 3333021696000050L);
        setLongElement(term5486, 45, 3375120384000000L);
        setLongElement(term5486, 46, 3459361996800050L);
        setLongElement(term5486, 47, 3506415206400000L);
        setLongElement(term5486, 48, 3588533452800050L);
        setLongElement(term5486, 49, 3640187289600000L);
        setLongElement(term5486, 50, 3719474380800050L);
        setLongElement(term5486, 51, 3766527590400000L);
        setLongElement(term5486, 52, 3845814681600050L);
        setLongElement(term5486, 53, 3897822412800000L);
        setLongElement(term5486, 54, 3977109504000050L);
        setLongElement(term5486, 55, 4024162713600000L);
        setLongElement(term5486, 56, 4108404326400050L);
        setLongElement(term5486, 57, 4152980275200000L);
        setLongElement(term5486, 58, 4244653670400050L);
        setLongElement(term5486, 59, 4281797836800000L);
        setLongElement(term5486, 60, 4368516710400050L);
        setLongElement(term5486, 61, 4410615398400000L);
        setLongElement(term5486, 62, 4502996582400050L);
        setLongElement(term5486, 63, 4541910220800000L);
        setLongElement(term5486, 64, 4626151833600050L);
        setLongElement(term5486, 65, 4670727782400000L);
        setLongElement(term5486, 66, 4762401177600050L);
        setLongElement(term5486, 67, 4802022604800000L);
        setLongElement(term5486, 68, 4883786956800050L);
        setLongElement(term5486, 69, 4928362905600000L);
        setLongElement(term5486, 70, 5015081779200050L);
        setLongElement(term5486, 71, 5057180467200000L);
        setLongElement(term5486, 72, 5143899340800050L);
        setLongElement(term5486, 73, 5188475289600000L);
        setLongElement(term5486, 74, 5272716902400050L);
        setLongElement(term5486, 75, 5317292851200000L);
        setLongElement(term5486, 76, 5401534464000050L);
        setLongElement(term5486, 77, 5448587673600000L);
        setLongElement(term5486, 78, 5532829286400050L);
        setLongElement(term5486, 79, 5574927974400000L);
        setLongElement(term5486, 80, 5661646848000050L);
        setLongElement(term5486, 81, 5703745536000000L);
        setLongElement(term5486, 82, 5790464409600050L);
        setLongElement(term5486, 83, 5835040358400000L);
        setLongElement(term5486, 84, 5919281971200050L);
        setLongElement(term5486, 85, 5963857920000000L);
        setLongElement(term5486, 86, 6048099532800050L);
        setLongElement(term5486, 87, 6092675481600000L);
        setLongElement(term5486, 88, 6176917094400050L);
        setLongElement(term5486, 89, 6221493043200000L);
        setLongElement(term5486, 90, 6313166438400050L);
        setLongElement(term5486, 91, 6350310604800000L);
        setLongElement(term5486, 92, 8660547993600000L);
        setField(term5481, term5481.getClass(), "transitions", term5486);
        setIntElement(term5580, 0, -10800000);
        setIntElement(term5580, 1, -11188000);
        setIntElement(term5580, 2, -7200000);
        setIntElement(term5580, 3, 3600000);
        setField(term5481, term5481.getClass(), "offsets", term5580);
        setField(term5481, term5481.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term5481, term5481.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term5481, term5481.getClass(), "dirty", false);
        setField(term5481, term5481.getClass(), "lastRule", null);
        setField(term5481, term5481.getClass(), "ID", "BET");
        setField(term5481, term5481.getClass(), "zoneId", null);
        setField(term5468, term5468.getClass(), "mTimeZone", term5481);
        setField(term5593, term5593.getClass(), "language", "be");
        setField(term5593, term5593.getClass(), "script", "");
        setField(term5593, term5593.getClass(), "region", "");
        setField(term5593, term5593.getClass(), "variant", "");
        setIntField(term5593, term5593.getClass(), "hash", 93513949);
        setField(term5592, term5592.getClass(), "baseLocale", term5593);
        setField(term5592, term5592.getClass(), "localeExtensions", null);
        setIntField(term5592, term5592.getClass(), "hashCodeValue", 93513949);
        setField(term5592, term5592.getClass(), "languageTag", null);
        setField(term5468, term5468.getClass(), "mLocale", term5592);
        setField(term5468, term5468.getClass(), "mRules", term5606);
        setIntField(term5468, term5468.getClass(), "mMaxLengthEstimate", 767834723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeZone", argTypes, term5468, args);
    }

};


