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

public class ZonedChronology_assemble_1604148452137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47157;
     Object term47257;

    public ZonedChronology_assemble_1604148452137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47157 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term47257 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term47341 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term47257, term47257.getClass(), "eras", null);
        setField(term47257, term47257.getClass(), "centuries", null);
        setField(term47257, term47257.getClass(), "years", null);
        setField(term47257, term47257.getClass(), "months", null);
        setField(term47257, term47257.getClass(), "weekyears", null);
        setField(term47257, term47257.getClass(), "weeks", null);
        setField(term47257, term47257.getClass(), "days", null);
        setField(term47257, term47257.getClass(), "halfdays", null);
        setField(term47257, term47257.getClass(), "hours", null);
        setField(term47257, term47257.getClass(), "minutes", null);
        setField(term47257, term47257.getClass(), "seconds", null);
        setField(term47257, term47257.getClass(), "millis", null);
        setField(term47257, term47257.getClass(), "year", null);
        setField(term47257, term47257.getClass(), "yearOfEra", null);
        setField(term47257, term47257.getClass(), "yearOfCentury", null);
        setField(term47257, term47257.getClass(), "centuryOfEra", term47341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term47257;
        try {
            callMethod(klass, "assemble", argTypes, term47157, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


