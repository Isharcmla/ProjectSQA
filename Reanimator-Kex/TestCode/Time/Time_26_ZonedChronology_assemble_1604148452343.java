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

public class ZonedChronology_assemble_1604148452343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132553;
     Object term132653;

    public ZonedChronology_assemble_1604148452343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132553 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term132653 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term132747 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term132833 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        setField(term132653, term132653.getClass(), "eras", null);
        setField(term132653, term132653.getClass(), "centuries", null);
        setField(term132653, term132653.getClass(), "years", null);
        setField(term132653, term132653.getClass(), "months", null);
        setField(term132653, term132653.getClass(), "weekyears", null);
        setField(term132653, term132653.getClass(), "weeks", null);
        setField(term132653, term132653.getClass(), "days", null);
        setField(term132653, term132653.getClass(), "halfdays", null);
        setField(term132653, term132653.getClass(), "hours", null);
        setField(term132653, term132653.getClass(), "minutes", null);
        setField(term132653, term132653.getClass(), "seconds", null);
        setField(term132653, term132653.getClass(), "millis", null);
        setField(term132653, term132653.getClass(), "year", null);
        setField(term132653, term132653.getClass(), "yearOfEra", null);
        setField(term132653, term132653.getClass(), "yearOfCentury", null);
        setField(term132653, term132653.getClass(), "centuryOfEra", null);
        setField(term132653, term132653.getClass(), "era", null);
        setField(term132653, term132653.getClass(), "dayOfWeek", null);
        setField(term132653, term132653.getClass(), "dayOfMonth", null);
        setField(term132653, term132653.getClass(), "dayOfYear", null);
        setField(term132653, term132653.getClass(), "monthOfYear", null);
        setField(term132653, term132653.getClass(), "weekOfWeekyear", null);
        setField(term132653, term132653.getClass(), "weekyear", null);
        setField(term132653, term132653.getClass(), "weekyearOfCentury", null);
        setField(term132653, term132653.getClass(), "millisOfSecond", null);
        setField(term132653, term132653.getClass(), "millisOfDay", term132747);
        setField(term132653, term132653.getClass(), "secondOfMinute", term132833);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term132653;
        try {
            callMethod(klass, "assemble", argTypes, term132553, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


