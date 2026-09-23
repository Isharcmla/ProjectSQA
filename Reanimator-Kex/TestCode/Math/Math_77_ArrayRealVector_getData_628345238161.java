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

public class ArrayRealVector_getData_628345238161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258;
     Object term9934;
     Object term9931;

    public ArrayRealVector_getData_628345238161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term259 = (double[]) newDoubleArray(0);
        setField(term258, term258.getClass(), "data", term259);
        term9934 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term9935 = (double[]) newDoubleArray(0);
        setField(term9934, term9934.getClass(), "data", term9935);
        term9931 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getData", argTypes, term258, args);
        assertTrue(recursiveEquals(term258, term9934));
        assertTrue(recursiveEquals(retValue, term9931));
    }

};


