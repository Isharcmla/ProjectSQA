package org.apache.commons.math.optimization;

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
import static org.apache.commons.math.optimization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiStartUnivariateRealOptimizer_resetAbsoluteAccuracy_98489625245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5486;

    public MultiStartUnivariateRealOptimizer_resetAbsoluteAccuracy_98489625245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5486 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term5632 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(term5486, term5486.getClass(), "optimizer", term5632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "resetAbsoluteAccuracy", argTypes, term5486, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


