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

public class DateTimeZone_forOffsetHours_1906202996101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23275;

    public DateTimeZone_forOffsetHours_1906202996101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23275 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term23275, term23275.getClass(), "iNameKey", "UTC");
        setIntField(term23275, term23275.getClass(), "iWallOffset", 0);
        setIntField(term23275, term23275.getClass(), "iStandardOffset", 0);
        setField(term23275, term23275.getClass(), "iID", "UTC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "forOffsetHours", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term23275));
    }

};


