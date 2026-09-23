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

public class LocalDate_plusMonths_982022226229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126472;
     Object term126478;
     Object term126474;

    public LocalDate_plusMonths_982022226229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126472 = newInstance(Class.forName("org.joda.time.LocalDate"));
        term126478 = newInstance(Class.forName("org.joda.time.LocalDate"));
        setLongField(term126478, term126478.getClass(), "iLocalMillis", 0L);
        setField(term126478, term126478.getClass(), "iChronology", null);
        setIntField(term126478, term126478.getClass(), "iHash", 0);
        term126474 = newInstance(Class.forName("org.joda.time.LocalDate"));
        setLongField(term126474, term126474.getClass(), "iLocalMillis", 0L);
        setField(term126474, term126474.getClass(), "iChronology", null);
        setIntField(term126474, term126474.getClass(), "iHash", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "plusMonths", argTypes, term126472, args);
        assertTrue(recursiveEquals(term126472, term126478));
        assertTrue(recursiveEquals(retValue, term126474));
    }

};


