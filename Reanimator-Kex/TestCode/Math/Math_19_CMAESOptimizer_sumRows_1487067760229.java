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
import java.lang.Object;

public class CMAESOptimizer_sumRows_1487067760229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107234;
     Object term114395;
     Object term114382;

    public CMAESOptimizer_sumRows_1487067760229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107234 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setIntField(term107234, term107234.getClass(), "columns", 1);
        term114395 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term114395, term114395.getClass(), "blocks", null);
        setIntField(term114395, term114395.getClass(), "rows", 0);
        setIntField(term114395, term114395.getClass(), "columns", 1);
        setIntField(term114395, term114395.getClass(), "blockRows", 0);
        setIntField(term114395, term114395.getClass(), "blockColumns", 0);
        term114382 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term114383 = (Object[]) newArray("[D", 1);
        double[] term114384 = (double[]) newDoubleArray(1);
        setElement(term114383, 0, term114384);
        setField(term114382, term114382.getClass(), "data", term114383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = term107234;
        Object retValue = callMethod(klass, "sumRows", argTypes, null, args);
        assertTrue(recursiveEquals(term107234, term114395));
        assertTrue(recursiveEquals(retValue, term114382));
    }

};


