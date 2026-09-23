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

public class ZonedChronology_assemble_1604148452141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48442;
     Object term48542;

    public ZonedChronology_assemble_1604148452141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48442 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term48442, term48442.getClass(), "iParam", null);
        term48542 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term48638 = newInstance(Class.forName("org.joda.time.chrono.GJDayOfWeekDateTimeField"));
        Object term48754 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        setField(term48542, term48542.getClass(), "eras", null);
        setField(term48542, term48542.getClass(), "centuries", null);
        setField(term48542, term48542.getClass(), "years", null);
        setField(term48542, term48542.getClass(), "months", null);
        setField(term48542, term48542.getClass(), "weekyears", null);
        setField(term48542, term48542.getClass(), "weeks", null);
        setField(term48542, term48542.getClass(), "days", null);
        setField(term48542, term48542.getClass(), "halfdays", null);
        setField(term48542, term48542.getClass(), "hours", null);
        setField(term48542, term48542.getClass(), "minutes", null);
        setField(term48542, term48542.getClass(), "seconds", null);
        setField(term48542, term48542.getClass(), "millis", null);
        setField(term48542, term48542.getClass(), "year", null);
        setField(term48542, term48542.getClass(), "yearOfEra", null);
        setField(term48542, term48542.getClass(), "yearOfCentury", null);
        setField(term48638, term48638.getClass(), "iUnitField", term48754);
        setField(term48542, term48542.getClass(), "centuryOfEra", term48638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term48542;
        try {
            callMethod(klass, "assemble", argTypes, term48442, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


