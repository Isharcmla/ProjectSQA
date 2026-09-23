package org.apache.commons.math.linear;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EigenDecompositionImpl_countEigenValues_965631374132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49917;

    public EigenDecompositionImpl_countEigenValues_965631374132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49917 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term49793 = (double[]) newDoubleArray(0);
        setField(term49917, term49917.getClass(), "main", term49793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = 0.0;
        args[1] = -1;
        args[2] = 0;
        try {
            callMethod(klass, "countEigenValues", argTypes, term49917, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


