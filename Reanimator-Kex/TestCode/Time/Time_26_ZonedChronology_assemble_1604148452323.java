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
import java.lang.NullPointerException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117050;
     Object term117226;

    public ZonedChronology_assemble_1604148452323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117050 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term117126 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term117050, term117050.getClass(), "iParam", term117126);
        term117226 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term117324 = newInstance(Class.forName("org.joda.time.chrono.ISOYearOfEraDateTimeField"));
        setField(term117226, term117226.getClass(), "eras", null);
        setField(term117226, term117226.getClass(), "centuries", null);
        setField(term117226, term117226.getClass(), "years", null);
        setField(term117226, term117226.getClass(), "months", null);
        setField(term117226, term117226.getClass(), "weekyears", null);
        setField(term117226, term117226.getClass(), "weeks", null);
        setField(term117226, term117226.getClass(), "days", null);
        setField(term117226, term117226.getClass(), "halfdays", null);
        setField(term117226, term117226.getClass(), "hours", null);
        setField(term117226, term117226.getClass(), "minutes", null);
        setField(term117226, term117226.getClass(), "seconds", null);
        setField(term117226, term117226.getClass(), "millis", null);
        setField(term117226, term117226.getClass(), "year", null);
        setField(term117226, term117226.getClass(), "yearOfEra", term117324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term117226;
        try {
            callMethod(klass, "assemble", argTypes, term117050, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


