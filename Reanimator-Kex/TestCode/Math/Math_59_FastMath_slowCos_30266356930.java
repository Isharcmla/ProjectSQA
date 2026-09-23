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
import java.lang.Double;

public class FastMath_slowCos_30266356930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212;
     Object term214;

    public FastMath_slowCos_30266356930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212 = new Double(0.39286935532362843);
        term214 = (double[]) newDoubleArray(6);
        setDoubleElement(term214, 0, 0.11577948268926874);
        setDoubleElement(term214, 1, 0.5617009352394552);
        setDoubleElement(term214, 2, 0.09067063848644474);
        setDoubleElement(term214, 3, 0.268304014379393);
        setDoubleElement(term214, 4, 0.7171972879282721);
        setDoubleElement(term214, 5, 0.9006361024877096);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.FastMath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term212;
        args[1] = term214;
        callMethod(klass, "slowCos", argTypes, null, args);
    }

};


