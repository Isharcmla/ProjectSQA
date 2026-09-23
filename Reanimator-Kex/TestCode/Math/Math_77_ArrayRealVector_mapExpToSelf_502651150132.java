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

public class ArrayRealVector_mapExpToSelf_502651150132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174;
     Object term6983;
     Object term6981;

    public ArrayRealVector_mapExpToSelf_502651150132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term175 = (double[]) newDoubleArray(0);
        setField(term174, term174.getClass(), "data", term175);
        term6983 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6984 = (double[]) newDoubleArray(0);
        setField(term6983, term6983.getClass(), "data", term6984);
        term6981 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6982 = (double[]) newDoubleArray(0);
        setField(term6981, term6981.getClass(), "data", term6982);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapExpToSelf", argTypes, term174, args);
        assertTrue(recursiveEquals(term174, term6983));
        assertTrue(recursiveEquals(retValue, term6981));
    }

};


