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

public class ZonedChronology_assemble_1604148452237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87589;
     Object term87689;

    public ZonedChronology_assemble_1604148452237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87589 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term87689 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term87779 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term87689, term87689.getClass(), "eras", null);
        setField(term87689, term87689.getClass(), "centuries", null);
        setField(term87689, term87689.getClass(), "years", null);
        setField(term87689, term87689.getClass(), "months", null);
        setField(term87689, term87689.getClass(), "weekyears", term87779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term87689;
        try {
            callMethod(klass, "assemble", argTypes, term87589, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


