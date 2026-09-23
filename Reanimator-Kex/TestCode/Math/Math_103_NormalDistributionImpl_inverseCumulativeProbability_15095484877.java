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
import java.lang.Double;

public class NormalDistributionImpl_inverseCumulativeProbability_15095484877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;
     Object term29;

    public NormalDistributionImpl_inverseCumulativeProbability_15095484877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setDoubleField(term26, term26.getClass(), "mean", 0.8474802076607362);
        setDoubleField(term26, term26.getClass(), "standardDeviation", 1.0);
        term29 = new Double(0.5183269973490326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term29;
        callMethod(klass, "inverseCumulativeProbability", argTypes, term26, args);
    }

};


