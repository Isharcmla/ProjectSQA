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

public class ZonedChronology_assemble_1604148452157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53314;
     Object term53414;

    public ZonedChronology_assemble_1604148452157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53314 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term53414 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term53502 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        setField(term53414, term53414.getClass(), "eras", null);
        setField(term53414, term53414.getClass(), "centuries", null);
        setField(term53414, term53414.getClass(), "years", null);
        setField(term53414, term53414.getClass(), "months", null);
        setField(term53414, term53414.getClass(), "weekyears", null);
        setField(term53414, term53414.getClass(), "weeks", null);
        setField(term53414, term53414.getClass(), "days", null);
        setField(term53414, term53414.getClass(), "halfdays", null);
        setField(term53414, term53414.getClass(), "hours", null);
        setField(term53414, term53414.getClass(), "minutes", null);
        setField(term53414, term53414.getClass(), "seconds", null);
        setField(term53414, term53414.getClass(), "millis", null);
        setField(term53414, term53414.getClass(), "year", term53502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term53414;
        try {
            callMethod(klass, "assemble", argTypes, term53314, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


