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

public class ZonedChronology_assemble_1604148452329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119720;
     Object term119820;

    public ZonedChronology_assemble_1604148452329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119720 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term119820 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term119914 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term120000 = newInstance(Class.forName("org.joda.time.field.PreciseDateTimeField"));
        setField(term119820, term119820.getClass(), "eras", null);
        setField(term119820, term119820.getClass(), "centuries", null);
        setField(term119820, term119820.getClass(), "years", null);
        setField(term119820, term119820.getClass(), "months", null);
        setField(term119820, term119820.getClass(), "weekyears", null);
        setField(term119820, term119820.getClass(), "weeks", null);
        setField(term119820, term119820.getClass(), "days", null);
        setField(term119820, term119820.getClass(), "halfdays", null);
        setField(term119820, term119820.getClass(), "hours", null);
        setField(term119820, term119820.getClass(), "minutes", null);
        setField(term119820, term119820.getClass(), "seconds", null);
        setField(term119820, term119820.getClass(), "millis", null);
        setField(term119820, term119820.getClass(), "year", null);
        setField(term119820, term119820.getClass(), "yearOfEra", null);
        setField(term119820, term119820.getClass(), "yearOfCentury", null);
        setField(term119820, term119820.getClass(), "centuryOfEra", null);
        setField(term119820, term119820.getClass(), "era", null);
        setField(term119820, term119820.getClass(), "dayOfWeek", null);
        setField(term119820, term119820.getClass(), "dayOfMonth", null);
        setField(term119820, term119820.getClass(), "dayOfYear", null);
        setField(term119820, term119820.getClass(), "monthOfYear", null);
        setField(term119820, term119820.getClass(), "weekOfWeekyear", null);
        setField(term119820, term119820.getClass(), "weekyear", null);
        setField(term119820, term119820.getClass(), "weekyearOfCentury", null);
        setField(term119820, term119820.getClass(), "millisOfSecond", null);
        setField(term119820, term119820.getClass(), "millisOfDay", term119914);
        setField(term119820, term119820.getClass(), "secondOfMinute", null);
        setField(term119820, term119820.getClass(), "secondOfDay", null);
        setField(term119820, term119820.getClass(), "minuteOfHour", null);
        setField(term119820, term119820.getClass(), "minuteOfDay", null);
        setField(term119820, term119820.getClass(), "hourOfDay", term120000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term119820;
        try {
            callMethod(klass, "assemble", argTypes, term119720, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


