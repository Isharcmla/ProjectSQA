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

public class ZonedChronology_assemble_1604148452183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67315;
     Object term67415;

    public ZonedChronology_assemble_1604148452183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67315 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term67415 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term67527 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$LinkedDurationField"));
        setField(term67415, term67415.getClass(), "eras", null);
        setField(term67415, term67415.getClass(), "centuries", null);
        setField(term67415, term67415.getClass(), "years", null);
        setField(term67415, term67415.getClass(), "months", null);
        setField(term67415, term67415.getClass(), "weekyears", null);
        setField(term67415, term67415.getClass(), "weeks", null);
        setField(term67415, term67415.getClass(), "days", null);
        setField(term67415, term67415.getClass(), "halfdays", null);
        setField(term67415, term67415.getClass(), "hours", null);
        setField(term67415, term67415.getClass(), "minutes", term67527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term67415;
        try {
            callMethod(klass, "assemble", argTypes, term67315, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


