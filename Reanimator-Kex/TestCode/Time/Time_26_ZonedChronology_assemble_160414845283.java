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
import java.lang.ClassCastException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_160414845283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24230;
     Object term24330;

    public ZonedChronology_assemble_160414845283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24230 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term24230, term24230.getClass(), "iParam", term24230);
        term24330 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term24442 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        setField(term24330, term24330.getClass(), "eras", null);
        setField(term24330, term24330.getClass(), "centuries", null);
        setField(term24330, term24330.getClass(), "years", null);
        setField(term24330, term24330.getClass(), "months", null);
        setField(term24330, term24330.getClass(), "weekyears", null);
        setField(term24330, term24330.getClass(), "weeks", null);
        setField(term24330, term24330.getClass(), "days", null);
        setField(term24330, term24330.getClass(), "halfdays", null);
        setField(term24330, term24330.getClass(), "hours", null);
        setField(term24330, term24330.getClass(), "minutes", null);
        setField(term24330, term24330.getClass(), "seconds", null);
        setField(term24330, term24330.getClass(), "millis", null);
        setField(term24330, term24330.getClass(), "year", null);
        setField(term24330, term24330.getClass(), "yearOfEra", null);
        setField(term24330, term24330.getClass(), "yearOfCentury", null);
        setField(term24330, term24330.getClass(), "centuryOfEra", null);
        setField(term24330, term24330.getClass(), "era", null);
        setField(term24330, term24330.getClass(), "dayOfWeek", null);
        setField(term24330, term24330.getClass(), "dayOfMonth", null);
        setField(term24330, term24330.getClass(), "dayOfYear", null);
        setField(term24330, term24330.getClass(), "monthOfYear", null);
        setField(term24330, term24330.getClass(), "weekOfWeekyear", null);
        setField(term24330, term24330.getClass(), "weekyear", null);
        setField(term24330, term24330.getClass(), "weekyearOfCentury", null);
        setField(term24330, term24330.getClass(), "millisOfSecond", null);
        setField(term24330, term24330.getClass(), "millisOfDay", null);
        setField(term24330, term24330.getClass(), "secondOfMinute", null);
        setField(term24330, term24330.getClass(), "secondOfDay", null);
        setField(term24330, term24330.getClass(), "minuteOfHour", null);
        setField(term24330, term24330.getClass(), "minuteOfDay", term24442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term24330;
        try {
            callMethod(klass, "assemble", argTypes, term24230, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


