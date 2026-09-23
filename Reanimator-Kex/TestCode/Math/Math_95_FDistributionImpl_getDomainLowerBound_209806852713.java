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

public class FDistributionImpl_getDomainLowerBound_209806852713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;
     Object term18;
     Object term720;

    public FDistributionImpl_getDomainLowerBound_209806852713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = newInstance(Class.forName("org.apache.commons.math.distribution.FDistributionImpl"));
        setDoubleField(term15, term15.getClass(), "numeratorDegreesOfFreedom", 0.6076495596892013);
        setDoubleField(term15, term15.getClass(), "denominatorDegreesOfFreedom", 0.37773193782763337);
        term18 = new Double(0.8474802076607362);
        term720 = newInstance(Class.forName("org.apache.commons.math.distribution.FDistributionImpl"));
        setDoubleField(term720, term720.getClass(), "numeratorDegreesOfFreedom", 0.6076495596892013);
        setDoubleField(term720, term720.getClass(), "denominatorDegreesOfFreedom", 0.37773193782763337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.FDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term18;
        Object retValue = callMethod(klass, "getDomainLowerBound", argTypes, term15, args);
        assertTrue(recursiveEquals(term15, term720));
        assertTrue(recursiveEquals(term18, 0.8474802076607362));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


