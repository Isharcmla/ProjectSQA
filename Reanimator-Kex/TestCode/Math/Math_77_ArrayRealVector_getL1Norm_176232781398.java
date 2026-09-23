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

public class ArrayRealVector_getL1Norm_176232781398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127932;
     Object term133082;

    public ArrayRealVector_getL1Norm_176232781398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127932 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term127332 = (double[]) newDoubleArray(489);
        setField(term127932, term127932.getClass(), "data", term127332);
        term133082 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term133083 = (double[]) newDoubleArray(489);
        setField(term133082, term133082.getClass(), "data", term133083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getL1Norm", argTypes, term127932, args);
        assertTrue(recursiveEquals(term127932, term133082));
    }

};


