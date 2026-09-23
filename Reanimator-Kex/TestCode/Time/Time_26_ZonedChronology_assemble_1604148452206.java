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

public class ZonedChronology_assemble_1604148452206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75191;
     Object term75291;

    public ZonedChronology_assemble_1604148452206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75191 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term75291 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term75379 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        setField(term75291, term75291.getClass(), "eras", null);
        setField(term75291, term75291.getClass(), "centuries", null);
        setField(term75291, term75291.getClass(), "years", null);
        setField(term75291, term75291.getClass(), "months", null);
        setField(term75291, term75291.getClass(), "weekyears", null);
        setField(term75291, term75291.getClass(), "weeks", null);
        setField(term75291, term75291.getClass(), "days", null);
        setField(term75291, term75291.getClass(), "halfdays", null);
        setField(term75291, term75291.getClass(), "hours", null);
        setField(term75291, term75291.getClass(), "minutes", null);
        setField(term75291, term75291.getClass(), "seconds", null);
        setField(term75291, term75291.getClass(), "millis", null);
        setField(term75291, term75291.getClass(), "year", null);
        setField(term75291, term75291.getClass(), "yearOfEra", null);
        setField(term75291, term75291.getClass(), "yearOfCentury", null);
        setField(term75291, term75291.getClass(), "centuryOfEra", null);
        setField(term75291, term75291.getClass(), "era", null);
        setField(term75291, term75291.getClass(), "dayOfWeek", null);
        setField(term75291, term75291.getClass(), "dayOfMonth", null);
        setField(term75291, term75291.getClass(), "dayOfYear", null);
        setField(term75291, term75291.getClass(), "monthOfYear", null);
        setField(term75291, term75291.getClass(), "weekOfWeekyear", null);
        setField(term75291, term75291.getClass(), "weekyear", null);
        setField(term75291, term75291.getClass(), "weekyearOfCentury", null);
        setField(term75291, term75291.getClass(), "millisOfSecond", null);
        setField(term75291, term75291.getClass(), "millisOfDay", null);
        setField(term75291, term75291.getClass(), "secondOfMinute", null);
        setField(term75291, term75291.getClass(), "secondOfDay", term75379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term75291;
        try {
            callMethod(klass, "assemble", argTypes, term75191, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


