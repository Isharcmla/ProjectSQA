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

public class ZonedChronology_assemble_1604148452385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167781;
     Object term167881;

    public ZonedChronology_assemble_1604148452385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167781 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term167881 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term167975 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term168071 = newInstance(Class.forName("org.joda.time.chrono.GJYearOfEraDateTimeField"));
        setField(term167881, term167881.getClass(), "eras", null);
        setField(term167881, term167881.getClass(), "centuries", null);
        setField(term167881, term167881.getClass(), "years", null);
        setField(term167881, term167881.getClass(), "months", null);
        setField(term167881, term167881.getClass(), "weekyears", null);
        setField(term167881, term167881.getClass(), "weeks", null);
        setField(term167881, term167881.getClass(), "days", null);
        setField(term167881, term167881.getClass(), "halfdays", null);
        setField(term167881, term167881.getClass(), "hours", null);
        setField(term167881, term167881.getClass(), "minutes", null);
        setField(term167881, term167881.getClass(), "seconds", null);
        setField(term167881, term167881.getClass(), "millis", null);
        setField(term167881, term167881.getClass(), "year", null);
        setField(term167881, term167881.getClass(), "yearOfEra", null);
        setField(term167881, term167881.getClass(), "yearOfCentury", null);
        setField(term167881, term167881.getClass(), "centuryOfEra", null);
        setField(term167881, term167881.getClass(), "era", null);
        setField(term167881, term167881.getClass(), "dayOfWeek", null);
        setField(term167881, term167881.getClass(), "dayOfMonth", null);
        setField(term167881, term167881.getClass(), "dayOfYear", null);
        setField(term167881, term167881.getClass(), "monthOfYear", null);
        setField(term167881, term167881.getClass(), "weekOfWeekyear", null);
        setField(term167881, term167881.getClass(), "weekyear", null);
        setField(term167881, term167881.getClass(), "weekyearOfCentury", null);
        setField(term167881, term167881.getClass(), "millisOfSecond", null);
        setField(term167881, term167881.getClass(), "millisOfDay", term167975);
        setField(term167881, term167881.getClass(), "secondOfMinute", null);
        setField(term167881, term167881.getClass(), "secondOfDay", null);
        setField(term167881, term167881.getClass(), "minuteOfHour", null);
        setField(term167881, term167881.getClass(), "minuteOfDay", null);
        setField(term167881, term167881.getClass(), "hourOfDay", null);
        setField(term167881, term167881.getClass(), "hourOfHalfday", null);
        setField(term167881, term167881.getClass(), "clockhourOfDay", null);
        setField(term167881, term167881.getClass(), "clockhourOfHalfday", null);
        setField(term167881, term167881.getClass(), "halfdayOfDay", term168071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term167881;
        try {
            callMethod(klass, "assemble", argTypes, term167781, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


