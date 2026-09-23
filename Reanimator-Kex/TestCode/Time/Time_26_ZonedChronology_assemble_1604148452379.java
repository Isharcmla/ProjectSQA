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

public class ZonedChronology_assemble_1604148452379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162254;
     Object term162354;

    public ZonedChronology_assemble_1604148452379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162254 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term162354 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term162448 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term162532 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term162354, term162354.getClass(), "eras", null);
        setField(term162354, term162354.getClass(), "centuries", null);
        setField(term162354, term162354.getClass(), "years", null);
        setField(term162354, term162354.getClass(), "months", null);
        setField(term162354, term162354.getClass(), "weekyears", null);
        setField(term162354, term162354.getClass(), "weeks", null);
        setField(term162354, term162354.getClass(), "days", null);
        setField(term162354, term162354.getClass(), "halfdays", null);
        setField(term162354, term162354.getClass(), "hours", null);
        setField(term162354, term162354.getClass(), "minutes", null);
        setField(term162354, term162354.getClass(), "seconds", null);
        setField(term162354, term162354.getClass(), "millis", null);
        setField(term162354, term162354.getClass(), "year", null);
        setField(term162354, term162354.getClass(), "yearOfEra", null);
        setField(term162354, term162354.getClass(), "yearOfCentury", null);
        setField(term162354, term162354.getClass(), "centuryOfEra", null);
        setField(term162354, term162354.getClass(), "era", null);
        setField(term162354, term162354.getClass(), "dayOfWeek", null);
        setField(term162354, term162354.getClass(), "dayOfMonth", null);
        setField(term162354, term162354.getClass(), "dayOfYear", null);
        setField(term162354, term162354.getClass(), "monthOfYear", null);
        setField(term162354, term162354.getClass(), "weekOfWeekyear", null);
        setField(term162354, term162354.getClass(), "weekyear", null);
        setField(term162354, term162354.getClass(), "weekyearOfCentury", null);
        setField(term162354, term162354.getClass(), "millisOfSecond", null);
        setField(term162354, term162354.getClass(), "millisOfDay", term162448);
        setField(term162354, term162354.getClass(), "secondOfMinute", null);
        setField(term162354, term162354.getClass(), "secondOfDay", null);
        setField(term162354, term162354.getClass(), "minuteOfHour", null);
        setField(term162354, term162354.getClass(), "minuteOfDay", null);
        setField(term162354, term162354.getClass(), "hourOfDay", null);
        setField(term162354, term162354.getClass(), "hourOfHalfday", term162532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term162354;
        try {
            callMethod(klass, "assemble", argTypes, term162254, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


