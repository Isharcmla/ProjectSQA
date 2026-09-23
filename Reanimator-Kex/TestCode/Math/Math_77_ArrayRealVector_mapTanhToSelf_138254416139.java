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

public class ArrayRealVector_mapTanhToSelf_138254416139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188;
     Object term7018;
     Object term7016;

    public ArrayRealVector_mapTanhToSelf_138254416139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term189 = (double[]) newDoubleArray(0);
        setField(term188, term188.getClass(), "data", term189);
        term7018 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7019 = (double[]) newDoubleArray(0);
        setField(term7018, term7018.getClass(), "data", term7019);
        term7016 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7017 = (double[]) newDoubleArray(0);
        setField(term7016, term7016.getClass(), "data", term7017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapTanhToSelf", argTypes, term188, args);
        assertTrue(recursiveEquals(term188, term7018));
        assertTrue(recursiveEquals(retValue, term7016));
    }

};


