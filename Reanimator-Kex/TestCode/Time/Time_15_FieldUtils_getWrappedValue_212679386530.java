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
import java.lang.Integer;

public class FieldUtils_getWrappedValue_212679386530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81;
     Object term83;
     Object term85;

    public FieldUtils_getWrappedValue_212679386530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81 = new Integer(1048535127);
        term83 = new Integer(-655067527);
        term85 = new Integer(-6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.FieldUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term81;
        args[1] = term83;
        args[2] = term85;
        Object retValue = callMethod(klass, "getWrappedValue", argTypes, null, args);
        assertTrue(recursiveEquals(term81, 1048535127));
        assertTrue(recursiveEquals(term83, -655067527));
        assertTrue(recursiveEquals(term85, -6029667));
        assertTrue(recursiveEquals(retValue, -249540595));
    }

};


