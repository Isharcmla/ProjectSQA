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

public class ZonedChronology_assemble_1604148452611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277164;
     Object term277264;

    public ZonedChronology_assemble_1604148452611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277164 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term277164, term277164.getClass(), "iParam", null);
        term277264 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term277368 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term277458 = newInstance(Class.forName("org.joda.time.field.DecoratedDurationField"));
        Object term277578 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term277264, term277264.getClass(), "eras", null);
        setField(term277264, term277264.getClass(), "centuries", null);
        setField(term277264, term277264.getClass(), "years", null);
        setField(term277264, term277264.getClass(), "months", null);
        setField(term277264, term277264.getClass(), "weekyears", null);
        setField(term277264, term277264.getClass(), "weeks", null);
        setField(term277264, term277264.getClass(), "days", null);
        setField(term277264, term277264.getClass(), "halfdays", null);
        setField(term277264, term277264.getClass(), "hours", null);
        setField(term277264, term277264.getClass(), "minutes", null);
        setField(term277264, term277264.getClass(), "seconds", null);
        setField(term277264, term277264.getClass(), "millis", null);
        setField(term277368, term277368.getClass(), "iUnitField", null);
        setField(term277458, term277458.getClass(), "iType", term277578);
        setField(term277368, term277368.getClass(), "iRangeField", term277458);
        setField(term277264, term277264.getClass(), "year", term277368);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term277264;
        try {
            callMethod(klass, "assemble", argTypes, term277164, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


