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

public class SimplexTableau_getSolution_1711318257180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108070;

    public SimplexTableau_getSolution_1711318257180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108070 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term108166 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setBooleanField(term108070, term108070.getClass(), "restrictToNonNegative", true);
        setIntField(term108070, term108070.getClass(), "numDecisionVariables", 0);
        setIntField(term108070, term108070.getClass(), "numArtificialVariables", 0);
        setField(term108070, term108070.getClass(), "tableau", term108166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSolution", argTypes, term108070, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


