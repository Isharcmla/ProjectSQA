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

public class ZonedChronology_assemble_1604148452501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225910;
     Object term226010;

    public ZonedChronology_assemble_1604148452501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225910 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term226010 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term226104 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term226188 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term226010, term226010.getClass(), "eras", null);
        setField(term226010, term226010.getClass(), "centuries", null);
        setField(term226010, term226010.getClass(), "years", null);
        setField(term226010, term226010.getClass(), "months", null);
        setField(term226010, term226010.getClass(), "weekyears", null);
        setField(term226010, term226010.getClass(), "weeks", null);
        setField(term226010, term226010.getClass(), "days", null);
        setField(term226010, term226010.getClass(), "halfdays", null);
        setField(term226010, term226010.getClass(), "hours", null);
        setField(term226010, term226010.getClass(), "minutes", null);
        setField(term226010, term226010.getClass(), "seconds", null);
        setField(term226010, term226010.getClass(), "millis", null);
        setField(term226010, term226010.getClass(), "year", null);
        setField(term226010, term226010.getClass(), "yearOfEra", null);
        setField(term226010, term226010.getClass(), "yearOfCentury", null);
        setField(term226010, term226010.getClass(), "centuryOfEra", null);
        setField(term226010, term226010.getClass(), "era", null);
        setField(term226010, term226010.getClass(), "dayOfWeek", null);
        setField(term226010, term226010.getClass(), "dayOfMonth", null);
        setField(term226010, term226010.getClass(), "dayOfYear", null);
        setField(term226010, term226010.getClass(), "monthOfYear", null);
        setField(term226010, term226010.getClass(), "weekOfWeekyear", null);
        setField(term226010, term226010.getClass(), "weekyear", null);
        setField(term226010, term226010.getClass(), "weekyearOfCentury", null);
        setField(term226010, term226010.getClass(), "millisOfSecond", null);
        setField(term226010, term226010.getClass(), "millisOfDay", term226104);
        setField(term226010, term226010.getClass(), "secondOfMinute", null);
        setField(term226010, term226010.getClass(), "secondOfDay", null);
        setField(term226010, term226010.getClass(), "minuteOfHour", null);
        setField(term226010, term226010.getClass(), "minuteOfDay", term226188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term226010;
        try {
            callMethod(klass, "assemble", argTypes, term225910, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


