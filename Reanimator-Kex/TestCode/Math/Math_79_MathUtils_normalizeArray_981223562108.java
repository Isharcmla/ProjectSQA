package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.util.EqualityUtils.*;
import java.lang.Double;

public class MathUtils_normalizeArray_981223562108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154;
     Object term159;
     Object term6436;
     Object term6425;

    public MathUtils_normalizeArray_981223562108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154 = (double[]) newDoubleArray(4);
        setDoubleElement(term154, 0, 0.2852810965221698);
        setDoubleElement(term154, 1, 0.6300849762307866);
        setDoubleElement(term154, 2, 0.9737083944266686);
        setDoubleElement(term154, 3, 0.0668892744806211);
        term159 = new Double(0.3587267442738795);
        term6436 = (double[]) newDoubleArray(4);
        setDoubleElement(term6436, 0, 0.2852810965221698);
        setDoubleElement(term6436, 1, 0.6300849762307866);
        setDoubleElement(term6436, 2, 0.9737083944266686);
        setDoubleElement(term6436, 3, 0.0668892744806211);
        term6425 = (double[]) newDoubleArray(4);
        setDoubleElement(term6425, 0, 0.052320989790646436);
        setDoubleElement(term6425, 1, 0.11555854913102796);
        setDoubleElement(term6425, 2, 0.17857961002300543);
        setDoubleElement(term6425, 3, 0.012267595329199646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term154;
        args[1] = term159;
        Object retValue = callMethod(klass, "normalizeArray", argTypes, null, args);
        assertTrue(recursiveEquals(term154, term6436));
        assertTrue(recursiveEquals(term159, 0.3587267442738795));
        assertTrue(recursiveEquals(retValue, term6425));
    }

};


