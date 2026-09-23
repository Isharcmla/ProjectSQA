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

public class FDistributionImpl_setDenominatorDegreesOfFreedom_135905146518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38;
     Object term41;
     Object term1010;

    public FDistributionImpl_setDenominatorDegreesOfFreedom_135905146518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38 = newInstance(Class.forName("org.apache.commons.math.distribution.FDistributionImpl"));
        setDoubleField(term38, term38.getClass(), "numeratorDegreesOfFreedom", 0.43692187681405226);
        setDoubleField(term38, term38.getClass(), "denominatorDegreesOfFreedom", 0.7633268466829064);
        term41 = new Double(0.13481025392611334);
        term1010 = newInstance(Class.forName("org.apache.commons.math.distribution.FDistributionImpl"));
        setDoubleField(term1010, term1010.getClass(), "numeratorDegreesOfFreedom", 0.43692187681405226);
        setDoubleField(term1010, term1010.getClass(), "denominatorDegreesOfFreedom", 0.13481025392611334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.FDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term41;
        callMethod(klass, "setDenominatorDegreesOfFreedom", argTypes, term38, args);
        assertTrue(recursiveEquals(term38, term1010));
        assertTrue(recursiveEquals(term41, 0.13481025392611334));
    }

};


