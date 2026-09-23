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

public class ZonedChronology_assemble_1604148452123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42176;
     Object term42276;

    public ZonedChronology_assemble_1604148452123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42176 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term42276 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term42362 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        setField(term42276, term42276.getClass(), "eras", null);
        setField(term42276, term42276.getClass(), "centuries", null);
        setField(term42276, term42276.getClass(), "years", null);
        setField(term42276, term42276.getClass(), "months", null);
        setField(term42276, term42276.getClass(), "weekyears", null);
        setField(term42276, term42276.getClass(), "weeks", null);
        setField(term42276, term42276.getClass(), "days", null);
        setField(term42276, term42276.getClass(), "halfdays", null);
        setField(term42276, term42276.getClass(), "hours", null);
        setField(term42276, term42276.getClass(), "minutes", null);
        setField(term42276, term42276.getClass(), "seconds", null);
        setField(term42276, term42276.getClass(), "millis", null);
        setField(term42276, term42276.getClass(), "year", null);
        setField(term42276, term42276.getClass(), "yearOfEra", null);
        setField(term42276, term42276.getClass(), "yearOfCentury", null);
        setField(term42276, term42276.getClass(), "centuryOfEra", null);
        setField(term42276, term42276.getClass(), "era", null);
        setField(term42276, term42276.getClass(), "dayOfWeek", null);
        setField(term42276, term42276.getClass(), "dayOfMonth", null);
        setField(term42276, term42276.getClass(), "dayOfYear", null);
        setField(term42276, term42276.getClass(), "monthOfYear", null);
        setField(term42276, term42276.getClass(), "weekOfWeekyear", null);
        setField(term42276, term42276.getClass(), "weekyear", null);
        setField(term42276, term42276.getClass(), "weekyearOfCentury", null);
        setField(term42276, term42276.getClass(), "millisOfSecond", null);
        setField(term42276, term42276.getClass(), "millisOfDay", null);
        setField(term42276, term42276.getClass(), "secondOfMinute", null);
        setField(term42276, term42276.getClass(), "secondOfDay", null);
        setField(term42276, term42276.getClass(), "minuteOfHour", null);
        setField(term42276, term42276.getClass(), "minuteOfDay", term42362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term42276;
        try {
            callMethod(klass, "assemble", argTypes, term42176, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


