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
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultivariateNormalDistribution_getCovariances_60735650734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172317;

    public MultivariateNormalDistribution_getCovariances_60735650734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172317 = newInstance(Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        Object term172417 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setIntField(term172417, term172417.getClass(), "rows", 1);
        setIntField(term172417, term172417.getClass(), "columns", 0);
        setField(term172317, term172317.getClass(), "covarianceMatrix", term172417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getCovariances", argTypes, term172317, args);
            assertTrue(false);
        }
        catch (NotStrictlyPositiveException e) {
        }

    }

};


