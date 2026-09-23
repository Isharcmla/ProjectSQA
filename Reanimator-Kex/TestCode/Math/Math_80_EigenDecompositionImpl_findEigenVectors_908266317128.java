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
import java.lang.Object;

public class EigenDecompositionImpl_findEigenVectors_908266317128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46896;

    public EigenDecompositionImpl_findEigenVectors_908266317128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46896 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term46345 = (double[]) newDoubleArray(12);
        Object[] term46359 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        double[] term46385 = (double[]) newDoubleArray(244);
        double[] term46645 = (double[]) newDoubleArray(10);
        setField(term46896, term46896.getClass(), "main", term46345);
        setField(term46896, term46896.getClass(), "eigenvectors", term46359);
        setDoubleElement(term46385, 11, 2.8823044487118848E17);
        setField(term46896, term46896.getClass(), "realEigenvalues", term46385);
        setField(term46896, term46896.getClass(), "secondary", term46645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term46896, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


