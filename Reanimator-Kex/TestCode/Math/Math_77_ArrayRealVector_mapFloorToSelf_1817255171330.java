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

public class ArrayRealVector_mapFloorToSelf_1817255171330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77461;
     Object term98247;
     Object term98244;

    public ArrayRealVector_mapFloorToSelf_1817255171330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77461 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term77350 = (double[]) newDoubleArray(1);
        setField(term77461, term77461.getClass(), "data", term77350);
        term98247 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term98248 = (double[]) newDoubleArray(1);
        setField(term98247, term98247.getClass(), "data", term98248);
        term98244 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term98245 = (double[]) newDoubleArray(1);
        setField(term98244, term98244.getClass(), "data", term98245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapFloorToSelf", argTypes, term77461, args);
        assertTrue(recursiveEquals(term77461, term98247));
        assertTrue(recursiveEquals(retValue, term98244));
    }

};


