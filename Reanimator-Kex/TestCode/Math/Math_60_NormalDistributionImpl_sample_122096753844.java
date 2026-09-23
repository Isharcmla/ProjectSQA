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

public class NormalDistributionImpl_sample_122096753844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6413;

    public NormalDistributionImpl_sample_122096753844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6413 = newInstance(Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl"));
        Object term6509 = newInstance(Class.forName("org.apache.commons.math.random.RandomDataImpl"));
        Object term6603 = newInstance(Class.forName("org.apache.commons.math.random.RandomAdaptor"));
        setField(term6509, term6509.getClass(), "rand", term6603);
        setField(term6413, term6413.getClass(), "randomData", term6509);
        setDoubleField(term6413, term6413.getClass(), "mean", 0.0);
        setDoubleField(term6413, term6413.getClass(), "standardDeviation", 4.503599627370497E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.distribution.NormalDistributionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "sample", argTypes, term6413, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


