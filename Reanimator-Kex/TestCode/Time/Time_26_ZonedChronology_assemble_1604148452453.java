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

public class ZonedChronology_assemble_1604148452453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197876;
     Object term197976;

    public ZonedChronology_assemble_1604148452453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197876 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term197876, term197876.getClass(), "iParam", term197876);
        term197976 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term198088 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        setField(term197976, term197976.getClass(), "eras", null);
        setField(term197976, term197976.getClass(), "centuries", null);
        setField(term197976, term197976.getClass(), "years", null);
        setField(term197976, term197976.getClass(), "months", null);
        setField(term197976, term197976.getClass(), "weekyears", null);
        setField(term197976, term197976.getClass(), "weeks", null);
        setField(term197976, term197976.getClass(), "days", null);
        setField(term197976, term197976.getClass(), "halfdays", null);
        setField(term197976, term197976.getClass(), "hours", null);
        setField(term197976, term197976.getClass(), "minutes", null);
        setField(term197976, term197976.getClass(), "seconds", null);
        setField(term197976, term197976.getClass(), "millis", null);
        setField(term197976, term197976.getClass(), "year", null);
        setField(term197976, term197976.getClass(), "yearOfEra", null);
        setField(term197976, term197976.getClass(), "yearOfCentury", null);
        setField(term197976, term197976.getClass(), "centuryOfEra", null);
        setField(term197976, term197976.getClass(), "era", null);
        setField(term197976, term197976.getClass(), "dayOfWeek", null);
        setField(term197976, term197976.getClass(), "dayOfMonth", null);
        setField(term197976, term197976.getClass(), "dayOfYear", null);
        setField(term197976, term197976.getClass(), "monthOfYear", null);
        setField(term197976, term197976.getClass(), "weekOfWeekyear", null);
        setField(term197976, term197976.getClass(), "weekyear", term198088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term197976;
        try {
            callMethod(klass, "assemble", argTypes, term197876, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


