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

public class EigenDecompositionImpl_findEigenVectors_908266317204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1306564;

    public EigenDecompositionImpl_findEigenVectors_908266317204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1306564 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term1305928 = (double[]) newDoubleArray(5);
        Object[] term1305935 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        double[] term1305947 = (double[]) newDoubleArray(260);
        double[] term1306216 = (double[]) newDoubleArray(24);
        setField(term1306564, term1306564.getClass(), "main", term1305928);
        setField(term1306564, term1306564.getClass(), "eigenvectors", term1305935);
        setDoubleElement(term1305947, 4, 1.15292150460691251E18);
        setField(term1306564, term1306564.getClass(), "realEigenvalues", term1305947);
        setField(term1306564, term1306564.getClass(), "secondary", term1306216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term1306564, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


