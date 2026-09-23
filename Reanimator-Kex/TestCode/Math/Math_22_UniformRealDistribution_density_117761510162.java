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

public class UniformRealDistribution_density_117761510162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242391;
     Object term248858;

    public UniformRealDistribution_density_117761510162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242391 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setDoubleField(term242391, term242391.getClass(), "lower", -8.0658718866569953E18);
        setDoubleField(term242391, term242391.getClass(), "upper", -9.146793251003433E18);
        term248858 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setDoubleField(term248858, term248858.getClass(), "lower", -8.0658718866569953E18);
        setDoubleField(term248858, term248858.getClass(), "upper", -9.146793251003433E18);
        setDoubleField(term248858, term248858.getClass(), "solverAbsoluteAccuracy", 0.0);
        setField(term248858, term248858.getClass(), "randomData", null);
        setField(term248858, term248858.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -2.859401890540787E-306;
        Object retValue = callMethod(klass, "density", argTypes, term242391, args);
        assertTrue(recursiveEquals(term242391, term248858));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


