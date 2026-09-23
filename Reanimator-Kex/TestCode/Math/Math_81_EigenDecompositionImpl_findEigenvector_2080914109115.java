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

public class EigenDecompositionImpl_findEigenvector_2080914109115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39770;
     Object term37667;
     Object term38158;

    public EigenDecompositionImpl_findEigenvector_2080914109115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39770 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        term38158 = (double[]) newDoubleArray(489);
        setField(term39770, term39770.getClass(), "main", term38158);
        setField(term39770, term39770.getClass(), "work", term38158);
        term37667 = (double[]) newDoubleArray(490);
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
        args[1] = term37667;
        args[2] = term38158;
        try {
            callMethod(klass, "findEigenvector", argTypes, term39770, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


