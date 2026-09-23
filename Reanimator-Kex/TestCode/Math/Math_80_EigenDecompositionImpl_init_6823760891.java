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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class EigenDecompositionImpl_init_6823760891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term9;
     Object term14;

    public EigenDecompositionImpl_init_6823760891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = (double[]) newDoubleArray(5);
        setDoubleElement(term3, 0, 0.3455959125047594);
        setDoubleElement(term3, 1, 0.5523635872663106);
        setDoubleElement(term3, 2, 0.544608645520025);
        setDoubleElement(term3, 3, 0.28570734989730284);
        setDoubleElement(term3, 4, 0.40176586625454525);
        term9 = (double[]) newDoubleArray(4);
        setDoubleElement(term9, 0, 0.2641345529914265);
        setDoubleElement(term9, 1, 0.36923381893433327);
        setDoubleElement(term9, 2, 0.6076495596892013);
        setDoubleElement(term9, 3, 0.37773193782763337);
        term14 = new Double(0.8474802076607362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.EigenDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term3;
        args[1] = term9;
        args[2] = term14;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


