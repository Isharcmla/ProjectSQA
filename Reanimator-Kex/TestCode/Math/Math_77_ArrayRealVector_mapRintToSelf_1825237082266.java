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

public class ArrayRealVector_mapRintToSelf_1825237082266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68171;
     Object term68293;
     Object term68290;

    public ArrayRealVector_mapRintToSelf_1825237082266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68171 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term68060 = (double[]) newDoubleArray(1);
        setField(term68171, term68171.getClass(), "data", term68060);
        term68293 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term68294 = (double[]) newDoubleArray(1);
        setField(term68293, term68293.getClass(), "data", term68294);
        term68290 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term68291 = (double[]) newDoubleArray(1);
        setField(term68290, term68290.getClass(), "data", term68291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapRintToSelf", argTypes, term68171, args);
        assertTrue(recursiveEquals(term68171, term68293));
        assertTrue(recursiveEquals(retValue, term68290));
    }

};


