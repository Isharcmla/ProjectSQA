package org.apache.commons.math3.stat.inference;

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
import org.apache.commons.math3.exception.NoDataException;
import static org.apache.commons.math3.stat.inference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MannWhitneyUTest_ensureDataConformance_171759561119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11274;
     Object term11142;

    public MannWhitneyUTest_ensureDataConformance_171759561119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11274 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        term11142 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term11142;
        args[1] = term11142;
        try {
            callMethod(klass, "ensureDataConformance", argTypes, term11274, args);
            assertTrue(false);
        }
        catch (NoDataException e) {
        }

    }

};


