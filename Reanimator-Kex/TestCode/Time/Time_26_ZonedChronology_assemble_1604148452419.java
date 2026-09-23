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

public class ZonedChronology_assemble_1604148452419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182989;
     Object term183183;

    public ZonedChronology_assemble_1604148452419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182989 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term183083 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term182989, term182989.getClass(), "iParam", term183083);
        term183183 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term183287 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        Object term183403 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        setField(term183183, term183183.getClass(), "eras", null);
        setField(term183183, term183183.getClass(), "centuries", null);
        setField(term183183, term183183.getClass(), "years", null);
        setField(term183183, term183183.getClass(), "months", null);
        setField(term183183, term183183.getClass(), "weekyears", null);
        setField(term183183, term183183.getClass(), "weeks", null);
        setField(term183183, term183183.getClass(), "days", null);
        setField(term183183, term183183.getClass(), "halfdays", null);
        setField(term183183, term183183.getClass(), "hours", null);
        setField(term183183, term183183.getClass(), "minutes", null);
        setField(term183183, term183183.getClass(), "seconds", null);
        setField(term183183, term183183.getClass(), "millis", null);
        setField(term183183, term183183.getClass(), "year", null);
        setField(term183183, term183183.getClass(), "yearOfEra", null);
        setField(term183183, term183183.getClass(), "yearOfCentury", null);
        setField(term183183, term183183.getClass(), "centuryOfEra", null);
        setField(term183183, term183183.getClass(), "era", null);
        setField(term183183, term183183.getClass(), "dayOfWeek", null);
        setField(term183183, term183183.getClass(), "dayOfMonth", null);
        setField(term183183, term183183.getClass(), "dayOfYear", null);
        setField(term183183, term183183.getClass(), "monthOfYear", null);
        setField(term183183, term183183.getClass(), "weekOfWeekyear", null);
        setField(term183183, term183183.getClass(), "weekyear", null);
        setField(term183183, term183183.getClass(), "weekyearOfCentury", null);
        setField(term183183, term183183.getClass(), "millisOfSecond", null);
        setField(term183183, term183183.getClass(), "millisOfDay", null);
        setField(term183183, term183183.getClass(), "secondOfMinute", null);
        setField(term183287, term183287.getClass(), "iUnitField", term183403);
        setField(term183183, term183183.getClass(), "secondOfDay", term183287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term183183;
        try {
            callMethod(klass, "assemble", argTypes, term182989, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


