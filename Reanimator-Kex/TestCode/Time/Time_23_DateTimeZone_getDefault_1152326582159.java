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
import java.lang.Object;

public class DateTimeZone_getDefault_1152326582159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45848;

    public DateTimeZone_getDefault_1152326582159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45846 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term45846);
        term45848 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term45848, term45848.getClass(), "iNameKey", null);
        setIntField(term45848, term45848.getClass(), "iWallOffset", 0);
        setIntField(term45848, term45848.getClass(), "iStandardOffset", 0);
        setField(term45848, term45848.getClass(), "iID", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefault", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term45848));
    }

};


