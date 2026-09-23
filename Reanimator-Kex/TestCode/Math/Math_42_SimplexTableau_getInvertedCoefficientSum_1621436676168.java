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

public class SimplexTableau_getInvertedCoefficientSum_1621436676168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91940;
     Object term94623;

    public SimplexTableau_getInvertedCoefficientSum_1621436676168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91940 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term89869 = (double[]) newDoubleArray(489);
        setField(term91940, term91940.getClass(), "data", term89869);
        term94623 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term94624 = (double[]) newDoubleArray(489);
        setField(term94623, term94623.getClass(), "data", term94624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = term91940;
        callMethod(klass, "getInvertedCoefficientSum", argTypes, null, args);
        assertTrue(recursiveEquals(term91940, term94623));
    }

};


