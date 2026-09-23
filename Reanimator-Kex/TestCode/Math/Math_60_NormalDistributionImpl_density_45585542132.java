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

public class NormalDistributionImpl_density_45585542132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3355;
     Object term3370;

    public NormalDistributionImpl_density_45585542132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3355 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setDoubleField(term3355, term3355.getClass(), "mean", -2.3103466088410644E18);
        setDoubleField(term3355, term3355.getClass(), "standardDeviation", -4.503599627370496E15);
        term3370 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setDoubleField(term3370, term3370.getClass(), "mean", -2.3103466088410644E18);
        setDoubleField(term3370, term3370.getClass(), "standardDeviation", -4.503599627370496E15);
        setDoubleField(term3370, term3370.getClass(), "solverAbsoluteAccuracy", 0.0);
        setField(term3370, term3370.getClass(), "randomData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = Double.NEGATIVE_INFINITY;
        Object retValue = callMethod(klass, "density", argTypes, term3355, args);
        assertTrue(recursiveEquals(term3355, term3370));
        assertTrue(recursiveEquals(retValue, -0.0));
    }

};


