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

public class ZonedChronology_assemble_1604148452585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265577;
     Object term265753;

    public ZonedChronology_assemble_1604148452585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265577 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term265653 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term265577, term265577.getClass(), "iParam", term265653);
        term265753 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term265865 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        Object term265955 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term265753, term265753.getClass(), "eras", null);
        setField(term265753, term265753.getClass(), "centuries", null);
        setField(term265753, term265753.getClass(), "years", null);
        setField(term265753, term265753.getClass(), "months", null);
        setField(term265753, term265753.getClass(), "weekyears", null);
        setField(term265753, term265753.getClass(), "weeks", null);
        setField(term265753, term265753.getClass(), "days", null);
        setField(term265753, term265753.getClass(), "halfdays", null);
        setField(term265753, term265753.getClass(), "hours", null);
        setField(term265753, term265753.getClass(), "minutes", null);
        setField(term265753, term265753.getClass(), "seconds", null);
        setField(term265753, term265753.getClass(), "millis", null);
        setField(term265753, term265753.getClass(), "year", null);
        setField(term265753, term265753.getClass(), "yearOfEra", null);
        setField(term265753, term265753.getClass(), "yearOfCentury", null);
        setField(term265753, term265753.getClass(), "centuryOfEra", null);
        setField(term265753, term265753.getClass(), "era", null);
        setField(term265753, term265753.getClass(), "dayOfWeek", null);
        setField(term265753, term265753.getClass(), "dayOfMonth", null);
        setField(term265753, term265753.getClass(), "dayOfYear", null);
        setField(term265753, term265753.getClass(), "monthOfYear", null);
        setField(term265753, term265753.getClass(), "weekOfWeekyear", null);
        setField(term265865, term265865.getClass(), "iUnitField", term265955);
        setField(term265753, term265753.getClass(), "weekyear", term265865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term265753;
        try {
            callMethod(klass, "assemble", argTypes, term265577, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


