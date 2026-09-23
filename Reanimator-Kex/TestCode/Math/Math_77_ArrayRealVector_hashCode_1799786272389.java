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

public class ArrayRealVector_hashCode_1799786272389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127313;
     Object term127327;

    public ArrayRealVector_hashCode_1799786272389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127313 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term127202 = (double[]) newDoubleArray(1);
        setField(term127313, term127313.getClass(), "data", term127202);
        term127327 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term127328 = (double[]) newDoubleArray(1);
        setField(term127327, term127327.getClass(), "data", term127328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term127313, args);
        assertTrue(recursiveEquals(term127313, term127327));
        assertTrue(recursiveEquals(retValue, 31));
    }

};


