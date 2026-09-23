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

public class NormalDistributionImpl_sample_122096753853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9707;

    public NormalDistributionImpl_sample_122096753853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9707 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term9803 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        Object term9887 = newInstance(Class.forName("org.apache.commons.math.random.Well512a"));
        setField(term9803, term9803.getClass(), "rand", term9887);
        setField(term9707, term9707.getClass(), "randomData", term9803);
        setDoubleField(term9707, term9707.getClass(), "mean", 0.0);
        setDoubleField(term9707, term9707.getClass(), "standardDeviation", 4.503599627370497E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sample", argTypes, term9707, args);
    }

};


