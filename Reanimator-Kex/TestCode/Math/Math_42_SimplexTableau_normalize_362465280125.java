package org.apache.commons.math.optimization.linear;

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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimplexTableau_normalize_362465280125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78385;
     Object term78511;

    public SimplexTableau_normalize_362465280125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78385 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        term78511 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term78603 = newInstance(Class.forName("org.apache.commons.math.linear.RealVector$2"));
        setDoubleField(term78511, term78511.getClass(), "value", -9.2188684372274053E18);
        setField(term78511, term78511.getClass(), "coefficients", term78603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Object[] args = new Object[1];
        args[0] = term78511;
        try {
            callMethod(klass, "normalize", argTypes, term78385, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


