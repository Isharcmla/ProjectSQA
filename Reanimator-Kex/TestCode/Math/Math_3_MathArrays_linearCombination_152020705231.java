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
import java.lang.Double;

public class MathArrays_linearCombination_152020705231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2223;
     Object term2225;
     Object term2227;
     Object term2229;
     Object term2231;
     Object term2233;

    public MathArrays_linearCombination_152020705231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2223 = new Double(0.1849998667663698);
        term2225 = new Double(0.36312400202399575);
        term2227 = new Double(0.5485690030548175);
        term2229 = new Double(0.9765248027281291);
        term2231 = new Double(0.9184034277897645);
        term2233 = new Double(0.9457448635091538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        Object[] args = new Object[6];
        args[0] = term2223;
        args[1] = term2225;
        args[2] = term2227;
        args[3] = term2229;
        args[4] = term2231;
        args[5] = term2233;
        callMethod(klass, "linearCombination", argTypes, null, args);
    }

};


