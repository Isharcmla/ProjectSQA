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

public class ZonedChronology_assemble_1604148452449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195889;
     Object term195989;

    public ZonedChronology_assemble_1604148452449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195889 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term195889, term195889.getClass(), "iParam", term195889);
        term195989 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term196073 = newInstance(Class.forName("org.joda.time.field.OffsetDateTimeField"));
        setField(term195989, term195989.getClass(), "eras", null);
        setField(term195989, term195989.getClass(), "centuries", null);
        setField(term195989, term195989.getClass(), "years", null);
        setField(term195989, term195989.getClass(), "months", null);
        setField(term195989, term195989.getClass(), "weekyears", null);
        setField(term195989, term195989.getClass(), "weeks", null);
        setField(term195989, term195989.getClass(), "days", null);
        setField(term195989, term195989.getClass(), "halfdays", null);
        setField(term195989, term195989.getClass(), "hours", null);
        setField(term195989, term195989.getClass(), "minutes", null);
        setField(term195989, term195989.getClass(), "seconds", null);
        setField(term195989, term195989.getClass(), "millis", null);
        setField(term195989, term195989.getClass(), "year", null);
        setField(term195989, term195989.getClass(), "yearOfEra", null);
        setField(term195989, term195989.getClass(), "yearOfCentury", null);
        setField(term195989, term195989.getClass(), "centuryOfEra", null);
        setField(term195989, term195989.getClass(), "era", null);
        setField(term195989, term195989.getClass(), "dayOfWeek", null);
        setField(term195989, term195989.getClass(), "dayOfMonth", null);
        setField(term195989, term195989.getClass(), "dayOfYear", term196073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term195989;
        try {
            callMethod(klass, "assemble", argTypes, term195889, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


