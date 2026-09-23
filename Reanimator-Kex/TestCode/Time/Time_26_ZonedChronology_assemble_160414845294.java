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

public class ZonedChronology_assemble_160414845294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32749;
     Object term32849;

    public ZonedChronology_assemble_160414845294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32749 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term32749, term32749.getClass(), "iParam", null);
        term32849 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term32953 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        Object term33043 = newInstance(Class.forName("org.joda.time.field.DecoratedDurationField"));
        setField(term32849, term32849.getClass(), "eras", null);
        setField(term32849, term32849.getClass(), "centuries", null);
        setField(term32849, term32849.getClass(), "years", null);
        setField(term32849, term32849.getClass(), "months", null);
        setField(term32849, term32849.getClass(), "weekyears", null);
        setField(term32849, term32849.getClass(), "weeks", null);
        setField(term32849, term32849.getClass(), "days", null);
        setField(term32849, term32849.getClass(), "halfdays", null);
        setField(term32849, term32849.getClass(), "hours", null);
        setField(term32849, term32849.getClass(), "minutes", null);
        setField(term32849, term32849.getClass(), "seconds", null);
        setField(term32849, term32849.getClass(), "millis", null);
        setField(term32849, term32849.getClass(), "year", null);
        setField(term32849, term32849.getClass(), "yearOfEra", null);
        setField(term32849, term32849.getClass(), "yearOfCentury", null);
        setField(term32849, term32849.getClass(), "centuryOfEra", null);
        setField(term32953, term32953.getClass(), "iUnitField", term33043);
        setField(term32849, term32849.getClass(), "era", term32953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term32849;
        try {
            callMethod(klass, "assemble", argTypes, term32749, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


