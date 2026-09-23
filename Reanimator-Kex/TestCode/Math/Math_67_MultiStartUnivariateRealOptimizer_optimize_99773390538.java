package org.apache.commons.math.optimization;

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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math.optimization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Double;

public class MultiStartUnivariateRealOptimizer_optimize_99773390538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term425;
     Object enum2;
     Object term453;
     Object term455;

    public MultiStartUnivariateRealOptimizer_optimize_99773390538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term425 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term431 = (double[]) newDoubleArray(3);
        double[] term435 = (double[]) newDoubleArray(5);
        setField(term425, term425.getClass(), "optimizer", null);
        setIntField(term425, term425.getClass(), "maxIterations", 1114000454);
        setIntField(term425, term425.getClass(), "maxEvaluations", -556405712);
        setIntField(term425, term425.getClass(), "totalIterations", -1772434990);
        setIntField(term425, term425.getClass(), "totalEvaluations", -1845499264);
        setIntField(term425, term425.getClass(), "starts", -505439934);
        setField(term425, term425.getClass(), "generator", null);
        setDoubleElement(term431, 0, 0.4355627280318103);
        setDoubleElement(term431, 1, 0.841460835734741);
        setDoubleElement(term431, 2, 0.7859316615744082);
        setField(term425, term425.getClass(), "optima", term431);
        setDoubleElement(term435, 0, 0.6428742553484879);
        setDoubleElement(term435, 1, 0.6584165706677267);
        setDoubleElement(term435, 2, 0.44268490778872205);
        setDoubleElement(term435, 3, 0.7507333108648018);
        setDoubleElement(term435, 4, 0.007493740494434409);
        setField(term425, term425.getClass(), "optimaValues", term435);
        Class<? extends Object> term3952 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term3951 = ((Class) term3952).getDeclaredField((String) "MAXIMIZE");
        ((Field) term3951).setAccessible(true);
        enum2 = ((Field) term3951).get((Object) null);
        term453 = new Double(0.29172553321356776);
        term455 = new Double(0.9276995636844321);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = enum2;
        args[2] = term453;
        args[3] = term455;
        try {
            callMethod(klass, "optimize", argTypes, term425, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


