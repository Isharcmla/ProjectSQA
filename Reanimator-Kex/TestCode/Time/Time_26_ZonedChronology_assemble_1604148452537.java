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

public class ZonedChronology_assemble_1604148452537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245340;
     Object term245440;

    public ZonedChronology_assemble_1604148452537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245340 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term245340, term245340.getClass(), "iParam", null);
        term245440 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term245552 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$LinkedDurationField"));
        Object term245672 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term245440, term245440.getClass(), "eras", null);
        setField(term245440, term245440.getClass(), "centuries", null);
        setField(term245440, term245440.getClass(), "years", null);
        setField(term245440, term245440.getClass(), "months", null);
        setField(term245440, term245440.getClass(), "weekyears", null);
        setField(term245440, term245440.getClass(), "weeks", null);
        setField(term245440, term245440.getClass(), "days", null);
        setField(term245440, term245440.getClass(), "halfdays", null);
        setField(term245440, term245440.getClass(), "hours", null);
        setField(term245552, term245552.getClass(), "iType", term245672);
        setField(term245440, term245440.getClass(), "minutes", term245552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term245440;
        try {
            callMethod(klass, "assemble", argTypes, term245340, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


