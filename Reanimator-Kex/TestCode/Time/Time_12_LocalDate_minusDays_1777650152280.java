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

public class LocalDate_minusDays_1777650152280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143576;
     Object term143582;
     Object term143578;

    public LocalDate_minusDays_1777650152280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143576 = newInstance(Class.forName("org.joda.time.LocalDate"));
        term143582 = newInstance(Class.forName("org.joda.time.LocalDate"));
        setLongField(term143582, term143582.getClass(), "iLocalMillis", 0L);
        setField(term143582, term143582.getClass(), "iChronology", null);
        setIntField(term143582, term143582.getClass(), "iHash", 0);
        term143578 = newInstance(Class.forName("org.joda.time.LocalDate"));
        setLongField(term143578, term143578.getClass(), "iLocalMillis", 0L);
        setField(term143578, term143578.getClass(), "iChronology", null);
        setIntField(term143578, term143578.getClass(), "iHash", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "minusDays", argTypes, term143576, args);
        assertTrue(recursiveEquals(term143576, term143582));
        assertTrue(recursiveEquals(retValue, term143578));
    }

};


