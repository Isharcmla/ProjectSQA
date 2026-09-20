package org.joda.time.field;

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
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.field.EqualityUtils.*;

public class UnsupportedDurationField_compareTo_213153975575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13594;
     Object term13678;
     Object term13700;
     Object term13701;

    public UnsupportedDurationField_compareTo_213153975575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13594 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        term13678 = newInstance(Class.forName("org.joda.time.field.ScaledDurationField"));
        term13700 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term13700, term13700.getClass(), "iType", null);
        term13701 = newInstance(Class.forName("org.joda.time.field.ScaledDurationField"));
        setIntField(term13701, term13701.getClass(), "iScalar", 0);
        setField(term13701, term13701.getClass(), "iField", null);
        setField(term13701, term13701.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.DurationField");
        Object[] args = new Object[1];
        args[0] = term13678;
        Object retValue = callMethod(klass, "compareTo", argTypes, term13594, args);
        assertTrue(recursiveEquals(term13594, term13700));
        assertTrue(recursiveEquals(term13678, term13701));
        assertTrue(recursiveEquals(retValue, 1));
    }

};
