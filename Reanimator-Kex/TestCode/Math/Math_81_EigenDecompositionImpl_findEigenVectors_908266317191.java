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

public class EigenDecompositionImpl_findEigenVectors_908266317191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term882519;

    public EigenDecompositionImpl_findEigenVectors_908266317191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term882519 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term879645 = (double[]) newDoubleArray(6);
        double[] term879666 = (double[]) newDoubleArray(52);
        double[] term879728 = (double[]) newDoubleArray(502);
        setField(term882519, term882519.getClass(), "main", term879645);
        setField(term882519, term882519.getClass(), "eigenvectors", null);
        setDoubleElement(term879666, 5, 2.305843009213694E18);
        setField(term882519, term882519.getClass(), "realEigenvalues", term879666);
        setField(term882519, term882519.getClass(), "secondary", term879728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term882519, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


