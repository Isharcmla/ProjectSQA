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

public class EigenDecompositionImpl_findEigenvalues_174011735592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32694;

    public EigenDecompositionImpl_findEigenvalues_174011735592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32694 = newInstance(Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl"));
        double[] term32475 = (double[]) newDoubleArray(18);
        double[] term32496 = (double[]) newDoubleArray(1);
        setField(term32694, term32694.getClass(), "main", term32475);
        setDoubleElement(term32496, 0, 4.6297004169368699E18);
        setField(term32694, term32694.getClass(), "secondary", term32496);
        setDoubleField(term32694, term32694.getClass(), "splitTolerance", 4.6116857349013596E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findEigenvalues", argTypes, term32694, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


