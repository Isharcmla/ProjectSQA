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

public class ArrayRealVector_mapSinToSelf_912187191141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192;
     Object term7028;
     Object term7026;

    public ArrayRealVector_mapSinToSelf_912187191141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term193 = (double[]) newDoubleArray(0);
        setField(term192, term192.getClass(), "data", term193);
        term7028 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7029 = (double[]) newDoubleArray(0);
        setField(term7028, term7028.getClass(), "data", term7029);
        term7026 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7027 = (double[]) newDoubleArray(0);
        setField(term7026, term7026.getClass(), "data", term7027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapSinToSelf", argTypes, term192, args);
        assertTrue(recursiveEquals(term192, term7028));
        assertTrue(recursiveEquals(retValue, term7026));
    }

};


