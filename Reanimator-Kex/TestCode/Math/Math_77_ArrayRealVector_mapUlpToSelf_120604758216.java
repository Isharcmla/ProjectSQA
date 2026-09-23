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

public class ArrayRealVector_mapUlpToSelf_120604758216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25989;
     Object term26465;
     Object term26462;

    public ArrayRealVector_mapUlpToSelf_120604758216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25989 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term25878 = (double[]) newDoubleArray(1);
        setField(term25989, term25989.getClass(), "data", term25878);
        term26465 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term26466 = (double[]) newDoubleArray(1);
        setDoubleElement(term26466, 0, 4.9E-324);
        setField(term26465, term26465.getClass(), "data", term26466);
        term26462 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term26463 = (double[]) newDoubleArray(1);
        setDoubleElement(term26463, 0, 4.9E-324);
        setField(term26462, term26462.getClass(), "data", term26463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapUlpToSelf", argTypes, term25989, args);
        assertTrue(recursiveEquals(term25989, term26465));
        assertTrue(recursiveEquals(retValue, term26462));
    }

};


