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

public class ZonedChronology_assemble_1604148452367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137554;
     Object term137768;

    public ZonedChronology_assemble_1604148452367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137554 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term137668 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term137554, term137554.getClass(), "iParam", term137668);
        term137768 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term137872 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term137988 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        setField(term137768, term137768.getClass(), "eras", null);
        setField(term137768, term137768.getClass(), "centuries", null);
        setField(term137768, term137768.getClass(), "years", null);
        setField(term137768, term137768.getClass(), "months", null);
        setField(term137768, term137768.getClass(), "weekyears", null);
        setField(term137768, term137768.getClass(), "weeks", null);
        setField(term137768, term137768.getClass(), "days", null);
        setField(term137768, term137768.getClass(), "halfdays", null);
        setField(term137768, term137768.getClass(), "hours", null);
        setField(term137768, term137768.getClass(), "minutes", null);
        setField(term137768, term137768.getClass(), "seconds", null);
        setField(term137768, term137768.getClass(), "millis", null);
        setField(term137872, term137872.getClass(), "iUnitField", null);
        setField(term137872, term137872.getClass(), "iRangeField", term137988);
        setField(term137768, term137768.getClass(), "year", term137872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term137768;
        try {
            callMethod(klass, "assemble", argTypes, term137554, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


