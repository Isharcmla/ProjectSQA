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

public class ArrayRealVector_mapLogToSelf_1664736053134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178;
     Object term6993;
     Object term6991;

    public ArrayRealVector_mapLogToSelf_1664736053134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term179 = (double[]) newDoubleArray(0);
        setField(term178, term178.getClass(), "data", term179);
        term6993 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6994 = (double[]) newDoubleArray(0);
        setField(term6993, term6993.getClass(), "data", term6994);
        term6991 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6992 = (double[]) newDoubleArray(0);
        setField(term6991, term6991.getClass(), "data", term6992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapLogToSelf", argTypes, term178, args);
        assertTrue(recursiveEquals(term178, term6993));
        assertTrue(recursiveEquals(retValue, term6991));
    }

};


