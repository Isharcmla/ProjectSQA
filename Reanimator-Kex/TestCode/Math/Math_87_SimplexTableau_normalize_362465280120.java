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

public class SimplexTableau_normalize_362465280120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75782;
     Object term75908;

    public SimplexTableau_normalize_362465280120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75782 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        term75908 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term76010 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term75908, term75908.getClass(), "value", -9.2188684372274053E18);
        setField(term75908, term75908.getClass(), "coefficients", term76010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Object[] args = new Object[1];
        args[0] = term75908;
        try {
            callMethod(klass, "normalize", argTypes, term75782, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


