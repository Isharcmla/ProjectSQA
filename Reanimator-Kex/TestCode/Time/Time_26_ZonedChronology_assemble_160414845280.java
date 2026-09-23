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

public class ZonedChronology_assemble_160414845280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22928;
     Object term23028;

    public ZonedChronology_assemble_160414845280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22928 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term23028 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term23144 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        setField(term23028, term23028.getClass(), "eras", null);
        setField(term23028, term23028.getClass(), "centuries", null);
        setField(term23028, term23028.getClass(), "years", null);
        setField(term23028, term23028.getClass(), "months", null);
        setField(term23028, term23028.getClass(), "weekyears", null);
        setField(term23028, term23028.getClass(), "weeks", null);
        setField(term23028, term23028.getClass(), "days", null);
        setField(term23028, term23028.getClass(), "halfdays", null);
        setField(term23028, term23028.getClass(), "hours", null);
        setField(term23028, term23028.getClass(), "minutes", null);
        setField(term23028, term23028.getClass(), "seconds", null);
        setField(term23028, term23028.getClass(), "millis", null);
        setField(term23028, term23028.getClass(), "year", null);
        setField(term23028, term23028.getClass(), "yearOfEra", null);
        setField(term23028, term23028.getClass(), "yearOfCentury", null);
        setField(term23028, term23028.getClass(), "centuryOfEra", null);
        setField(term23028, term23028.getClass(), "era", null);
        setField(term23028, term23028.getClass(), "dayOfWeek", null);
        setField(term23028, term23028.getClass(), "dayOfMonth", null);
        setField(term23028, term23028.getClass(), "dayOfYear", null);
        setField(term23028, term23028.getClass(), "monthOfYear", null);
        setField(term23028, term23028.getClass(), "weekOfWeekyear", null);
        setField(term23028, term23028.getClass(), "weekyear", null);
        setField(term23028, term23028.getClass(), "weekyearOfCentury", null);
        setField(term23028, term23028.getClass(), "millisOfSecond", term23144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term23028;
        try {
            callMethod(klass, "assemble", argTypes, term22928, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


