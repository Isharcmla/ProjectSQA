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

public class ArrayRealVector_ebeMultiply_33250693154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235;
     Object term237;

    public ArrayRealVector_ebeMultiply_33250693154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term236 = (double[]) newDoubleArray(0);
        setField(term235, term235.getClass(), "data", term236);
        term237 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term238 = (double[]) newDoubleArray(0);
        setField(term237, term237.getClass(), "data", term238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term237;
        callMethod(klass, "ebeMultiply", argTypes, term235, args);
    }

};


