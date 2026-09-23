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
import java.lang.StackOverflowError;
import static org.apache.commons.math.optimization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MultiStartUnivariateRealOptimizer_resetAbsoluteAccuracy_984896252166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35071;

    public MultiStartUnivariateRealOptimizer_resetAbsoluteAccuracy_984896252166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35071 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term35217 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        Object term35363 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(term35363, term35363.getClass(), "optimizer", term35363);
        setField(term35217, term35217.getClass(), "optimizer", term35363);
        setField(term35071, term35071.getClass(), "optimizer", term35217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "resetAbsoluteAccuracy", argTypes, term35071, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


