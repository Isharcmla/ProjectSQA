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
import java.lang.IndexOutOfBoundsException;
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class DiscreteDistribution_getSamples_78043274511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;

    public DiscreteDistribution_getSamples_78043274511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term76 = new ArrayList();
        term75 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        double[] term80 = (double[]) newDoubleArray(2);
        setField(term75, term75.getClass(), "random", null);
        setField(term75, term75.getClass(), "singletons", term76);
        setDoubleElement(term80, 0, 0.28570734989730284);
        setDoubleElement(term80, 1, 0.40176586625454525);
        setField(term75, term75.getClass(), "probabilities", term80);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSamples", argTypes, term75, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


