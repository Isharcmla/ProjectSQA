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

public class ZonedChronology_assemble_1604148452186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67981;
     Object term68081;

    public ZonedChronology_assemble_1604148452186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67981 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term68081 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term68165 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term68081, term68081.getClass(), "eras", null);
        setField(term68081, term68081.getClass(), "centuries", null);
        setField(term68081, term68081.getClass(), "years", null);
        setField(term68081, term68081.getClass(), "months", null);
        setField(term68081, term68081.getClass(), "weekyears", null);
        setField(term68081, term68081.getClass(), "weeks", null);
        setField(term68081, term68081.getClass(), "days", null);
        setField(term68081, term68081.getClass(), "halfdays", null);
        setField(term68081, term68081.getClass(), "hours", null);
        setField(term68081, term68081.getClass(), "minutes", null);
        setField(term68081, term68081.getClass(), "seconds", null);
        setField(term68081, term68081.getClass(), "millis", null);
        setField(term68081, term68081.getClass(), "year", null);
        setField(term68081, term68081.getClass(), "yearOfEra", null);
        setField(term68081, term68081.getClass(), "yearOfCentury", null);
        setField(term68081, term68081.getClass(), "centuryOfEra", null);
        setField(term68081, term68081.getClass(), "era", null);
        setField(term68081, term68081.getClass(), "dayOfWeek", null);
        setField(term68081, term68081.getClass(), "dayOfMonth", null);
        setField(term68081, term68081.getClass(), "dayOfYear", null);
        setField(term68081, term68081.getClass(), "monthOfYear", null);
        setField(term68081, term68081.getClass(), "weekOfWeekyear", null);
        setField(term68081, term68081.getClass(), "weekyear", term68165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term68081;
        try {
            callMethod(klass, "assemble", argTypes, term67981, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


