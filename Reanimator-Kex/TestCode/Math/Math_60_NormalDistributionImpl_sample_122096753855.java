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
import java.lang.Object;

public class NormalDistributionImpl_sample_122096753855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10415;

    public NormalDistributionImpl_sample_122096753855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10415 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term10511 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        Object term10605 = newInstance(Class.forName("org.apache.commons.math.random.RandomAdaptor"));
        setField(term10605, term10605.getClass(), "randomGenerator", term10605);
        setField(term10511, term10511.getClass(), "rand", term10605);
        setField(term10415, term10415.getClass(), "randomData", term10511);
        setDoubleField(term10415, term10415.getClass(), "mean", 0.0);
        setDoubleField(term10415, term10415.getClass(), "standardDeviation", 4.503599627370497E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sample", argTypes, term10415, args);
    }

};


