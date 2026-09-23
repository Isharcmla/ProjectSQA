package org.apache.commons.math3.distribution;

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
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.distribution.EqualityUtils.*;

public class UniformRealDistribution_cumulativeProbability_205313412138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202064;
     Object term202558;

    public UniformRealDistribution_cumulativeProbability_205313412138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202064 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setDoubleField(term202064, term202064.getClass(), "lower", 6.755399441055745E15);
        term202558 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setDoubleField(term202558, term202558.getClass(), "lower", 6.755399441055745E15);
        setDoubleField(term202558, term202558.getClass(), "upper", 0.0);
        setDoubleField(term202558, term202558.getClass(), "solverAbsoluteAccuracy", 0.0);
        setField(term202558, term202558.getClass(), "randomData", null);
        setField(term202558, term202558.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 5.5340232221128655E19;
        Object retValue = callMethod(klass, "cumulativeProbability", argTypes, term202064, args);
        assertTrue(recursiveEquals(term202064, term202558));
        assertTrue(recursiveEquals(retValue, 1.0));
    }

};


