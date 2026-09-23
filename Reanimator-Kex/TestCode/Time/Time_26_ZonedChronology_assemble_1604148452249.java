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

public class ZonedChronology_assemble_1604148452249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92727;
     Object term92827;

    public ZonedChronology_assemble_1604148452249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92727 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term92727, term92727.getClass(), "iParam", term92727);
        term92827 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term92923 = newInstance(Class.forName("org.joda.time.chrono.GJDayOfWeekDateTimeField"));
        setField(term92827, term92827.getClass(), "eras", null);
        setField(term92827, term92827.getClass(), "centuries", null);
        setField(term92827, term92827.getClass(), "years", null);
        setField(term92827, term92827.getClass(), "months", null);
        setField(term92827, term92827.getClass(), "weekyears", null);
        setField(term92827, term92827.getClass(), "weeks", null);
        setField(term92827, term92827.getClass(), "days", null);
        setField(term92827, term92827.getClass(), "halfdays", null);
        setField(term92827, term92827.getClass(), "hours", null);
        setField(term92827, term92827.getClass(), "minutes", null);
        setField(term92827, term92827.getClass(), "seconds", null);
        setField(term92827, term92827.getClass(), "millis", null);
        setField(term92827, term92827.getClass(), "year", null);
        setField(term92827, term92827.getClass(), "yearOfEra", null);
        setField(term92827, term92827.getClass(), "yearOfCentury", null);
        setField(term92827, term92827.getClass(), "centuryOfEra", term92923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term92827;
        try {
            callMethod(klass, "assemble", argTypes, term92727, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


