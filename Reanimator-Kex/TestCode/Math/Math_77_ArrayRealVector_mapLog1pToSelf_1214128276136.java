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

public class ArrayRealVector_mapLog1pToSelf_1214128276136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182;
     Object term7003;
     Object term7001;

    public ArrayRealVector_mapLog1pToSelf_1214128276136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term183 = (double[]) newDoubleArray(0);
        setField(term182, term182.getClass(), "data", term183);
        term7003 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7004 = (double[]) newDoubleArray(0);
        setField(term7003, term7003.getClass(), "data", term7004);
        term7001 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7002 = (double[]) newDoubleArray(0);
        setField(term7001, term7001.getClass(), "data", term7002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapLog1pToSelf", argTypes, term182, args);
        assertTrue(recursiveEquals(term182, term7003));
        assertTrue(recursiveEquals(retValue, term7001));
    }

};


