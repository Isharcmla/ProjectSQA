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

public class ArrayRealVector_subtract_1937547621319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86315;
     Object term86413;

    public ArrayRealVector_subtract_1937547621319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86315 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term85897 = (double[]) newDoubleArray(0);
        setField(term86315, term86315.getClass(), "data", term85897);
        term86413 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term85896 = (double[]) newDoubleArray(0);
        setField(term86413, term86413.getClass(), "data", term85896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term86413;
        callMethod(klass, "subtract", argTypes, term86315, args);
    }

};


