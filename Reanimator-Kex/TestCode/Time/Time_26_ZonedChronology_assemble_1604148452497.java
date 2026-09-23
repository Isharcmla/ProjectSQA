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

public class ZonedChronology_assemble_1604148452497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224097;
     Object term224291;

    public ZonedChronology_assemble_1604148452497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224097 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term224191 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term224097, term224097.getClass(), "iParam", term224191);
        term224291 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term224395 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term224485 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term224291, term224291.getClass(), "eras", null);
        setField(term224291, term224291.getClass(), "centuries", null);
        setField(term224291, term224291.getClass(), "years", null);
        setField(term224291, term224291.getClass(), "months", null);
        setField(term224291, term224291.getClass(), "weekyears", null);
        setField(term224291, term224291.getClass(), "weeks", null);
        setField(term224291, term224291.getClass(), "days", null);
        setField(term224291, term224291.getClass(), "halfdays", null);
        setField(term224291, term224291.getClass(), "hours", null);
        setField(term224291, term224291.getClass(), "minutes", null);
        setField(term224291, term224291.getClass(), "seconds", null);
        setField(term224291, term224291.getClass(), "millis", null);
        setField(term224291, term224291.getClass(), "year", null);
        setField(term224291, term224291.getClass(), "yearOfEra", null);
        setField(term224291, term224291.getClass(), "yearOfCentury", null);
        setField(term224291, term224291.getClass(), "centuryOfEra", null);
        setField(term224291, term224291.getClass(), "era", null);
        setField(term224291, term224291.getClass(), "dayOfWeek", null);
        setField(term224291, term224291.getClass(), "dayOfMonth", null);
        setField(term224291, term224291.getClass(), "dayOfYear", null);
        setField(term224291, term224291.getClass(), "monthOfYear", null);
        setField(term224395, term224395.getClass(), "iUnitField", term224485);
        setField(term224291, term224291.getClass(), "weekOfWeekyear", term224395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term224291;
        try {
            callMethod(klass, "assemble", argTypes, term224097, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


