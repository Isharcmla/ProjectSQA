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

public class ZonedChronology_assemble_1604148452609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276296;
     Object term276472;

    public ZonedChronology_assemble_1604148452609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276296 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term276372 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term276296, term276296.getClass(), "iParam", term276372);
        term276472 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term276566 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term276678 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        setField(term276472, term276472.getClass(), "eras", null);
        setField(term276472, term276472.getClass(), "centuries", null);
        setField(term276472, term276472.getClass(), "years", null);
        setField(term276472, term276472.getClass(), "months", null);
        setField(term276472, term276472.getClass(), "weekyears", null);
        setField(term276472, term276472.getClass(), "weeks", null);
        setField(term276472, term276472.getClass(), "days", null);
        setField(term276472, term276472.getClass(), "halfdays", null);
        setField(term276472, term276472.getClass(), "hours", null);
        setField(term276472, term276472.getClass(), "minutes", null);
        setField(term276472, term276472.getClass(), "seconds", null);
        setField(term276472, term276472.getClass(), "millis", null);
        setField(term276472, term276472.getClass(), "year", null);
        setField(term276472, term276472.getClass(), "yearOfEra", null);
        setField(term276472, term276472.getClass(), "yearOfCentury", null);
        setField(term276472, term276472.getClass(), "centuryOfEra", null);
        setField(term276472, term276472.getClass(), "era", null);
        setField(term276472, term276472.getClass(), "dayOfWeek", null);
        setField(term276472, term276472.getClass(), "dayOfMonth", null);
        setField(term276472, term276472.getClass(), "dayOfYear", null);
        setField(term276472, term276472.getClass(), "monthOfYear", null);
        setField(term276472, term276472.getClass(), "weekOfWeekyear", null);
        setField(term276472, term276472.getClass(), "weekyear", null);
        setField(term276472, term276472.getClass(), "weekyearOfCentury", null);
        setField(term276472, term276472.getClass(), "millisOfSecond", null);
        setField(term276472, term276472.getClass(), "millisOfDay", term276566);
        setField(term276472, term276472.getClass(), "secondOfMinute", null);
        setField(term276472, term276472.getClass(), "secondOfDay", null);
        setField(term276472, term276472.getClass(), "minuteOfHour", null);
        setField(term276472, term276472.getClass(), "minuteOfDay", null);
        setField(term276472, term276472.getClass(), "hourOfDay", null);
        setField(term276472, term276472.getClass(), "hourOfHalfday", null);
        setField(term276472, term276472.getClass(), "clockhourOfDay", term276678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term276472;
        try {
            callMethod(klass, "assemble", argTypes, term276296, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


