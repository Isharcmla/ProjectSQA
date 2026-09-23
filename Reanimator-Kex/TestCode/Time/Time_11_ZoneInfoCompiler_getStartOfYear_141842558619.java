package org.joda.time.tz;

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
import static org.joda.time.tz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.tz.EqualityUtils.*;

public class ZoneInfoCompiler_getStartOfYear_141842558619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17379;

    public ZoneInfoCompiler_getStartOfYear_141842558619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17379 = newInstance(Class.forName("org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear"));
        setIntField(term17379, term17379.getClass(), "iMonthOfYear", 1);
        setIntField(term17379, term17379.getClass(), "iDayOfMonth", 1);
        setIntField(term17379, term17379.getClass(), "iDayOfWeek", 0);
        setBooleanField(term17379, term17379.getClass(), "iAdvanceDayOfWeek", false);
        setIntField(term17379, term17379.getClass(), "iMillisOfDay", 0);
        setCharField(term17379, term17379.getClass(), "iZoneChar", 'w');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.tz.ZoneInfoCompiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getStartOfYear", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term17379));
    }

};


