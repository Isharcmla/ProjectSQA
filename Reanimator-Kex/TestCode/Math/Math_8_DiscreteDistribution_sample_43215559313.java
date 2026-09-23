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
import java.lang.Integer;

public class DiscreteDistribution_sample_43215559313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105;
     Object term117;

    public DiscreteDistribution_sample_43215559313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term106 = new ArrayList();
        term105 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        double[] term110 = (double[]) newDoubleArray(6);
        setField(term105, term105.getClass(), "random", null);
        setField(term105, term105.getClass(), "singletons", term106);
        setDoubleElement(term110, 0, 0.1374549299694151);
        setDoubleElement(term110, 1, 0.7031006357544823);
        setDoubleElement(term110, 2, 0.9527281779865117);
        setDoubleElement(term110, 3, 0.9828442029246764);
        setDoubleElement(term110, 4, 0.2779719046761513);
        setDoubleElement(term110, 5, 0.6436713023569729);
        setField(term105, term105.getClass(), "probabilities", term110);
        term117 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term117;
        try {
            callMethod(klass, "sample", argTypes, term105, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


