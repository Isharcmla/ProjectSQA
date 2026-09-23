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

public class ZonedChronology_assemble_1604148452197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72324;
     Object term72424;

    public ZonedChronology_assemble_1604148452197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72324 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term72424 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term72526 = newInstance(Class.forName("org.joda.time.chrono.BasicSingleEraDateTimeField"));
        setField(term72424, term72424.getClass(), "eras", null);
        setField(term72424, term72424.getClass(), "centuries", null);
        setField(term72424, term72424.getClass(), "years", null);
        setField(term72424, term72424.getClass(), "months", null);
        setField(term72424, term72424.getClass(), "weekyears", null);
        setField(term72424, term72424.getClass(), "weeks", null);
        setField(term72424, term72424.getClass(), "days", null);
        setField(term72424, term72424.getClass(), "halfdays", null);
        setField(term72424, term72424.getClass(), "hours", null);
        setField(term72424, term72424.getClass(), "minutes", null);
        setField(term72424, term72424.getClass(), "seconds", null);
        setField(term72424, term72424.getClass(), "millis", null);
        setField(term72424, term72424.getClass(), "year", null);
        setField(term72424, term72424.getClass(), "yearOfEra", null);
        setField(term72424, term72424.getClass(), "yearOfCentury", null);
        setField(term72424, term72424.getClass(), "centuryOfEra", null);
        setField(term72424, term72424.getClass(), "era", null);
        setField(term72424, term72424.getClass(), "dayOfWeek", null);
        setField(term72424, term72424.getClass(), "dayOfMonth", null);
        setField(term72424, term72424.getClass(), "dayOfYear", null);
        setField(term72424, term72424.getClass(), "monthOfYear", null);
        setField(term72424, term72424.getClass(), "weekOfWeekyear", null);
        setField(term72424, term72424.getClass(), "weekyear", null);
        setField(term72424, term72424.getClass(), "weekyearOfCentury", null);
        setField(term72424, term72424.getClass(), "millisOfSecond", null);
        setField(term72424, term72424.getClass(), "millisOfDay", null);
        setField(term72424, term72424.getClass(), "secondOfMinute", null);
        setField(term72424, term72424.getClass(), "secondOfDay", null);
        setField(term72424, term72424.getClass(), "minuteOfHour", null);
        setField(term72424, term72424.getClass(), "minuteOfDay", null);
        setField(term72424, term72424.getClass(), "hourOfDay", null);
        setField(term72424, term72424.getClass(), "hourOfHalfday", null);
        setField(term72424, term72424.getClass(), "clockhourOfDay", null);
        setField(term72424, term72424.getClass(), "clockhourOfHalfday", term72526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term72424;
        try {
            callMethod(klass, "assemble", argTypes, term72324, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


