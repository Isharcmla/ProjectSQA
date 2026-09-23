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

public class ZonedChronology_assemble_160414845260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16775;
     Object term16875;

    public ZonedChronology_assemble_160414845260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16775 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term16875 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term16973 = newInstance(Class.forName("org.joda.time.chrono.ISOYearOfEraDateTimeField"));
        setField(term16875, term16875.getClass(), "eras", null);
        setField(term16875, term16875.getClass(), "centuries", null);
        setField(term16875, term16875.getClass(), "years", null);
        setField(term16875, term16875.getClass(), "months", null);
        setField(term16875, term16875.getClass(), "weekyears", null);
        setField(term16875, term16875.getClass(), "weeks", null);
        setField(term16875, term16875.getClass(), "days", null);
        setField(term16875, term16875.getClass(), "halfdays", null);
        setField(term16875, term16875.getClass(), "hours", null);
        setField(term16875, term16875.getClass(), "minutes", null);
        setField(term16875, term16875.getClass(), "seconds", null);
        setField(term16875, term16875.getClass(), "millis", null);
        setField(term16875, term16875.getClass(), "year", null);
        setField(term16875, term16875.getClass(), "yearOfEra", null);
        setField(term16875, term16875.getClass(), "yearOfCentury", null);
        setField(term16875, term16875.getClass(), "centuryOfEra", null);
        setField(term16875, term16875.getClass(), "era", null);
        setField(term16875, term16875.getClass(), "dayOfWeek", null);
        setField(term16875, term16875.getClass(), "dayOfMonth", null);
        setField(term16875, term16875.getClass(), "dayOfYear", null);
        setField(term16875, term16875.getClass(), "monthOfYear", null);
        setField(term16875, term16875.getClass(), "weekOfWeekyear", null);
        setField(term16875, term16875.getClass(), "weekyear", null);
        setField(term16875, term16875.getClass(), "weekyearOfCentury", term16973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term16875;
        try {
            callMethod(klass, "assemble", argTypes, term16775, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


