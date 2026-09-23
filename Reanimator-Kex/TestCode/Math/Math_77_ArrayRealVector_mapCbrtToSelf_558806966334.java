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

public class ArrayRealVector_mapCbrtToSelf_558806966334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78015;
     Object term98531;
     Object term98528;

    public ArrayRealVector_mapCbrtToSelf_558806966334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78015 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term77904 = (double[]) newDoubleArray(1);
        setField(term78015, term78015.getClass(), "data", term77904);
        term98531 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term98532 = (double[]) newDoubleArray(1);
        setField(term98531, term98531.getClass(), "data", term98532);
        term98528 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term98529 = (double[]) newDoubleArray(1);
        setField(term98528, term98528.getClass(), "data", term98529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapCbrtToSelf", argTypes, term78015, args);
        assertTrue(recursiveEquals(term78015, term98531));
        assertTrue(recursiveEquals(retValue, term98528));
    }

};


