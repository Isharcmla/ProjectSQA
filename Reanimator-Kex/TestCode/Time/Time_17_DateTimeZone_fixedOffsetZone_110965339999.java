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

public class DateTimeZone_fixedOffsetZone_110965339999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20428;

    public DateTimeZone_fixedOffsetZone_110965339999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20428 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term20428, term20428.getClass(), "iNameKey", "UTC");
        setIntField(term20428, term20428.getClass(), "iWallOffset", 0);
        setIntField(term20428, term20428.getClass(), "iStandardOffset", 0);
        setField(term20428, term20428.getClass(), "iID", "UTC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = 0;
        Object retValue = callMethod(klass, "fixedOffsetZone", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term20428));
    }

};


