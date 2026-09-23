package org.apache.commons.math3.optim.nonlinear.vector;

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
import static org.apache.commons.math3.optim.nonlinear.vector.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.vector.EqualityUtils.*;
import java.lang.Object;

public class Weight_init_111688338419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7627;
     Object term1692527;
     Object term1692546;

    public Weight_init_111688338419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7833 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        setField(term7833, term7833.getClass(), "weightMatrix", null);
        term7627 = (double[]) newDoubleArray(16);
        term1692527 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Object term1692528 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        Object[] term1692529 = (Object[]) newArray("[D", 16);
        double[] term1692530 = (double[]) newDoubleArray(16);
        double[] term1692531 = (double[]) newDoubleArray(16);
        double[] term1692532 = (double[]) newDoubleArray(16);
        double[] term1692533 = (double[]) newDoubleArray(16);
        double[] term1692534 = (double[]) newDoubleArray(16);
        double[] term1692535 = (double[]) newDoubleArray(16);
        double[] term1692536 = (double[]) newDoubleArray(16);
        double[] term1692537 = (double[]) newDoubleArray(16);
        double[] term1692538 = (double[]) newDoubleArray(16);
        double[] term1692539 = (double[]) newDoubleArray(16);
        double[] term1692540 = (double[]) newDoubleArray(16);
        double[] term1692541 = (double[]) newDoubleArray(16);
        double[] term1692542 = (double[]) newDoubleArray(16);
        double[] term1692543 = (double[]) newDoubleArray(16);
        double[] term1692544 = (double[]) newDoubleArray(16);
        double[] term1692545 = (double[]) newDoubleArray(16);
        setElement(term1692529, 0, term1692530);
        setElement(term1692529, 1, term1692531);
        setElement(term1692529, 2, term1692532);
        setElement(term1692529, 3, term1692533);
        setElement(term1692529, 4, term1692534);
        setElement(term1692529, 5, term1692535);
        setElement(term1692529, 6, term1692536);
        setElement(term1692529, 7, term1692537);
        setElement(term1692529, 8, term1692538);
        setElement(term1692529, 9, term1692539);
        setElement(term1692529, 10, term1692540);
        setElement(term1692529, 11, term1692541);
        setElement(term1692529, 12, term1692542);
        setElement(term1692529, 13, term1692543);
        setElement(term1692529, 14, term1692544);
        setElement(term1692529, 15, term1692545);
        setField(term1692528, term1692528.getClass(), "data", term1692529);
        setField(term1692527, term1692527.getClass(), "weightMatrix", term1692528);
        term1692546 = (double[]) newDoubleArray(16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.Weight");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term7627;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1692527));
        assertTrue(recursiveEquals(term7627, term1692546));
    }

};


