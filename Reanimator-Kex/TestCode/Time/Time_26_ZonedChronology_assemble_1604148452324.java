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

public class ZonedChronology_assemble_1604148452324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117477;
     Object term117651;

    public ZonedChronology_assemble_1604148452324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117477 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term117551 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term117477, term117477.getClass(), "iParam", term117551);
        term117651 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term117755 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        setField(term117651, term117651.getClass(), "eras", null);
        setField(term117651, term117651.getClass(), "centuries", null);
        setField(term117651, term117651.getClass(), "years", null);
        setField(term117651, term117651.getClass(), "months", null);
        setField(term117651, term117651.getClass(), "weekyears", null);
        setField(term117651, term117651.getClass(), "weeks", null);
        setField(term117651, term117651.getClass(), "days", null);
        setField(term117651, term117651.getClass(), "halfdays", null);
        setField(term117651, term117651.getClass(), "hours", null);
        setField(term117651, term117651.getClass(), "minutes", null);
        setField(term117651, term117651.getClass(), "seconds", null);
        setField(term117651, term117651.getClass(), "millis", null);
        setField(term117651, term117651.getClass(), "year", term117755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term117651;
        try {
            callMethod(klass, "assemble", argTypes, term117477, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


