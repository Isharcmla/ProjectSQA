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

public class EigenDecompositionImpl_findEigenVectors_908266317190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1070739;

    public EigenDecompositionImpl_findEigenVectors_908266317190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1070739 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term1069701 = (double[]) newDoubleArray(128);
        double[] term1070088 = (double[]) newDoubleArray(178);
        double[] term1070577 = (double[]) newDoubleArray(4);
        setField(term1070739, term1070739.getClass(), "main", term1069701);
        setField(term1070739, term1070739.getClass(), "eigenvectors", null);
        setField(term1070739, term1070739.getClass(), "realEigenvalues", term1070088);
        setField(term1070739, term1070739.getClass(), "secondary", term1070577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term1070739, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


