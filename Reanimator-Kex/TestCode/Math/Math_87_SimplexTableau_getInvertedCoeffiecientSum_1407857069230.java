package org.apache.commons.math.optimization.linear;

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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.linear.EqualityUtils.*;

public class SimplexTableau_getInvertedCoeffiecientSum_1407857069230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155265;
     Object term161131;

    public SimplexTableau_getInvertedCoeffiecientSum_1407857069230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155265 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        double[] term150367 = (double[]) newDoubleArray(489);
        setField(term155265, term155265.getClass(), "data", term150367);
        term161131 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        double[] term161132 = (double[]) newDoubleArray(489);
        setField(term161131, term161131.getClass(), "data", term161132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = term155265;
        callMethod(klass, "getInvertedCoeffiecientSum", argTypes, null, args);
        assertTrue(recursiveEquals(term155265, term161131));
    }

};


