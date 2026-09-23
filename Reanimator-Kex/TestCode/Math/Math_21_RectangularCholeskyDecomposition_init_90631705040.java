package org.apache.commons.math3.linear;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RectangularCholeskyDecomposition_init_90631705040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53659;

    public RectangularCholeskyDecomposition_init_90631705040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term53559 = newInstance(Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition"));
        term53659 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setIntField(term53659, term53659.getClass(), "rows", 10);
        setIntField(term53659, term53659.getClass(), "columns", 1);
        setIntField(term53659, term53659.getClass(), "blockColumns", 0);
        setIntField(term53659, term53659.getClass(), "blockRows", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.RectangularCholeskyDecomposition");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term53659;
        args[1] = 0.0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


