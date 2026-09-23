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

public class ZonedChronology_assemble_1604148452364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136119;
     Object term136219;

    public ZonedChronology_assemble_1604148452364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136119 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term136119, term136119.getClass(), "iParam", null);
        term136219 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term136323 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term136413 = newInstance(Class.forName("org.joda.time.field.DecoratedDurationField"));
        setField(term136219, term136219.getClass(), "eras", null);
        setField(term136219, term136219.getClass(), "centuries", null);
        setField(term136219, term136219.getClass(), "years", null);
        setField(term136219, term136219.getClass(), "months", null);
        setField(term136219, term136219.getClass(), "weekyears", null);
        setField(term136219, term136219.getClass(), "weeks", null);
        setField(term136219, term136219.getClass(), "days", null);
        setField(term136219, term136219.getClass(), "halfdays", null);
        setField(term136219, term136219.getClass(), "hours", null);
        setField(term136219, term136219.getClass(), "minutes", null);
        setField(term136219, term136219.getClass(), "seconds", null);
        setField(term136219, term136219.getClass(), "millis", null);
        setField(term136323, term136323.getClass(), "iUnitField", null);
        setField(term136323, term136323.getClass(), "iRangeField", term136413);
        setField(term136219, term136219.getClass(), "year", term136323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term136219;
        try {
            callMethod(klass, "assemble", argTypes, term136119, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


