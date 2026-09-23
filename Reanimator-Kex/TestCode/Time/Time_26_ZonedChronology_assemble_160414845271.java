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

public class ZonedChronology_assemble_160414845271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19688;
     Object term19788;

    public ZonedChronology_assemble_160414845271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19688 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term19788 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term19892 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        setField(term19788, term19788.getClass(), "eras", null);
        setField(term19788, term19788.getClass(), "centuries", null);
        setField(term19788, term19788.getClass(), "years", null);
        setField(term19788, term19788.getClass(), "months", null);
        setField(term19788, term19788.getClass(), "weekyears", null);
        setField(term19788, term19788.getClass(), "weeks", null);
        setField(term19788, term19788.getClass(), "days", null);
        setField(term19788, term19788.getClass(), "halfdays", null);
        setField(term19788, term19788.getClass(), "hours", null);
        setField(term19788, term19788.getClass(), "minutes", null);
        setField(term19788, term19788.getClass(), "seconds", null);
        setField(term19788, term19788.getClass(), "millis", null);
        setField(term19788, term19788.getClass(), "year", null);
        setField(term19788, term19788.getClass(), "yearOfEra", null);
        setField(term19788, term19788.getClass(), "yearOfCentury", null);
        setField(term19788, term19788.getClass(), "centuryOfEra", null);
        setField(term19788, term19788.getClass(), "era", term19892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term19788;
        try {
            callMethod(klass, "assemble", argTypes, term19688, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


