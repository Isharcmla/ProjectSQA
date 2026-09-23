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

public class ZonedChronology_assemble_1604148452227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83186;
     Object term83380;

    public ZonedChronology_assemble_1604148452227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83186 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term83280 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term83186, term83186.getClass(), "iParam", term83280);
        term83380 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term83478 = newInstance(Class.forName("org.joda.time.chrono.ISOYearOfEraDateTimeField"));
        setField(term83380, term83380.getClass(), "eras", null);
        setField(term83380, term83380.getClass(), "centuries", null);
        setField(term83380, term83380.getClass(), "years", null);
        setField(term83380, term83380.getClass(), "months", null);
        setField(term83380, term83380.getClass(), "weekyears", null);
        setField(term83380, term83380.getClass(), "weeks", null);
        setField(term83380, term83380.getClass(), "days", null);
        setField(term83380, term83380.getClass(), "halfdays", null);
        setField(term83380, term83380.getClass(), "hours", null);
        setField(term83380, term83380.getClass(), "minutes", null);
        setField(term83380, term83380.getClass(), "seconds", null);
        setField(term83380, term83380.getClass(), "millis", null);
        setField(term83380, term83380.getClass(), "year", null);
        setField(term83380, term83380.getClass(), "yearOfEra", null);
        setField(term83380, term83380.getClass(), "yearOfCentury", null);
        setField(term83380, term83380.getClass(), "centuryOfEra", null);
        setField(term83380, term83380.getClass(), "era", null);
        setField(term83380, term83380.getClass(), "dayOfWeek", null);
        setField(term83380, term83380.getClass(), "dayOfMonth", null);
        setField(term83380, term83380.getClass(), "dayOfYear", null);
        setField(term83380, term83380.getClass(), "monthOfYear", null);
        setField(term83380, term83380.getClass(), "weekOfWeekyear", null);
        setField(term83380, term83380.getClass(), "weekyear", null);
        setField(term83380, term83380.getClass(), "weekyearOfCentury", null);
        setField(term83380, term83380.getClass(), "millisOfSecond", null);
        setField(term83380, term83380.getClass(), "millisOfDay", null);
        setField(term83380, term83380.getClass(), "secondOfMinute", null);
        setField(term83380, term83380.getClass(), "secondOfDay", null);
        setField(term83380, term83380.getClass(), "minuteOfHour", null);
        setField(term83380, term83380.getClass(), "minuteOfDay", null);
        setField(term83380, term83380.getClass(), "hourOfDay", null);
        setField(term83380, term83380.getClass(), "hourOfHalfday", null);
        setField(term83380, term83380.getClass(), "clockhourOfDay", null);
        setField(term83380, term83380.getClass(), "clockhourOfHalfday", null);
        setField(term83380, term83380.getClass(), "halfdayOfDay", term83478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term83380;
        try {
            callMethod(klass, "assemble", argTypes, term83186, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


