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
import java.util.HashMap;

public class DateTimeZone_forOffsetHours_1906202996195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36157;

    public DateTimeZone_forOffsetHours_1906202996195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term35839 = new HashMap();
        ((HashMap) term35839).put("", "");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "iFixedOffsetCache", term35839);
        term36157 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term36157, term36157.getClass(), "iNameKey", null);
        setIntField(term36157, term36157.getClass(), "iWallOffset", 21600000);
        setIntField(term36157, term36157.getClass(), "iStandardOffset", 21600000);
        setField(term36157, term36157.getClass(), "iID", "+06:00");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 6;
        Object retValue = callMethod(klass, "forOffsetHours", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term36157));
    }

};


