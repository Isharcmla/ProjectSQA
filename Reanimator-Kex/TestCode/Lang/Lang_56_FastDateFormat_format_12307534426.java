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

public class FastDateFormat_format_12307534426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3691;
     Object term3782;

    public FastDateFormat_format_12307534426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3691 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        Object term3704 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term3709 = (long[]) newLongArray(31);
        int[] term3741 = (int[]) newIntArray(4);
        Object term3763 = newInstance(Class.forName("java.util.Locale"));
        Object term3764 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term3780 = (Object[]) newArray("org.apache.commons.lang.time.FastDateFormat$Rule", 6);
        setField(term3691, term3691.getClass(), "mPattern", "aJlieCFVtF");
        setIntField(term3704, term3704.getClass(), "rawOffset", 43200000);
        setIntField(term3704, term3704.getClass(), "rawOffsetDiff", 0);
        setIntField(term3704, term3704.getClass(), "checksum", -2137017291);
        setIntField(term3704, term3704.getClass(), "dstSavings", 0);
        setLongElement(term3709, 0, -9048018124799999L);
        setLongElement(term3709, 1, -7004099969024000L);
        setLongElement(term3709, 2, 3726714470400050L);
        setLongElement(term3709, 3, 3768827904000000L);
        setLongElement(term3709, 4, 3858009292800050L);
        setLongElement(term3709, 5, 3897645465600000L);
        setLongElement(term3709, 6, 5158571212800050L);
        setLongElement(term3709, 7, 5200684646400000L);
        setLongElement(term3709, 8, 5275002470400050L);
        setLongElement(term3709, 9, 5322070425600000L);
        setLongElement(term3709, 10, 5403820032000050L);
        setLongElement(term3709, 11, 5436024422400000L);
        setLongElement(term3709, 12, 5532637593600050L);
        setLongElement(term3709, 13, 5564841984000000L);
        setLongElement(term3709, 14, 5663932416000050L);
        setLongElement(term3709, 15, 5693644800000000L);
        setLongElement(term3709, 16, 5795227238400050L);
        setLongElement(term3709, 17, 5822477107200000L);
        setLongElement(term3709, 18, 5924044800000050L);
        setLongElement(term3709, 19, 5951294668800000L);
        setLongElement(term3709, 20, 6055339622400050L);
        setLongElement(term3709, 21, 6080112230400000L);
        setLongElement(term3709, 22, 6184157184000050L);
        setLongElement(term3709, 23, 6208929792000000L);
        setLongElement(term3709, 24, 6312974745600050L);
        setLongElement(term3709, 25, 6337747353600000L);
        setLongElement(term3709, 26, 6444269568000050L);
        setLongElement(term3709, 27, 6466564915200000L);
        setLongElement(term3709, 28, 6587950694400050L);
        setLongElement(term3709, 29, 6597859737600000L);
        setLongElement(term3709, 30, 8660326809600000L);
        setField(term3704, term3704.getClass(), "transitions", term3709);
        setIntElement(term3741, 0, 43200000);
        setIntElement(term3741, 1, 42944000);
        setIntElement(term3741, 2, 46800000);
        setIntElement(term3741, 3, 3600000);
        setField(term3704, term3704.getClass(), "offsets", term3741);
        setField(term3704, term3704.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term3704, term3704.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term3704, term3704.getClass(), "dirty", false);
        setField(term3704, term3704.getClass(), "lastRule", null);
        setField(term3704, term3704.getClass(), "ID", "Pacific/Fiji");
        setField(term3704, term3704.getClass(), "zoneId", null);
        setField(term3691, term3691.getClass(), "mTimeZone", term3704);
        setBooleanField(term3691, term3691.getClass(), "mTimeZoneForced", true);
        setField(term3764, term3764.getClass(), "language", "sw");
        setField(term3764, term3764.getClass(), "script", "");
        setField(term3764, term3764.getClass(), "region", "CD");
        setField(term3764, term3764.getClass(), "variant", "");
        setIntField(term3764, term3764.getClass(), "hash", 109816539);
        setField(term3763, term3763.getClass(), "baseLocale", term3764);
        setField(term3763, term3763.getClass(), "localeExtensions", null);
        setIntField(term3763, term3763.getClass(), "hashCodeValue", 109816539);
        setField(term3763, term3763.getClass(), "languageTag", null);
        setField(term3691, term3691.getClass(), "mLocale", term3763);
        setBooleanField(term3691, term3691.getClass(), "mLocaleForced", false);
        setField(term3691, term3691.getClass(), "mRules", term3780);
        setIntField(term3691, term3691.getClass(), "mMaxLengthEstimate", 1962444399);
        term3782 = newInstance(Class.forName("java.util.Date"));
        setLongField(term3782, term3782.getClass(), "fastTime", 1345889412244L);
        setField(term3782, term3782.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term3782;
        callMethod(klass, "format", argTypes, term3691, args);
    }

};


