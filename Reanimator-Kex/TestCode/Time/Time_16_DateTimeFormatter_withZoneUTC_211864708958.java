package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatter_withZoneUTC_211864708958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328;
     Object term2254;
     Object term2236;

    public DateTimeFormatter_withZoneUTC_211864708958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term344 = new Integer(1134449235);
        term328 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term329 = newInstance(Class.forName("java.util.Locale"));
        Object term330 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term328, term328.getClass(), "iPrinter", null);
        setField(term328, term328.getClass(), "iParser", null);
        setField(term330, term330.getClass(), "language", "bm");
        setField(term330, term330.getClass(), "script", "");
        setField(term330, term330.getClass(), "region", "");
        setField(term330, term330.getClass(), "variant", "");
        setIntField(term330, term330.getClass(), "hash", 93752277);
        setField(term329, term329.getClass(), "baseLocale", term330);
        setField(term329, term329.getClass(), "localeExtensions", null);
        setIntField(term329, term329.getClass(), "hashCodeValue", 93752277);
        setField(term329, term329.getClass(), "languageTag", null);
        setField(term328, term328.getClass(), "iLocale", term329);
        setBooleanField(term328, term328.getClass(), "iOffsetParsed", false);
        setField(term328, term328.getClass(), "iChrono", null);
        setField(term328, term328.getClass(), "iZone", null);
        setField(term328, term328.getClass(), "iPivotYear", term344);
        setIntField(term328, term328.getClass(), "iDefaultYear", 1134449235);
        Integer term2265 = new Integer(1134449235);
        term2254 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2255 = newInstance(Class.forName("java.util.Locale"));
        Object term2256 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2254, term2254.getClass(), "iPrinter", null);
        setField(term2254, term2254.getClass(), "iParser", null);
        setField(term2256, term2256.getClass(), "language", "bm");
        setField(term2256, term2256.getClass(), "script", "");
        setField(term2256, term2256.getClass(), "region", "");
        setField(term2256, term2256.getClass(), "variant", "");
        setIntField(term2256, term2256.getClass(), "hash", 93752277);
        setField(term2255, term2255.getClass(), "baseLocale", term2256);
        setField(term2255, term2255.getClass(), "localeExtensions", null);
        setIntField(term2255, term2255.getClass(), "hashCodeValue", 93752277);
        setField(term2255, term2255.getClass(), "languageTag", null);
        setField(term2254, term2254.getClass(), "iLocale", term2255);
        setBooleanField(term2254, term2254.getClass(), "iOffsetParsed", false);
        setField(term2254, term2254.getClass(), "iChrono", null);
        setField(term2254, term2254.getClass(), "iZone", null);
        setField(term2254, term2254.getClass(), "iPivotYear", term2265);
        setIntField(term2254, term2254.getClass(), "iDefaultYear", 1134449235);
        Integer term2251 = new Integer(1134449235);
        term2236 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2218 = newInstance(Class.forName("java.util.Locale"));
        Object term2219 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term2238 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term2236, term2236.getClass(), "iPrinter", null);
        setField(term2236, term2236.getClass(), "iParser", null);
        setField(term2219, term2219.getClass(), "language", "bm");
        setField(term2219, term2219.getClass(), "script", "");
        setField(term2219, term2219.getClass(), "region", "");
        setField(term2219, term2219.getClass(), "variant", "");
        setIntField(term2219, term2219.getClass(), "hash", 93752277);
        setField(term2218, term2218.getClass(), "baseLocale", term2219);
        setField(term2218, term2218.getClass(), "localeExtensions", null);
        setIntField(term2218, term2218.getClass(), "hashCodeValue", 93752277);
        setField(term2218, term2218.getClass(), "languageTag", null);
        setField(term2236, term2236.getClass(), "iLocale", term2218);
        setBooleanField(term2236, term2236.getClass(), "iOffsetParsed", false);
        setField(term2236, term2236.getClass(), "iChrono", null);
        setField(term2238, term2238.getClass(), "iNameKey", "UTC");
        setIntField(term2238, term2238.getClass(), "iWallOffset", 0);
        setIntField(term2238, term2238.getClass(), "iStandardOffset", 0);
        setField(term2238, term2238.getClass(), "iID", "UTC");
        setField(term2236, term2236.getClass(), "iZone", term2238);
        setField(term2236, term2236.getClass(), "iPivotYear", term2251);
        setIntField(term2236, term2236.getClass(), "iDefaultYear", 1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withZoneUTC", argTypes, term328, args);
        assertTrue(recursiveEquals(term328, term2254));
        assertTrue(recursiveEquals(retValue, term2236));
    }

};


