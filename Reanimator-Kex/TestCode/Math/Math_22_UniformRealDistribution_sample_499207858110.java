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

public class UniformRealDistribution_sample_499207858110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286663;

    public UniformRealDistribution_sample_499207858110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286663 = newInstance(Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution"));
        Object term286763 = newInstance(Class.forName("org.apache.commons.math3.random.MersenneTwister"));
        int[] term285855 = (int[]) newIntArray(640);
        setIntField(term286763, term286763.getClass(), "mti", 623);
        setField(term286763, term286763.getClass(), "mt", term285855);
        setField(term286663, term286663.getClass(), "random", term286763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.UniformRealDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sample", argTypes, term286663, args);
    }

};


