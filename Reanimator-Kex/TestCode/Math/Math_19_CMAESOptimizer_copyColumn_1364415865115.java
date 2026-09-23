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
import static org.apache.commons.math3.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.direct.EqualityUtils.*;

public class CMAESOptimizer_copyColumn_1364415865115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65152;
     Object term65159;

    public CMAESOptimizer_copyColumn_1364415865115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65152 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        term65159 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(term65159, term65159.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term65152;
        args[1] = 0;
        args[2] = null;
        args[3] = 0;
        callMethod(klass, "copyColumn", argTypes, null, args);
        assertTrue(recursiveEquals(term65152, term65159));
    }

};


