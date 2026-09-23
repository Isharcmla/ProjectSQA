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

public class ArrayRealVector_mapSqrtToSelf_322049929148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206;
     Object term7063;
     Object term7061;

    public ArrayRealVector_mapSqrtToSelf_322049929148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term207 = (double[]) newDoubleArray(0);
        setField(term206, term206.getClass(), "data", term207);
        term7063 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7064 = (double[]) newDoubleArray(0);
        setField(term7063, term7063.getClass(), "data", term7064);
        term7061 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7062 = (double[]) newDoubleArray(0);
        setField(term7061, term7061.getClass(), "data", term7062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapSqrtToSelf", argTypes, term206, args);
        assertTrue(recursiveEquals(term206, term7063));
        assertTrue(recursiveEquals(retValue, term7061));
    }

};


