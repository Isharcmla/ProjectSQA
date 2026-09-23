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

public class FDistributionImpl_inverseCumulativeProbability_195700453427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2746;

    public FDistributionImpl_inverseCumulativeProbability_195700453427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2746 = newInstance(Class.forName("org.apache.commons.math.distribution.FDistributionImpl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.FDistributionImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 1.0;
        callMethod(klass, "inverseCumulativeProbability", argTypes, term2746, args);
    }

};


