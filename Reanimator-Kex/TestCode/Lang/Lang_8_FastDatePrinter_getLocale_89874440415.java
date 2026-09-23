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

public class FastDatePrinter_getLocale_89874440415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5720;

    public FastDatePrinter_getLocale_89874440415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5720 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        Object term5733 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        Object term5755 = newInstance(Class.forName("java.util.Locale"));
        Object term5756 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term5771 = (Object[]) newArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 1);
        setField(term5720, term5720.getClass(), "mPattern", "xOEqzGAmDU");
        setIntField(term5733, term5733.getClass(), "rawOffset", 0);
        setIntField(term5733, term5733.getClass(), "rawOffsetDiff", 0);
        setIntField(term5733, term5733.getClass(), "checksum", 0);
        setIntField(term5733, term5733.getClass(), "dstSavings", 0);
        setField(term5733, term5733.getClass(), "transitions", null);
        setField(term5733, term5733.getClass(), "offsets", null);
        setField(term5733, term5733.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term5733, term5733.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term5733, term5733.getClass(), "dirty", false);
        setField(term5733, term5733.getClass(), "lastRule", null);
        setField(term5733, term5733.getClass(), "ID", "Etc/Universal");
        setField(term5733, term5733.getClass(), "zoneId", null);
        setField(term5720, term5720.getClass(), "mTimeZone", term5733);
        setField(term5756, term5756.getClass(), "language", "ca");
        setField(term5756, term5756.getClass(), "script", "");
        setField(term5756, term5756.getClass(), "region", "FR");
        setField(term5756, term5756.getClass(), "variant", "");
        setIntField(term5756, term5756.getClass(), "hash", 94388118);
        setField(term5755, term5755.getClass(), "baseLocale", term5756);
        setField(term5755, term5755.getClass(), "localeExtensions", null);
        setIntField(term5755, term5755.getClass(), "hashCodeValue", 94388118);
        setField(term5755, term5755.getClass(), "languageTag", null);
        setField(term5720, term5720.getClass(), "mLocale", term5755);
        setField(term5720, term5720.getClass(), "mRules", term5771);
        setIntField(term5720, term5720.getClass(), "mMaxLengthEstimate", -157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocale", argTypes, term5720, args);
    }

};


