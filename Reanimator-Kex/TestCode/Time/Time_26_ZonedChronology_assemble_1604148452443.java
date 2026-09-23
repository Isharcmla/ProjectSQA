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

public class ZonedChronology_assemble_1604148452443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193226;
     Object term193402;

    public ZonedChronology_assemble_1604148452443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193226 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term193302 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term193226, term193226.getClass(), "iParam", term193302);
        term193402 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term193498 = newInstance(Class.forName("org.joda.time.chrono.GJDayOfWeekDateTimeField"));
        Object term193588 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term193402, term193402.getClass(), "eras", null);
        setField(term193402, term193402.getClass(), "centuries", null);
        setField(term193402, term193402.getClass(), "years", null);
        setField(term193402, term193402.getClass(), "months", null);
        setField(term193402, term193402.getClass(), "weekyears", null);
        setField(term193402, term193402.getClass(), "weeks", null);
        setField(term193402, term193402.getClass(), "days", null);
        setField(term193402, term193402.getClass(), "halfdays", null);
        setField(term193402, term193402.getClass(), "hours", null);
        setField(term193402, term193402.getClass(), "minutes", null);
        setField(term193402, term193402.getClass(), "seconds", null);
        setField(term193402, term193402.getClass(), "millis", null);
        setField(term193402, term193402.getClass(), "year", null);
        setField(term193402, term193402.getClass(), "yearOfEra", null);
        setField(term193402, term193402.getClass(), "yearOfCentury", null);
        setField(term193498, term193498.getClass(), "iUnitField", term193588);
        setField(term193402, term193402.getClass(), "centuryOfEra", term193498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term193402;
        try {
            callMethod(klass, "assemble", argTypes, term193226, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


