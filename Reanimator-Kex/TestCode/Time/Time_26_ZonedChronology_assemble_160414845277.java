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

public class ZonedChronology_assemble_160414845277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22302;
     Object term22402;

    public ZonedChronology_assemble_160414845277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22302 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term22402 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term22498 = newInstance(Class.forName("org.joda.time.chrono.GJDayOfWeekDateTimeField"));
        setField(term22402, term22402.getClass(), "eras", null);
        setField(term22402, term22402.getClass(), "centuries", null);
        setField(term22402, term22402.getClass(), "years", null);
        setField(term22402, term22402.getClass(), "months", null);
        setField(term22402, term22402.getClass(), "weekyears", null);
        setField(term22402, term22402.getClass(), "weeks", null);
        setField(term22402, term22402.getClass(), "days", null);
        setField(term22402, term22402.getClass(), "halfdays", null);
        setField(term22402, term22402.getClass(), "hours", null);
        setField(term22402, term22402.getClass(), "minutes", null);
        setField(term22402, term22402.getClass(), "seconds", null);
        setField(term22402, term22402.getClass(), "millis", null);
        setField(term22402, term22402.getClass(), "year", null);
        setField(term22402, term22402.getClass(), "yearOfEra", null);
        setField(term22402, term22402.getClass(), "yearOfCentury", null);
        setField(term22402, term22402.getClass(), "centuryOfEra", term22498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term22402;
        try {
            callMethod(klass, "assemble", argTypes, term22302, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


