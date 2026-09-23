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
import org.apache.commons.math3.exception.NoDataException;
import static org.apache.commons.math3.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CMAESOptimizer_updateCovariance_130250242112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62044;
     Object term62154;

    public CMAESOptimizer_updateCovariance_130250242112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62044 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setDoubleField(term62044, term62044.getClass(), "ccov1", 4.6432112158525686E18);
        setDoubleField(term62044, term62044.getClass(), "ccovmu", -4.6161896179876495E18);
        setIntField(term62044, term62044.getClass(), "mu", 0);
        term62154 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[2] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[3] = Array.newInstance(int.class, 0).getClass();
        argTypes[4] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[5];
        args[0] = false;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term62154;
        try {
            callMethod(klass, "updateCovariance", argTypes, term62044, args);
            assertTrue(false);
        }
        catch (NoDataException e) {
        }

    }

};


