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

public class ArrayRealVector_mapTanToSelf_1137030510142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194;
     Object term7033;
     Object term7031;

    public ArrayRealVector_mapTanToSelf_1137030510142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term195 = (double[]) newDoubleArray(0);
        setField(term194, term194.getClass(), "data", term195);
        term7033 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7034 = (double[]) newDoubleArray(0);
        setField(term7033, term7033.getClass(), "data", term7034);
        term7031 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7032 = (double[]) newDoubleArray(0);
        setField(term7031, term7031.getClass(), "data", term7032);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapTanToSelf", argTypes, term194, args);
        assertTrue(recursiveEquals(term194, term7033));
        assertTrue(recursiveEquals(retValue, term7031));
    }

};


