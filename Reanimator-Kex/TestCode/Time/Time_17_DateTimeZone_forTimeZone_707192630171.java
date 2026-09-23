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

public class DateTimeZone_forTimeZone_707192630171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50960;

    public DateTimeZone_forTimeZone_707192630171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term50956 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term50956);
        term50960 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term50960, term50960.getClass(), "iTransitions", null);
        setField(term50960, term50960.getClass(), "iWallOffsets", null);
        setField(term50960, term50960.getClass(), "iStandardOffsets", null);
        setField(term50960, term50960.getClass(), "iNameKeys", null);
        setField(term50960, term50960.getClass(), "iTailZone", null);
        setField(term50960, term50960.getClass(), "iID", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "forTimeZone", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term50960));
    }

};


