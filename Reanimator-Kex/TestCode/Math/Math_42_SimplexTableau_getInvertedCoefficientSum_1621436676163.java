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

public class SimplexTableau_getInvertedCoefficientSum_1621436676163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89543;
     Object term89864;

    public SimplexTableau_getInvertedCoefficientSum_1621436676163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89543 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term89434 = (double[]) newDoubleArray(0);
        setField(term89543, term89543.getClass(), "data", term89434);
        term89864 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term89865 = (double[]) newDoubleArray(0);
        setField(term89864, term89864.getClass(), "data", term89865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = term89543;
        Object retValue = callMethod(klass, "getInvertedCoefficientSum", argTypes, null, args);
        assertTrue(recursiveEquals(term89543, term89864));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


