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
import java.lang.NullPointerException;
import static org.apache.commons.math.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NormalDistributionImpl_sample_122096753850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8500;

    public NormalDistributionImpl_sample_122096753850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8500 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term8596 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        Object term8700 = newInstance(Class.forName("org.apache.commons.math.random.JDKRandomGenerator"));
        setField(term8596, term8596.getClass(), "rand", term8700);
        setField(term8500, term8500.getClass(), "randomData", term8596);
        setDoubleField(term8500, term8500.getClass(), "mean", 0.0);
        setDoubleField(term8500, term8500.getClass(), "standardDeviation", 4.503599627370497E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term8500, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


