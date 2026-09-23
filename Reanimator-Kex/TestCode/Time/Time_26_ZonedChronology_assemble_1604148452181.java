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

public class ZonedChronology_assemble_1604148452181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66579;
     Object term66773;

    public ZonedChronology_assemble_1604148452181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66579 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term66673 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term66579, term66579.getClass(), "iParam", term66673);
        term66773 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term66885 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        setField(term66773, term66773.getClass(), "eras", null);
        setField(term66773, term66773.getClass(), "centuries", null);
        setField(term66773, term66773.getClass(), "years", null);
        setField(term66773, term66773.getClass(), "months", null);
        setField(term66773, term66773.getClass(), "weekyears", null);
        setField(term66773, term66773.getClass(), "weeks", null);
        setField(term66773, term66773.getClass(), "days", null);
        setField(term66773, term66773.getClass(), "halfdays", null);
        setField(term66773, term66773.getClass(), "hours", null);
        setField(term66773, term66773.getClass(), "minutes", null);
        setField(term66773, term66773.getClass(), "seconds", null);
        setField(term66773, term66773.getClass(), "millis", null);
        setField(term66773, term66773.getClass(), "year", null);
        setField(term66773, term66773.getClass(), "yearOfEra", null);
        setField(term66773, term66773.getClass(), "yearOfCentury", null);
        setField(term66773, term66773.getClass(), "centuryOfEra", null);
        setField(term66773, term66773.getClass(), "era", null);
        setField(term66773, term66773.getClass(), "dayOfWeek", null);
        setField(term66773, term66773.getClass(), "dayOfMonth", null);
        setField(term66773, term66773.getClass(), "dayOfYear", null);
        setField(term66773, term66773.getClass(), "monthOfYear", null);
        setField(term66773, term66773.getClass(), "weekOfWeekyear", null);
        setField(term66773, term66773.getClass(), "weekyear", null);
        setField(term66773, term66773.getClass(), "weekyearOfCentury", null);
        setField(term66773, term66773.getClass(), "millisOfSecond", null);
        setField(term66773, term66773.getClass(), "millisOfDay", null);
        setField(term66773, term66773.getClass(), "secondOfMinute", null);
        setField(term66773, term66773.getClass(), "secondOfDay", null);
        setField(term66773, term66773.getClass(), "minuteOfHour", null);
        setField(term66773, term66773.getClass(), "minuteOfDay", term66885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term66773;
        try {
            callMethod(klass, "assemble", argTypes, term66579, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


