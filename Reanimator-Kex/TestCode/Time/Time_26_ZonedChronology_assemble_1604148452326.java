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

public class ZonedChronology_assemble_1604148452326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118368;
     Object term118468;

    public ZonedChronology_assemble_1604148452326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118368 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term118468 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term118562 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term118648 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        setField(term118468, term118468.getClass(), "eras", null);
        setField(term118468, term118468.getClass(), "centuries", null);
        setField(term118468, term118468.getClass(), "years", null);
        setField(term118468, term118468.getClass(), "months", null);
        setField(term118468, term118468.getClass(), "weekyears", null);
        setField(term118468, term118468.getClass(), "weeks", null);
        setField(term118468, term118468.getClass(), "days", null);
        setField(term118468, term118468.getClass(), "halfdays", null);
        setField(term118468, term118468.getClass(), "hours", null);
        setField(term118468, term118468.getClass(), "minutes", null);
        setField(term118468, term118468.getClass(), "seconds", null);
        setField(term118468, term118468.getClass(), "millis", null);
        setField(term118468, term118468.getClass(), "year", null);
        setField(term118468, term118468.getClass(), "yearOfEra", null);
        setField(term118468, term118468.getClass(), "yearOfCentury", null);
        setField(term118468, term118468.getClass(), "centuryOfEra", null);
        setField(term118468, term118468.getClass(), "era", null);
        setField(term118468, term118468.getClass(), "dayOfWeek", null);
        setField(term118468, term118468.getClass(), "dayOfMonth", null);
        setField(term118468, term118468.getClass(), "dayOfYear", null);
        setField(term118468, term118468.getClass(), "monthOfYear", null);
        setField(term118468, term118468.getClass(), "weekOfWeekyear", null);
        setField(term118468, term118468.getClass(), "weekyear", null);
        setField(term118468, term118468.getClass(), "weekyearOfCentury", null);
        setField(term118468, term118468.getClass(), "millisOfSecond", null);
        setField(term118468, term118468.getClass(), "millisOfDay", term118562);
        setField(term118468, term118468.getClass(), "secondOfMinute", null);
        setField(term118468, term118468.getClass(), "secondOfDay", null);
        setField(term118468, term118468.getClass(), "minuteOfHour", null);
        setField(term118468, term118468.getClass(), "minuteOfDay", null);
        setField(term118468, term118468.getClass(), "hourOfDay", null);
        setField(term118468, term118468.getClass(), "hourOfHalfday", term118648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term118468;
        try {
            callMethod(klass, "assemble", argTypes, term118368, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


