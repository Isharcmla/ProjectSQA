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

public class FieldUtils_getWrappedValue_206953556329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;
     Object term75;
     Object term77;
     Object term79;

    public FieldUtils_getWrappedValue_206953556329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = new Integer(597278769);
        term75 = new Integer(-1685132342);
        term77 = new Integer(-1456670397);
        term79 = new Integer(1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.FieldUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term73;
        args[1] = term75;
        args[2] = term77;
        args[3] = term79;
        Object retValue = callMethod(klass, "getWrappedValue", argTypes, null, args);
        assertTrue(recursiveEquals(term73, -1456670397));
        assertTrue(recursiveEquals(term75, 1622346318));
        assertTrue(recursiveEquals(term77, 597278769));
        assertTrue(recursiveEquals(term79, -1685132342));
        assertTrue(recursiveEquals(retValue, -1087853573));
    }

};


