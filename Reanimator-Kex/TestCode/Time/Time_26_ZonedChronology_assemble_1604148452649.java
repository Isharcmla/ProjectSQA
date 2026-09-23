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

public class ZonedChronology_assemble_1604148452649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337885;
     Object term338079;

    public ZonedChronology_assemble_1604148452649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term337885 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term337979 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term337885, term337885.getClass(), "iParam", term337979);
        term338079 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term338173 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term338259 = newInstance(Class.forName("org.joda.time.field.PreciseDateTimeField"));
        Object term338349 = newInstance(Class.forName("org.joda.time.field.DecoratedDurationField"));
        setField(term338079, term338079.getClass(), "eras", null);
        setField(term338079, term338079.getClass(), "centuries", null);
        setField(term338079, term338079.getClass(), "years", null);
        setField(term338079, term338079.getClass(), "months", null);
        setField(term338079, term338079.getClass(), "weekyears", null);
        setField(term338079, term338079.getClass(), "weeks", null);
        setField(term338079, term338079.getClass(), "days", null);
        setField(term338079, term338079.getClass(), "halfdays", null);
        setField(term338079, term338079.getClass(), "hours", null);
        setField(term338079, term338079.getClass(), "minutes", null);
        setField(term338079, term338079.getClass(), "seconds", null);
        setField(term338079, term338079.getClass(), "millis", null);
        setField(term338079, term338079.getClass(), "year", null);
        setField(term338079, term338079.getClass(), "yearOfEra", null);
        setField(term338079, term338079.getClass(), "yearOfCentury", null);
        setField(term338079, term338079.getClass(), "centuryOfEra", null);
        setField(term338079, term338079.getClass(), "era", null);
        setField(term338079, term338079.getClass(), "dayOfWeek", null);
        setField(term338079, term338079.getClass(), "dayOfMonth", null);
        setField(term338079, term338079.getClass(), "dayOfYear", null);
        setField(term338079, term338079.getClass(), "monthOfYear", null);
        setField(term338079, term338079.getClass(), "weekOfWeekyear", null);
        setField(term338079, term338079.getClass(), "weekyear", null);
        setField(term338079, term338079.getClass(), "weekyearOfCentury", null);
        setField(term338079, term338079.getClass(), "millisOfSecond", null);
        setField(term338079, term338079.getClass(), "millisOfDay", term338173);
        setField(term338079, term338079.getClass(), "secondOfMinute", null);
        setField(term338079, term338079.getClass(), "secondOfDay", null);
        setField(term338079, term338079.getClass(), "minuteOfHour", null);
        setField(term338079, term338079.getClass(), "minuteOfDay", null);
        setField(term338259, term338259.getClass(), "iUnitField", term338349);
        setField(term338079, term338079.getClass(), "hourOfDay", term338259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term338079;
        try {
            callMethod(klass, "assemble", argTypes, term337885, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


