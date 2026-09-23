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
import java.lang.ClassCastException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_160414845290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25684;
     Object term25784;

    public ZonedChronology_assemble_160414845290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25684 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term25684, term25684.getClass(), "iParam", term25684);
        term25784 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term25888 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        setField(term25784, term25784.getClass(), "eras", null);
        setField(term25784, term25784.getClass(), "centuries", null);
        setField(term25784, term25784.getClass(), "years", null);
        setField(term25784, term25784.getClass(), "months", null);
        setField(term25784, term25784.getClass(), "weekyears", null);
        setField(term25784, term25784.getClass(), "weeks", null);
        setField(term25784, term25784.getClass(), "days", null);
        setField(term25784, term25784.getClass(), "halfdays", null);
        setField(term25784, term25784.getClass(), "hours", null);
        setField(term25784, term25784.getClass(), "minutes", null);
        setField(term25784, term25784.getClass(), "seconds", null);
        setField(term25784, term25784.getClass(), "millis", null);
        setField(term25784, term25784.getClass(), "year", null);
        setField(term25784, term25784.getClass(), "yearOfEra", null);
        setField(term25784, term25784.getClass(), "yearOfCentury", term25888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term25784;
        try {
            callMethod(klass, "assemble", argTypes, term25684, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


