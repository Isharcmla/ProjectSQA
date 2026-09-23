package org.apache.commons.math.distribution;

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
import static org.apache.commons.math.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.distribution.EqualityUtils.*;
import java.lang.Double;

public class NormalDistributionImpl_density_45585542142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6248;
     Object term6263;

    public NormalDistributionImpl_density_45585542142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6248 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setDoubleField(term6248, term6248.getClass(), "mean", 6.03979776E8);
        setDoubleField(term6248, term6248.getClass(), "standardDeviation", 3.9994779440817111E18);
        term6263 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setDoubleField(term6263, term6263.getClass(), "mean", 6.03979776E8);
        setDoubleField(term6263, term6263.getClass(), "standardDeviation", 3.9994779440817111E18);
        setDoubleField(term6263, term6263.getClass(), "solverAbsoluteAccuracy", 0.0);
        setField(term6263, term6263.getClass(), "randomData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = Double.NEGATIVE_INFINITY;
        Object retValue = callMethod(klass, "density", argTypes, term6248, args);
        assertTrue(recursiveEquals(term6248, term6263));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


