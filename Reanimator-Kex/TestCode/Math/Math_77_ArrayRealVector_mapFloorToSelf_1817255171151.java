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

public class ArrayRealVector_mapFloorToSelf_1817255171151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212;
     Object term7078;
     Object term7076;

    public ArrayRealVector_mapFloorToSelf_1817255171151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term213 = (double[]) newDoubleArray(0);
        setField(term212, term212.getClass(), "data", term213);
        term7078 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7079 = (double[]) newDoubleArray(0);
        setField(term7078, term7078.getClass(), "data", term7079);
        term7076 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7077 = (double[]) newDoubleArray(0);
        setField(term7076, term7076.getClass(), "data", term7077);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapFloorToSelf", argTypes, term212, args);
        assertTrue(recursiveEquals(term212, term7078));
        assertTrue(recursiveEquals(retValue, term7076));
    }

};


