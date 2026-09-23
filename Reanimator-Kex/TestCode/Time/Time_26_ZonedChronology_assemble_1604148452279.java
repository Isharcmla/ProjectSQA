package org.joda.time.chrono;

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
import java.lang.IllegalArgumentException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103766;
     Object term103942;

    public ZonedChronology_assemble_1604148452279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103766 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term103842 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term103766, term103766.getClass(), "iParam", term103842);
        term103942 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term104044 = newInstance(Class.forName("org.joda.time.chrono.BasicSingleEraDateTimeField"));
        setField(term103942, term103942.getClass(), "eras", null);
        setField(term103942, term103942.getClass(), "centuries", null);
        setField(term103942, term103942.getClass(), "years", null);
        setField(term103942, term103942.getClass(), "months", null);
        setField(term103942, term103942.getClass(), "weekyears", null);
        setField(term103942, term103942.getClass(), "weeks", null);
        setField(term103942, term103942.getClass(), "days", null);
        setField(term103942, term103942.getClass(), "halfdays", null);
        setField(term103942, term103942.getClass(), "hours", null);
        setField(term103942, term103942.getClass(), "minutes", null);
        setField(term103942, term103942.getClass(), "seconds", null);
        setField(term103942, term103942.getClass(), "millis", null);
        setField(term103942, term103942.getClass(), "year", null);
        setField(term103942, term103942.getClass(), "yearOfEra", null);
        setField(term103942, term103942.getClass(), "yearOfCentury", null);
        setField(term103942, term103942.getClass(), "centuryOfEra", null);
        setField(term103942, term103942.getClass(), "era", null);
        setField(term103942, term103942.getClass(), "dayOfWeek", null);
        setField(term103942, term103942.getClass(), "dayOfMonth", null);
        setField(term103942, term103942.getClass(), "dayOfYear", null);
        setField(term103942, term103942.getClass(), "monthOfYear", term104044);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term103942;
        try {
            callMethod(klass, "assemble", argTypes, term103766, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


