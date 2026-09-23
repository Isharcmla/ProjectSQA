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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class FastDatePrinter_format_24540290428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378;
     Object term1447;

    public FastDatePrinter_format_24540290428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        Object term1391 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term1396 = (long[]) newLongArray(7);
        int[] term1404 = (int[]) newIntArray(4);
        Object term1429 = newInstance(Class.forName("java.util.Locale"));
        Object term1430 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term1445 = (Object[]) newArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 2);
        setField(term1378, term1378.getClass(), "mPattern", "RMFIsYGgne");
        setIntField(term1391, term1391.getClass(), "rawOffset", 10800000);
        setIntField(term1391, term1391.getClass(), "rawOffsetDiff", 0);
        setIntField(term1391, term1391.getClass(), "checksum", -1382808297);
        setIntField(term1391, term1391.getClass(), "dstSavings", 0);
        setLongElement(term1396, 0, -9048018124799999L);
        setLongElement(term1396, 1, -7971507552255998L);
        setLongElement(term1396, 2, -5364722073600000L);
        setLongElement(term1396, 3, -5169025843199998L);
        setLongElement(term1396, 4, -4265526067199997L);
        setLongElement(term1396, 5, -3544292966400000L);
        setLongElement(term1396, 6, 8660459520000000L);
        setField(term1391, term1391.getClass(), "transitions", term1396);
        setIntElement(term1404, 0, 10800000);
        setIntElement(term1404, 1, 8836000);
        setIntElement(term1404, 2, 9000000);
        setIntElement(term1404, 3, 9900000);
        setField(term1391, term1391.getClass(), "offsets", term1404);
        setField(term1391, term1391.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term1391, term1391.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term1391, term1391.getClass(), "dirty", false);
        setField(term1391, term1391.getClass(), "lastRule", null);
        setField(term1391, term1391.getClass(), "ID", "Africa/Mogadishu");
        setField(term1391, term1391.getClass(), "zoneId", null);
        setField(term1378, term1378.getClass(), "mTimeZone", term1391);
        setField(term1430, term1430.getClass(), "language", "se");
        setField(term1430, term1430.getClass(), "script", "");
        setField(term1430, term1430.getClass(), "region", "SE");
        setField(term1430, term1430.getClass(), "variant", "");
        setIntField(term1430, term1430.getClass(), "hash", 109295708);
        setField(term1429, term1429.getClass(), "baseLocale", term1430);
        setField(term1429, term1429.getClass(), "localeExtensions", null);
        setIntField(term1429, term1429.getClass(), "hashCodeValue", 109295708);
        setField(term1429, term1429.getClass(), "languageTag", null);
        setField(term1378, term1378.getClass(), "mLocale", term1429);
        setField(term1378, term1378.getClass(), "mRules", term1445);
        setIntField(term1378, term1378.getClass(), "mMaxLengthEstimate", -6029667);
        term1447 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1447;
        try {
            callMethod(klass, "format", argTypes, term1378, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


