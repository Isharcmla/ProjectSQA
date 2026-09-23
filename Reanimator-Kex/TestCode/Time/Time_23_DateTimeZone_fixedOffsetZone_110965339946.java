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
import java.lang.Integer;

public class DateTimeZone_fixedOffsetZone_110965339946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70;
     Object term3128;

    public DateTimeZone_fixedOffsetZone_110965339946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70 = new Integer(-1922583790);
        term3128 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term3128, term3128.getClass(), "iNameKey", null);
        setIntField(term3128, term3128.getClass(), "iWallOffset", -1922583790);
        setIntField(term3128, term3128.getClass(), "iStandardOffset", -1922583790);
        setField(term3128, term3128.getClass(), "iID", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "sjlJAEtRrb";
        args[1] = term70;
        Object retValue = callMethod(klass, "fixedOffsetZone", argTypes, null, args);
        assertTrue(recursiveEquals(term70, -1922583790));
        assertTrue(recursiveEquals(retValue, term3128));
    }

};


