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

public class ZonedChronology_assemble_1604148452387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168531;
     Object term168631;

    public ZonedChronology_assemble_1604148452387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168531 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term168531, term168531.getClass(), "iParam", null);
        term168631 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term168761 = newInstance(Class.forName("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField"));
        Object term168881 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term168631, term168631.getClass(), "eras", null);
        setField(term168631, term168631.getClass(), "centuries", null);
        setField(term168631, term168631.getClass(), "years", null);
        setField(term168631, term168631.getClass(), "months", null);
        setField(term168761, term168761.getClass(), "iType", term168881);
        setField(term168631, term168631.getClass(), "weekyears", term168761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term168631;
        try {
            callMethod(klass, "assemble", argTypes, term168531, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


