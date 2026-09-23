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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;

public class LocalDate_minusWeeks_807092368297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147131;
     Object term147137;
     Object term147133;

    public LocalDate_minusWeeks_807092368297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147131 = newInstance(Class.forName("org.joda.time.LocalDate"));
        term147137 = newInstance(Class.forName("org.joda.time.LocalDate"));
        setLongField(term147137, term147137.getClass(), "iLocalMillis", 0L);
        setField(term147137, term147137.getClass(), "iChronology", null);
        setIntField(term147137, term147137.getClass(), "iHash", 0);
        term147133 = newInstance(Class.forName("org.joda.time.LocalDate"));
        setLongField(term147133, term147133.getClass(), "iLocalMillis", 0L);
        setField(term147133, term147133.getClass(), "iChronology", null);
        setIntField(term147133, term147133.getClass(), "iHash", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "minusWeeks", argTypes, term147131, args);
        assertTrue(recursiveEquals(term147131, term147137));
        assertTrue(recursiveEquals(retValue, term147133));
    }

};


