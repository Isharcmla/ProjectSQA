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

public class ZonedChronology_assemble_1604148452433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188754;
     Object term188948;

    public ZonedChronology_assemble_1604148452433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188754 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term188848 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term188754, term188754.getClass(), "iParam", term188848);
        term188948 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term189064 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        setField(term188948, term188948.getClass(), "eras", null);
        setField(term188948, term188948.getClass(), "centuries", null);
        setField(term188948, term188948.getClass(), "years", null);
        setField(term188948, term188948.getClass(), "months", null);
        setField(term188948, term188948.getClass(), "weekyears", null);
        setField(term188948, term188948.getClass(), "weeks", null);
        setField(term188948, term188948.getClass(), "days", null);
        setField(term188948, term188948.getClass(), "halfdays", null);
        setField(term188948, term188948.getClass(), "hours", null);
        setField(term188948, term188948.getClass(), "minutes", null);
        setField(term188948, term188948.getClass(), "seconds", null);
        setField(term188948, term188948.getClass(), "millis", null);
        setField(term188948, term188948.getClass(), "year", null);
        setField(term188948, term188948.getClass(), "yearOfEra", null);
        setField(term188948, term188948.getClass(), "yearOfCentury", null);
        setField(term188948, term188948.getClass(), "centuryOfEra", null);
        setField(term188948, term188948.getClass(), "era", null);
        setField(term188948, term188948.getClass(), "dayOfWeek", null);
        setField(term188948, term188948.getClass(), "dayOfMonth", null);
        setField(term188948, term188948.getClass(), "dayOfYear", null);
        setField(term188948, term188948.getClass(), "monthOfYear", null);
        setField(term188948, term188948.getClass(), "weekOfWeekyear", null);
        setField(term188948, term188948.getClass(), "weekyear", null);
        setField(term188948, term188948.getClass(), "weekyearOfCentury", null);
        setField(term188948, term188948.getClass(), "millisOfSecond", term189064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term188948;
        try {
            callMethod(klass, "assemble", argTypes, term188754, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


