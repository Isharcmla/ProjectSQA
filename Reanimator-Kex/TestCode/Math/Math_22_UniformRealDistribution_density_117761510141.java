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

public class UniformRealDistribution_density_117761510141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202698;
     Object term202962;

    public UniformRealDistribution_density_117761510141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202698 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setDoubleField(term202698, term202698.getClass(), "lower", -8.6469112842829169E18);
        term202962 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        setDoubleField(term202962, term202962.getClass(), "lower", -8.6469112842829169E18);
        setDoubleField(term202962, term202962.getClass(), "upper", 0.0);
        setDoubleField(term202962, term202962.getClass(), "solverAbsoluteAccuracy", 0.0);
        setField(term202962, term202962.getClass(), "randomData", null);
        setField(term202962, term202962.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -3.785767221382976E-270;
        Object retValue = callMethod(klass, "density", argTypes, term202698, args);
        assertTrue(recursiveEquals(term202698, term202962));
        assertTrue(recursiveEquals(retValue, 1.1564823173537734E-19));
    }

};


