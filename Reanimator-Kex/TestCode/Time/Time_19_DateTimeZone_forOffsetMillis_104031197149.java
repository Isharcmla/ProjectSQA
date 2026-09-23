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

public class DateTimeZone_forOffsetMillis_104031197149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43116;

    public DateTimeZone_forOffsetMillis_104031197149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term42993 = new HashMap();
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "iFixedOffsetCache", term42993);
        term43116 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term43116, term43116.getClass(), "iNameKey", null);
        setIntField(term43116, term43116.getClass(), "iWallOffset", 1143183688);
        setIntField(term43116, term43116.getClass(), "iStandardOffset", 1143183688);
        setField(term43116, term43116.getClass(), "iID", "+317:33:03.688");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1143183688;
        Object retValue = callMethod(klass, "forOffsetMillis", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term43116));
    }

};


