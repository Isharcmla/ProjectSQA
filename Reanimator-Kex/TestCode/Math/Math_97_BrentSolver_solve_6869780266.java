package org.apache.commons.math.analysis;

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
import static org.apache.commons.math.analysis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class BrentSolver_solve_6869780266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19;
     Object term31;
     Object term33;

    public BrentSolver_solve_6869780266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19 = newInstance(Class.forName("org.apache.commons.math.analysis.BrentSolver"));
        setDoubleField(term19, term19.getClass(), "absoluteAccuracy", 0.8474802076607362);
        setDoubleField(term19, term19.getClass(), "relativeAccuracy", 0.5183269973490326);
        setDoubleField(term19, term19.getClass(), "functionValueAccuracy", 0.7655020693602768);
        setIntField(term19, term19.getClass(), "maximalIterationCount", 391863371);
        setDoubleField(term19, term19.getClass(), "defaultAbsoluteAccuracy", 0.1374549299694151);
        setDoubleField(term19, term19.getClass(), "defaultRelativeAccuracy", 0.7031006357544823);
        setDoubleField(term19, term19.getClass(), "defaultFunctionValueAccuracy", 0.9527281779865117);
        setIntField(term19, term19.getClass(), "defaultMaximalIterationCount", -1922583790);
        setBooleanField(term19, term19.getClass(), "resultComputed", false);
        setDoubleField(term19, term19.getClass(), "result", 0.9828442029246764);
        setIntField(term19, term19.getClass(), "iterationCount", -616727354);
        setField(term19, term19.getClass(), "f", null);
        term31 = new Double(0.2779719046761513);
        term33 = new Double(0.6436713023569729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.BrentSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term31;
        args[1] = term33;
        try {
            callMethod(klass, "solve", argTypes, term19, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


