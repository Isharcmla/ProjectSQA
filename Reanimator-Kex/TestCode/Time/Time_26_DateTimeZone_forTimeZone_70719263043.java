package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;

public class DateTimeZone_forTimeZone_70719263043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31;
     Object term2652;
     Object term2623;

    public DateTimeZone_forTimeZone_70719263043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term31, term31.getClass(), "rawOffset", 18000000);
        setIntField(term31, term31.getClass(), "rawOffsetDiff", 0);
        setIntField(term31, term31.getClass(), "checksum", 0);
        setIntField(term31, term31.getClass(), "dstSavings", 0);
        setField(term31, term31.getClass(), "transitions", null);
        setField(term31, term31.getClass(), "offsets", null);
        setField(term31, term31.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term31, term31.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term31, term31.getClass(), "dirty", false);
        setField(term31, term31.getClass(), "lastRule", null);
        setField(term31, term31.getClass(), "ID", "Etc/GMT-5");
        setField(term31, term31.getClass(), "zoneId", null);
        term2652 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term2652, term2652.getClass(), "rawOffset", 18000000);
        setIntField(term2652, term2652.getClass(), "rawOffsetDiff", 0);
        setIntField(term2652, term2652.getClass(), "checksum", 0);
        setIntField(term2652, term2652.getClass(), "dstSavings", 0);
        setField(term2652, term2652.getClass(), "transitions", null);
        setField(term2652, term2652.getClass(), "offsets", null);
        setField(term2652, term2652.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term2652, term2652.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term2652, term2652.getClass(), "dirty", false);
        setField(term2652, term2652.getClass(), "lastRule", null);
        setField(term2652, term2652.getClass(), "ID", "Etc/GMT-5");
        setField(term2652, term2652.getClass(), "zoneId", null);
        term2623 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term2623, term2623.getClass(), "iNameKey", null);
        setIntField(term2623, term2623.getClass(), "iWallOffset", 18000000);
        setIntField(term2623, term2623.getClass(), "iStandardOffset", 18000000);
        setField(term2623, term2623.getClass(), "iID", "+05:00");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[1];
        args[0] = term31;
        Object retValue = callMethod(klass, "forTimeZone", argTypes, null, args);
        assertTrue(recursiveEquals(term31, term2652));
        assertTrue(recursiveEquals(retValue, term2623));
    }

};


