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
import java.lang.IllegalArgumentException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DateTimeZone_forTimeZone_70719263045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31;

    public DateTimeZone_forTimeZone_70719263045() {
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
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[1];
        args[0] = term31;
        try {
            callMethod(klass, "forTimeZone", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


