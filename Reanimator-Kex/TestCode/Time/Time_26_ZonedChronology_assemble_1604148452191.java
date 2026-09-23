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

public class ZonedChronology_assemble_1604148452191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70151;
     Object term70251;

    public ZonedChronology_assemble_1604148452191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70151 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term70151, term70151.getClass(), "iParam", null);
        term70251 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term70355 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term70485 = newInstance(Class.forName("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField"));
        setField(term70251, term70251.getClass(), "eras", null);
        setField(term70251, term70251.getClass(), "centuries", null);
        setField(term70251, term70251.getClass(), "years", null);
        setField(term70251, term70251.getClass(), "months", null);
        setField(term70251, term70251.getClass(), "weekyears", null);
        setField(term70251, term70251.getClass(), "weeks", null);
        setField(term70251, term70251.getClass(), "days", null);
        setField(term70251, term70251.getClass(), "halfdays", null);
        setField(term70251, term70251.getClass(), "hours", null);
        setField(term70251, term70251.getClass(), "minutes", null);
        setField(term70251, term70251.getClass(), "seconds", null);
        setField(term70251, term70251.getClass(), "millis", null);
        setField(term70251, term70251.getClass(), "year", null);
        setField(term70251, term70251.getClass(), "yearOfEra", null);
        setField(term70355, term70355.getClass(), "iUnitField", term70485);
        setField(term70251, term70251.getClass(), "yearOfCentury", term70355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term70251;
        try {
            callMethod(klass, "assemble", argTypes, term70151, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


