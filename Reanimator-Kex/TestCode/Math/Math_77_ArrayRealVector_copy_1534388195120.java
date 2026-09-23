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

public class ArrayRealVector_copy_1534388195120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120;
     Object term4115;
     Object term4109;

    public ArrayRealVector_copy_1534388195120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term121 = (double[]) newDoubleArray(0);
        setField(term120, term120.getClass(), "data", term121);
        term4115 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4116 = (double[]) newDoubleArray(0);
        setField(term4115, term4115.getClass(), "data", term4116);
        term4109 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term4110 = (double[]) newDoubleArray(0);
        setField(term4109, term4109.getClass(), "data", term4110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "copy", argTypes, term120, args);
        assertTrue(recursiveEquals(term120, term4115));
        assertTrue(recursiveEquals(retValue, term4109));
    }

};


