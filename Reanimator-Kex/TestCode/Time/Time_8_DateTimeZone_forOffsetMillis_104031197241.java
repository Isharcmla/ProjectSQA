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

public class DateTimeZone_forOffsetMillis_104031197241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52490;

    public DateTimeZone_forOffsetMillis_104031197241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "iFixedOffsetCache", null);
        term52490 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term52490, term52490.getClass(), "iNameKey", null);
        setIntField(term52490, term52490.getClass(), "iWallOffset", -768640);
        setIntField(term52490, term52490.getClass(), "iStandardOffset", -768640);
        setField(term52490, term52490.getClass(), "iID", "-00:12:48.640");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -768640;
        Object retValue = callMethod(klass, "forOffsetMillis", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term52490));
    }

};


