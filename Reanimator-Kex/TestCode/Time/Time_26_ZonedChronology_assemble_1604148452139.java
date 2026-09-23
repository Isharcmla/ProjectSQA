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

public class ZonedChronology_assemble_1604148452139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47769;
     Object term47869;

    public ZonedChronology_assemble_1604148452139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47769 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term47869 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term47967 = newInstance(Class.forName("org.joda.time.chrono.ISOYearOfEraDateTimeField"));
        setField(term47869, term47869.getClass(), "eras", null);
        setField(term47869, term47869.getClass(), "centuries", null);
        setField(term47869, term47869.getClass(), "years", null);
        setField(term47869, term47869.getClass(), "months", null);
        setField(term47869, term47869.getClass(), "weekyears", null);
        setField(term47869, term47869.getClass(), "weeks", null);
        setField(term47869, term47869.getClass(), "days", null);
        setField(term47869, term47869.getClass(), "halfdays", null);
        setField(term47869, term47869.getClass(), "hours", null);
        setField(term47869, term47869.getClass(), "minutes", null);
        setField(term47869, term47869.getClass(), "seconds", null);
        setField(term47869, term47869.getClass(), "millis", null);
        setField(term47869, term47869.getClass(), "year", null);
        setField(term47869, term47869.getClass(), "yearOfEra", null);
        setField(term47869, term47869.getClass(), "yearOfCentury", null);
        setField(term47869, term47869.getClass(), "centuryOfEra", null);
        setField(term47869, term47869.getClass(), "era", null);
        setField(term47869, term47869.getClass(), "dayOfWeek", null);
        setField(term47869, term47869.getClass(), "dayOfMonth", null);
        setField(term47869, term47869.getClass(), "dayOfYear", null);
        setField(term47869, term47869.getClass(), "monthOfYear", null);
        setField(term47869, term47869.getClass(), "weekOfWeekyear", null);
        setField(term47869, term47869.getClass(), "weekyear", null);
        setField(term47869, term47869.getClass(), "weekyearOfCentury", null);
        setField(term47869, term47869.getClass(), "millisOfSecond", null);
        setField(term47869, term47869.getClass(), "millisOfDay", null);
        setField(term47869, term47869.getClass(), "secondOfMinute", null);
        setField(term47869, term47869.getClass(), "secondOfDay", null);
        setField(term47869, term47869.getClass(), "minuteOfHour", null);
        setField(term47869, term47869.getClass(), "minuteOfDay", null);
        setField(term47869, term47869.getClass(), "hourOfDay", null);
        setField(term47869, term47869.getClass(), "hourOfHalfday", null);
        setField(term47869, term47869.getClass(), "clockhourOfDay", null);
        setField(term47869, term47869.getClass(), "clockhourOfHalfday", null);
        setField(term47869, term47869.getClass(), "halfdayOfDay", term47967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term47869;
        try {
            callMethod(klass, "assemble", argTypes, term47769, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


