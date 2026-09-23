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

public class UnsupportedDurationField_compareTo_213153975544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58;
     Object term6153;

    public UnsupportedDurationField_compareTo_213153975544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term58, term58.getClass(), "iType", null);
        term6153 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term6153, term6153.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.DurationField");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "compareTo", argTypes, term58, args);
        assertTrue(recursiveEquals(term58, term6153));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


