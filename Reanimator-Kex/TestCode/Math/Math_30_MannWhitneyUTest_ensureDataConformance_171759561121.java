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

public class MannWhitneyUTest_ensureDataConformance_171759561121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13841;
     Object term13695;
     Object term13704;

    public MannWhitneyUTest_ensureDataConformance_171759561121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13841 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        term13695 = (double[]) newDoubleArray(8);
        term13704 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term13695;
        args[1] = term13704;
        try {
            callMethod(klass, "ensureDataConformance", argTypes, term13841, args);
            assertTrue(false);
        }
        catch (NoDataException e) {
        }

    }

};


