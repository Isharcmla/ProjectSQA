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

public class ArrayRealVector_ebeDivide_165380052057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254;
     Object term256;

    public ArrayRealVector_ebeDivide_165380052057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term255 = (double[]) newDoubleArray(0);
        setField(term254, term254.getClass(), "data", term255);
        term256 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term257 = (double[]) newDoubleArray(0);
        setField(term256, term256.getClass(), "data", term257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term256;
        callMethod(klass, "ebeDivide", argTypes, term254, args);
    }

};


