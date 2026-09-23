package org.apache.commons.math.optimization.univariate;

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
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiStartUnivariateRealOptimizer_getConvergenceChecker_181730281828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4834;

    public MultiStartUnivariateRealOptimizer_getConvergenceChecker_181730281828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4834 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object term5002 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        setField(term4834, term4834.getClass(), "optimizer", term5002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getConvergenceChecker", argTypes, term4834, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


