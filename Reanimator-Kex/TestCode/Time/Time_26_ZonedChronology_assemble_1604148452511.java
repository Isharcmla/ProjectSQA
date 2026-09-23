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

public class ZonedChronology_assemble_1604148452511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230608;
     Object term230786;

    public ZonedChronology_assemble_1604148452511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230608 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term230686 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term230608, term230608.getClass(), "iParam", term230686);
        term230786 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term230884 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$CutoverField"));
        setField(term230786, term230786.getClass(), "eras", null);
        setField(term230786, term230786.getClass(), "centuries", null);
        setField(term230786, term230786.getClass(), "years", null);
        setField(term230786, term230786.getClass(), "months", null);
        setField(term230786, term230786.getClass(), "weekyears", null);
        setField(term230786, term230786.getClass(), "weeks", null);
        setField(term230786, term230786.getClass(), "days", null);
        setField(term230786, term230786.getClass(), "halfdays", null);
        setField(term230786, term230786.getClass(), "hours", null);
        setField(term230786, term230786.getClass(), "minutes", null);
        setField(term230786, term230786.getClass(), "seconds", null);
        setField(term230786, term230786.getClass(), "millis", null);
        setField(term230786, term230786.getClass(), "year", null);
        setField(term230786, term230786.getClass(), "yearOfEra", null);
        setField(term230786, term230786.getClass(), "yearOfCentury", null);
        setField(term230786, term230786.getClass(), "centuryOfEra", null);
        setField(term230786, term230786.getClass(), "era", null);
        setField(term230786, term230786.getClass(), "dayOfWeek", null);
        setField(term230786, term230786.getClass(), "dayOfMonth", null);
        setField(term230786, term230786.getClass(), "dayOfYear", null);
        setField(term230786, term230786.getClass(), "monthOfYear", null);
        setField(term230786, term230786.getClass(), "weekOfWeekyear", null);
        setField(term230786, term230786.getClass(), "weekyear", null);
        setField(term230786, term230786.getClass(), "weekyearOfCentury", null);
        setField(term230786, term230786.getClass(), "millisOfSecond", null);
        setField(term230786, term230786.getClass(), "millisOfDay", null);
        setField(term230786, term230786.getClass(), "secondOfMinute", null);
        setField(term230786, term230786.getClass(), "secondOfDay", null);
        setField(term230786, term230786.getClass(), "minuteOfHour", null);
        setField(term230786, term230786.getClass(), "minuteOfDay", null);
        setField(term230786, term230786.getClass(), "hourOfDay", null);
        setField(term230786, term230786.getClass(), "hourOfHalfday", null);
        setField(term230786, term230786.getClass(), "clockhourOfDay", term230884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term230786;
        try {
            callMethod(klass, "assemble", argTypes, term230608, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


