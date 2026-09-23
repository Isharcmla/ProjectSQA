package org.apache.commons.math.distribution;

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
import static org.apache.commons.math.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.distribution.EqualityUtils.*;
import java.lang.Double;

public class NormalDistributionImpl_density_45585542158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12239;
     Object term12254;

    public NormalDistributionImpl_density_45585542158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12239 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setDoubleField(term12239, term12239.getClass(), "mean", 9.2188684372274053E18);
        setDoubleField(term12239, term12239.getClass(), "standardDeviation", 2.256197860196353E15);
        term12254 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setDoubleField(term12254, term12254.getClass(), "mean", 9.2188684372274053E18);
        setDoubleField(term12254, term12254.getClass(), "standardDeviation", 2.256197860196353E15);
        setDoubleField(term12254, term12254.getClass(), "solverAbsoluteAccuracy", 0.0);
        setField(term12254, term12254.getClass(), "randomData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = Double.NEGATIVE_INFINITY;
        Object retValue = callMethod(klass, "density", argTypes, term12239, args);
        assertTrue(recursiveEquals(term12239, term12254));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


