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
import java.lang.NumberFormatException;
import static org.joda.time.tz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ZoneInfoCompiler_test_175190823791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69957;

    public ZoneInfoCompiler_test_175190823791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69957 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term69957, term69957.getClass(), "iID", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.tz.ZoneInfoCompiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.joda.time.DateTimeZone");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term69957;
        try {
            callMethod(klass, "test", argTypes, null, args);
            assertTrue(false);
        }
        catch (NumberFormatException e) {
        }

    }

};


