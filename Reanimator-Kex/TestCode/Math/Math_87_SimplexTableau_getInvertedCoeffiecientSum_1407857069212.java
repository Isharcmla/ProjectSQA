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

public class SimplexTableau_getInvertedCoeffiecientSum_1407857069212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121727;
     Object term121733;

    public SimplexTableau_getInvertedCoeffiecientSum_1407857069212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121727 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        double[] term121620 = (double[]) newDoubleArray(0);
        setField(term121727, term121727.getClass(), "data", term121620);
        term121733 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        double[] term121734 = (double[]) newDoubleArray(0);
        setField(term121733, term121733.getClass(), "data", term121734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = term121727;
        Object retValue = callMethod(klass, "getInvertedCoeffiecientSum", argTypes, null, args);
        assertTrue(recursiveEquals(term121727, term121733));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


