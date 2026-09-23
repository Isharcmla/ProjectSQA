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

public class ArrayRealVector_projection_1070191850282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70422;
     Object term70520;
     Object term70664;
     Object term70666;
     Object term70662;

    public ArrayRealVector_projection_1070191850282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70422 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term70287 = (double[]) newDoubleArray(0);
        setField(term70422, term70422.getClass(), "data", term70287);
        term70520 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        setField(term70520, term70520.getClass(), "data", term70287);
        term70664 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term70665 = (double[]) newDoubleArray(0);
        setField(term70664, term70664.getClass(), "data", term70665);
        term70666 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term70667 = (double[]) newDoubleArray(0);
        setField(term70666, term70666.getClass(), "data", term70667);
        term70662 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term70663 = (double[]) newDoubleArray(0);
        setField(term70662, term70662.getClass(), "data", term70663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term70520;
        Object retValue = callMethod(klass, "projection", argTypes, term70422, args);
        assertTrue(recursiveEquals(term70422, term70664));
        assertTrue(recursiveEquals(term70520, term70666));
        assertTrue(recursiveEquals(retValue, term70662));
    }

};


