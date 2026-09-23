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

public class EigenDecompositionImpl_findEigenVectors_908266317174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term708560;

    public EigenDecompositionImpl_findEigenVectors_908266317174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term708560 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term707910 = (double[]) newDoubleArray(10);
        Object[] term707922 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        double[] term707944 = (double[]) newDoubleArray(68);
        double[] term708026 = (double[]) newDoubleArray(12);
        setField(term708560, term708560.getClass(), "main", term707910);
        setField(term708560, term708560.getClass(), "eigenvectors", term707922);
        setDoubleElement(term707944, 9, 9.007199254740992E15);
        setField(term708560, term708560.getClass(), "realEigenvalues", term707944);
        setField(term708560, term708560.getClass(), "secondary", term708026);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term708560, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


