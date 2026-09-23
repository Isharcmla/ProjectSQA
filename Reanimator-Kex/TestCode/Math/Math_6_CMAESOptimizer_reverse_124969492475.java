package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.EqualityUtils.*;

public class CMAESOptimizer_reverse_124969492475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term637;
     Object term7144;
     Object term7132;

    public CMAESOptimizer_reverse_124969492475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term637 = (int[]) newIntArray(5);
        setIntElement(term637, 0, -268815336);
        setIntElement(term637, 1, -1210583429);
        setIntElement(term637, 2, -663691365);
        setIntElement(term637, 3, 339854490);
        setIntElement(term637, 4, -615654495);
        term7144 = (int[]) newIntArray(5);
        setIntElement(term7144, 0, -268815336);
        setIntElement(term7144, 1, -1210583429);
        setIntElement(term7144, 2, -663691365);
        setIntElement(term7144, 3, 339854490);
        setIntElement(term7144, 4, -615654495);
        term7132 = (int[]) newIntArray(5);
        setIntElement(term7132, 0, -615654495);
        setIntElement(term7132, 1, 339854490);
        setIntElement(term7132, 2, -663691365);
        setIntElement(term7132, 3, -1210583429);
        setIntElement(term7132, 4, -268815336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term637;
        Object retValue = callMethod(klass, "reverse", argTypes, null, args);
        assertTrue(recursiveEquals(term637, term7144));
        assertTrue(recursiveEquals(retValue, term7132));
    }

};


