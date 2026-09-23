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

public class EigenDecompositionImpl_findEigenVectors_908266317192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1072128;

    public EigenDecompositionImpl_findEigenVectors_908266317192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1072128 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term1071654 = (double[]) newDoubleArray(3);
        Object[] term1071659 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        double[] term1071667 = (double[]) newDoubleArray(44);
        double[] term1071718 = (double[]) newDoubleArray(106);
        setField(term1072128, term1072128.getClass(), "main", term1071654);
        setField(term1072128, term1072128.getClass(), "eigenvectors", term1071659);
        setDoubleElement(term1071667, 2, 9.007199254740992E15);
        setField(term1072128, term1072128.getClass(), "realEigenvalues", term1071667);
        setField(term1072128, term1072128.getClass(), "secondary", term1071718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term1072128, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


