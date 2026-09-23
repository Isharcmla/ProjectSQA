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

public class ZonedChronology_assemble_1604148452366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137107;
     Object term137207;

    public ZonedChronology_assemble_1604148452366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137107 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term137207 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term137301 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term137397 = newInstance(Class.forName("org.joda.time.chrono.GJYearOfEraDateTimeField"));
        setField(term137207, term137207.getClass(), "eras", null);
        setField(term137207, term137207.getClass(), "centuries", null);
        setField(term137207, term137207.getClass(), "years", null);
        setField(term137207, term137207.getClass(), "months", null);
        setField(term137207, term137207.getClass(), "weekyears", null);
        setField(term137207, term137207.getClass(), "weeks", null);
        setField(term137207, term137207.getClass(), "days", null);
        setField(term137207, term137207.getClass(), "halfdays", null);
        setField(term137207, term137207.getClass(), "hours", null);
        setField(term137207, term137207.getClass(), "minutes", null);
        setField(term137207, term137207.getClass(), "seconds", null);
        setField(term137207, term137207.getClass(), "millis", null);
        setField(term137207, term137207.getClass(), "year", null);
        setField(term137207, term137207.getClass(), "yearOfEra", null);
        setField(term137207, term137207.getClass(), "yearOfCentury", null);
        setField(term137207, term137207.getClass(), "centuryOfEra", null);
        setField(term137207, term137207.getClass(), "era", null);
        setField(term137207, term137207.getClass(), "dayOfWeek", null);
        setField(term137207, term137207.getClass(), "dayOfMonth", null);
        setField(term137207, term137207.getClass(), "dayOfYear", null);
        setField(term137207, term137207.getClass(), "monthOfYear", null);
        setField(term137207, term137207.getClass(), "weekOfWeekyear", null);
        setField(term137207, term137207.getClass(), "weekyear", null);
        setField(term137207, term137207.getClass(), "weekyearOfCentury", null);
        setField(term137207, term137207.getClass(), "millisOfSecond", null);
        setField(term137207, term137207.getClass(), "millisOfDay", term137301);
        setField(term137207, term137207.getClass(), "secondOfMinute", null);
        setField(term137207, term137207.getClass(), "secondOfDay", term137397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term137207;
        try {
            callMethod(klass, "assemble", argTypes, term137107, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


