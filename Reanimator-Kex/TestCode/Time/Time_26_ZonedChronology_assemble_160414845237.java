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

public class ZonedChronology_assemble_160414845237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9887;
     Object term9987;

    public ZonedChronology_assemble_160414845237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9887 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term9987 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term10073 = newInstance(Class.forName("org.joda.time.field.PreciseDurationField"));
        setField(term9987, term9987.getClass(), "eras", null);
        setField(term9987, term9987.getClass(), "centuries", null);
        setField(term9987, term9987.getClass(), "years", null);
        setField(term9987, term9987.getClass(), "months", null);
        setField(term9987, term9987.getClass(), "weekyears", null);
        setField(term9987, term9987.getClass(), "weeks", null);
        setField(term9987, term9987.getClass(), "days", null);
        setField(term9987, term9987.getClass(), "halfdays", null);
        setField(term9987, term9987.getClass(), "hours", null);
        setField(term9987, term9987.getClass(), "minutes", null);
        setField(term9987, term9987.getClass(), "seconds", term10073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term9987;
        try {
            callMethod(klass, "assemble", argTypes, term9887, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


