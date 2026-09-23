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

public class ArrayRealVector_mapSignumToSelf_1143548034153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216;
     Object term7088;
     Object term7086;

    public ArrayRealVector_mapSignumToSelf_1143548034153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term217 = (double[]) newDoubleArray(0);
        setField(term216, term216.getClass(), "data", term217);
        term7088 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7089 = (double[]) newDoubleArray(0);
        setField(term7088, term7088.getClass(), "data", term7089);
        term7086 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7087 = (double[]) newDoubleArray(0);
        setField(term7086, term7086.getClass(), "data", term7087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapSignumToSelf", argTypes, term216, args);
        assertTrue(recursiveEquals(term216, term7088));
        assertTrue(recursiveEquals(retValue, term7086));
    }

};


