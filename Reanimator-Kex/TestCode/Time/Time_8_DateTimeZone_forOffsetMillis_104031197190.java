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
import java.util.HashMap;

public class DateTimeZone_forOffsetMillis_104031197190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35086;

    public DateTimeZone_forOffsetMillis_104031197190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term34726 = new HashMap();
        ((HashMap) term34726).put("", "");
        ((HashMap) term34726).put("", "");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "iFixedOffsetCache", term34726);
        term35086 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term35086, term35086.getClass(), "iNameKey", null);
        setIntField(term35086, term35086.getClass(), "iWallOffset", -25292120);
        setIntField(term35086, term35086.getClass(), "iStandardOffset", -25292120);
        setField(term35086, term35086.getClass(), "iID", "-07:01:32.120");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -25292120;
        Object retValue = callMethod(klass, "forOffsetMillis", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term35086));
    }

};


