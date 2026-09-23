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

public class EigenDecompositionImpl_findEigenVectors_908266317121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41004;

    public EigenDecompositionImpl_findEigenVectors_908266317121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41004 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term40576 = (double[]) newDoubleArray(2);
        Object[] term40580 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        double[] term40586 = (double[]) newDoubleArray(2);
        double[] term40594 = (double[]) newDoubleArray(236);
        setField(term41004, term41004.getClass(), "main", term40576);
        setField(term41004, term41004.getClass(), "eigenvectors", term40580);
        setDoubleElement(term40586, 1, 1.9140298416324608E16);
        setField(term41004, term41004.getClass(), "realEigenvalues", term40586);
        setField(term41004, term41004.getClass(), "secondary", term40594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term41004, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


