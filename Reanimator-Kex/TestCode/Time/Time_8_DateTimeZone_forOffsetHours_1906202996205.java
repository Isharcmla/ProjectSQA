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

public class DateTimeZone_forOffsetHours_1906202996205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38929;

    public DateTimeZone_forOffsetHours_1906202996205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "iFixedOffsetCache", null);
        term38929 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term38929, term38929.getClass(), "iNameKey", null);
        setIntField(term38929, term38929.getClass(), "iWallOffset", 3600000);
        setIntField(term38929, term38929.getClass(), "iStandardOffset", 3600000);
        setField(term38929, term38929.getClass(), "iID", "+01:00");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object retValue = callMethod(klass, "forOffsetHours", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term38929));
    }

};


