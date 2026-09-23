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

public class UniformRealDistribution_cumulativeProbability_205313412156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241177;
     Object term241719;

    public UniformRealDistribution_cumulativeProbability_205313412156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241177 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setDoubleField(term241177, term241177.getClass(), "lower", -6.0091630789779692E18);
        setDoubleField(term241177, term241177.getClass(), "upper", -7.6318674342588805E18);
        term241719 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setDoubleField(term241719, term241719.getClass(), "lower", -6.0091630789779692E18);
        setDoubleField(term241719, term241719.getClass(), "upper", -7.6318674342588805E18);
        setDoubleField(term241719, term241719.getClass(), "solverAbsoluteAccuracy", 0.0);
        setField(term241719, term241719.getClass(), "randomData", null);
        setField(term241719, term241719.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -2.4658958456196404E-195;
        Object retValue = callMethod(klass, "cumulativeProbability", argTypes, term241177, args);
        assertTrue(recursiveEquals(term241177, term241719));
        assertTrue(recursiveEquals(retValue, 1.0));
    }

};


