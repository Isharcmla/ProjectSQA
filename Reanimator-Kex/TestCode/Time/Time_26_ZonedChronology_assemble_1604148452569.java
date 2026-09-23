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

public class ZonedChronology_assemble_1604148452569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258605;
     Object term258799;

    public ZonedChronology_assemble_1604148452569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258605 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term258699 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term258605, term258605.getClass(), "iParam", term258699);
        term258799 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term258903 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term259015 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$LinkedDurationField"));
        Object term259135 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term258799, term258799.getClass(), "eras", null);
        setField(term258799, term258799.getClass(), "centuries", null);
        setField(term258799, term258799.getClass(), "years", null);
        setField(term258799, term258799.getClass(), "months", null);
        setField(term258799, term258799.getClass(), "weekyears", null);
        setField(term258799, term258799.getClass(), "weeks", null);
        setField(term258799, term258799.getClass(), "days", null);
        setField(term258799, term258799.getClass(), "halfdays", null);
        setField(term258799, term258799.getClass(), "hours", null);
        setField(term258799, term258799.getClass(), "minutes", null);
        setField(term258799, term258799.getClass(), "seconds", null);
        setField(term258799, term258799.getClass(), "millis", null);
        setField(term258799, term258799.getClass(), "year", null);
        setField(term258799, term258799.getClass(), "yearOfEra", null);
        setField(term259015, term259015.getClass(), "iType", term259135);
        setField(term258903, term258903.getClass(), "iUnitField", term259015);
        setField(term258799, term258799.getClass(), "yearOfCentury", term258903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term258799;
        try {
            callMethod(klass, "assemble", argTypes, term258605, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


