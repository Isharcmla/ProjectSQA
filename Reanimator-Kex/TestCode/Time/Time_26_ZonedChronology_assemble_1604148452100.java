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

public class ZonedChronology_assemble_1604148452100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34733;
     Object term34833;

    public ZonedChronology_assemble_1604148452100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34733 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term34833 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term34921 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        setField(term34833, term34833.getClass(), "eras", null);
        setField(term34833, term34833.getClass(), "centuries", null);
        setField(term34833, term34833.getClass(), "years", null);
        setField(term34833, term34833.getClass(), "months", null);
        setField(term34833, term34833.getClass(), "weekyears", null);
        setField(term34833, term34833.getClass(), "weeks", null);
        setField(term34833, term34833.getClass(), "days", null);
        setField(term34833, term34833.getClass(), "halfdays", null);
        setField(term34833, term34833.getClass(), "hours", null);
        setField(term34833, term34833.getClass(), "minutes", null);
        setField(term34833, term34833.getClass(), "seconds", null);
        setField(term34833, term34833.getClass(), "millis", null);
        setField(term34833, term34833.getClass(), "year", null);
        setField(term34833, term34833.getClass(), "yearOfEra", null);
        setField(term34833, term34833.getClass(), "yearOfCentury", null);
        setField(term34833, term34833.getClass(), "centuryOfEra", null);
        setField(term34833, term34833.getClass(), "era", null);
        setField(term34833, term34833.getClass(), "dayOfWeek", null);
        setField(term34833, term34833.getClass(), "dayOfMonth", term34921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term34833;
        try {
            callMethod(klass, "assemble", argTypes, term34733, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


