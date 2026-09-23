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

public class ZonedChronology_assemble_1604148452411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179485;
     Object term179585;

    public ZonedChronology_assemble_1604148452411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179485 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term179585 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term179679 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term179795 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        setField(term179585, term179585.getClass(), "eras", null);
        setField(term179585, term179585.getClass(), "centuries", null);
        setField(term179585, term179585.getClass(), "years", null);
        setField(term179585, term179585.getClass(), "months", null);
        setField(term179585, term179585.getClass(), "weekyears", null);
        setField(term179585, term179585.getClass(), "weeks", null);
        setField(term179585, term179585.getClass(), "days", null);
        setField(term179585, term179585.getClass(), "halfdays", null);
        setField(term179585, term179585.getClass(), "hours", null);
        setField(term179585, term179585.getClass(), "minutes", null);
        setField(term179585, term179585.getClass(), "seconds", null);
        setField(term179585, term179585.getClass(), "millis", null);
        setField(term179585, term179585.getClass(), "year", null);
        setField(term179585, term179585.getClass(), "yearOfEra", null);
        setField(term179585, term179585.getClass(), "yearOfCentury", null);
        setField(term179585, term179585.getClass(), "centuryOfEra", null);
        setField(term179585, term179585.getClass(), "era", null);
        setField(term179585, term179585.getClass(), "dayOfWeek", null);
        setField(term179585, term179585.getClass(), "dayOfMonth", null);
        setField(term179585, term179585.getClass(), "dayOfYear", null);
        setField(term179585, term179585.getClass(), "monthOfYear", null);
        setField(term179585, term179585.getClass(), "weekOfWeekyear", null);
        setField(term179585, term179585.getClass(), "weekyear", null);
        setField(term179585, term179585.getClass(), "weekyearOfCentury", null);
        setField(term179585, term179585.getClass(), "millisOfSecond", null);
        setField(term179585, term179585.getClass(), "millisOfDay", term179679);
        setField(term179585, term179585.getClass(), "secondOfMinute", null);
        setField(term179585, term179585.getClass(), "secondOfDay", null);
        setField(term179585, term179585.getClass(), "minuteOfHour", null);
        setField(term179585, term179585.getClass(), "minuteOfDay", null);
        setField(term179585, term179585.getClass(), "hourOfDay", null);
        setField(term179585, term179585.getClass(), "hourOfHalfday", null);
        setField(term179585, term179585.getClass(), "clockhourOfDay", null);
        setField(term179585, term179585.getClass(), "clockhourOfHalfday", term179795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term179585;
        try {
            callMethod(klass, "assemble", argTypes, term179485, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


