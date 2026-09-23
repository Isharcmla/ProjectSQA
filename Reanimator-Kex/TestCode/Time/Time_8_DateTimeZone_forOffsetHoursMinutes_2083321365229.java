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

public class DateTimeZone_forOffsetHoursMinutes_2083321365229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48467;

    public DateTimeZone_forOffsetHoursMinutes_2083321365229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48467 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term48467, term48467.getClass(), "iNameKey", null);
        setIntField(term48467, term48467.getClass(), "iWallOffset", -18420000);
        setIntField(term48467, term48467.getClass(), "iStandardOffset", -18420000);
        setField(term48467, term48467.getClass(), "iID", "-05:07");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = -5;
        args[1] = 7;
        Object retValue = callMethod(klass, "forOffsetHoursMinutes", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term48467));
    }

};


