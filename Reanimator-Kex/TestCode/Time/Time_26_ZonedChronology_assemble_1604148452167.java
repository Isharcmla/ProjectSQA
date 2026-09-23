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

public class ZonedChronology_assemble_1604148452167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61611;
     Object term61711;

    public ZonedChronology_assemble_1604148452167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61611 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term61711 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term61799 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        setField(term61711, term61711.getClass(), "eras", null);
        setField(term61711, term61711.getClass(), "centuries", null);
        setField(term61711, term61711.getClass(), "years", null);
        setField(term61711, term61711.getClass(), "months", null);
        setField(term61711, term61711.getClass(), "weekyears", null);
        setField(term61711, term61711.getClass(), "weeks", null);
        setField(term61711, term61711.getClass(), "days", null);
        setField(term61711, term61711.getClass(), "halfdays", null);
        setField(term61711, term61711.getClass(), "hours", null);
        setField(term61711, term61711.getClass(), "minutes", null);
        setField(term61711, term61711.getClass(), "seconds", null);
        setField(term61711, term61711.getClass(), "millis", null);
        setField(term61711, term61711.getClass(), "year", null);
        setField(term61711, term61711.getClass(), "yearOfEra", null);
        setField(term61711, term61711.getClass(), "yearOfCentury", null);
        setField(term61711, term61711.getClass(), "centuryOfEra", null);
        setField(term61711, term61711.getClass(), "era", term61799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term61711;
        try {
            callMethod(klass, "assemble", argTypes, term61611, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


