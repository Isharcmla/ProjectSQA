package org.apache.commons.math3.optimization.direct;

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
import static org.apache.commons.math3.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CMAESOptimizer_updateCovarianceDiagonalOnly_1698871943140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86738;

    public CMAESOptimizer_updateCovarianceDiagonalOnly_1698871943140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86738 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Object term86838 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setDoubleField(term86738, term86738.getClass(), "ccov1Sep", 0.0);
        setDoubleField(term86738, term86738.getClass(), "cc", 0.0);
        setDoubleField(term86738, term86738.getClass(), "ccovmuSep", 0.0);
        setField(term86738, term86738.getClass(), "diagC", term86838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[2] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[3];
        args[0] = false;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "updateCovarianceDiagonalOnly", argTypes, term86738, args);
            assertTrue(false);
        }
        catch (NotStrictlyPositiveException e) {
        }

    }

};


