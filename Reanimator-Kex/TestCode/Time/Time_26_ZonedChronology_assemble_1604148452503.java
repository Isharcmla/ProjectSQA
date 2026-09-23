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

public class ZonedChronology_assemble_1604148452503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226664;
     Object term226764;

    public ZonedChronology_assemble_1604148452503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226664 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term226664, term226664.getClass(), "iParam", null);
        term226764 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term226858 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term226974 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term227090 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        setField(term226764, term226764.getClass(), "eras", null);
        setField(term226764, term226764.getClass(), "centuries", null);
        setField(term226764, term226764.getClass(), "years", null);
        setField(term226764, term226764.getClass(), "months", null);
        setField(term226764, term226764.getClass(), "weekyears", null);
        setField(term226764, term226764.getClass(), "weeks", null);
        setField(term226764, term226764.getClass(), "days", null);
        setField(term226764, term226764.getClass(), "halfdays", null);
        setField(term226764, term226764.getClass(), "hours", null);
        setField(term226764, term226764.getClass(), "minutes", null);
        setField(term226764, term226764.getClass(), "seconds", null);
        setField(term226764, term226764.getClass(), "millis", null);
        setField(term226764, term226764.getClass(), "year", null);
        setField(term226764, term226764.getClass(), "yearOfEra", null);
        setField(term226764, term226764.getClass(), "yearOfCentury", null);
        setField(term226764, term226764.getClass(), "centuryOfEra", null);
        setField(term226764, term226764.getClass(), "era", null);
        setField(term226764, term226764.getClass(), "dayOfWeek", null);
        setField(term226764, term226764.getClass(), "dayOfMonth", null);
        setField(term226764, term226764.getClass(), "dayOfYear", null);
        setField(term226764, term226764.getClass(), "monthOfYear", null);
        setField(term226764, term226764.getClass(), "weekOfWeekyear", null);
        setField(term226764, term226764.getClass(), "weekyear", null);
        setField(term226764, term226764.getClass(), "weekyearOfCentury", null);
        setField(term226764, term226764.getClass(), "millisOfSecond", null);
        setField(term226764, term226764.getClass(), "millisOfDay", term226858);
        setField(term226764, term226764.getClass(), "secondOfMinute", null);
        setField(term226764, term226764.getClass(), "secondOfDay", null);
        setField(term226764, term226764.getClass(), "minuteOfHour", null);
        setField(term226974, term226974.getClass(), "iDurationField", null);
        setField(term226974, term226974.getClass(), "iRangeDurationField", null);
        setField(term226974, term226974.getClass(), "iLeapDurationField", term227090);
        setField(term226764, term226764.getClass(), "minuteOfDay", term226974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term226764;
        try {
            callMethod(klass, "assemble", argTypes, term226664, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


