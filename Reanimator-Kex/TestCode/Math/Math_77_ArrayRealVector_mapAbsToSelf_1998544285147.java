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

public class ArrayRealVector_mapAbsToSelf_1998544285147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204;
     Object term7058;
     Object term7056;

    public ArrayRealVector_mapAbsToSelf_1998544285147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term205 = (double[]) newDoubleArray(0);
        setField(term204, term204.getClass(), "data", term205);
        term7058 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7059 = (double[]) newDoubleArray(0);
        setField(term7058, term7058.getClass(), "data", term7059);
        term7056 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7057 = (double[]) newDoubleArray(0);
        setField(term7056, term7056.getClass(), "data", term7057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapAbsToSelf", argTypes, term204, args);
        assertTrue(recursiveEquals(term204, term7058));
        assertTrue(recursiveEquals(retValue, term7056));
    }

};


