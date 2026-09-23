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

public class ArrayRealVector_mapCosToSelf_442812024359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86640;
     Object term113849;
     Object term113846;

    public ArrayRealVector_mapCosToSelf_442812024359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86640 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term86529 = (double[]) newDoubleArray(1);
        setField(term86640, term86640.getClass(), "data", term86529);
        term113849 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term113850 = (double[]) newDoubleArray(1);
        setDoubleElement(term113850, 0, 1.0);
        setField(term113849, term113849.getClass(), "data", term113850);
        term113846 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term113847 = (double[]) newDoubleArray(1);
        setDoubleElement(term113847, 0, 1.0);
        setField(term113846, term113846.getClass(), "data", term113847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapCosToSelf", argTypes, term86640, args);
        assertTrue(recursiveEquals(term86640, term113849));
        assertTrue(recursiveEquals(retValue, term113846));
    }

};


