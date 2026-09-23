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

public class ZonedChronology_assemble_1604148452163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60333;
     Object term60433;

    public ZonedChronology_assemble_1604148452163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60333 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term60433 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term60513 = newInstance(Class.forName("org.joda.time.field.SkipDateTimeField"));
        setField(term60433, term60433.getClass(), "eras", null);
        setField(term60433, term60433.getClass(), "centuries", null);
        setField(term60433, term60433.getClass(), "years", null);
        setField(term60433, term60433.getClass(), "months", null);
        setField(term60433, term60433.getClass(), "weekyears", null);
        setField(term60433, term60433.getClass(), "weeks", null);
        setField(term60433, term60433.getClass(), "days", null);
        setField(term60433, term60433.getClass(), "halfdays", null);
        setField(term60433, term60433.getClass(), "hours", null);
        setField(term60433, term60433.getClass(), "minutes", null);
        setField(term60433, term60433.getClass(), "seconds", null);
        setField(term60433, term60433.getClass(), "millis", null);
        setField(term60433, term60433.getClass(), "year", null);
        setField(term60433, term60433.getClass(), "yearOfEra", null);
        setField(term60433, term60433.getClass(), "yearOfCentury", null);
        setField(term60433, term60433.getClass(), "centuryOfEra", null);
        setField(term60433, term60433.getClass(), "era", term60513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term60433;
        try {
            callMethod(klass, "assemble", argTypes, term60333, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


