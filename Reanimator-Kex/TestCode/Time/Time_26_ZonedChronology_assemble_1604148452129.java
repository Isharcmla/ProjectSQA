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
import java.lang.ClassCastException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44175;
     Object term44275;

    public ZonedChronology_assemble_1604148452129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44175 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term44175, term44175.getClass(), "iParam", term44175);
        term44275 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term44379 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        setField(term44275, term44275.getClass(), "eras", null);
        setField(term44275, term44275.getClass(), "centuries", null);
        setField(term44275, term44275.getClass(), "years", null);
        setField(term44275, term44275.getClass(), "months", null);
        setField(term44275, term44275.getClass(), "weekyears", null);
        setField(term44275, term44275.getClass(), "weeks", null);
        setField(term44275, term44275.getClass(), "days", null);
        setField(term44275, term44275.getClass(), "halfdays", null);
        setField(term44275, term44275.getClass(), "hours", null);
        setField(term44275, term44275.getClass(), "minutes", null);
        setField(term44275, term44275.getClass(), "seconds", null);
        setField(term44275, term44275.getClass(), "millis", null);
        setField(term44275, term44275.getClass(), "year", null);
        setField(term44275, term44275.getClass(), "yearOfEra", null);
        setField(term44275, term44275.getClass(), "yearOfCentury", null);
        setField(term44275, term44275.getClass(), "centuryOfEra", null);
        setField(term44275, term44275.getClass(), "era", term44379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term44275;
        try {
            callMethod(klass, "assemble", argTypes, term44175, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


