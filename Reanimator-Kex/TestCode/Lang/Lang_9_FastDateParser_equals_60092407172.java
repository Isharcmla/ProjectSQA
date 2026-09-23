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
import static org.apache.commons.lang3.time.EqualityUtils.*;
import java.lang.Object;

public class FastDateParser_equals_60092407172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143339;
     Object term143469;
     Object term930598;
     Object term930602;

    public FastDateParser_equals_60092407172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143339 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        Object term143431 = newInstance(Class.forName("java.util.SimpleTimeZone"));
        setField(term143339, term143339.getClass(), "pattern", "");
        setField(term143339, term143339.getClass(), "timeZone", term143431);
        term143469 = newInstance(Class.forName("java.lang.Object"));
        term930598 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        Object term930601 = newInstance(Class.forName("java.util.SimpleTimeZone"));
        setField(term930598, term930598.getClass(), "pattern", "");
        setIntField(term930601, term930601.getClass(), "startMonth", 0);
        setIntField(term930601, term930601.getClass(), "startDay", 0);
        setIntField(term930601, term930601.getClass(), "startDayOfWeek", 0);
        setIntField(term930601, term930601.getClass(), "startTime", 0);
        setIntField(term930601, term930601.getClass(), "startTimeMode", 0);
        setIntField(term930601, term930601.getClass(), "endMonth", 0);
        setIntField(term930601, term930601.getClass(), "endDay", 0);
        setIntField(term930601, term930601.getClass(), "endDayOfWeek", 0);
        setIntField(term930601, term930601.getClass(), "endTime", 0);
        setIntField(term930601, term930601.getClass(), "endTimeMode", 0);
        setIntField(term930601, term930601.getClass(), "startYear", 0);
        setIntField(term930601, term930601.getClass(), "rawOffset", 0);
        setBooleanField(term930601, term930601.getClass(), "useDaylight", false);
        setField(term930601, term930601.getClass(), "monthLength", null);
        setIntField(term930601, term930601.getClass(), "startMode", 0);
        setIntField(term930601, term930601.getClass(), "endMode", 0);
        setIntField(term930601, term930601.getClass(), "dstSavings", 0);
        setField(term930601, term930601.getClass(), "cache", null);
        setIntField(term930601, term930601.getClass(), "serialVersionOnStream", 0);
        setField(term930601, term930601.getClass(), "ID", null);
        setField(term930601, term930601.getClass(), "zoneId", null);
        setField(term930598, term930598.getClass(), "timeZone", term930601);
        setField(term930598, term930598.getClass(), "locale", null);
        setField(term930598, term930598.getClass(), "parsePattern", null);
        setField(term930598, term930598.getClass(), "strategies", null);
        setIntField(term930598, term930598.getClass(), "thisYear", 0);
        setField(term930598, term930598.getClass(), "nameValues", null);
        setField(term930598, term930598.getClass(), "currentFormatField", null);
        setField(term930598, term930598.getClass(), "nextStrategy", null);
        term930602 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term143469;
        Object retValue = callMethod(klass, "equals", argTypes, term143339, args);
        assertTrue(recursiveEquals(term143339, term930598));
        assertTrue(recursiveEquals(term143469, term930602));
        assertTrue(recursiveEquals(retValue, false));
    }

};


