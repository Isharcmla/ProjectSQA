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

public class EigenDecompositionImpl_findEigenVectors_908266317104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35797;

    public EigenDecompositionImpl_findEigenVectors_908266317104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35797 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term35604 = (double[]) newDoubleArray(1);
        Object[] term35607 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        double[] term35611 = (double[]) newDoubleArray(32);
        setField(term35797, term35797.getClass(), "main", term35604);
        setField(term35797, term35797.getClass(), "eigenvectors", term35607);
        setDoubleElement(term35611, 0, 2.9048217596539699E17);
        setField(term35797, term35797.getClass(), "realEigenvalues", term35611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term35797, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


