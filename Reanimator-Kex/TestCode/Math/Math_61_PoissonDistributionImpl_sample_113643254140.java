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
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import static org.apache.commons.math.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PoissonDistributionImpl_sample_113643254140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8570;

    public PoissonDistributionImpl_sample_113643254140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8570 = newInstance(Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        Object term8666 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        setField(term8570, term8570.getClass(), "randomData", term8666);
        setDoubleField(term8570, term8570.getClass(), "mean", -9.2188684372274053E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term8570, args);
            assertTrue(false);
        }
        catch (NotStrictlyPositiveException e) {
        }

    }

};


