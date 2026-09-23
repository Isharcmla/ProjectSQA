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

public class ZonedChronology_assemble_1604148452457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199623;
     Object term199799;

    public ZonedChronology_assemble_1604148452457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199623 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term199699 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term199623, term199623.getClass(), "iParam", term199699);
        term199799 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term199903 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term200019 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDurationField"));
        setField(term199799, term199799.getClass(), "eras", null);
        setField(term199799, term199799.getClass(), "centuries", null);
        setField(term199799, term199799.getClass(), "years", null);
        setField(term199799, term199799.getClass(), "months", null);
        setField(term199799, term199799.getClass(), "weekyears", null);
        setField(term199799, term199799.getClass(), "weeks", null);
        setField(term199799, term199799.getClass(), "days", null);
        setField(term199799, term199799.getClass(), "halfdays", null);
        setField(term199799, term199799.getClass(), "hours", null);
        setField(term199799, term199799.getClass(), "minutes", null);
        setField(term199799, term199799.getClass(), "seconds", null);
        setField(term199799, term199799.getClass(), "millis", null);
        setField(term199799, term199799.getClass(), "year", null);
        setField(term199799, term199799.getClass(), "yearOfEra", null);
        setField(term199903, term199903.getClass(), "iUnitField", null);
        setField(term199903, term199903.getClass(), "iRangeField", term200019);
        setField(term199799, term199799.getClass(), "yearOfCentury", term199903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term199799;
        try {
            callMethod(klass, "assemble", argTypes, term199623, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


