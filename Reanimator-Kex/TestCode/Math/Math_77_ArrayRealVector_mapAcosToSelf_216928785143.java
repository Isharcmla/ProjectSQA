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

public class ArrayRealVector_mapAcosToSelf_216928785143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196;
     Object term7038;
     Object term7036;

    public ArrayRealVector_mapAcosToSelf_216928785143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term197 = (double[]) newDoubleArray(0);
        setField(term196, term196.getClass(), "data", term197);
        term7038 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7039 = (double[]) newDoubleArray(0);
        setField(term7038, term7038.getClass(), "data", term7039);
        term7036 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7037 = (double[]) newDoubleArray(0);
        setField(term7036, term7036.getClass(), "data", term7037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapAcosToSelf", argTypes, term196, args);
        assertTrue(recursiveEquals(term196, term7038));
        assertTrue(recursiveEquals(retValue, term7036));
    }

};


