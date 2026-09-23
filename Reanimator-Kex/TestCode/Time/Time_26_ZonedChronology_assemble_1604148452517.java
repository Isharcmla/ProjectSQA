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

public class ZonedChronology_assemble_1604148452517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236381;
     Object term236559;

    public ZonedChronology_assemble_1604148452517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236381 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term236459 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term236381, term236381.getClass(), "iParam", term236459);
        term236559 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term236653 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term236765 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        setField(term236559, term236559.getClass(), "eras", null);
        setField(term236559, term236559.getClass(), "centuries", null);
        setField(term236559, term236559.getClass(), "years", null);
        setField(term236559, term236559.getClass(), "months", null);
        setField(term236559, term236559.getClass(), "weekyears", null);
        setField(term236559, term236559.getClass(), "weeks", null);
        setField(term236559, term236559.getClass(), "days", null);
        setField(term236559, term236559.getClass(), "halfdays", null);
        setField(term236559, term236559.getClass(), "hours", null);
        setField(term236559, term236559.getClass(), "minutes", null);
        setField(term236559, term236559.getClass(), "seconds", null);
        setField(term236559, term236559.getClass(), "millis", null);
        setField(term236559, term236559.getClass(), "year", null);
        setField(term236559, term236559.getClass(), "yearOfEra", null);
        setField(term236559, term236559.getClass(), "yearOfCentury", null);
        setField(term236559, term236559.getClass(), "centuryOfEra", null);
        setField(term236559, term236559.getClass(), "era", null);
        setField(term236559, term236559.getClass(), "dayOfWeek", null);
        setField(term236559, term236559.getClass(), "dayOfMonth", null);
        setField(term236559, term236559.getClass(), "dayOfYear", null);
        setField(term236559, term236559.getClass(), "monthOfYear", null);
        setField(term236559, term236559.getClass(), "weekOfWeekyear", null);
        setField(term236559, term236559.getClass(), "weekyear", null);
        setField(term236559, term236559.getClass(), "weekyearOfCentury", null);
        setField(term236559, term236559.getClass(), "millisOfSecond", null);
        setField(term236559, term236559.getClass(), "millisOfDay", term236653);
        setField(term236559, term236559.getClass(), "secondOfMinute", null);
        setField(term236559, term236559.getClass(), "secondOfDay", null);
        setField(term236559, term236559.getClass(), "minuteOfHour", null);
        setField(term236559, term236559.getClass(), "minuteOfDay", null);
        setField(term236559, term236559.getClass(), "hourOfDay", null);
        setField(term236559, term236559.getClass(), "hourOfHalfday", null);
        setField(term236559, term236559.getClass(), "clockhourOfDay", term236765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term236559;
        try {
            callMethod(klass, "assemble", argTypes, term236381, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


