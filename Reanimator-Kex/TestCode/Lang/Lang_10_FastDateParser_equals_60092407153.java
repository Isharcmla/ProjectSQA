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

public class FastDateParser_equals_60092407153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66902;
     Object term67032;
     Object term692590;
     Object term692594;

    public FastDateParser_equals_60092407153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66902 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        Object term66994 = newInstance(Class.forName("java.util.SimpleTimeZone"));
        setField(term66902, term66902.getClass(), "pattern", "");
        setField(term66902, term66902.getClass(), "timeZone", term66994);
        term67032 = newInstance(Class.forName("java.lang.Object"));
        term692590 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        Object term692593 = newInstance(Class.forName("java.util.SimpleTimeZone"));
        setField(term692590, term692590.getClass(), "pattern", "");
        setIntField(term692593, term692593.getClass(), "startMonth", 0);
        setIntField(term692593, term692593.getClass(), "startDay", 0);
        setIntField(term692593, term692593.getClass(), "startDayOfWeek", 0);
        setIntField(term692593, term692593.getClass(), "startTime", 0);
        setIntField(term692593, term692593.getClass(), "startTimeMode", 0);
        setIntField(term692593, term692593.getClass(), "endMonth", 0);
        setIntField(term692593, term692593.getClass(), "endDay", 0);
        setIntField(term692593, term692593.getClass(), "endDayOfWeek", 0);
        setIntField(term692593, term692593.getClass(), "endTime", 0);
        setIntField(term692593, term692593.getClass(), "endTimeMode", 0);
        setIntField(term692593, term692593.getClass(), "startYear", 0);
        setIntField(term692593, term692593.getClass(), "rawOffset", 0);
        setBooleanField(term692593, term692593.getClass(), "useDaylight", false);
        setField(term692593, term692593.getClass(), "monthLength", null);
        setIntField(term692593, term692593.getClass(), "startMode", 0);
        setIntField(term692593, term692593.getClass(), "endMode", 0);
        setIntField(term692593, term692593.getClass(), "dstSavings", 0);
        setField(term692593, term692593.getClass(), "cache", null);
        setIntField(term692593, term692593.getClass(), "serialVersionOnStream", 0);
        setField(term692593, term692593.getClass(), "ID", null);
        setField(term692593, term692593.getClass(), "zoneId", null);
        setField(term692590, term692590.getClass(), "timeZone", term692593);
        setField(term692590, term692590.getClass(), "locale", null);
        setField(term692590, term692590.getClass(), "parsePattern", null);
        setField(term692590, term692590.getClass(), "strategies", null);
        setIntField(term692590, term692590.getClass(), "thisYear", 0);
        setField(term692590, term692590.getClass(), "nameValues", null);
        setField(term692590, term692590.getClass(), "currentFormatField", null);
        setField(term692590, term692590.getClass(), "nextStrategy", null);
        term692594 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term67032;
        Object retValue = callMethod(klass, "equals", argTypes, term66902, args);
        assertTrue(recursiveEquals(term66902, term692590));
        assertTrue(recursiveEquals(term67032, term692594));
        assertTrue(recursiveEquals(retValue, false));
    }

};


