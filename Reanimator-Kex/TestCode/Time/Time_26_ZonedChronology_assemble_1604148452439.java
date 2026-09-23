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

public class ZonedChronology_assemble_1604148452439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191451;
     Object term191625;

    public ZonedChronology_assemble_1604148452439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191451 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term191525 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term191451, term191451.getClass(), "iParam", term191525);
        term191625 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term191729 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term191841 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$LinkedDurationField"));
        setField(term191625, term191625.getClass(), "eras", null);
        setField(term191625, term191625.getClass(), "centuries", null);
        setField(term191625, term191625.getClass(), "years", null);
        setField(term191625, term191625.getClass(), "months", null);
        setField(term191625, term191625.getClass(), "weekyears", null);
        setField(term191625, term191625.getClass(), "weeks", null);
        setField(term191625, term191625.getClass(), "days", null);
        setField(term191625, term191625.getClass(), "halfdays", null);
        setField(term191625, term191625.getClass(), "hours", null);
        setField(term191625, term191625.getClass(), "minutes", null);
        setField(term191625, term191625.getClass(), "seconds", null);
        setField(term191625, term191625.getClass(), "millis", null);
        setField(term191729, term191729.getClass(), "iUnitField", term191841);
        setField(term191625, term191625.getClass(), "year", term191729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term191625;
        try {
            callMethod(klass, "assemble", argTypes, term191451, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


