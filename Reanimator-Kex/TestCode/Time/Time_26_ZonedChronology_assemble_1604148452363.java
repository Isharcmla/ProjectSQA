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

public class ZonedChronology_assemble_1604148452363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135646;
     Object term135860;

    public ZonedChronology_assemble_1604148452363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135646 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term135760 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term135646, term135646.getClass(), "iParam", term135760);
        term135860 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term135964 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        setField(term135860, term135860.getClass(), "eras", null);
        setField(term135860, term135860.getClass(), "centuries", null);
        setField(term135860, term135860.getClass(), "years", null);
        setField(term135860, term135860.getClass(), "months", null);
        setField(term135860, term135860.getClass(), "weekyears", null);
        setField(term135860, term135860.getClass(), "weeks", null);
        setField(term135860, term135860.getClass(), "days", null);
        setField(term135860, term135860.getClass(), "halfdays", null);
        setField(term135860, term135860.getClass(), "hours", null);
        setField(term135860, term135860.getClass(), "minutes", null);
        setField(term135860, term135860.getClass(), "seconds", null);
        setField(term135860, term135860.getClass(), "millis", null);
        setField(term135860, term135860.getClass(), "year", null);
        setField(term135860, term135860.getClass(), "yearOfEra", null);
        setField(term135860, term135860.getClass(), "yearOfCentury", null);
        setField(term135860, term135860.getClass(), "centuryOfEra", null);
        setField(term135860, term135860.getClass(), "era", null);
        setField(term135860, term135860.getClass(), "dayOfWeek", null);
        setField(term135860, term135860.getClass(), "dayOfMonth", null);
        setField(term135860, term135860.getClass(), "dayOfYear", null);
        setField(term135860, term135860.getClass(), "monthOfYear", null);
        setField(term135860, term135860.getClass(), "weekOfWeekyear", null);
        setField(term135860, term135860.getClass(), "weekyear", null);
        setField(term135860, term135860.getClass(), "weekyearOfCentury", null);
        setField(term135860, term135860.getClass(), "millisOfSecond", null);
        setField(term135860, term135860.getClass(), "millisOfDay", null);
        setField(term135860, term135860.getClass(), "secondOfMinute", null);
        setField(term135860, term135860.getClass(), "secondOfDay", term135964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term135860;
        try {
            callMethod(klass, "assemble", argTypes, term135646, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


