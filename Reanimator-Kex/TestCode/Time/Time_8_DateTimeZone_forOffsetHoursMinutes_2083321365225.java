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

public class DateTimeZone_forOffsetHoursMinutes_2083321365225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47207;

    public DateTimeZone_forOffsetHoursMinutes_2083321365225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "iFixedOffsetCache", null);
        term47207 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term47207, term47207.getClass(), "iNameKey", null);
        setIntField(term47207, term47207.getClass(), "iWallOffset", -47340000);
        setIntField(term47207, term47207.getClass(), "iStandardOffset", -47340000);
        setField(term47207, term47207.getClass(), "iID", "-13:09");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = -13;
        args[1] = 9;
        Object retValue = callMethod(klass, "forOffsetHoursMinutes", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term47207));
    }

};


