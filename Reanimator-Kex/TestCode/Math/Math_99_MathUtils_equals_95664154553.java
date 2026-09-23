package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.util.EqualityUtils.*;
import java.lang.Double;

public class MathUtils_equals_95664154553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53;
     Object term55;
     Object term57;

    public MathUtils_equals_95664154553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53 = new Double(0.544608645520025);
        term55 = new Double(0.28570734989730284);
        term57 = new Double(0.40176586625454525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term53;
        args[1] = term55;
        args[2] = term57;
        Object retValue = callMethod(klass, "equals", argTypes, null, args);
        assertTrue(recursiveEquals(term53, 0.544608645520025));
        assertTrue(recursiveEquals(term55, 0.28570734989730284));
        assertTrue(recursiveEquals(term57, 0.40176586625454525));
        assertTrue(recursiveEquals(retValue, true));
    }

};


