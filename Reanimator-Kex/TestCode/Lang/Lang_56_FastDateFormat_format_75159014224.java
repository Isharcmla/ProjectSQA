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

public class FastDateFormat_format_75159014224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3267;
     Object term3409;
     Object term3410;
     Object term3442;

    public FastDateFormat_format_75159014224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3267 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        Object term3280 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term3285 = (long[]) newLongArray(93);
        int[] term3379 = (int[]) newIntArray(4);
        Object term3392 = newInstance(Class.forName("java.util.Locale"));
        Object term3393 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term3407 = (Object[]) newArray("org.apache.commons.lang.time.FastDateFormat$Rule", 6);
        setField(term3267, term3267.getClass(), "mPattern", "uuaPigETmJ");
        setIntField(term3280, term3280.getClass(), "rawOffset", -10800000);
        setIntField(term3280, term3280.getClass(), "rawOffsetDiff", 0);
        setIntField(term3280, term3280.getClass(), "checksum", -1194895336);
        setIntField(term3280, term3280.getClass(), "dstSavings", 0);
        setLongElement(term3285, 0, -9048018124799999L);
        setLongElement(term3285, 1, -7238510231552000L);
        setLongElement(term3285, 2, -4943698329599950L);
        setLongElement(term3285, 3, -4879820390400000L);
        setLongElement(term3285, 4, -4814335180799950L);
        setLongElement(term3285, 5, -4750648934400000L);
        setLongElement(term3285, 6, -2596125081599950L);
        setLongElement(term3285, 7, -2547995443200000L);
        setLongElement(term3285, 8, -2466953625599950L);
        setLongElement(term3285, 9, -2424147148800000L);
        setLongElement(term3285, 10, -2337782169599950L);
        setLongElement(term3285, 11, -2294621798400000L);
        setLongElement(term3285, 12, -2208256819199950L);
        setLongElement(term3285, 13, -2176421068800000L);
        setLongElement(term3285, 14, -800464895999950L);
        setLongElement(term3285, 15, -754473369600000L);
        setLongElement(term3285, 16, -635550105599950L);
        setLongElement(term3285, 17, -614685081600000L);
        setLongElement(term3285, 18, -527966207999950L);
        setLongElement(term3285, 19, -496130457600000L);
        setLongElement(term3285, 20, -409411583999950L);
        setLongElement(term3285, 21, -366959001600000L);
        setLongElement(term3285, 22, -280240127999950L);
        setLongElement(term3285, 23, -237433651200000L);
        setLongElement(term3285, 24, 2046969446400050L);
        setLongElement(term3285, 25, 2094022656000000L);
        setLongElement(term3285, 26, 2173309747200050L);
        setLongElement(term3285, 27, 2212931174400000L);
        setLongElement(term3285, 28, 2302481203200050L);
        setLongElement(term3285, 29, 2339625369600000L);
        setLongElement(term3285, 30, 2428821504000050L);
        setLongElement(term3285, 31, 2465965670400000L);
        setLongElement(term3285, 32, 2557639065600050L);
        setLongElement(term3285, 33, 2599737753600000L);
        setLongElement(term3285, 34, 2688933888000050L);
        setLongElement(term3285, 35, 2731032576000000L);
        setLongElement(term3285, 36, 2817751449600050L);
        setLongElement(term3285, 37, 2857372876800000L);
        setLongElement(term3285, 38, 2949046272000050L);
        setLongElement(term3285, 39, 2983713177600000L);
        setLongElement(term3285, 40, 3075386572800050L);
        setLongElement(term3285, 41, 3119962521600000L);
        setLongElement(term3285, 42, 3204204134400050L);
        setLongElement(term3285, 43, 3248780083200000L);
        setLongElement(term3285, 44, 3333021696000050L);
        setLongElement(term3285, 45, 3375120384000000L);
        setLongElement(term3285, 46, 3459361996800050L);
        setLongElement(term3285, 47, 3506415206400000L);
        setLongElement(term3285, 48, 3588533452800050L);
        setLongElement(term3285, 49, 3640187289600000L);
        setLongElement(term3285, 50, 3719474380800050L);
        setLongElement(term3285, 51, 3766527590400000L);
        setLongElement(term3285, 52, 3845814681600050L);
        setLongElement(term3285, 53, 3897822412800000L);
        setLongElement(term3285, 54, 3977109504000050L);
        setLongElement(term3285, 55, 4024162713600000L);
        setLongElement(term3285, 56, 4108404326400050L);
        setLongElement(term3285, 57, 4152980275200000L);
        setLongElement(term3285, 58, 4244653670400050L);
        setLongElement(term3285, 59, 4281797836800000L);
        setLongElement(term3285, 60, 4368516710400050L);
        setLongElement(term3285, 61, 4410615398400000L);
        setLongElement(term3285, 62, 4502996582400050L);
        setLongElement(term3285, 63, 4541910220800000L);
        setLongElement(term3285, 64, 4626151833600050L);
        setLongElement(term3285, 65, 4670727782400000L);
        setLongElement(term3285, 66, 4762401177600050L);
        setLongElement(term3285, 67, 4802022604800000L);
        setLongElement(term3285, 68, 4883786956800050L);
        setLongElement(term3285, 69, 4928362905600000L);
        setLongElement(term3285, 70, 5015081779200050L);
        setLongElement(term3285, 71, 5057180467200000L);
        setLongElement(term3285, 72, 5143899340800050L);
        setLongElement(term3285, 73, 5188475289600000L);
        setLongElement(term3285, 74, 5272716902400050L);
        setLongElement(term3285, 75, 5317292851200000L);
        setLongElement(term3285, 76, 5401534464000050L);
        setLongElement(term3285, 77, 5448587673600000L);
        setLongElement(term3285, 78, 5532829286400050L);
        setLongElement(term3285, 79, 5574927974400000L);
        setLongElement(term3285, 80, 5661646848000050L);
        setLongElement(term3285, 81, 5703745536000000L);
        setLongElement(term3285, 82, 5790464409600050L);
        setLongElement(term3285, 83, 5835040358400000L);
        setLongElement(term3285, 84, 5919281971200050L);
        setLongElement(term3285, 85, 5963857920000000L);
        setLongElement(term3285, 86, 6048099532800050L);
        setLongElement(term3285, 87, 6092675481600000L);
        setLongElement(term3285, 88, 6176917094400050L);
        setLongElement(term3285, 89, 6221493043200000L);
        setLongElement(term3285, 90, 6313166438400050L);
        setLongElement(term3285, 91, 6350310604800000L);
        setLongElement(term3285, 92, 8660547993600000L);
        setField(term3280, term3280.getClass(), "transitions", term3285);
        setIntElement(term3379, 0, -10800000);
        setIntElement(term3379, 1, -11188000);
        setIntElement(term3379, 2, -7200000);
        setIntElement(term3379, 3, 3600000);
        setField(term3280, term3280.getClass(), "offsets", term3379);
        setField(term3280, term3280.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term3280, term3280.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term3280, term3280.getClass(), "dirty", false);
        setField(term3280, term3280.getClass(), "lastRule", null);
        setField(term3280, term3280.getClass(), "ID", "BET");
        setField(term3280, term3280.getClass(), "zoneId", null);
        setField(term3267, term3267.getClass(), "mTimeZone", term3280);
        setBooleanField(term3267, term3267.getClass(), "mTimeZoneForced", true);
        setField(term3393, term3393.getClass(), "language", "be");
        setField(term3393, term3393.getClass(), "script", "");
        setField(term3393, term3393.getClass(), "region", "");
        setField(term3393, term3393.getClass(), "variant", "");
        setIntField(term3393, term3393.getClass(), "hash", 93513949);
        setField(term3392, term3392.getClass(), "baseLocale", term3393);
        setField(term3392, term3392.getClass(), "localeExtensions", null);
        setIntField(term3392, term3392.getClass(), "hashCodeValue", 93513949);
        setField(term3392, term3392.getClass(), "languageTag", null);
        setField(term3267, term3267.getClass(), "mLocale", term3392);
        setBooleanField(term3267, term3267.getClass(), "mLocaleForced", false);
        setField(term3267, term3267.getClass(), "mRules", term3407);
        setIntField(term3267, term3267.getClass(), "mMaxLengthEstimate", -73683645);
        term3409 = newInstance(Class.forName("java.lang.Object"));
        term3410 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term3423 = (byte[]) newByteArray(16);
        setField(term3410, term3410.getClass(), "toStringCache", "MxlszYVzRf");
        setField(term3410, term3410.getClass(), "value", term3423);
        setByteField(term3410, term3410.getClass(), "coder", (byte) 47);
        setIntField(term3410, term3410.getClass(), "count", -226514366);
        term3442 = newInstance(Class.forName("java.text.FieldPosition"));
        Object term3446 = newInstance(Class.forName("java.text.Format$Field"));
        setIntField(term3442, term3442.getClass(), "field", 1193880199);
        setIntField(term3442, term3442.getClass(), "endIndex", -1087774327);
        setIntField(term3442, term3442.getClass(), "beginIndex", -1530420153);
        setField(term3446, term3446.getClass(), "name", "LQFpaHEwXR");
        setField(term3442, term3442.getClass(), "attribute", term3446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.StringBuffer");
        argTypes[2] = Class.forName("java.text.FieldPosition");
        Object[] args = new Object[3];
        args[0] = term3409;
        args[1] = term3410;
        args[2] = term3442;
        callMethod(klass, "format", argTypes, term3267, args);
    }

};


