package org.apache.commons.math3.util;

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
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.util.EqualityUtils.*;
import java.lang.Double;

public class MathArrays_normalizeArray_59604353878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2355;
     Object term2362;
     Object term19716;
     Object term19701;

    public MathArrays_normalizeArray_59604353878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2355 = (double[]) newDoubleArray(6);
        setDoubleElement(term2355, 0, 0.7808234535616719);
        setDoubleElement(term2355, 1, 0.9772425797816359);
        setDoubleElement(term2355, 2, 0.32009327814110977);
        setDoubleElement(term2355, 3, 0.9013029318694921);
        setDoubleElement(term2355, 4, 0.1755673139619638);
        setDoubleElement(term2355, 5, 0.9136597256674437);
        term2362 = new Double(0.3741779691002205);
        term19716 = (double[]) newDoubleArray(6);
        setDoubleElement(term19716, 0, 0.7808234535616719);
        setDoubleElement(term19716, 1, 0.9772425797816359);
        setDoubleElement(term19716, 2, 0.32009327814110977);
        setDoubleElement(term19716, 3, 0.9013029318694921);
        setDoubleElement(term19716, 4, 0.1755673139619638);
        setDoubleElement(term19716, 5, 0.9136597256674437);
        term19701 = (double[]) newDoubleArray(6);
        setDoubleElement(term19701, 0, 0.07180861298538356);
        setDoubleElement(term19701, 1, 0.08987234423387451);
        setDoubleElement(term19701, 2, 0.029437453786014155);
        setDoubleElement(term19701, 3, 0.08288853661091519);
        setDoubleElement(term19701, 4, 0.016146089418383774);
        setDoubleElement(term19701, 5, 0.08402493206564933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term2355;
        args[1] = term2362;
        Object retValue = callMethod(klass, "normalizeArray", argTypes, null, args);
        assertTrue(recursiveEquals(term2355, term19716));
        assertTrue(recursiveEquals(term2362, 0.3741779691002205));
        assertTrue(recursiveEquals(retValue, term19701));
    }

};


