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

public class ZonedChronology_assemble_1604148452533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243620;
     Object term243794;

    public ZonedChronology_assemble_1604148452533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243620 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term243694 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term243620, term243620.getClass(), "iParam", term243694);
        term243794 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term243898 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term243988 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term243794, term243794.getClass(), "eras", null);
        setField(term243794, term243794.getClass(), "centuries", null);
        setField(term243794, term243794.getClass(), "years", null);
        setField(term243794, term243794.getClass(), "months", null);
        setField(term243794, term243794.getClass(), "weekyears", null);
        setField(term243794, term243794.getClass(), "weeks", null);
        setField(term243794, term243794.getClass(), "days", null);
        setField(term243794, term243794.getClass(), "halfdays", null);
        setField(term243794, term243794.getClass(), "hours", null);
        setField(term243794, term243794.getClass(), "minutes", null);
        setField(term243794, term243794.getClass(), "seconds", null);
        setField(term243794, term243794.getClass(), "millis", null);
        setField(term243898, term243898.getClass(), "iUnitField", term243988);
        setField(term243794, term243794.getClass(), "year", term243898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term243794;
        try {
            callMethod(klass, "assemble", argTypes, term243620, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


