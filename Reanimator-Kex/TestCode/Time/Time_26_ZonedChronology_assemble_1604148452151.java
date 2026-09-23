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

public class ZonedChronology_assemble_1604148452151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52090;
     Object term52190;

    public ZonedChronology_assemble_1604148452151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52090 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term52190 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term52270 = newInstance(Class.forName("org.joda.time.field.SkipDateTimeField"));
        setField(term52190, term52190.getClass(), "eras", null);
        setField(term52190, term52190.getClass(), "centuries", null);
        setField(term52190, term52190.getClass(), "years", null);
        setField(term52190, term52190.getClass(), "months", null);
        setField(term52190, term52190.getClass(), "weekyears", null);
        setField(term52190, term52190.getClass(), "weeks", null);
        setField(term52190, term52190.getClass(), "days", null);
        setField(term52190, term52190.getClass(), "halfdays", null);
        setField(term52190, term52190.getClass(), "hours", null);
        setField(term52190, term52190.getClass(), "minutes", null);
        setField(term52190, term52190.getClass(), "seconds", null);
        setField(term52190, term52190.getClass(), "millis", null);
        setField(term52190, term52190.getClass(), "year", null);
        setField(term52190, term52190.getClass(), "yearOfEra", null);
        setField(term52190, term52190.getClass(), "yearOfCentury", term52270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term52190;
        try {
            callMethod(klass, "assemble", argTypes, term52090, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


