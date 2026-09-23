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

public class EigenDecompositionImpl_findEigenVectors_908266317146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72160;

    public EigenDecompositionImpl_findEigenVectors_908266317146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72160 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term70307 = (double[]) newDoubleArray(4);
        Object[] term70313 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        double[] term70323 = (double[]) newDoubleArray(106);
        double[] term70437 = (double[]) newDoubleArray(500);
        setField(term72160, term72160.getClass(), "main", term70307);
        setField(term72160, term72160.getClass(), "eigenvectors", term70313);
        setDoubleElement(term70323, 3, 2.8823038044667904E17);
        setField(term72160, term72160.getClass(), "realEigenvalues", term70323);
        setField(term72160, term72160.getClass(), "secondary", term70437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term72160, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


