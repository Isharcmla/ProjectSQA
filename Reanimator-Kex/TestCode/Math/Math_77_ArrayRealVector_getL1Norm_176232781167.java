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

public class ArrayRealVector_getL1Norm_176232781167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;
     Object term10816;

    public ArrayRealVector_getL1Norm_176232781167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term278 = (double[]) newDoubleArray(0);
        setField(term277, term277.getClass(), "data", term278);
        term10816 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term10817 = (double[]) newDoubleArray(0);
        setField(term10816, term10816.getClass(), "data", term10817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getL1Norm", argTypes, term277, args);
        assertTrue(recursiveEquals(term277, term10816));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


