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

public class ZonedChronology_assemble_1604148452295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109041;
     Object term109141;

    public ZonedChronology_assemble_1604148452295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109041 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term109141 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term109229 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        setField(term109141, term109141.getClass(), "eras", null);
        setField(term109141, term109141.getClass(), "centuries", null);
        setField(term109141, term109141.getClass(), "years", null);
        setField(term109141, term109141.getClass(), "months", null);
        setField(term109141, term109141.getClass(), "weekyears", null);
        setField(term109141, term109141.getClass(), "weeks", null);
        setField(term109141, term109141.getClass(), "days", null);
        setField(term109141, term109141.getClass(), "halfdays", null);
        setField(term109141, term109141.getClass(), "hours", null);
        setField(term109141, term109141.getClass(), "minutes", null);
        setField(term109141, term109141.getClass(), "seconds", null);
        setField(term109141, term109141.getClass(), "millis", null);
        setField(term109141, term109141.getClass(), "year", null);
        setField(term109141, term109141.getClass(), "yearOfEra", null);
        setField(term109141, term109141.getClass(), "yearOfCentury", null);
        setField(term109141, term109141.getClass(), "centuryOfEra", null);
        setField(term109141, term109141.getClass(), "era", null);
        setField(term109141, term109141.getClass(), "dayOfWeek", term109229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term109141;
        try {
            callMethod(klass, "assemble", argTypes, term109041, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


