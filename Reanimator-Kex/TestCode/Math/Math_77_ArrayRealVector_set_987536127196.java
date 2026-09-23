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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ArrayRealVector_set_987536127196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414;
     Object term416;
     Object term418;

    public ArrayRealVector_set_987536127196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term414 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term415 = (double[]) newDoubleArray(0);
        setField(term414, term414.getClass(), "data", term415);
        term416 = new Integer(1134449235);
        term418 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term419 = (double[]) newDoubleArray(0);
        setField(term418, term418.getClass(), "data", term419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[2];
        args[0] = term416;
        args[1] = term418;
        try {
            callMethod(klass, "set", argTypes, term414, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


