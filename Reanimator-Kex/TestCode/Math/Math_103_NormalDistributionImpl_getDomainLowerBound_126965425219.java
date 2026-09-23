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

public class NormalDistributionImpl_getDomainLowerBound_126965425219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term980;
     Object term983;

    public NormalDistributionImpl_getDomainLowerBound_126965425219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term980 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        setDoubleField(term980, term980.getClass(), "mean", 0.0);
        setDoubleField(term980, term980.getClass(), "standardDeviation", 0.0);
        term983 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term983;
        callMethod(klass, "getDomainLowerBound", argTypes, term980, args);
    }

};


