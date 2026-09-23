package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.util.EqualityUtils.*;

public class MultidimensionalCounter_getSizes_143677331814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;
     Object term2311;
     Object term2295;

    public MultidimensionalCounter_getSizes_143677331814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term137 = (int[]) newIntArray(5);
        int[] term143 = (int[]) newIntArray(2);
        setIntField(term135, term135.getClass(), "dimension", -1588772968);
        setIntElement(term137, 0, -93135961);
        setIntElement(term137, 1, -112921587);
        setIntElement(term137, 2, 933028652);
        setIntElement(term137, 3, 287287233);
        setIntElement(term137, 4, 962840079);
        setField(term135, term135.getClass(), "uniCounterOffset", term137);
        setIntElement(term143, 0, 1540719661);
        setIntElement(term143, 1, 1265463001);
        setField(term135, term135.getClass(), "size", term143);
        setIntField(term135, term135.getClass(), "totalSize", 335112684);
        setIntField(term135, term135.getClass(), "last", 1551099402);
        term2311 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term2312 = (int[]) newIntArray(5);
        int[] term2313 = (int[]) newIntArray(2);
        setIntField(term2311, term2311.getClass(), "dimension", -1588772968);
        setIntElement(term2312, 0, -93135961);
        setIntElement(term2312, 1, -112921587);
        setIntElement(term2312, 2, 933028652);
        setIntElement(term2312, 3, 287287233);
        setIntElement(term2312, 4, 962840079);
        setField(term2311, term2311.getClass(), "uniCounterOffset", term2312);
        setIntElement(term2313, 0, 1540719661);
        setIntElement(term2313, 1, 1265463001);
        setField(term2311, term2311.getClass(), "size", term2313);
        setIntField(term2311, term2311.getClass(), "totalSize", 335112684);
        setIntField(term2311, term2311.getClass(), "last", 1551099402);
        term2295 = (int[]) newIntArray(2);
        setIntElement(term2295, 0, 1540719661);
        setIntElement(term2295, 1, 1265463001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSizes", argTypes, term135, args);
        assertTrue(recursiveEquals(term135, term2311));
        assertTrue(recursiveEquals(retValue, term2295));
    }

};


