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
import java.lang.Object;

public class DiscreteDistribution_sample_43215751588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52497;

    public DiscreteDistribution_sample_43215751588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52497 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Object term52589 = newInstance(Class.forName("org.apache.commons.math3.random.ISAACRandom"));
        int[] term51308 = (int[]) newIntArray(512);
        int[] term51826 = (int[]) newIntArray(512);
        setIntField(term52589, term52589.getClass(), "count", 0);
        setField(term52589, term52589.getClass(), "rsl", term51308);
        setIntField(term52589, term52589.getClass(), "isaacI", 0);
        setIntField(term52589, term52589.getClass(), "isaacJ", 0);
        setIntField(term52589, term52589.getClass(), "isaacB", 0);
        setIntField(term52589, term52589.getClass(), "isaacC", 0);
        setField(term52589, term52589.getClass(), "mem", term51826);
        setField(term52497, term52497.getClass(), "random", term52589);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sample", argTypes, term52497, args);
    }

};


