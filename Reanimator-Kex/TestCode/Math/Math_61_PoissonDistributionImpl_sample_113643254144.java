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
import java.lang.Object;

public class PoissonDistributionImpl_sample_113643254144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10447;

    public PoissonDistributionImpl_sample_113643254144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10447 = newInstance(Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl"));
        Object term10543 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        Object term10641 = newInstance(Class.forName("org.apache.commons.math.random.MersenneTwister"));
        setField(term10543, term10543.getClass(), "rand", term10641);
        setField(term10447, term10447.getClass(), "randomData", term10543);
        setDoubleField(term10447, term10447.getClass(), "mean", 4.503599627370497E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.PoissonDistributionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sample", argTypes, term10447, args);
    }

};


