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

public class EigenDecompositionImpl_findEigenVectors_908266317136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48465;

    public EigenDecompositionImpl_findEigenVectors_908266317136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48465 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term48264 = (double[]) newDoubleArray(9);
        Object[] term48275 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        double[] term48295 = (double[]) newDoubleArray(9);
        setField(term48465, term48465.getClass(), "main", term48264);
        setField(term48465, term48465.getClass(), "eigenvectors", term48275);
        setDoubleElement(term48295, 0, 3.60287970525184E16);
        setDoubleElement(term48295, 8, -4.6116860184273874E18);
        setField(term48465, term48465.getClass(), "realEigenvalues", term48295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term48465, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


