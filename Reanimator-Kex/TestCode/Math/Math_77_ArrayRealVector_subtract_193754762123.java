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

public class ArrayRealVector_subtract_193754762123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150;
     Object term152;

    public ArrayRealVector_subtract_193754762123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term151 = (double[]) newDoubleArray(0);
        setField(term150, term150.getClass(), "data", term151);
        term152 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term153 = (double[]) newDoubleArray(0);
        setField(term152, term152.getClass(), "data", term153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term152;
        callMethod(klass, "subtract", argTypes, term150, args);
    }

};


