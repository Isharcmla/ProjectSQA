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
import java.lang.Object;

public class DateTimeZone_forOffsetMillis_104031197133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35226;

    public DateTimeZone_forOffsetMillis_104031197133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term34944 = new HashMap();
        ((HashMap) term34944).put((Object)null, (Object)null);
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "iFixedOffsetCache", term34944);
        term35226 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term35226, term35226.getClass(), "iNameKey", null);
        setIntField(term35226, term35226.getClass(), "iWallOffset", -3662007);
        setIntField(term35226, term35226.getClass(), "iStandardOffset", -3662007);
        setField(term35226, term35226.getClass(), "iID", "-01:01:02.007");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -3662007;
        Object retValue = callMethod(klass, "forOffsetMillis", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term35226));
    }

};


