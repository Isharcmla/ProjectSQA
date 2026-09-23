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

public class LocalDate_plusWeeks_1292937466293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146731;
     Object term146737;
     Object term146733;

    public LocalDate_plusWeeks_1292937466293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146731 = newInstance(Class.forName("org.joda.time.LocalDate"));
        term146737 = newInstance(Class.forName("org.joda.time.LocalDate"));
        setLongField(term146737, term146737.getClass(), "iLocalMillis", 0L);
        setField(term146737, term146737.getClass(), "iChronology", null);
        setIntField(term146737, term146737.getClass(), "iHash", 0);
        term146733 = newInstance(Class.forName("org.joda.time.LocalDate"));
        setLongField(term146733, term146733.getClass(), "iLocalMillis", 0L);
        setField(term146733, term146733.getClass(), "iChronology", null);
        setIntField(term146733, term146733.getClass(), "iHash", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "plusWeeks", argTypes, term146731, args);
        assertTrue(recursiveEquals(term146731, term146737));
        assertTrue(recursiveEquals(retValue, term146733));
    }

};


