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

public class ZonedChronology_assemble_160414845275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21198;
     Object term21298;

    public ZonedChronology_assemble_160414845275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21198 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term21198, term21198.getClass(), "iParam", null);
        term21298 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term21410 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        Object term21540 = newInstance(Class.forName("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField"));
        setField(term21298, term21298.getClass(), "eras", null);
        setField(term21298, term21298.getClass(), "centuries", null);
        setField(term21298, term21298.getClass(), "years", null);
        setField(term21298, term21298.getClass(), "months", null);
        setField(term21298, term21298.getClass(), "weekyears", null);
        setField(term21298, term21298.getClass(), "weeks", null);
        setField(term21298, term21298.getClass(), "days", null);
        setField(term21298, term21298.getClass(), "halfdays", null);
        setField(term21298, term21298.getClass(), "hours", null);
        setField(term21298, term21298.getClass(), "minutes", null);
        setField(term21298, term21298.getClass(), "seconds", null);
        setField(term21298, term21298.getClass(), "millis", null);
        setField(term21298, term21298.getClass(), "year", null);
        setField(term21298, term21298.getClass(), "yearOfEra", null);
        setField(term21298, term21298.getClass(), "yearOfCentury", null);
        setField(term21298, term21298.getClass(), "centuryOfEra", null);
        setField(term21298, term21298.getClass(), "era", null);
        setField(term21298, term21298.getClass(), "dayOfWeek", null);
        setField(term21298, term21298.getClass(), "dayOfMonth", null);
        setField(term21298, term21298.getClass(), "dayOfYear", null);
        setField(term21298, term21298.getClass(), "monthOfYear", null);
        setField(term21298, term21298.getClass(), "weekOfWeekyear", null);
        setField(term21410, term21410.getClass(), "iUnitField", term21540);
        setField(term21298, term21298.getClass(), "weekyear", term21410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term21298;
        try {
            callMethod(klass, "assemble", argTypes, term21198, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


