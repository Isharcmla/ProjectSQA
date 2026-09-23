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

public class DateTimeZone_forOffsetMillis_10403119742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;
     Object term2288;

    public DateTimeZone_forOffsetMillis_10403119742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29 = new Integer(391863371);
        term2288 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term2288, term2288.getClass(), "iNameKey", null);
        setIntField(term2288, term2288.getClass(), "iWallOffset", 391863371);
        setIntField(term2288, term2288.getClass(), "iStandardOffset", 391863371);
        setField(term2288, term2288.getClass(), "iID", "+108:51:03.371");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29;
        Object retValue = callMethod(klass, "forOffsetMillis", argTypes, null, args);
        assertTrue(recursiveEquals(term29, 391863371));
        assertTrue(recursiveEquals(retValue, term2288));
    }

};


