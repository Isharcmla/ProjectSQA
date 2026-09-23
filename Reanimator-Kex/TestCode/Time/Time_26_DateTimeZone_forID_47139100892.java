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

public class DateTimeZone_forID_47139100892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17119;

    public DateTimeZone_forID_47139100892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17119 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term17119, term17119.getClass(), "iNameKey", "UTC");
        setIntField(term17119, term17119.getClass(), "iWallOffset", 0);
        setIntField(term17119, term17119.getClass(), "iStandardOffset", 0);
        setField(term17119, term17119.getClass(), "iID", "UTC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UTC";
        Object retValue = callMethod(klass, "forID", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term17119));
    }

};


