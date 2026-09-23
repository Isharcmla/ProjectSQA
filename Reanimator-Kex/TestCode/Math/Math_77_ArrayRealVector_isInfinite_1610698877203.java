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

public class ArrayRealVector_isInfinite_1610698877203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436;
     Object term20839;

    public ArrayRealVector_isInfinite_1610698877203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term436 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term437 = (double[]) newDoubleArray(0);
        setField(term436, term436.getClass(), "data", term437);
        term20839 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term20840 = (double[]) newDoubleArray(0);
        setField(term20839, term20839.getClass(), "data", term20840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInfinite", argTypes, term436, args);
        assertTrue(recursiveEquals(term436, term20839));
        assertTrue(recursiveEquals(retValue, false));
    }

};


