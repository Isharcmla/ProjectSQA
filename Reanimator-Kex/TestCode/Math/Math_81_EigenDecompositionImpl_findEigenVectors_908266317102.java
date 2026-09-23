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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class EigenDecompositionImpl_findEigenVectors_908266317102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34868;

    public EigenDecompositionImpl_findEigenVectors_908266317102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34868 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term34440 = (double[]) newDoubleArray(2);
        Object[] term34444 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        double[] term34450 = (double[]) newDoubleArray(2);
        double[] term34458 = (double[]) newDoubleArray(236);
        setField(term34868, term34868.getClass(), "main", term34440);
        setField(term34868, term34868.getClass(), "eigenvectors", term34444);
        setDoubleElement(term34450, 1, 1.9140298416324608E16);
        setField(term34868, term34868.getClass(), "realEigenvalues", term34450);
        setField(term34868, term34868.getClass(), "secondary", term34458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term34868, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


