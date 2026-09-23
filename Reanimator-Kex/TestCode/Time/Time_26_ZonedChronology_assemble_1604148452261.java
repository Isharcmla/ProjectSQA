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

public class ZonedChronology_assemble_1604148452261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97083;
     Object term97183;

    public ZonedChronology_assemble_1604148452261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97083 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term97183 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term97269 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        setField(term97183, term97183.getClass(), "eras", null);
        setField(term97183, term97183.getClass(), "centuries", null);
        setField(term97183, term97183.getClass(), "years", null);
        setField(term97183, term97183.getClass(), "months", null);
        setField(term97183, term97183.getClass(), "weekyears", null);
        setField(term97183, term97183.getClass(), "weeks", null);
        setField(term97183, term97183.getClass(), "days", null);
        setField(term97183, term97183.getClass(), "halfdays", null);
        setField(term97183, term97183.getClass(), "hours", null);
        setField(term97183, term97183.getClass(), "minutes", null);
        setField(term97183, term97183.getClass(), "seconds", null);
        setField(term97183, term97183.getClass(), "millis", null);
        setField(term97183, term97183.getClass(), "year", null);
        setField(term97183, term97183.getClass(), "yearOfEra", null);
        setField(term97183, term97183.getClass(), "yearOfCentury", null);
        setField(term97183, term97183.getClass(), "centuryOfEra", null);
        setField(term97183, term97183.getClass(), "era", term97269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term97183;
        try {
            callMethod(klass, "assemble", argTypes, term97083, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


