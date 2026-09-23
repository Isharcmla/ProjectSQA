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
import java.lang.NullPointerException;
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class DiscreteDistribution_sample_43215751512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;

    public DiscreteDistribution_sample_43215751512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term86 = new ArrayList();
        term85 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        double[] term90 = (double[]) newDoubleArray(7);
        setField(term85, term85.getClass(), "random", null);
        setField(term85, term85.getClass(), "singletons", term86);
        setDoubleElement(term90, 0, 0.2641345529914265);
        setDoubleElement(term90, 1, 0.36923381893433327);
        setDoubleElement(term90, 2, 0.6076495596892013);
        setDoubleElement(term90, 3, 0.37773193782763337);
        setDoubleElement(term90, 4, 0.8474802076607362);
        setDoubleElement(term90, 5, 0.5183269973490326);
        setDoubleElement(term90, 6, 0.7655020693602768);
        setField(term85, term85.getClass(), "probabilities", term90);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term85, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


