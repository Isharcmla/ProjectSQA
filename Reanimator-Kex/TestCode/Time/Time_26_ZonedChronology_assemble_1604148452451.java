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

public class ZonedChronology_assemble_1604148452451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196797;
     Object term196975;

    public ZonedChronology_assemble_1604148452451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196797 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term196875 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term196797, term196797.getClass(), "iParam", term196875);
        term196975 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term197069 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term197165 = newInstance(Class.forName("org.joda.time.chrono.GJYearOfEraDateTimeField"));
        setField(term196975, term196975.getClass(), "eras", null);
        setField(term196975, term196975.getClass(), "centuries", null);
        setField(term196975, term196975.getClass(), "years", null);
        setField(term196975, term196975.getClass(), "months", null);
        setField(term196975, term196975.getClass(), "weekyears", null);
        setField(term196975, term196975.getClass(), "weeks", null);
        setField(term196975, term196975.getClass(), "days", null);
        setField(term196975, term196975.getClass(), "halfdays", null);
        setField(term196975, term196975.getClass(), "hours", null);
        setField(term196975, term196975.getClass(), "minutes", null);
        setField(term196975, term196975.getClass(), "seconds", null);
        setField(term196975, term196975.getClass(), "millis", null);
        setField(term196975, term196975.getClass(), "year", null);
        setField(term196975, term196975.getClass(), "yearOfEra", null);
        setField(term196975, term196975.getClass(), "yearOfCentury", null);
        setField(term196975, term196975.getClass(), "centuryOfEra", null);
        setField(term196975, term196975.getClass(), "era", null);
        setField(term196975, term196975.getClass(), "dayOfWeek", null);
        setField(term196975, term196975.getClass(), "dayOfMonth", null);
        setField(term196975, term196975.getClass(), "dayOfYear", null);
        setField(term196975, term196975.getClass(), "monthOfYear", null);
        setField(term196975, term196975.getClass(), "weekOfWeekyear", null);
        setField(term196975, term196975.getClass(), "weekyear", null);
        setField(term196975, term196975.getClass(), "weekyearOfCentury", null);
        setField(term196975, term196975.getClass(), "millisOfSecond", null);
        setField(term196975, term196975.getClass(), "millisOfDay", term197069);
        setField(term196975, term196975.getClass(), "secondOfMinute", null);
        setField(term196975, term196975.getClass(), "secondOfDay", null);
        setField(term196975, term196975.getClass(), "minuteOfHour", null);
        setField(term196975, term196975.getClass(), "minuteOfDay", null);
        setField(term196975, term196975.getClass(), "hourOfDay", null);
        setField(term196975, term196975.getClass(), "hourOfHalfday", null);
        setField(term196975, term196975.getClass(), "clockhourOfDay", null);
        setField(term196975, term196975.getClass(), "clockhourOfHalfday", null);
        setField(term196975, term196975.getClass(), "halfdayOfDay", term197165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term196975;
        try {
            callMethod(klass, "assemble", argTypes, term196797, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


