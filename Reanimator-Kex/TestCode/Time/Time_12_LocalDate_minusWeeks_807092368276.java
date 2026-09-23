package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LocalDate_minusWeeks_807092368276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142175;

    public LocalDate_minusWeeks_807092368276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142175 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term142249 = newInstance(Class.forName("org.joda.time.chrono.ISOChronology"));
        Object term142335 = newInstance(Class.forName("org.joda.time.field.PreciseDurationField"));
        setLongField(term142335, term142335.getClass(), "iUnitMillis", 1180275985L);
        setField(term142249, term142249.getClass(), "iWeeks", term142335);
        setField(term142175, term142175.getClass(), "iChronology", term142249);
        setLongField(term142175, term142175.getClass(), "iLocalMillis", 1L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1865851879;
        try {
            callMethod(klass, "minusWeeks", argTypes, term142175, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


