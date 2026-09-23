package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

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
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GaussNewtonOptimizer_doOptimize_158447067172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236030;

    public GaussNewtonOptimizer_doOptimize_158447067172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236030 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Object term236134 = newInstance(Class.forName("org.apache.commons.math3.optim.SimplePointChecker"));
        double[] term230631 = (double[]) newDoubleArray(488);
        Object term236232 = newInstance(Class.forName("org.apache.commons.math3.linear.DiagonalMatrix"));
        setField(term236030, term236030.getClass(), "lowerBound", null);
        setField(term236030, term236030.getClass(), "upperBound", null);
        setField(term236030, term236030.getClass(), "checker", term236134);
        setField(term236030, term236030.getClass(), "target", term230631);
        setField(term236232, term236232.getClass(), "data", term230631);
        setField(term236030, term236030.getClass(), "weightMatrix", term236232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term236030, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


