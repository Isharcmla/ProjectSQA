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

public class UnsupportedDurationField_equals_72423379954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9728;
     Object term9932;
     Object term9933;

    public UnsupportedDurationField_equals_72423379954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9728 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        term9932 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term9932, term9932.getClass(), "iType", null);
        term9933 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term9933, term9933.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9728;
        Object retValue = callMethod(klass, "equals", argTypes, term9728, args);
        assertTrue(recursiveEquals(term9728, term9932));
        assertTrue(recursiveEquals(term9728, term9933));
        assertTrue(recursiveEquals(retValue, true));
    }

};
