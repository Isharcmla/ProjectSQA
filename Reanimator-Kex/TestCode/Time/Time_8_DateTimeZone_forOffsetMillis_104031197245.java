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

public class DateTimeZone_forOffsetMillis_104031197245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53976;

    public DateTimeZone_forOffsetMillis_104031197245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53976 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term53976, term53976.getClass(), "iNameKey", null);
        setIntField(term53976, term53976.getClass(), "iWallOffset", -84780000);
        setIntField(term53976, term53976.getClass(), "iStandardOffset", -84780000);
        setField(term53976, term53976.getClass(), "iID", "-23:33");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -84780000;
        Object retValue = callMethod(klass, "forOffsetMillis", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term53976));
    }

};


