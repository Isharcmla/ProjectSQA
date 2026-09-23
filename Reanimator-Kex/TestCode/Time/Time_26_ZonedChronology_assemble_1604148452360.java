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

public class ZonedChronology_assemble_1604148452360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134164;
     Object term134264;

    public ZonedChronology_assemble_1604148452360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134164 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term134164, term134164.getClass(), "iParam", null);
        term134264 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term134358 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term134444 = newInstance(Class.forName("org.joda.time.field.PreciseDateTimeField"));
        Object term134528 = newInstance(Class.forName("org.joda.time.field.ScaledDurationField"));
        setField(term134264, term134264.getClass(), "eras", null);
        setField(term134264, term134264.getClass(), "centuries", null);
        setField(term134264, term134264.getClass(), "years", null);
        setField(term134264, term134264.getClass(), "months", null);
        setField(term134264, term134264.getClass(), "weekyears", null);
        setField(term134264, term134264.getClass(), "weeks", null);
        setField(term134264, term134264.getClass(), "days", null);
        setField(term134264, term134264.getClass(), "halfdays", null);
        setField(term134264, term134264.getClass(), "hours", null);
        setField(term134264, term134264.getClass(), "minutes", null);
        setField(term134264, term134264.getClass(), "seconds", null);
        setField(term134264, term134264.getClass(), "millis", null);
        setField(term134264, term134264.getClass(), "year", null);
        setField(term134264, term134264.getClass(), "yearOfEra", null);
        setField(term134264, term134264.getClass(), "yearOfCentury", null);
        setField(term134264, term134264.getClass(), "centuryOfEra", null);
        setField(term134264, term134264.getClass(), "era", null);
        setField(term134264, term134264.getClass(), "dayOfWeek", null);
        setField(term134264, term134264.getClass(), "dayOfMonth", null);
        setField(term134264, term134264.getClass(), "dayOfYear", null);
        setField(term134264, term134264.getClass(), "monthOfYear", null);
        setField(term134264, term134264.getClass(), "weekOfWeekyear", null);
        setField(term134264, term134264.getClass(), "weekyear", null);
        setField(term134264, term134264.getClass(), "weekyearOfCentury", null);
        setField(term134264, term134264.getClass(), "millisOfSecond", null);
        setField(term134264, term134264.getClass(), "millisOfDay", term134358);
        setField(term134264, term134264.getClass(), "secondOfMinute", null);
        setField(term134264, term134264.getClass(), "secondOfDay", null);
        setField(term134264, term134264.getClass(), "minuteOfHour", null);
        setField(term134264, term134264.getClass(), "minuteOfDay", null);
        setField(term134444, term134444.getClass(), "iUnitField", null);
        setField(term134444, term134444.getClass(), "iRangeField", term134528);
        setField(term134264, term134264.getClass(), "hourOfDay", term134444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term134264;
        try {
            callMethod(klass, "assemble", argTypes, term134164, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


