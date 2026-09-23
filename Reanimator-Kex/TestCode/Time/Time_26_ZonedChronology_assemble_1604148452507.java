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

public class ZonedChronology_assemble_1604148452507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228828;
     Object term228928;

    public ZonedChronology_assemble_1604148452507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228828 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term228828, term228828.getClass(), "iParam", null);
        term228928 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term229022 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term229138 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term229232 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term228928, term228928.getClass(), "eras", null);
        setField(term228928, term228928.getClass(), "centuries", null);
        setField(term228928, term228928.getClass(), "years", null);
        setField(term228928, term228928.getClass(), "months", null);
        setField(term228928, term228928.getClass(), "weekyears", null);
        setField(term228928, term228928.getClass(), "weeks", null);
        setField(term228928, term228928.getClass(), "days", null);
        setField(term228928, term228928.getClass(), "halfdays", null);
        setField(term228928, term228928.getClass(), "hours", null);
        setField(term228928, term228928.getClass(), "minutes", null);
        setField(term228928, term228928.getClass(), "seconds", null);
        setField(term228928, term228928.getClass(), "millis", null);
        setField(term228928, term228928.getClass(), "year", null);
        setField(term228928, term228928.getClass(), "yearOfEra", null);
        setField(term228928, term228928.getClass(), "yearOfCentury", null);
        setField(term228928, term228928.getClass(), "centuryOfEra", null);
        setField(term228928, term228928.getClass(), "era", null);
        setField(term228928, term228928.getClass(), "dayOfWeek", null);
        setField(term228928, term228928.getClass(), "dayOfMonth", null);
        setField(term228928, term228928.getClass(), "dayOfYear", null);
        setField(term228928, term228928.getClass(), "monthOfYear", null);
        setField(term228928, term228928.getClass(), "weekOfWeekyear", null);
        setField(term228928, term228928.getClass(), "weekyear", null);
        setField(term228928, term228928.getClass(), "weekyearOfCentury", null);
        setField(term228928, term228928.getClass(), "millisOfSecond", null);
        setField(term228928, term228928.getClass(), "millisOfDay", term229022);
        setField(term228928, term228928.getClass(), "secondOfMinute", null);
        setField(term228928, term228928.getClass(), "secondOfDay", null);
        setField(term228928, term228928.getClass(), "minuteOfHour", null);
        setField(term228928, term228928.getClass(), "minuteOfDay", null);
        setField(term228928, term228928.getClass(), "hourOfDay", null);
        setField(term228928, term228928.getClass(), "hourOfHalfday", null);
        setField(term228928, term228928.getClass(), "clockhourOfDay", null);
        setField(term229138, term229138.getClass(), "iDurationField", term229232);
        setField(term228928, term228928.getClass(), "clockhourOfHalfday", term229138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term228928;
        try {
            callMethod(klass, "assemble", argTypes, term228828, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


