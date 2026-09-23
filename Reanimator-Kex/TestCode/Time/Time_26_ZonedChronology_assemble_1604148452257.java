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

public class ZonedChronology_assemble_1604148452257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96136;
     Object term96236;

    public ZonedChronology_assemble_1604148452257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96136 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term96236 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term96320 = newInstance(Class.forName("org.joda.time.field.OffsetDateTimeField"));
        setField(term96236, term96236.getClass(), "eras", null);
        setField(term96236, term96236.getClass(), "centuries", null);
        setField(term96236, term96236.getClass(), "years", null);
        setField(term96236, term96236.getClass(), "months", null);
        setField(term96236, term96236.getClass(), "weekyears", null);
        setField(term96236, term96236.getClass(), "weeks", null);
        setField(term96236, term96236.getClass(), "days", null);
        setField(term96236, term96236.getClass(), "halfdays", null);
        setField(term96236, term96236.getClass(), "hours", null);
        setField(term96236, term96236.getClass(), "minutes", null);
        setField(term96236, term96236.getClass(), "seconds", null);
        setField(term96236, term96236.getClass(), "millis", null);
        setField(term96236, term96236.getClass(), "year", null);
        setField(term96236, term96236.getClass(), "yearOfEra", null);
        setField(term96236, term96236.getClass(), "yearOfCentury", null);
        setField(term96236, term96236.getClass(), "centuryOfEra", null);
        setField(term96236, term96236.getClass(), "era", null);
        setField(term96236, term96236.getClass(), "dayOfWeek", term96320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term96236;
        try {
            callMethod(klass, "assemble", argTypes, term96136, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


