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

public class ZonedChronology_assemble_1604148452240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88340;
     Object term88440;

    public ZonedChronology_assemble_1604148452240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88340 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term88340, term88340.getClass(), "iParam", null);
        term88440 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term88538 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$CutoverField"));
        Object term88622 = newInstance(Class.forName("org.joda.time.field.MillisDurationField"));
        Object term88738 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        setField(term88440, term88440.getClass(), "eras", null);
        setField(term88440, term88440.getClass(), "centuries", null);
        setField(term88440, term88440.getClass(), "years", null);
        setField(term88440, term88440.getClass(), "months", null);
        setField(term88440, term88440.getClass(), "weekyears", null);
        setField(term88440, term88440.getClass(), "weeks", null);
        setField(term88440, term88440.getClass(), "days", null);
        setField(term88440, term88440.getClass(), "halfdays", null);
        setField(term88440, term88440.getClass(), "hours", null);
        setField(term88440, term88440.getClass(), "minutes", null);
        setField(term88440, term88440.getClass(), "seconds", null);
        setField(term88440, term88440.getClass(), "millis", null);
        setField(term88440, term88440.getClass(), "year", null);
        setField(term88440, term88440.getClass(), "yearOfEra", null);
        setField(term88440, term88440.getClass(), "yearOfCentury", null);
        setField(term88440, term88440.getClass(), "centuryOfEra", null);
        setField(term88440, term88440.getClass(), "era", null);
        setField(term88440, term88440.getClass(), "dayOfWeek", null);
        setField(term88440, term88440.getClass(), "dayOfMonth", null);
        setField(term88440, term88440.getClass(), "dayOfYear", null);
        setField(term88440, term88440.getClass(), "monthOfYear", null);
        setField(term88440, term88440.getClass(), "weekOfWeekyear", null);
        setField(term88440, term88440.getClass(), "weekyear", null);
        setField(term88440, term88440.getClass(), "weekyearOfCentury", null);
        setField(term88440, term88440.getClass(), "millisOfSecond", null);
        setField(term88440, term88440.getClass(), "millisOfDay", null);
        setField(term88440, term88440.getClass(), "secondOfMinute", null);
        setField(term88440, term88440.getClass(), "secondOfDay", null);
        setField(term88440, term88440.getClass(), "minuteOfHour", null);
        setField(term88440, term88440.getClass(), "minuteOfDay", null);
        setField(term88440, term88440.getClass(), "hourOfDay", null);
        setField(term88440, term88440.getClass(), "hourOfHalfday", null);
        setField(term88538, term88538.getClass(), "iDurationField", term88622);
        setField(term88538, term88538.getClass(), "iRangeDurationField", term88738);
        setField(term88440, term88440.getClass(), "clockhourOfDay", term88538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term88440;
        try {
            callMethod(klass, "assemble", argTypes, term88340, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


