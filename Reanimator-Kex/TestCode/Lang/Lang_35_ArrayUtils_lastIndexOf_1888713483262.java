package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Float;
import java.lang.Integer;

public class ArrayUtils_lastIndexOf_1888713483262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1003;
     Object term1013;
     Object term1015;
     Object term13839;

    public ArrayUtils_lastIndexOf_1888713483262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1003 = (float[]) newFloatArray(9);
        setFloatElement(term1003, 0, 0.89057696F);
        setFloatElement(term1003, 1, 0.7332741F);
        setFloatElement(term1003, 2, 0.15826964F);
        setFloatElement(term1003, 3, 0.45691717F);
        setFloatElement(term1003, 4, 0.17877543F);
        setFloatElement(term1003, 5, 0.8598297F);
        setFloatElement(term1003, 6, 0.96323884F);
        setFloatElement(term1003, 7, 0.43692183F);
        setFloatElement(term1003, 8, 0.80973893F);
        term1013 = new Float(0.7633268F);
        term1015 = new Integer(972867650);
        term13839 = (float[]) newFloatArray(9);
        setFloatElement(term13839, 0, 0.89057696F);
        setFloatElement(term13839, 1, 0.7332741F);
        setFloatElement(term13839, 2, 0.15826964F);
        setFloatElement(term13839, 3, 0.45691717F);
        setFloatElement(term13839, 4, 0.17877543F);
        setFloatElement(term13839, 5, 0.8598297F);
        setFloatElement(term13839, 6, 0.96323884F);
        setFloatElement(term13839, 7, 0.43692183F);
        setFloatElement(term13839, 8, 0.80973893F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        argTypes[1] = float.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1003;
        args[1] = term1013;
        args[2] = term1015;
        Object retValue = callMethod(klass, "lastIndexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term1003, term13839));
        assertTrue(recursiveEquals(term1013, 0.7633268F));
        assertTrue(recursiveEquals(term1015, 972867650));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


