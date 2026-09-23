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

public class ArrayRealVector_mapAsinToSelf_1571928000331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77575;
     Object term98257;
     Object term98254;

    public ArrayRealVector_mapAsinToSelf_1571928000331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77575 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term77464 = (double[]) newDoubleArray(1);
        setField(term77575, term77575.getClass(), "data", term77464);
        term98257 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term98258 = (double[]) newDoubleArray(1);
        setField(term98257, term98257.getClass(), "data", term98258);
        term98254 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term98255 = (double[]) newDoubleArray(1);
        setField(term98254, term98254.getClass(), "data", term98255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapAsinToSelf", argTypes, term77575, args);
        assertTrue(recursiveEquals(term77575, term98257));
        assertTrue(recursiveEquals(retValue, term98254));
    }

};


