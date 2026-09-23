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

public class EigenDecompositionImpl_findEigenVectors_908266317211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1139183;

    public EigenDecompositionImpl_findEigenVectors_908266317211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1139183 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term1134348 = (double[]) newDoubleArray(256);
        Object[] term1134606 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        double[] term1135120 = (double[]) newDoubleArray(398);
        double[] term1135778 = (double[]) newDoubleArray(44);
        setField(term1139183, term1139183.getClass(), "main", term1134348);
        setField(term1139183, term1139183.getClass(), "eigenvectors", term1134606);
        setDoubleElement(term1135120, 255, 2.3058430178036285E18);
        setField(term1139183, term1139183.getClass(), "realEigenvalues", term1135120);
        setField(term1139183, term1139183.getClass(), "secondary", term1135778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term1139183, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


