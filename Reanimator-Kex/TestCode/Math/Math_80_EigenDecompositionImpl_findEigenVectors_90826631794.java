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

public class EigenDecompositionImpl_findEigenVectors_90826631794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26552;

    public EigenDecompositionImpl_findEigenVectors_90826631794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26552 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term26301 = (double[]) newDoubleArray(6);
        Object[] term26309 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        double[] term26323 = (double[]) newDoubleArray(34);
        double[] term26367 = (double[]) newDoubleArray(2);
        setField(term26552, term26552.getClass(), "main", term26301);
        setField(term26552, term26552.getClass(), "eigenvectors", term26309);
        setDoubleElement(term26323, 5, 4.6116860184273879E18);
        setField(term26552, term26552.getClass(), "realEigenvalues", term26323);
        setField(term26552, term26552.getClass(), "secondary", term26367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term26552, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


