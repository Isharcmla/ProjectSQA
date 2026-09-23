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

public class ZonedChronology_assemble_1604148452383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167038;
     Object term167138;

    public ZonedChronology_assemble_1604148452383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167038 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term167138 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term167232 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term167316 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term167138, term167138.getClass(), "eras", null);
        setField(term167138, term167138.getClass(), "centuries", null);
        setField(term167138, term167138.getClass(), "years", null);
        setField(term167138, term167138.getClass(), "months", null);
        setField(term167138, term167138.getClass(), "weekyears", null);
        setField(term167138, term167138.getClass(), "weeks", null);
        setField(term167138, term167138.getClass(), "days", null);
        setField(term167138, term167138.getClass(), "halfdays", null);
        setField(term167138, term167138.getClass(), "hours", null);
        setField(term167138, term167138.getClass(), "minutes", null);
        setField(term167138, term167138.getClass(), "seconds", null);
        setField(term167138, term167138.getClass(), "millis", null);
        setField(term167138, term167138.getClass(), "year", null);
        setField(term167138, term167138.getClass(), "yearOfEra", null);
        setField(term167138, term167138.getClass(), "yearOfCentury", null);
        setField(term167138, term167138.getClass(), "centuryOfEra", null);
        setField(term167138, term167138.getClass(), "era", null);
        setField(term167138, term167138.getClass(), "dayOfWeek", null);
        setField(term167138, term167138.getClass(), "dayOfMonth", null);
        setField(term167138, term167138.getClass(), "dayOfYear", null);
        setField(term167138, term167138.getClass(), "monthOfYear", null);
        setField(term167138, term167138.getClass(), "weekOfWeekyear", null);
        setField(term167138, term167138.getClass(), "weekyear", null);
        setField(term167138, term167138.getClass(), "weekyearOfCentury", null);
        setField(term167138, term167138.getClass(), "millisOfSecond", null);
        setField(term167138, term167138.getClass(), "millisOfDay", term167232);
        setField(term167138, term167138.getClass(), "secondOfMinute", null);
        setField(term167138, term167138.getClass(), "secondOfDay", null);
        setField(term167138, term167138.getClass(), "minuteOfHour", null);
        setField(term167138, term167138.getClass(), "minuteOfDay", null);
        setField(term167138, term167138.getClass(), "hourOfDay", null);
        setField(term167138, term167138.getClass(), "hourOfHalfday", null);
        setField(term167138, term167138.getClass(), "clockhourOfDay", term167316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term167138;
        try {
            callMethod(klass, "assemble", argTypes, term167038, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


