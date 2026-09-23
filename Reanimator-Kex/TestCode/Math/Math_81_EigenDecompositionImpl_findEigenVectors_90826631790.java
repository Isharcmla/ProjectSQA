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

public class EigenDecompositionImpl_findEigenVectors_90826631790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32096;

    public EigenDecompositionImpl_findEigenVectors_90826631790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32096 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term31845 = (double[]) newDoubleArray(6);
        Object[] term31853 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        double[] term31867 = (double[]) newDoubleArray(34);
        double[] term31911 = (double[]) newDoubleArray(2);
        setField(term32096, term32096.getClass(), "main", term31845);
        setField(term32096, term32096.getClass(), "eigenvectors", term31853);
        setDoubleElement(term31867, 5, 4.6116860184273879E18);
        setField(term32096, term32096.getClass(), "realEigenvalues", term31867);
        setField(term32096, term32096.getClass(), "secondary", term31911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term32096, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


