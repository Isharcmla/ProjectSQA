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

public class ZonedChronology_assemble_1604148452617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279975;
     Object term280189;

    public ZonedChronology_assemble_1604148452617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279975 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term280089 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term279975, term279975.getClass(), "iParam", term280089);
        term280189 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term280287 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$CutoverField"));
        setField(term280189, term280189.getClass(), "eras", null);
        setField(term280189, term280189.getClass(), "centuries", null);
        setField(term280189, term280189.getClass(), "years", null);
        setField(term280189, term280189.getClass(), "months", null);
        setField(term280189, term280189.getClass(), "weekyears", null);
        setField(term280189, term280189.getClass(), "weeks", null);
        setField(term280189, term280189.getClass(), "days", null);
        setField(term280189, term280189.getClass(), "halfdays", null);
        setField(term280189, term280189.getClass(), "hours", null);
        setField(term280189, term280189.getClass(), "minutes", null);
        setField(term280189, term280189.getClass(), "seconds", null);
        setField(term280189, term280189.getClass(), "millis", null);
        setField(term280189, term280189.getClass(), "year", null);
        setField(term280189, term280189.getClass(), "yearOfEra", null);
        setField(term280189, term280189.getClass(), "yearOfCentury", null);
        setField(term280189, term280189.getClass(), "centuryOfEra", null);
        setField(term280189, term280189.getClass(), "era", null);
        setField(term280189, term280189.getClass(), "dayOfWeek", null);
        setField(term280189, term280189.getClass(), "dayOfMonth", null);
        setField(term280189, term280189.getClass(), "dayOfYear", null);
        setField(term280189, term280189.getClass(), "monthOfYear", null);
        setField(term280189, term280189.getClass(), "weekOfWeekyear", null);
        setField(term280189, term280189.getClass(), "weekyear", null);
        setField(term280189, term280189.getClass(), "weekyearOfCentury", null);
        setField(term280189, term280189.getClass(), "millisOfSecond", null);
        setField(term280189, term280189.getClass(), "millisOfDay", null);
        setField(term280189, term280189.getClass(), "secondOfMinute", null);
        setField(term280189, term280189.getClass(), "secondOfDay", null);
        setField(term280189, term280189.getClass(), "minuteOfHour", null);
        setField(term280189, term280189.getClass(), "minuteOfDay", null);
        setField(term280189, term280189.getClass(), "hourOfDay", null);
        setField(term280189, term280189.getClass(), "hourOfHalfday", null);
        setField(term280189, term280189.getClass(), "clockhourOfDay", term280287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term280189;
        try {
            callMethod(klass, "assemble", argTypes, term279975, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


