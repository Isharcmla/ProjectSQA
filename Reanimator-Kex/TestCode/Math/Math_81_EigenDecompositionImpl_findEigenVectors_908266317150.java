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

public class EigenDecompositionImpl_findEigenVectors_908266317150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115521;

    public EigenDecompositionImpl_findEigenVectors_908266317150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115521 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term114885 = (double[]) newDoubleArray(5);
        Object[] term114892 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        double[] term114904 = (double[]) newDoubleArray(260);
        double[] term115173 = (double[]) newDoubleArray(24);
        setField(term115521, term115521.getClass(), "main", term114885);
        setField(term115521, term115521.getClass(), "eigenvectors", term114892);
        setDoubleElement(term114904, 4, 1.15292150460691251E18);
        setField(term115521, term115521.getClass(), "realEigenvalues", term114904);
        setField(term115521, term115521.getClass(), "secondary", term115173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term115521, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


