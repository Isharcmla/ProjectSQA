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
import java.util.ArrayList;
import java.lang.Long;

public class DiscreteDistribution_reseedRandomGenerator_20408839309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52;
     Object term61;

    public DiscreteDistribution_reseedRandomGenerator_20408839309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term53 = new ArrayList();
        term52 = newInstance(Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution"));
        double[] term57 = (double[]) newDoubleArray(3);
        setField(term52, term52.getClass(), "random", null);
        setField(term52, term52.getClass(), "singletons", term53);
        setDoubleElement(term57, 0, 0.13238746331190498);
        setDoubleElement(term57, 1, 0.3455959125047594);
        setDoubleElement(term57, 2, 0.5523635872663106);
        setField(term52, term52.getClass(), "probabilities", term57);
        term61 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.DiscreteDistribution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term61;
        try {
            callMethod(klass, "reseedRandomGenerator", argTypes, term52, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


