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

public class ZonedChronology_assemble_1604148452607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275287;
     Object term275501;

    public ZonedChronology_assemble_1604148452607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275287 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term275401 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term275287, term275287.getClass(), "iParam", term275401);
        term275501 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term275595 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term275681 = newInstance(Class.forName("org.joda.time.field.PreciseDateTimeField"));
        setField(term275501, term275501.getClass(), "eras", null);
        setField(term275501, term275501.getClass(), "centuries", null);
        setField(term275501, term275501.getClass(), "years", null);
        setField(term275501, term275501.getClass(), "months", null);
        setField(term275501, term275501.getClass(), "weekyears", null);
        setField(term275501, term275501.getClass(), "weeks", null);
        setField(term275501, term275501.getClass(), "days", null);
        setField(term275501, term275501.getClass(), "halfdays", null);
        setField(term275501, term275501.getClass(), "hours", null);
        setField(term275501, term275501.getClass(), "minutes", null);
        setField(term275501, term275501.getClass(), "seconds", null);
        setField(term275501, term275501.getClass(), "millis", null);
        setField(term275501, term275501.getClass(), "year", null);
        setField(term275501, term275501.getClass(), "yearOfEra", null);
        setField(term275501, term275501.getClass(), "yearOfCentury", null);
        setField(term275501, term275501.getClass(), "centuryOfEra", null);
        setField(term275501, term275501.getClass(), "era", null);
        setField(term275501, term275501.getClass(), "dayOfWeek", null);
        setField(term275501, term275501.getClass(), "dayOfMonth", null);
        setField(term275501, term275501.getClass(), "dayOfYear", null);
        setField(term275501, term275501.getClass(), "monthOfYear", null);
        setField(term275501, term275501.getClass(), "weekOfWeekyear", null);
        setField(term275501, term275501.getClass(), "weekyear", null);
        setField(term275501, term275501.getClass(), "weekyearOfCentury", null);
        setField(term275501, term275501.getClass(), "millisOfSecond", null);
        setField(term275501, term275501.getClass(), "millisOfDay", term275595);
        setField(term275501, term275501.getClass(), "secondOfMinute", null);
        setField(term275501, term275501.getClass(), "secondOfDay", null);
        setField(term275501, term275501.getClass(), "minuteOfHour", null);
        setField(term275501, term275501.getClass(), "minuteOfDay", null);
        setField(term275501, term275501.getClass(), "hourOfDay", term275681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term275501;
        try {
            callMethod(klass, "assemble", argTypes, term275287, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


