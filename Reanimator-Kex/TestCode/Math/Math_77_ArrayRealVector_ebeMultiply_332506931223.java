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

public class ArrayRealVector_ebeMultiply_332506931223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29235;
     Object term29333;

    public ArrayRealVector_ebeMultiply_332506931223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29235 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term28817 = (double[]) newDoubleArray(0);
        setField(term29235, term29235.getClass(), "data", term28817);
        term29333 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term28816 = (double[]) newDoubleArray(0);
        setField(term29333, term29333.getClass(), "data", term28816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term29333;
        callMethod(klass, "ebeMultiply", argTypes, term29235, args);
    }

};


