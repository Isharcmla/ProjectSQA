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

public class ZonedChronology_assemble_1604148452223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81419;
     Object term81519;

    public ZonedChronology_assemble_1604148452223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81419 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term81419, term81419.getClass(), "iParam", term81419);
        term81519 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term81623 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        setField(term81519, term81519.getClass(), "eras", null);
        setField(term81519, term81519.getClass(), "centuries", null);
        setField(term81519, term81519.getClass(), "years", null);
        setField(term81519, term81519.getClass(), "months", null);
        setField(term81519, term81519.getClass(), "weekyears", null);
        setField(term81519, term81519.getClass(), "weeks", null);
        setField(term81519, term81519.getClass(), "days", null);
        setField(term81519, term81519.getClass(), "halfdays", null);
        setField(term81519, term81519.getClass(), "hours", null);
        setField(term81519, term81519.getClass(), "minutes", null);
        setField(term81519, term81519.getClass(), "seconds", null);
        setField(term81519, term81519.getClass(), "millis", null);
        setField(term81519, term81519.getClass(), "year", term81623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term81519;
        try {
            callMethod(klass, "assemble", argTypes, term81419, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


