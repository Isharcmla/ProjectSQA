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

public class ZonedChronology_assemble_1604148452213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78217;
     Object term78317;

    public ZonedChronology_assemble_1604148452213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78217 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term78217, term78217.getClass(), "iParam", null);
        term78317 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term78433 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term78523 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term78317, term78317.getClass(), "eras", null);
        setField(term78317, term78317.getClass(), "centuries", null);
        setField(term78317, term78317.getClass(), "years", null);
        setField(term78317, term78317.getClass(), "months", null);
        setField(term78317, term78317.getClass(), "weekyears", null);
        setField(term78317, term78317.getClass(), "weeks", null);
        setField(term78317, term78317.getClass(), "days", null);
        setField(term78317, term78317.getClass(), "halfdays", null);
        setField(term78317, term78317.getClass(), "hours", null);
        setField(term78317, term78317.getClass(), "minutes", null);
        setField(term78317, term78317.getClass(), "seconds", null);
        setField(term78317, term78317.getClass(), "millis", null);
        setField(term78317, term78317.getClass(), "year", null);
        setField(term78317, term78317.getClass(), "yearOfEra", null);
        setField(term78317, term78317.getClass(), "yearOfCentury", null);
        setField(term78317, term78317.getClass(), "centuryOfEra", null);
        setField(term78317, term78317.getClass(), "era", null);
        setField(term78317, term78317.getClass(), "dayOfWeek", null);
        setField(term78317, term78317.getClass(), "dayOfMonth", null);
        setField(term78317, term78317.getClass(), "dayOfYear", null);
        setField(term78317, term78317.getClass(), "monthOfYear", null);
        setField(term78317, term78317.getClass(), "weekOfWeekyear", null);
        setField(term78317, term78317.getClass(), "weekyear", null);
        setField(term78317, term78317.getClass(), "weekyearOfCentury", null);
        setField(term78433, term78433.getClass(), "iDurationField", term78523);
        setField(term78317, term78317.getClass(), "millisOfSecond", term78433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term78317;
        try {
            callMethod(klass, "assemble", argTypes, term78217, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


