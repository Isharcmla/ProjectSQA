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
import static org.apache.commons.math.linear.EqualityUtils.*;

public class ArrayRealVector_add_1926198040402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129498;
     Object term129596;
     Object term135522;
     Object term135524;
     Object term135502;

    public ArrayRealVector_add_1926198040402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129498 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term129318 = (double[]) newDoubleArray(8);
        setField(term129498, term129498.getClass(), "data", term129318);
        term129596 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        setField(term129596, term129596.getClass(), "data", term129318);
        term135522 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term135523 = (double[]) newDoubleArray(8);
        setField(term135522, term135522.getClass(), "data", term135523);
        term135524 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term135525 = (double[]) newDoubleArray(8);
        setField(term135524, term135524.getClass(), "data", term135525);
        term135502 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term135503 = (double[]) newDoubleArray(8);
        setField(term135502, term135502.getClass(), "data", term135503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term129596;
        Object retValue = callMethod(klass, "add", argTypes, term129498, args);
        assertTrue(recursiveEquals(term129498, term135522));
        assertTrue(recursiveEquals(term129596, term135524));
        assertTrue(recursiveEquals(retValue, term135502));
    }

};


