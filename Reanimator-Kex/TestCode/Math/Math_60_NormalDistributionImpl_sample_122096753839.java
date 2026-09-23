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

public class NormalDistributionImpl_sample_122096753839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5462;

    public NormalDistributionImpl_sample_122096753839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5462 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term5558 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        Object term5646 = newInstance(Class.forName("org.apache.commons.math.random.Well44497a"));
        setField(term5558, term5558.getClass(), "rand", term5646);
        setField(term5462, term5462.getClass(), "randomData", term5558);
        setDoubleField(term5462, term5462.getClass(), "mean", 0.0);
        setDoubleField(term5462, term5462.getClass(), "standardDeviation", 4.503599627370497E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sample", argTypes, term5462, args);
    }

};


