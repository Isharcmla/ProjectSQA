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

public class ArrayRealVector_mapCosToSelf_442812024140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190;
     Object term7023;
     Object term7021;

    public ArrayRealVector_mapCosToSelf_442812024140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term191 = (double[]) newDoubleArray(0);
        setField(term190, term190.getClass(), "data", term191);
        term7023 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7024 = (double[]) newDoubleArray(0);
        setField(term7023, term7023.getClass(), "data", term7024);
        term7021 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7022 = (double[]) newDoubleArray(0);
        setField(term7021, term7021.getClass(), "data", term7022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapCosToSelf", argTypes, term190, args);
        assertTrue(recursiveEquals(term190, term7023));
        assertTrue(recursiveEquals(retValue, term7021));
    }

};


