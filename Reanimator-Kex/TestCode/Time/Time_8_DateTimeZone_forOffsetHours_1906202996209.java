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

public class DateTimeZone_forOffsetHours_1906202996209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40112;

    public DateTimeZone_forOffsetHours_1906202996209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40112 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term40112, term40112.getClass(), "iNameKey", null);
        setIntField(term40112, term40112.getClass(), "iWallOffset", 43200000);
        setIntField(term40112, term40112.getClass(), "iStandardOffset", 43200000);
        setField(term40112, term40112.getClass(), "iID", "+12:00");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 12;
        Object retValue = callMethod(klass, "forOffsetHours", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term40112));
    }

};


