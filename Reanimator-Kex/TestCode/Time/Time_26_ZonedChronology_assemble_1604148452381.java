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

public class ZonedChronology_assemble_1604148452381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163119;
     Object term163219;

    public ZonedChronology_assemble_1604148452381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163119 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term163119, term163119.getClass(), "iParam", null);
        term163219 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term163323 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term163413 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term163219, term163219.getClass(), "eras", null);
        setField(term163219, term163219.getClass(), "centuries", null);
        setField(term163219, term163219.getClass(), "years", null);
        setField(term163219, term163219.getClass(), "months", null);
        setField(term163219, term163219.getClass(), "weekyears", null);
        setField(term163219, term163219.getClass(), "weeks", null);
        setField(term163219, term163219.getClass(), "days", null);
        setField(term163219, term163219.getClass(), "halfdays", null);
        setField(term163219, term163219.getClass(), "hours", null);
        setField(term163219, term163219.getClass(), "minutes", null);
        setField(term163219, term163219.getClass(), "seconds", null);
        setField(term163219, term163219.getClass(), "millis", null);
        setField(term163219, term163219.getClass(), "year", null);
        setField(term163219, term163219.getClass(), "yearOfEra", null);
        setField(term163323, term163323.getClass(), "iUnitField", null);
        setField(term163323, term163323.getClass(), "iRangeField", term163413);
        setField(term163219, term163219.getClass(), "yearOfCentury", term163323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term163219;
        try {
            callMethod(klass, "assemble", argTypes, term163119, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


