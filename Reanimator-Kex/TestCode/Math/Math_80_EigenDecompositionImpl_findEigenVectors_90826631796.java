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

public class EigenDecompositionImpl_findEigenVectors_90826631796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27120;

    public EigenDecompositionImpl_findEigenVectors_90826631796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27120 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term26927 = (double[]) newDoubleArray(1);
        Object[] term26930 = (Object[]) newArray("org.apache.commons.math.linear.ArrayRealVector", 0);
        double[] term26934 = (double[]) newDoubleArray(32);
        setField(term27120, term27120.getClass(), "main", term26927);
        setField(term27120, term27120.getClass(), "eigenvectors", term26930);
        setDoubleElement(term26934, 0, 2.9048217596539699E17);
        setField(term27120, term27120.getClass(), "realEigenvalues", term26934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenVectors", argTypes, term27120, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


