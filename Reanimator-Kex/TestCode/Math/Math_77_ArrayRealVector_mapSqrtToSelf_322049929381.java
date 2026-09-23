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

public class ArrayRealVector_mapSqrtToSelf_322049929381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126369;
     Object term126686;
     Object term126683;

    public ArrayRealVector_mapSqrtToSelf_322049929381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126369 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term126258 = (double[]) newDoubleArray(1);
        setField(term126369, term126369.getClass(), "data", term126258);
        term126686 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term126687 = (double[]) newDoubleArray(1);
        setField(term126686, term126686.getClass(), "data", term126687);
        term126683 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term126684 = (double[]) newDoubleArray(1);
        setField(term126683, term126683.getClass(), "data", term126684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapSqrtToSelf", argTypes, term126369, args);
        assertTrue(recursiveEquals(term126369, term126686));
        assertTrue(recursiveEquals(retValue, term126683));
    }

};


