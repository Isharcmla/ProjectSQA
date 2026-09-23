package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.EqualityUtils.*;

public class CMAESOptimizer_copyColumn_182513139190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15637;
     Object term18063;

    public CMAESOptimizer_copyColumn_182513139190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15637 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        term18063 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term18063, term18063.getClass(), "blocks", null);
        setIntField(term18063, term18063.getClass(), "rows", 0);
        setIntField(term18063, term18063.getClass(), "columns", 0);
        setIntField(term18063, term18063.getClass(), "blockRows", 0);
        setIntField(term18063, term18063.getClass(), "blockColumns", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term15637;
        args[1] = 0;
        args[2] = null;
        args[3] = 0;
        callMethod(klass, "copyColumn", argTypes, null, args);
        assertTrue(recursiveEquals(term15637, term18063));
    }

};


