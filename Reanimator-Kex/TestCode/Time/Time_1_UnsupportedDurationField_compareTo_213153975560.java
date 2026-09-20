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

public class UnsupportedDurationField_compareTo_213153975560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10769;
     Object term10863;
     Object term11626;
     Object term11627;

    public UnsupportedDurationField_compareTo_213153975560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10769 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        term10863 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        term11626 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term11626, term11626.getClass(), "iType", null);
        term11627 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term11627, term11627.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.DurationField");
        Object[] args = new Object[1];
        args[0] = term10863;
        Object retValue = callMethod(klass, "compareTo", argTypes, term10769, args);
        assertTrue(recursiveEquals(term10769, term11626));
        assertTrue(recursiveEquals(term10863, term11627));
        assertTrue(recursiveEquals(retValue, 0));
    }

};
