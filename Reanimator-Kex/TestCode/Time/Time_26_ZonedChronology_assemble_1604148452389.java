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

public class ZonedChronology_assemble_1604148452389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169348;
     Object term169526;

    public ZonedChronology_assemble_1604148452389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169348 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term169426 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term169348, term169348.getClass(), "iParam", term169426);
        term169526 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term169620 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term169706 = newInstance(Class.forName("org.joda.time.field.PreciseDateTimeField"));
        setField(term169526, term169526.getClass(), "eras", null);
        setField(term169526, term169526.getClass(), "centuries", null);
        setField(term169526, term169526.getClass(), "years", null);
        setField(term169526, term169526.getClass(), "months", null);
        setField(term169526, term169526.getClass(), "weekyears", null);
        setField(term169526, term169526.getClass(), "weeks", null);
        setField(term169526, term169526.getClass(), "days", null);
        setField(term169526, term169526.getClass(), "halfdays", null);
        setField(term169526, term169526.getClass(), "hours", null);
        setField(term169526, term169526.getClass(), "minutes", null);
        setField(term169526, term169526.getClass(), "seconds", null);
        setField(term169526, term169526.getClass(), "millis", null);
        setField(term169526, term169526.getClass(), "year", null);
        setField(term169526, term169526.getClass(), "yearOfEra", null);
        setField(term169526, term169526.getClass(), "yearOfCentury", null);
        setField(term169526, term169526.getClass(), "centuryOfEra", null);
        setField(term169526, term169526.getClass(), "era", null);
        setField(term169526, term169526.getClass(), "dayOfWeek", null);
        setField(term169526, term169526.getClass(), "dayOfMonth", null);
        setField(term169526, term169526.getClass(), "dayOfYear", null);
        setField(term169526, term169526.getClass(), "monthOfYear", null);
        setField(term169526, term169526.getClass(), "weekOfWeekyear", null);
        setField(term169526, term169526.getClass(), "weekyear", null);
        setField(term169526, term169526.getClass(), "weekyearOfCentury", null);
        setField(term169526, term169526.getClass(), "millisOfSecond", null);
        setField(term169526, term169526.getClass(), "millisOfDay", term169620);
        setField(term169526, term169526.getClass(), "secondOfMinute", null);
        setField(term169526, term169526.getClass(), "secondOfDay", null);
        setField(term169526, term169526.getClass(), "minuteOfHour", null);
        setField(term169526, term169526.getClass(), "minuteOfDay", null);
        setField(term169526, term169526.getClass(), "hourOfDay", term169706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term169526;
        try {
            callMethod(klass, "assemble", argTypes, term169348, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


