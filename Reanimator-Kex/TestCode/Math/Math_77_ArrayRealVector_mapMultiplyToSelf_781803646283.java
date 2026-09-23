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

public class ArrayRealVector_mapMultiplyToSelf_781803646283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70634;
     Object term70674;
     Object term70670;

    public ArrayRealVector_mapMultiplyToSelf_781803646283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70634 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term70523 = (double[]) newDoubleArray(1);
        setField(term70634, term70634.getClass(), "data", term70523);
        term70674 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term70675 = (double[]) newDoubleArray(1);
        setField(term70674, term70674.getClass(), "data", term70675);
        term70670 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term70671 = (double[]) newDoubleArray(1);
        setField(term70670, term70670.getClass(), "data", term70671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        Object retValue = callMethod(klass, "mapMultiplyToSelf", argTypes, term70634, args);
        assertTrue(recursiveEquals(term70634, term70674));
        assertTrue(recursiveEquals(retValue, term70670));
    }

};


