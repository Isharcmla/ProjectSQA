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

public class DateTimeZone_forOffsetMillis_104031197114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24065;

    public DateTimeZone_forOffsetMillis_104031197114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24065 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term24065, term24065.getClass(), "iNameKey", null);
        setIntField(term24065, term24065.getClass(), "iWallOffset", 35091456);
        setIntField(term24065, term24065.getClass(), "iStandardOffset", 35091456);
        setField(term24065, term24065.getClass(), "iID", "+09:44:51.456");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 35091456;
        Object retValue = callMethod(klass, "forOffsetMillis", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term24065));
    }

};


