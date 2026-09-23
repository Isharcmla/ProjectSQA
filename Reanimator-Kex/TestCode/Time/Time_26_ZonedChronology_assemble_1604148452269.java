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

public class ZonedChronology_assemble_1604148452269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100081;
     Object term100181;

    public ZonedChronology_assemble_1604148452269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100081 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term100081, term100081.getClass(), "iParam", null);
        term100181 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term100297 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDurationField"));
        Object term100417 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term100181, term100181.getClass(), "eras", null);
        setField(term100297, term100297.getClass(), "iType", term100417);
        setField(term100181, term100181.getClass(), "centuries", term100297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term100181;
        try {
            callMethod(klass, "assemble", argTypes, term100081, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


