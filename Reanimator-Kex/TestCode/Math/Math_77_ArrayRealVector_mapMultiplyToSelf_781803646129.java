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
import java.lang.Double;

public class ArrayRealVector_mapMultiplyToSelf_781803646129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162;
     Object term164;
     Object term6966;
     Object term6963;

    public ArrayRealVector_mapMultiplyToSelf_781803646129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term163 = (double[]) newDoubleArray(0);
        setField(term162, term162.getClass(), "data", term163);
        term164 = new Double(0.6397214730945112);
        term6966 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6967 = (double[]) newDoubleArray(0);
        setField(term6966, term6966.getClass(), "data", term6967);
        term6963 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6964 = (double[]) newDoubleArray(0);
        setField(term6963, term6963.getClass(), "data", term6964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term164;
        Object retValue = callMethod(klass, "mapMultiplyToSelf", argTypes, term162, args);
        assertTrue(recursiveEquals(term162, term6966));
        assertTrue(recursiveEquals(term164, 0.6397214730945112));
        assertTrue(recursiveEquals(retValue, term6963));
    }

};


