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
import java.lang.Double;

public class EigenDecompositionImpl_findEigenvector_2080914109195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term979109;
     Object term888858;
     Object term888917;

    public EigenDecompositionImpl_findEigenvector_2080914109195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term979109 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term889429 = (double[]) newDoubleArray(489);
        term888917 = (double[]) newDoubleArray(511);
        setField(term979109, term979109.getClass(), "main", term889429);
        setField(term979109, term979109.getClass(), "work", term888917);
        term888858 = (double[]) newDoubleArray(58);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = Double.NaN;
        args[1] = term888858;
        args[2] = term888917;
        try {
            callMethod(klass, "findEigenvector", argTypes, term979109, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


