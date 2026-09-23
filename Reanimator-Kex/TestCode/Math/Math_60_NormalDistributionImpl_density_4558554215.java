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
import java.lang.Object;
import java.lang.Double;

public class NormalDistributionImpl_density_4558554215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term29;

    public NormalDistributionImpl_density_4558554215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term27 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        setDoubleField(term23, term23.getClass(), "mean", 0.36923381893433327);
        setDoubleField(term23, term23.getClass(), "standardDeviation", 1.0);
        setDoubleField(term23, term23.getClass(), "solverAbsoluteAccuracy", 1.0E-6);
        setField(term27, term27.getClass(), "rand", null);
        setField(term27, term27.getClass(), "secRand", null);
        setField(term23, term23.getClass(), "randomData", term27);
        term29 = new Double(0.6076495596892013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term29;
        callMethod(klass, "density", argTypes, term23, args);
    }

};


