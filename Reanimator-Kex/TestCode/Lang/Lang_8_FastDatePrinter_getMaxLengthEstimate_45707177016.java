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

public class FastDatePrinter_getMaxLengthEstimate_45707177016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5800;

    public FastDatePrinter_getMaxLengthEstimate_45707177016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5800 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        Object term5813 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term5818 = (long[]) newLongArray(31);
        int[] term5850 = (int[]) newIntArray(4);
        Object term5871 = newInstance(Class.forName("java.util.Locale"));
        Object term5872 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term5887 = (Object[]) newArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 0);
        setField(term5800, term5800.getClass(), "mPattern", "eZFUvlxvGV");
        setIntField(term5813, term5813.getClass(), "rawOffset", 43200000);
        setIntField(term5813, term5813.getClass(), "rawOffsetDiff", 0);
        setIntField(term5813, term5813.getClass(), "checksum", -2137017291);
        setIntField(term5813, term5813.getClass(), "dstSavings", 0);
        setLongElement(term5818, 0, -9048018124799999L);
        setLongElement(term5818, 1, -7004099969024000L);
        setLongElement(term5818, 2, 3726714470400050L);
        setLongElement(term5818, 3, 3768827904000000L);
        setLongElement(term5818, 4, 3858009292800050L);
        setLongElement(term5818, 5, 3897645465600000L);
        setLongElement(term5818, 6, 5158571212800050L);
        setLongElement(term5818, 7, 5200684646400000L);
        setLongElement(term5818, 8, 5275002470400050L);
        setLongElement(term5818, 9, 5322070425600000L);
        setLongElement(term5818, 10, 5403820032000050L);
        setLongElement(term5818, 11, 5436024422400000L);
        setLongElement(term5818, 12, 5532637593600050L);
        setLongElement(term5818, 13, 5564841984000000L);
        setLongElement(term5818, 14, 5663932416000050L);
        setLongElement(term5818, 15, 5693644800000000L);
        setLongElement(term5818, 16, 5795227238400050L);
        setLongElement(term5818, 17, 5822477107200000L);
        setLongElement(term5818, 18, 5924044800000050L);
        setLongElement(term5818, 19, 5951294668800000L);
        setLongElement(term5818, 20, 6055339622400050L);
        setLongElement(term5818, 21, 6080112230400000L);
        setLongElement(term5818, 22, 6184157184000050L);
        setLongElement(term5818, 23, 6208929792000000L);
        setLongElement(term5818, 24, 6312974745600050L);
        setLongElement(term5818, 25, 6337747353600000L);
        setLongElement(term5818, 26, 6444269568000050L);
        setLongElement(term5818, 27, 6466564915200000L);
        setLongElement(term5818, 28, 6587950694400050L);
        setLongElement(term5818, 29, 6597859737600000L);
        setLongElement(term5818, 30, 8660326809600000L);
        setField(term5813, term5813.getClass(), "transitions", term5818);
        setIntElement(term5850, 0, 43200000);
        setIntElement(term5850, 1, 42944000);
        setIntElement(term5850, 2, 46800000);
        setIntElement(term5850, 3, 3600000);
        setField(term5813, term5813.getClass(), "offsets", term5850);
        setField(term5813, term5813.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term5813, term5813.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term5813, term5813.getClass(), "dirty", false);
        setField(term5813, term5813.getClass(), "lastRule", null);
        setField(term5813, term5813.getClass(), "ID", "Pacific/Fiji");
        setField(term5813, term5813.getClass(), "zoneId", null);
        setField(term5800, term5800.getClass(), "mTimeZone", term5813);
        setField(term5872, term5872.getClass(), "language", "sw");
        setField(term5872, term5872.getClass(), "script", "");
        setField(term5872, term5872.getClass(), "region", "CD");
        setField(term5872, term5872.getClass(), "variant", "");
        setIntField(term5872, term5872.getClass(), "hash", 109816539);
        setField(term5871, term5871.getClass(), "baseLocale", term5872);
        setField(term5871, term5871.getClass(), "localeExtensions", null);
        setIntField(term5871, term5871.getClass(), "hashCodeValue", 109816539);
        setField(term5871, term5871.getClass(), "languageTag", null);
        setField(term5800, term5800.getClass(), "mLocale", term5871);
        setField(term5800, term5800.getClass(), "mRules", term5887);
        setIntField(term5800, term5800.getClass(), "mMaxLengthEstimate", -817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxLengthEstimate", argTypes, term5800, args);
    }

};


