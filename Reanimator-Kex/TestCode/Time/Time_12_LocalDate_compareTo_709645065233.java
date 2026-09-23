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

public class LocalDate_compareTo_709645065233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127018;
     Object term127024;
     Object term127025;

    public LocalDate_compareTo_709645065233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127018 = newInstance(Class.forName("org.joda.time.LocalDate"));
        term127024 = newInstance(Class.forName("org.joda.time.LocalDate"));
        setLongField(term127024, term127024.getClass(), "iLocalMillis", 0L);
        setField(term127024, term127024.getClass(), "iChronology", null);
        setIntField(term127024, term127024.getClass(), "iHash", 0);
        term127025 = newInstance(Class.forName("org.joda.time.LocalDate"));
        setLongField(term127025, term127025.getClass(), "iLocalMillis", 0L);
        setField(term127025, term127025.getClass(), "iChronology", null);
        setIntField(term127025, term127025.getClass(), "iHash", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        Object[] args = new Object[1];
        args[0] = term127018;
        Object retValue = callMethod(klass, "compareTo", argTypes, term127018, args);
        assertTrue(recursiveEquals(term127018, term127024));
        assertTrue(recursiveEquals(term127018, term127025));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


