package org.joda.time.tz;

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
import static org.joda.time.tz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.tz.EqualityUtils.*;

public class ZoneInfoCompiler_test_1751908237105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79743;
     Object term79750;

    public ZoneInfoCompiler_test_1751908237105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79743 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term79743, term79743.getClass(), "iID", null);
        term79750 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setIntField(term79750, term79750.getClass(), "iStandardOffset", 0);
        setField(term79750, term79750.getClass(), "iStartRecurrence", null);
        setField(term79750, term79750.getClass(), "iEndRecurrence", null);
        setField(term79750, term79750.getClass(), "iID", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.tz.ZoneInfoCompiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.joda.time.DateTimeZone");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term79743;
        Object retValue = callMethod(klass, "test", argTypes, null, args);
        assertTrue(recursiveEquals(term79743, ""));
        assertTrue(recursiveEquals(retValue, true));
    }

};


