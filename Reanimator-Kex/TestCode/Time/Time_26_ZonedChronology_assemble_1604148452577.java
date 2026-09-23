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

public class ZonedChronology_assemble_1604148452577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262159;
     Object term262335;

    public ZonedChronology_assemble_1604148452577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262159 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term262235 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term262159, term262159.getClass(), "iParam", term262235);
        term262335 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term262429 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term262545 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        setField(term262335, term262335.getClass(), "eras", null);
        setField(term262335, term262335.getClass(), "centuries", null);
        setField(term262335, term262335.getClass(), "years", null);
        setField(term262335, term262335.getClass(), "months", null);
        setField(term262335, term262335.getClass(), "weekyears", null);
        setField(term262335, term262335.getClass(), "weeks", null);
        setField(term262335, term262335.getClass(), "days", null);
        setField(term262335, term262335.getClass(), "halfdays", null);
        setField(term262335, term262335.getClass(), "hours", null);
        setField(term262335, term262335.getClass(), "minutes", null);
        setField(term262335, term262335.getClass(), "seconds", null);
        setField(term262335, term262335.getClass(), "millis", null);
        setField(term262335, term262335.getClass(), "year", null);
        setField(term262335, term262335.getClass(), "yearOfEra", null);
        setField(term262335, term262335.getClass(), "yearOfCentury", null);
        setField(term262335, term262335.getClass(), "centuryOfEra", null);
        setField(term262335, term262335.getClass(), "era", null);
        setField(term262335, term262335.getClass(), "dayOfWeek", null);
        setField(term262335, term262335.getClass(), "dayOfMonth", null);
        setField(term262335, term262335.getClass(), "dayOfYear", null);
        setField(term262335, term262335.getClass(), "monthOfYear", null);
        setField(term262335, term262335.getClass(), "weekOfWeekyear", null);
        setField(term262335, term262335.getClass(), "weekyear", null);
        setField(term262335, term262335.getClass(), "weekyearOfCentury", null);
        setField(term262335, term262335.getClass(), "millisOfSecond", null);
        setField(term262335, term262335.getClass(), "millisOfDay", term262429);
        setField(term262335, term262335.getClass(), "secondOfMinute", null);
        setField(term262335, term262335.getClass(), "secondOfDay", null);
        setField(term262335, term262335.getClass(), "minuteOfHour", null);
        setField(term262335, term262335.getClass(), "minuteOfDay", null);
        setField(term262335, term262335.getClass(), "hourOfDay", null);
        setField(term262335, term262335.getClass(), "hourOfHalfday", null);
        setField(term262335, term262335.getClass(), "clockhourOfDay", null);
        setField(term262335, term262335.getClass(), "clockhourOfHalfday", term262545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term262335;
        try {
            callMethod(klass, "assemble", argTypes, term262159, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


