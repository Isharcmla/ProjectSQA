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

public class ZonedChronology_assemble_1604148452305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112204;
     Object term112304;

    public ZonedChronology_assemble_1604148452305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112204 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term112304 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term112398 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term112502 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        setField(term112304, term112304.getClass(), "eras", null);
        setField(term112304, term112304.getClass(), "centuries", null);
        setField(term112304, term112304.getClass(), "years", null);
        setField(term112304, term112304.getClass(), "months", null);
        setField(term112304, term112304.getClass(), "weekyears", null);
        setField(term112304, term112304.getClass(), "weeks", null);
        setField(term112304, term112304.getClass(), "days", null);
        setField(term112304, term112304.getClass(), "halfdays", null);
        setField(term112304, term112304.getClass(), "hours", null);
        setField(term112304, term112304.getClass(), "minutes", null);
        setField(term112304, term112304.getClass(), "seconds", null);
        setField(term112304, term112304.getClass(), "millis", null);
        setField(term112304, term112304.getClass(), "year", null);
        setField(term112304, term112304.getClass(), "yearOfEra", null);
        setField(term112304, term112304.getClass(), "yearOfCentury", null);
        setField(term112304, term112304.getClass(), "centuryOfEra", null);
        setField(term112304, term112304.getClass(), "era", null);
        setField(term112304, term112304.getClass(), "dayOfWeek", null);
        setField(term112304, term112304.getClass(), "dayOfMonth", null);
        setField(term112304, term112304.getClass(), "dayOfYear", null);
        setField(term112304, term112304.getClass(), "monthOfYear", null);
        setField(term112304, term112304.getClass(), "weekOfWeekyear", null);
        setField(term112304, term112304.getClass(), "weekyear", null);
        setField(term112304, term112304.getClass(), "weekyearOfCentury", null);
        setField(term112304, term112304.getClass(), "millisOfSecond", null);
        setField(term112304, term112304.getClass(), "millisOfDay", term112398);
        setField(term112304, term112304.getClass(), "secondOfMinute", null);
        setField(term112304, term112304.getClass(), "secondOfDay", null);
        setField(term112304, term112304.getClass(), "minuteOfHour", term112502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term112304;
        try {
            callMethod(klass, "assemble", argTypes, term112204, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


