package org.apache.commons.math.stat.correlation;

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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.stat.correlation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PearsonsCorrelation_init_1288623535135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1118751;

    public PearsonsCorrelation_init_1288623535135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1118643 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        setIntField(term1118643, term1118643.getClass(), "nObs", 0);
        term1118751 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.Covariance"));
        Object term1118853 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term1118853, term1118853.getClass(), "columns", 1);
        setField(term1118751, term1118751.getClass(), "covarianceMatrix", term1118853);
        setIntField(term1118751, term1118751.getClass(), "n", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.correlation.Covariance");
        Object[] args = new Object[1];
        args[0] = term1118751;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


