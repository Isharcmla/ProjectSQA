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

public class ArrayRealVector_mapCeilToSelf_1688661614234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29891;
     Object term36133;
     Object term36130;

    public ArrayRealVector_mapCeilToSelf_1688661614234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29891 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term29780 = (double[]) newDoubleArray(1);
        setField(term29891, term29891.getClass(), "data", term29780);
        term36133 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term36134 = (double[]) newDoubleArray(1);
        setField(term36133, term36133.getClass(), "data", term36134);
        term36130 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term36131 = (double[]) newDoubleArray(1);
        setField(term36130, term36130.getClass(), "data", term36131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapCeilToSelf", argTypes, term29891, args);
        assertTrue(recursiveEquals(term29891, term36133));
        assertTrue(recursiveEquals(retValue, term36130));
    }

};


