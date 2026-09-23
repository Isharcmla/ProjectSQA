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
import static org.apache.commons.math.stat.correlation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PearsonsCorrelation_init_1288623535110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1099629;

    public PearsonsCorrelation_init_1288623535110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1099521 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        setIntField(term1099521, term1099521.getClass(), "nObs", 0);
        term1099629 = newInstance(Class.forName("org.apache.commons.math.stat.correlation.Covariance"));
        Object term1099727 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term1099629, term1099629.getClass(), "covarianceMatrix", term1099727);
        setIntField(term1099629, term1099629.getClass(), "n", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.correlation.Covariance");
        Object[] args = new Object[1];
        args[0] = term1099629;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


