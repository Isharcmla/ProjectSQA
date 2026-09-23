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

public class ZonedChronology_assemble_1604148452519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237448;
     Object term237548;

    public ZonedChronology_assemble_1604148452519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237448 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term237548 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term237678 = newInstance(Class.forName("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField"));
        setField(term237548, term237548.getClass(), "eras", null);
        setField(term237548, term237548.getClass(), "centuries", null);
        setField(term237548, term237548.getClass(), "years", null);
        setField(term237548, term237548.getClass(), "months", null);
        setField(term237548, term237548.getClass(), "weekyears", null);
        setField(term237548, term237548.getClass(), "weeks", null);
        setField(term237548, term237548.getClass(), "days", null);
        setField(term237548, term237548.getClass(), "halfdays", null);
        setField(term237548, term237548.getClass(), "hours", null);
        setField(term237548, term237548.getClass(), "minutes", null);
        setField(term237548, term237548.getClass(), "seconds", null);
        setField(term237548, term237548.getClass(), "millis", term237678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term237548;
        try {
            callMethod(klass, "assemble", argTypes, term237448, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


