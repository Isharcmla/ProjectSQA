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

public class ArrayRealVector_isInfinite_1610698877387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127172;
     Object term127196;

    public ArrayRealVector_isInfinite_1610698877387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127172 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term127061 = (double[]) newDoubleArray(1);
        setField(term127172, term127172.getClass(), "data", term127061);
        term127196 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term127197 = (double[]) newDoubleArray(1);
        setField(term127196, term127196.getClass(), "data", term127197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInfinite", argTypes, term127172, args);
        assertTrue(recursiveEquals(term127172, term127196));
        assertTrue(recursiveEquals(retValue, false));
    }

};


