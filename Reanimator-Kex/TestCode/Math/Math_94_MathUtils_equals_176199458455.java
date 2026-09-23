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
import java.lang.Double;

public class MathUtils_equals_176199458455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1067;
     Object term1068;
     Object term1070;

    public MathUtils_equals_176199458455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1067 = newInstance(Class.forName("org.apache.commons.math.util.MathUtils"));
        term1068 = new Double(0.0);
        term1070 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term1068;
        args[1] = term1070;
        callMethod(klass, "equals", argTypes, term1067, args);
    }

};


