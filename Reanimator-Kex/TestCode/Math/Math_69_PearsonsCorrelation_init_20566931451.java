package org.apache.commons.math.stat.correlation;

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
import static org.apache.commons.math.stat.correlation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PearsonsCorrelation_init_20566931451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public PearsonsCorrelation_init_20566931451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (Object[]) newArray("[D", 5);
        double[] term2 = (double[]) newDoubleArray(4);
        double[] term7 = (double[]) newDoubleArray(3);
        double[] term11 = (double[]) newDoubleArray(4);
        double[] term16 = (double[]) newDoubleArray(1);
        double[] term18 = (double[]) newDoubleArray(6);
        setDoubleElement(term2, 0, 0.13238746331190498);
        setDoubleElement(term2, 1, 0.3455959125047594);
        setDoubleElement(term2, 2, 0.5523635872663106);
        setDoubleElement(term2, 3, 0.544608645520025);
        setElement(term1, 0, term2);
        setDoubleElement(term7, 0, 0.28570734989730284);
        setDoubleElement(term7, 1, 0.40176586625454525);
        setDoubleElement(term7, 2, 0.2641345529914265);
        setElement(term1, 1, term7);
        setDoubleElement(term11, 0, 0.36923381893433327);
        setDoubleElement(term11, 1, 0.6076495596892013);
        setDoubleElement(term11, 2, 0.37773193782763337);
        setDoubleElement(term11, 3, 0.8474802076607362);
        setElement(term1, 2, term11);
        setDoubleElement(term16, 0, 0.5183269973490326);
        setElement(term1, 3, term16);
        setDoubleElement(term18, 0, 0.7655020693602768);
        setDoubleElement(term18, 1, 0.1374549299694151);
        setDoubleElement(term18, 2, 0.7031006357544823);
        setDoubleElement(term18, 3, 0.9527281779865117);
        setDoubleElement(term18, 4, 0.9828442029246764);
        setDoubleElement(term18, 5, 0.2779719046761513);
        setElement(term1, 4, term18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


