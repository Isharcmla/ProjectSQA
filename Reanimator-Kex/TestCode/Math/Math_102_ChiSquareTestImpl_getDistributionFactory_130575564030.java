package org.apache.commons.math.stat.inference;

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
import static org.apache.commons.math.stat.inference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.inference.EqualityUtils.*;
import java.lang.Object;

public class ChiSquareTestImpl_getDistributionFactory_130575564030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278;
     Object term3567;
     Object term3561;

    public ChiSquareTestImpl_getDistributionFactory_130575564030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term279 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term280 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term280, term280.getClass(), "alpha", 0.5);
        setDoubleField(term280, term280.getClass(), "beta", 2.0);
        setField(term279, term279.getClass(), "gamma", term280);
        setField(term278, term278.getClass(), "distribution", term279);
        term3567 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term3568 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term3569 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term3569, term3569.getClass(), "alpha", 0.5);
        setDoubleField(term3569, term3569.getClass(), "beta", 2.0);
        setField(term3568, term3568.getClass(), "gamma", term3569);
        setField(term3567, term3567.getClass(), "distribution", term3568);
        term3561 = newInstance(Class.forName("org.apache.commons.math.distribution.DistributionFactoryImpl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDistributionFactory", argTypes, term278, args);
        assertTrue(recursiveEquals(term278, term3567));
        assertTrue(recursiveEquals(retValue, term3561));
    }

};


