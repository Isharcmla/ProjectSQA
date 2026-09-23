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

public class ZonedChronology_assemble_1604148452613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278081;
     Object term278181;

    public ZonedChronology_assemble_1604148452613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278081 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term278081, term278081.getClass(), "iParam", null);
        term278181 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term278275 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term278391 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term278485 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term278579 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term278181, term278181.getClass(), "eras", null);
        setField(term278181, term278181.getClass(), "centuries", null);
        setField(term278181, term278181.getClass(), "years", null);
        setField(term278181, term278181.getClass(), "months", null);
        setField(term278181, term278181.getClass(), "weekyears", null);
        setField(term278181, term278181.getClass(), "weeks", null);
        setField(term278181, term278181.getClass(), "days", null);
        setField(term278181, term278181.getClass(), "halfdays", null);
        setField(term278181, term278181.getClass(), "hours", null);
        setField(term278181, term278181.getClass(), "minutes", null);
        setField(term278181, term278181.getClass(), "seconds", null);
        setField(term278181, term278181.getClass(), "millis", null);
        setField(term278181, term278181.getClass(), "year", null);
        setField(term278181, term278181.getClass(), "yearOfEra", null);
        setField(term278181, term278181.getClass(), "yearOfCentury", null);
        setField(term278181, term278181.getClass(), "centuryOfEra", null);
        setField(term278181, term278181.getClass(), "era", null);
        setField(term278181, term278181.getClass(), "dayOfWeek", null);
        setField(term278181, term278181.getClass(), "dayOfMonth", null);
        setField(term278181, term278181.getClass(), "dayOfYear", null);
        setField(term278181, term278181.getClass(), "monthOfYear", null);
        setField(term278181, term278181.getClass(), "weekOfWeekyear", null);
        setField(term278181, term278181.getClass(), "weekyear", null);
        setField(term278181, term278181.getClass(), "weekyearOfCentury", null);
        setField(term278181, term278181.getClass(), "millisOfSecond", null);
        setField(term278181, term278181.getClass(), "millisOfDay", term278275);
        setField(term278181, term278181.getClass(), "secondOfMinute", null);
        setField(term278181, term278181.getClass(), "secondOfDay", null);
        setField(term278181, term278181.getClass(), "minuteOfHour", null);
        setField(term278181, term278181.getClass(), "minuteOfDay", null);
        setField(term278181, term278181.getClass(), "hourOfDay", null);
        setField(term278181, term278181.getClass(), "hourOfHalfday", null);
        setField(term278181, term278181.getClass(), "clockhourOfDay", null);
        setField(term278391, term278391.getClass(), "iDurationField", term278485);
        setField(term278391, term278391.getClass(), "iRangeDurationField", term278579);
        setField(term278181, term278181.getClass(), "clockhourOfHalfday", term278391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term278181;
        try {
            callMethod(klass, "assemble", argTypes, term278081, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


