package org.apache.commons.math3.distribution;

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
import java.lang.NullPointerException;
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DiscreteDistribution_reseedRandomGenerator_204088393097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58186;

    public DiscreteDistribution_reseedRandomGenerator_204088393097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58186 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        Object term58282 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term58378 = newInstance(Class.forName("org.apache.commons.math3.random.RandomAdaptor"));
        Object term58484 = newInstance(Class.forName("org.apache.commons.math3.random.JDKRandomGenerator"));
        setField(term58378, term58378.getClass(), "randomGenerator", term58484);
        setField(term58282, term58282.getClass(), "randomGenerator", term58378);
        setField(term58186, term58186.getClass(), "random", term58282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        try {
            callMethod(klass, "reseedRandomGenerator", argTypes, term58186, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


