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

public class ZonedChronology_assemble_1604148452275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101958;
     Object term102058;

    public ZonedChronology_assemble_1604148452275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101958 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term102058 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term102142 = newInstance(Class.forName("org.joda.time.field.OffsetDateTimeField"));
        setField(term102058, term102058.getClass(), "eras", null);
        setField(term102058, term102058.getClass(), "centuries", null);
        setField(term102058, term102058.getClass(), "years", null);
        setField(term102058, term102058.getClass(), "months", null);
        setField(term102058, term102058.getClass(), "weekyears", null);
        setField(term102058, term102058.getClass(), "weeks", null);
        setField(term102058, term102058.getClass(), "days", null);
        setField(term102058, term102058.getClass(), "halfdays", null);
        setField(term102058, term102058.getClass(), "hours", null);
        setField(term102058, term102058.getClass(), "minutes", null);
        setField(term102058, term102058.getClass(), "seconds", null);
        setField(term102058, term102058.getClass(), "millis", null);
        setField(term102058, term102058.getClass(), "year", null);
        setField(term102058, term102058.getClass(), "yearOfEra", null);
        setField(term102058, term102058.getClass(), "yearOfCentury", null);
        setField(term102058, term102058.getClass(), "centuryOfEra", null);
        setField(term102058, term102058.getClass(), "era", null);
        setField(term102058, term102058.getClass(), "dayOfWeek", null);
        setField(term102058, term102058.getClass(), "dayOfMonth", null);
        setField(term102058, term102058.getClass(), "dayOfYear", term102142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term102058;
        try {
            callMethod(klass, "assemble", argTypes, term101958, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


