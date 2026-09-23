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

public class ArrayRealVector_mapLog10ToSelf_927096916271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68878;
     Object term68885;
     Object term68882;

    public ArrayRealVector_mapLog10ToSelf_927096916271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68878 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term68767 = (double[]) newDoubleArray(1);
        setField(term68878, term68878.getClass(), "data", term68767);
        term68885 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term68886 = (double[]) newDoubleArray(1);
        setDoubleElement(term68886, 0, Double.NEGATIVE_INFINITY);
        setField(term68885, term68885.getClass(), "data", term68886);
        term68882 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term68883 = (double[]) newDoubleArray(1);
        setDoubleElement(term68883, 0, Double.NEGATIVE_INFINITY);
        setField(term68882, term68882.getClass(), "data", term68883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapLog10ToSelf", argTypes, term68878, args);
        assertTrue(recursiveEquals(term68878, term68885));
        assertTrue(recursiveEquals(retValue, term68882));
    }

};


