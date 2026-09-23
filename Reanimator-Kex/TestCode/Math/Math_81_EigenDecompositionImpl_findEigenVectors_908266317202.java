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

public class EigenDecompositionImpl_findEigenVectors_908266317202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term986804;

    public EigenDecompositionImpl_findEigenVectors_908266317202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term986804 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term985744 = (double[]) newDoubleArray(32);
        Object[] term985778 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        double[] term985844 = (double[]) newDoubleArray(252);
        double[] term986638 = (double[]) newDoubleArray(2);
        setField(term986804, term986804.getClass(), "main", term985744);
        setField(term986804, term986804.getClass(), "eigenvectors", term985778);
        setDoubleElement(term985844, 0, 1.7179869184E10);
        setField(term986804, term986804.getClass(), "realEigenvalues", term985844);
        setField(term986804, term986804.getClass(), "secondary", term986638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term986804, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


