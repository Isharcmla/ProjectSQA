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
import java.lang.Double;

public class FDistributionImpl_inverseCumulativeProbability_195700453412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10;
     Object term13;

    public FDistributionImpl_inverseCumulativeProbability_195700453412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10 = newInstance(Class.forName("org.apache.commons.math.distribution.FDistributionImpl"));
        setDoubleField(term10, term10.getClass(), "numeratorDegreesOfFreedom", 0.40176586625454525);
        setDoubleField(term10, term10.getClass(), "denominatorDegreesOfFreedom", 0.2641345529914265);
        term13 = new Double(0.36923381893433327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.FDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term13;
        try {
            callMethod(klass, "inverseCumulativeProbability", argTypes, term10, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


