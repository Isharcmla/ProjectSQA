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

public class ZonedChronology_assemble_1604148452174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64013;
     Object term64113;

    public ZonedChronology_assemble_1604148452174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64013 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term64113 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term64199 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        setField(term64113, term64113.getClass(), "eras", null);
        setField(term64113, term64113.getClass(), "centuries", null);
        setField(term64113, term64113.getClass(), "years", null);
        setField(term64113, term64113.getClass(), "months", null);
        setField(term64113, term64113.getClass(), "weekyears", null);
        setField(term64113, term64113.getClass(), "weeks", null);
        setField(term64113, term64113.getClass(), "days", null);
        setField(term64113, term64113.getClass(), "halfdays", null);
        setField(term64113, term64113.getClass(), "hours", null);
        setField(term64113, term64113.getClass(), "minutes", null);
        setField(term64113, term64113.getClass(), "seconds", null);
        setField(term64113, term64113.getClass(), "millis", null);
        setField(term64113, term64113.getClass(), "year", null);
        setField(term64113, term64113.getClass(), "yearOfEra", null);
        setField(term64113, term64113.getClass(), "yearOfCentury", null);
        setField(term64113, term64113.getClass(), "centuryOfEra", null);
        setField(term64113, term64113.getClass(), "era", null);
        setField(term64113, term64113.getClass(), "dayOfWeek", null);
        setField(term64113, term64113.getClass(), "dayOfMonth", null);
        setField(term64113, term64113.getClass(), "dayOfYear", null);
        setField(term64113, term64113.getClass(), "monthOfYear", null);
        setField(term64113, term64113.getClass(), "weekOfWeekyear", null);
        setField(term64113, term64113.getClass(), "weekyear", null);
        setField(term64113, term64113.getClass(), "weekyearOfCentury", null);
        setField(term64113, term64113.getClass(), "millisOfSecond", null);
        setField(term64113, term64113.getClass(), "millisOfDay", null);
        setField(term64113, term64113.getClass(), "secondOfMinute", null);
        setField(term64113, term64113.getClass(), "secondOfDay", null);
        setField(term64113, term64113.getClass(), "minuteOfHour", null);
        setField(term64113, term64113.getClass(), "minuteOfDay", null);
        setField(term64113, term64113.getClass(), "hourOfDay", term64199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term64113;
        try {
            callMethod(klass, "assemble", argTypes, term64013, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


