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
import java.lang.Object;
import java.lang.Double;

public class NormalDistributionImpl_getDomainLowerBound_126965425223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term65;
     Object term2525;

    public NormalDistributionImpl_getDomainLowerBound_126965425223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term63 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        setDoubleField(term59, term59.getClass(), "mean", 0.9527281779865117);
        setDoubleField(term59, term59.getClass(), "standardDeviation", 1.0);
        setDoubleField(term59, term59.getClass(), "solverAbsoluteAccuracy", 1.0E-6);
        setField(term63, term63.getClass(), "rand", null);
        setField(term63, term63.getClass(), "secRand", null);
        setField(term59, term59.getClass(), "randomData", term63);
        term65 = new Double(0.9828442029246764);
        term2525 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term2526 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        setDoubleField(term2525, term2525.getClass(), "mean", 0.9527281779865117);
        setDoubleField(term2525, term2525.getClass(), "standardDeviation", 1.0);
        setDoubleField(term2525, term2525.getClass(), "solverAbsoluteAccuracy", 0.0);
        setField(term2526, term2526.getClass(), "rand", null);
        setField(term2526, term2526.getClass(), "secRand", null);
        setField(term2525, term2525.getClass(), "randomData", term2526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term65;
        Object retValue = callMethod(klass, "getDomainLowerBound", argTypes, term59, args);
        assertTrue(recursiveEquals(term59, term2525));
        assertTrue(recursiveEquals(term65, 0.9828442029246764));
        assertTrue(recursiveEquals(retValue, 0.9527281779865117));
    }

};


